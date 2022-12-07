/*Copyright © 2019 Robert Bosch Engineering and Business Solutions Private Limited. All Rights Reserved.

NOTICE:  All information contained herein is, and remains the property of Robert Bosch Engineering and Business Solutions Private Limited.
Dissemination of this information or reproduction of this material is strictly forbidden unless prior written permission is obtained from
Robert Bosch Engineering and Business Solutions Private Limited.

*/
package com.bosch.OrderState.service;

import com.bosch.OrderState.constants.ErrorMessageConstants;
import com.bosch.OrderState.constants.MSSBadRequestException;
import com.bosch.OrderState.model.OrderDTO;
import com.bosch.OrderState.model.OrderDetails;
import com.bosch.OrderState.model.ProductOrder;
import com.bosch.OrderState.model.Status;
import com.bosch.OrderState.repository.OrderRepository;
import com.bosch.OrderState.repository.StatusRepositoryService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StateChangeService {

    OrderState orderState;
    OrderDetails orderDetails;

    String role;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private StatusRepositoryService statusRepositoryService;

    @Autowired
    ModelMapper modelMapper;

    public OrderDTO updateOrderState(OrderState orderState, String role, OrderDetails orderDetails) {

        this.orderDetails = orderDetails;
        this.orderState = orderState;
        this.role = role;
        isValidNextState();
        return updateOrder(orderDetails, orderState.getState());
    }

    private void isValidNextState() {
        ProductOrder productOrder = orderDetails.getProductOrder();
        String currentStatus = productOrder.getOrderStatus();
        String categoryId = productOrder.getProductCategory();

        if (!MasterDataCacheService.isValidNextState(currentStatus, orderState.getState(), role, categoryId)) {
            throw new MSSBadRequestException("E000041",
                    currentStatus + ErrorMessageConstants.E000041 + orderState);
        }
    }


    public OrderDTO updateOrder(OrderDetails orderDetails, String nextStatus) {
        ProductOrder inputOrderDetail = orderDetails.getProductOrder();
        inputOrderDetail.setOrderStatus(getStatus(nextStatus));
        ProductOrder productOrder = orderRepository.save(inputOrderDetail);
        return modelMapper.map(productOrder, OrderDTO.class);
    }

    private String getStatus(String nextStatus) {
        Optional<Status> status = statusRepositoryService.findByOrderStatus(nextStatus);
        if (!status.isPresent()) {
            throw new MSSBadRequestException("E000038", ErrorMessageConstants.E000038);
        }
        return status.get().getOrderStatus();
    }
}
