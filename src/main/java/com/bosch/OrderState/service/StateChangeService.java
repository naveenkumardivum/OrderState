/*Copyright © 2019 Robert Bosch Engineering and Business Solutions Private Limited. All Rights Reserved.

NOTICE:  All information contained herein is, and remains the property of Robert Bosch Engineering and Business Solutions Private Limited.
Dissemination of this information or reproduction of this material is strictly forbidden unless prior written permission is obtained from
Robert Bosch Engineering and Business Solutions Private Limited.

*/
package com.bosch.OrderState.service;

import com.bosch.OrderState.configuration.ErrorMessageConstants;
import com.bosch.OrderState.configuration.MSSBadRequestException;
import com.bosch.OrderState.model.OrderDTO;
import com.bosch.OrderState.model.OrderDetails;
import com.bosch.OrderState.model.ProductOrder;
import com.bosch.OrderState.repository.OrderRepository;
import com.bosch.OrderState.repository.StatusRepositoryService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StateChangeService {

    String prodStateToSet = "ORDER_CONFIRMED";
    OrderDetails orderDetails;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private StatusRepositoryService statusRepositoryService;

    @Autowired
    ModelMapper modelMapper;

    public OrderDTO updateOrderState(OrderDetails orderDetails) {

        this.orderDetails = orderDetails;

        isValidNextState();


        return updateProduct(orderDetails, prodStateToSet);
    }

    /**
     * validate if requested state can be attained
     */
    private void isValidNextState() {
        ProductOrder productOrder = orderDetails.getProductOrder();
        String currentStatus = productOrder.getOrderStatus();
        String categoryId = productOrder.getProductCategory();

        if (!MasterDataCacheService.isValidNextState(currentStatus, prodStateToSet, "BUYER", categoryId)) {
            throw new MSSBadRequestException("E000041",
                    currentStatus + ErrorMessageConstants.E000041 + prodStateToSet);
        }
    }


    private OrderDTO updateProduct(OrderDetails orderDetails, String nextStatus) {
        ProductOrder orderDetail = orderDetails.getProductOrder();
        orderDetail.setOrderStatus(getStatus(nextStatus));

        ProductOrder productOrder;
        productOrder = orderRepository.save(orderDetail);
        OrderDTO orderDTO = modelMapper.map(productOrder, OrderDTO.class);
        return orderDTO;
    }

    private String getStatus(String nextStatus) {
        Optional<String> status = statusRepositoryService.findByStatus(nextStatus);
        if (!status.isPresent()) {
            throw new MSSBadRequestException("E000038", ErrorMessageConstants.E000038);
        }
        return status.get();
    }
}
