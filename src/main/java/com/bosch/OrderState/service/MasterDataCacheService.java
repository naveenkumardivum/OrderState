/*Copyright © 2019 Robert Bosch Engineering and Business Solutions Private Limited. All Rights Reserved.

NOTICE:  All information contained herein is, and remains the property of Robert Bosch Engineering and Business Solutions Private Limited.
Dissemination of this information or reproduction of this material is strictly forbidden unless prior written permission is obtained from
Robert Bosch Engineering and Business Solutions Private Limited.

*/
package com.bosch.OrderState.service;

import com.bosch.OrderState.configuration.Process;
import com.bosch.OrderState.configuration.*;
import com.bosch.OrderState.model.OrderWorkflowTransition;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.dataformat.xml.JacksonXmlModule;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;

/**
 * @author IMM8KOR
 */
@Service
public class MasterDataCacheService {

    private static final HashMap<String, HashMap<String, String>> HARDWARE_ORDER_WORKFLOW_MAP = new HashMap<>();

    private static final HashMap<String, HashMap<String, HashMap<String, HashMap<String, String>>>> CTG_TO_VERSION_TO_SRC_DEST_SET_MAP = new HashMap<>();

    public static void prepareWorkflow(List<OrderWorkflowTransition> listOfOrderWorkflowTransitions) {
        for (OrderWorkflowTransition workflow : listOfOrderWorkflowTransitions) {
            HashMap<String, String> versionToWorkflowFileMap = new HashMap<>();
            versionToWorkflowFileMap.put(workflow.getVersion(), workflow.getFilename());
            HARDWARE_ORDER_WORKFLOW_MAP.put(workflow.getProductCategoryId(), versionToWorkflowFileMap);
        }
        for (String categoryKey : HARDWARE_ORDER_WORKFLOW_MAP.keySet()) {
            HashMap<String, String> versionToWfNameMap = HARDWARE_ORDER_WORKFLOW_MAP.get(categoryKey);
            HashMap<String, HashMap<String, HashMap<String, String>>> versionToSrcRefToDestRoleSetMap = new HashMap<>();
            for (String versionKey : versionToWfNameMap.keySet()) {
                String transitionFlowName = versionToWfNameMap.get(versionKey);
                Process transitionProcess = loadTransitionFlow(transitionFlowName);
                HashMap<String, HashMap<String, String>> sourceRefToTargetRefRoleSetMap = new HashMap<>();
                for (SequenceFlow seqFlow : transitionProcess.getSequenceFlow()) {
                    String sourceRef = seqFlow.getSourceRef();
                    String targetRef = seqFlow.getTargetRef();
                    String allowedRole = seqFlow.getAllowedRoles();
                    HashMap<String, String> targetRoleMap = sourceRefToTargetRefRoleSetMap.get(sourceRef);
                    if (targetRoleMap == null)
                        targetRoleMap = new HashMap<>();
                    targetRoleMap.put(targetRef, allowedRole);
                    sourceRefToTargetRefRoleSetMap.put(sourceRef, targetRoleMap);
                }
                versionToSrcRefToDestRoleSetMap.put(versionKey, sourceRefToTargetRefRoleSetMap);
            }
            CTG_TO_VERSION_TO_SRC_DEST_SET_MAP.put(categoryKey, versionToSrcRefToDestRoleSetMap);
        }
    }

    private static Process loadTransitionFlow(String OrderTransitionFlowName) {
        Resource workFlowFileName = getWorkflowFileName(OrderTransitionFlowName);
        Process transitionProcess = null;
        try {
            JacksonXmlModule xmlModule = new JacksonXmlModule();
            xmlModule.setDefaultUseWrapper(false);
            XmlMapper xmlMapper = new XmlMapper(xmlModule);
            xmlMapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
            InputStream ipStream = workFlowFileName.getInputStream();
            transitionProcess = xmlMapper.readValue(ipStream, Process.class);
        } catch (Exception ex) {
            throw new MSSInternalException("E000045", ErrorMessageConstants.E000045);

        }
        return transitionProcess;
    }

    /**
     * @param workflowName
     * @return
     */
    private static Resource getWorkflowFileName(String workflowName) {

        return new ClassPathResource("workflows/" + workflowName, MasterDataCacheService.class.getClassLoader());
    }

    /**
     * @param currentStatus
     * @param statusToBeSet
     * @param productCtg
     * @return
     */
    public static final boolean isValidNextState(String currentStatus, String statusToBeSet, String role, String productCtg) {
        HashMap<String, String> targetRoleMap = new HashMap<>();
        targetRoleMap.put(statusToBeSet.trim().toUpperCase(), role.trim().toUpperCase());
        boolean isValidStateToSet = false;

        /**
         * maintain in constant file
         */
        String workFlowVersion = ApplicationMessageConstants.CURRENT_WORKFLOW_VERSION;

        /**
         * assumption - this would be read from cache
         */
        HashMap<String, HashMap<String, HashMap<String, String>>> versionToSrcRefToDestRoleSetMapForCtg = CTG_TO_VERSION_TO_SRC_DEST_SET_MAP.get(productCtg);

        if (versionToSrcRefToDestRoleSetMapForCtg == null || versionToSrcRefToDestRoleSetMapForCtg.isEmpty()) {

        } else {
            HashMap<String, HashMap<String, String>> versionToSrcRefToDestRoleSetMap = versionToSrcRefToDestRoleSetMapForCtg.get(workFlowVersion);
            if (versionToSrcRefToDestRoleSetMap == null || versionToSrcRefToDestRoleSetMap.isEmpty()) {

            } else {
                HashMap<String, String> srcRefToTargetRefRoleSet = versionToSrcRefToDestRoleSetMap.get(currentStatus.trim().toUpperCase());
                if (srcRefToTargetRefRoleSet.equals(targetRoleMap)) {
                    isValidStateToSet = true;
                }
            }
        }
        return isValidStateToSet;
    }
}