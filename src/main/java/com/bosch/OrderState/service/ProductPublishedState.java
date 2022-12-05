/*Copyright © 2019 Robert Bosch Engineering and Business Solutions Private Limited. All Rights Reserved.

NOTICE:  All information contained herein is, and remains the property of Robert Bosch Engineering and Business Solutions Private Limited.
Dissemination of this information or reproduction of this material is strictly forbidden unless prior written permission is obtained from 
Robert Bosch Engineering and Business Solutions Private Limited.

*/
package com.bosch.OrderState.service;

import com.bosch.ms.product.configuration.ProductServiceFactory;
import com.bosch.ms.product.gateway.ApiGatewayRequests;
import com.bosch.ms.product.model.Product;
import com.bosch.ms.product.service.ElasticSearchService;
import com.bosch.ms.product.service.ProductSvc;
import com.bosch.ms.product.utils.ApplicationMessageConstants;
import com.bosch.ms.vo.product.ProductDetails;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;


@Service
public class ProductPublishedState implements ProductState {

    private static final Log LOG = LogFactory.getLog(ProductPublishedState.class);

    private static final String STATE = ApplicationMessageConstants.STATES.PUBLISHED.toString();

    private static final String STATE_PERMISSION = ApplicationMessageConstants.ROLES.SELLER.toString();


    @Autowired
    @Lazy
    ElasticSearchService elasticSearchService;

    ProductSvc productSvc;

    @Autowired
    private ProductServiceFactory productServiceFactory;

    @Autowired
    ApiGatewayRequests apiGatewayRequests;

    @Override
    public void customOperationOnStateChange(ProductDetails productDetails) {
        Product product = productDetails.getProdBasicInfo();
        String categoryName = product.getProductCategory()
                .getProductCategoryName();
        productSvc = productServiceFactory.getProductService(categoryName);
        productSvc.customOperationsOnPublish(productDetails);

        LOG.debug("Pushing the record to elastic cahce for search.");
        elasticSearchService.saveProductToElasticCache(productDetails.getProdBasicInfo(), SecurityContextHolder.getContext().getAuthentication());
    }

    @Override
    public String getState() {
        return STATE;
    }

    @Override
    public String getStatePermission() {
        return STATE_PERMISSION;
    }
}