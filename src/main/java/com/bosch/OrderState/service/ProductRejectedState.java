/*Copyright © 2019 Robert Bosch Engineering and Business Solutions Private Limited. All Rights Reserved.

NOTICE:  All information contained herein is, and remains the property of Robert Bosch Engineering and Business Solutions Private Limited.
Dissemination of this information or reproduction of this material is strictly forbidden unless prior written permission is obtained from 
Robert Bosch Engineering and Business Solutions Private Limited.

*/
package com.bosch.OrderState.service;

import com.bosch.ms.product.exception.MSSBadRequestException;
import com.bosch.ms.product.exception.MSSInvalidInputException;
import com.bosch.ms.product.model.RejectReason;
import com.bosch.ms.product.utils.ApplicationMessageConstants;
import com.bosch.ms.product.utils.ErrorMessageConstants;
import com.bosch.ms.product.utils.Utils;
import com.bosch.ms.vo.product.ProductDetails;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@Service
public class ProductRejectedState implements ProductState {

    private static final String STATE = ApplicationMessageConstants.STATES.REJECTED.toString();

    private static final String STATE_PERMISSION = ApplicationMessageConstants.ROLES.MSS_P_ADM.toString();

    private static final Map<String, RejectReason> REJECT_REASON_ID_MAP = MasterDataCacheService.getRejectReasonIdMap();

    private static final Map<String, HashMap<String, RejectReason>> PRO_CTG_REJ_REASON_MAP = MasterDataCacheService
            .getProdCtgToRejectReasonMap();

    @Override
    public void customOperationOnStateChange(ProductDetails productDetails) {
        validateComments(Utils.convertObjectAsString(productDetails.getProductDetailedInfo()));
        validateRejectReasons(productDetails);
    }

    @Override
    public String getState() {
        return STATE;
    }

    @Override
    public String getStatePermission() {
        return STATE_PERMISSION;
    }

    private void validateComments(String commentsJsonNode) {
        if (commentsJsonNode == null)
            throw new MSSBadRequestException("E000042", ErrorMessageConstants.E000042);

        JSONObject reqJsonObject = new JSONObject(commentsJsonNode);
        String comments = reqJsonObject.get(ApplicationMessageConstants.COMMENTS).toString();

        if (comments == null || comments.trim().isEmpty()) {
            throw new MSSBadRequestException("E000042", ErrorMessageConstants.E000042);
        }
    }

    private void validateRejectReasons(ProductDetails productDetails) {
        String prodCategoryId = productDetails.getProdBasicInfo().getProductCategory().getCategoryId();
        HashMap<String, RejectReason> rejectReasonIdMap = PRO_CTG_REJ_REASON_MAP.get(prodCategoryId);
        if (rejectReasonIdMap == null) {
            throw new MSSInvalidInputException("E000172", ErrorMessageConstants.E000172);
        }

        Set<String> rejectReasonIds = productDetails.getRejectReasonIds();
        if (rejectReasonIds != null) {
            for (String rejectReasonId : rejectReasonIds) {
                isValidRejectReason(rejectReasonId);
            }
        }
    }

    private void isValidRejectReason(String rejectReasonId) {
        if (REJECT_REASON_ID_MAP.get(rejectReasonId) == null) {
            throw new MSSInvalidInputException("E000173", rejectReasonId + " - " + ErrorMessageConstants.E000173);
        }
    }

}
