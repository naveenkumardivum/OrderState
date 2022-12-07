/**
 * Copyright (c) RBEI (Robert Bosch Engineering And Business Solutions). All rights reserved
 * <p>
 * This software is the confidential and proprietary information of
 * RBEI ("Confidential Information"). Do not disclose
 * such Confidential Information
 */
package com.bosch.OrderState;

import com.bosch.OrderState.model.OrderDTO;
import com.bosch.OrderState.model.OrderDetails;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface OrderAPI {

    @PutMapping(value = "/api/{uid}/{role}", produces = {MediaType.APPLICATION_JSON_VALUE}, consumes = {
            MediaType.APPLICATION_JSON_VALUE})
    OrderDTO updateOrderState(@PathVariable String uid, @PathVariable String role, @RequestBody OrderDetails orderDetails);
}
