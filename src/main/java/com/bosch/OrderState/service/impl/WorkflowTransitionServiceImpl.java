/*Copyright © 2019 Robert Bosch Engineering and Business Solutions Private Limited. All Rights Reserved.

NOTICE:  All information contained herein is, and remains the property of Robert Bosch Engineering and Business Solutions Private Limited.
Dissemination of this information or reproduction of this material is strictly forbidden unless prior written permission is obtained from 
Robert Bosch Engineering and Business Solutions Private Limited.

*/
/*Copyright © 2019 Robert Bosch Engineering and Business Solutions Private Limited. All Rights Reserved.

NOTICE:  All information contained herein is, and remains the property of Robert Bosch Engineering and Business Solutions Private Limited.
Dissemination of this information or reproduction of this material is strictly forbidden unless prior written permission is obtained from 
Robert Bosch Engineering and Business Solutions Private Limited.

*/
package com.bosch.OrderState.service.impl;

import com.bosch.OrderState.model.OrderWorkflowTransition;
import com.bosch.OrderState.repository.WorkflowTransitionRepository;
import com.bosch.OrderState.service.WorkflowTransitionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author IMM8KOR Retrieve the Workflow Transition file
 */
@Service
public class WorkflowTransitionServiceImpl implements WorkflowTransitionService {

    @Autowired
    WorkflowTransitionRepository workflowTransitionRepository;


    @Override
    public List<OrderWorkflowTransition> findAll() {
        return workflowTransitionRepository.findAll();
    }

}
