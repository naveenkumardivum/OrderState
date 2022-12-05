/*Copyright © 2019 Robert Bosch Engineering and Business Solutions Private Limited. All Rights Reserved.

NOTICE:  All information contained herein is, and remains the property of Robert Bosch Engineering and Business Solutions Private Limited.
Dissemination of this information or reproduction of this material is strictly forbidden unless prior written permission is obtained from 
Robert Bosch Engineering and Business Solutions Private Limited.

*/
package com.bosch.OrderState.service;

import com.bosch.ms.product.configuration.ProductServiceFactory;
import com.bosch.ms.product.configuration.RequestBodyValidator;
import com.bosch.ms.product.dto.AttributesDTO;
import com.bosch.ms.product.exception.MSSValidateDataException;
import com.bosch.ms.product.model.Product;
import com.bosch.ms.product.service.ProductSvc;
import com.bosch.ms.product.utils.ApplicationMessageConstants;
import com.bosch.ms.validator.exception.ValidateDataException;
import com.bosch.ms.vo.product.ProductDetails;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.json.JsonValue;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

@Service
public class ProductSubmittedState implements ProductState {

    private static final String STATE = ApplicationMessageConstants.STATES.SUBMITTED.toString();

    private static final String STATE_PERMISSION = ApplicationMessageConstants.ROLES.SELLER.toString();

    private ProductSvc productSvc;

    @Autowired
    private RequestBodyValidator requestBodyVaidator;

    @Autowired
    private ProductServiceFactory productServiceFactory;

    @Override
    public void customOperationOnStateChange(ProductDetails productDetails) {

        Product product = productDetails.getProdBasicInfo();
        String categoryId = product.getProductCategory().getCategoryId();
        String categoryName = product.getProductCategory().getProductCategoryName();
        productSvc = productServiceFactory.getProductService(categoryName);
        String productDetailJson = productSvc.retrieveProductDetails(product, categoryId);

        JSONObject reqJsonObject = new JSONObject(productDetailJson);

        // Step 1 - reduce the mandatory rules set
        Map<String, AttributesDTO> xpathToAttributeDtoMapForCategory = requestBodyVaidator
                .getAttributeRulesMapForCategory(categoryId);
        TreeSet<String> xPathSetForMandatoryAttribs = new TreeSet<>();
        TreeSet<String> xPathSetForNonMandatoryAttribs = new TreeSet<>();

        reduceTheRulesOnSubmit(xpathToAttributeDtoMapForCategory, xPathSetForMandatoryAttribs,
                xPathSetForNonMandatoryAttribs);

        // Step 2 - reduce the rules further with respect to category
        productSvc.reduceRulesOnSubmitForCategory(reqJsonObject, xPathSetForMandatoryAttribs);

        // Step 3 - validate the request before submit
        try {
            Map<String, Object> attributesMap = new HashMap<>();
            requestBodyVaidator.validateRequestForRules(reqJsonObject, xpathToAttributeDtoMapForCategory,
                    xPathSetForMandatoryAttribs, true, attributesMap);
        } catch (ValidateDataException e) {
            throw new MSSValidateDataException(e.getCode(), e.getMessage());
        }

        // Step 4 - perform custom validation with respect to category
        productSvc.customValidationsOnSubmit(product);
    }

    @Override
    public String getState() {
        return STATE;
    }

    @Override
    public String getStatePermission() {
        return STATE_PERMISSION;
    }

    private void reduceTheRulesOnSubmit(Map<String, AttributesDTO> xpathToAttributeDtoMapForCategory,
                                        TreeSet<String> xPathSetForMandatoryAttribs, TreeSet<String> xPathSetForNonMandatoryAttribs) {
        TreeSet<String> xPathAttributesKeySet = new TreeSet<>();
        xPathAttributesKeySet.addAll(xpathToAttributeDtoMapForCategory.keySet());
        for (String xPath : xPathAttributesKeySet) {
            AttributesDTO attributesDto = xpathToAttributeDtoMapForCategory.get(xPath);
            if (JsonValue.ValueType.ARRAY.toString().equals(attributesDto.getJsonType())
                    || JsonValue.ValueType.OBJECT.toString().equals(attributesDto.getJsonType())) {
                if (attributesDto.isElementRequired()) {
                    xPathSetForMandatoryAttribs.add(xPath);
                } else {
                    xPathSetForNonMandatoryAttribs.add(xPath);
                }
            } else {
                String parentXPath = xPath.substring(0, xPath.lastIndexOf('/'));
                AttributesDTO parentValidationObj = xpathToAttributeDtoMapForCategory.get(parentXPath);
                if (isParentObjectRequired(parentValidationObj)) {
                    xPathSetForMandatoryAttribs.add(xPath);
                } else {
                    xPathSetForNonMandatoryAttribs.add(xPath);
                }
            }
        }
    }

    private boolean isParentObjectRequired(AttributesDTO attributesDto) {
        return ((JsonValue.ValueType.ARRAY.toString().equals(attributesDto.getJsonType())
                || JsonValue.ValueType.OBJECT.toString().equals(attributesDto.getJsonType()))
                && attributesDto.isElementRequired());
    }
}