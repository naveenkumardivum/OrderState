/*Copyright © 2019 Robert Bosch Engineering and Business Solutions Private Limited. All Rights Reserved.

NOTICE:  All information contained herein is, and remains the property of Robert Bosch Engineering and Business Solutions Private Limited.
Dissemination of this information or reproduction of this material is strictly forbidden unless prior written permission is obtained from 
Robert Bosch Engineering and Business Solutions Private Limited.

*/
package com.bosch.OrderState.service;

import com.bosch.OrderState.constants.ApplicationMessageConstants;
import org.springframework.stereotype.Service;

@Service
public class OrderConfirmedState implements OrderState {

    private static final String STATE = ApplicationMessageConstants.STATES.ORDER_CONFIRMED.toString();

    private static final String STATE_PERMISSION = ApplicationMessageConstants.ROLES.SELLER.toString();


    @Override
    public String getState() {
        return STATE;
    }

    @Override
    public String getStatePermission() {
        return STATE_PERMISSION;
    }

}