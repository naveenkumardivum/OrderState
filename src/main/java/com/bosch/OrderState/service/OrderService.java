/**
 * Copyright (c) RBEI (Robert Bosch Engineering And Business Solutions). All rights reserved
 * <p>
 * This software is the confidential and proprietary information of
 * RBEI ("Confidential Information"). Do not disclose
 * such Confidential Information
 */
package com.bosch.OrderState.service;

import com.bosch.OrderState.constants.ErrorMessageConstants;
import com.bosch.OrderState.constants.MSSNotFoundException;
import com.bosch.OrderState.model.OrderDTO;
import com.bosch.OrderState.model.OrderDetails;
import com.bosch.OrderState.model.ProductOrder;
import com.bosch.OrderState.model.Status;
import com.bosch.OrderState.repository.OrderRepository;
import com.bosch.OrderState.repository.StatusRepositoryService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.Optional;

@Component
@Qualifier("orderService")
@Primary
public class OrderService {


    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private OrderStateFactory orderStateFactory;

    @Autowired
    private StatusRepositoryService statusRepositoryService;


    @Autowired
    private StateChangeService stateChangeService;

    ModelMapper modelMapper = new ModelMapper();

    private static final String E000026 = "E000026";
    private static final String E000437 = "E000437";


    @Transactional
    public OrderDTO updateOrderState(String uid,String role, OrderDetails orderDetails) {
        ProductOrder productOrder = getOrderObj(uid);
        String nextStatus = getStatusObj(orderDetails.getProductOrder().getOrderStatus());
        OrderState orderState = orderStateFactory.getState(nextStatus);
        if (!orderDetails.getProductOrder().getProductCategory().equals(productOrder.getProductCategory())) {
            throw new MSSNotFoundException(E000437, ErrorMessageConstants.E000437);
        }
        orderDetails.setProductOrder(productOrder);

        return stateChangeService.updateOrderState(orderState,role, orderDetails);
    }

    public ProductOrder getOrderObj(String orderId) {
        Optional<ProductOrder> product = orderRepository.findByProductOrderId(orderId);
        if (!product.isPresent()) {
            throw new MSSNotFoundException(E000026, ErrorMessageConstants.E000026);
        }

        return product.get();
    }

    public String getStatusObj(String state) {
        Optional<Status> status = statusRepositoryService.findByOrderStatus(state);
        if (!status.isPresent()) {
            throw new MSSNotFoundException("E000052", ErrorMessageConstants.E000052);
        }
        return status.get().getOrderStatus();
    }
}
