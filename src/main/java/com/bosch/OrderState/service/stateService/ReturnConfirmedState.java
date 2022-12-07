/*Copyright © 2019 Robert Bosch Engineering and Business Solutions Private Limited. All Rights Reserved.

NOTICE:  All information contained herein is, and remains the property of Robert Bosch Engineering and Business Solutions Private Limited.
Dissemination of this information or reproduction of this material is strictly forbidden unless prior written permission is obtained from 
Robert Bosch Engineering and Business Solutions Private Limited.

*/
package com.bosch.OrderState.service.stateService;

import com.bosch.OrderState.constants.ApplicationMessageConstants;
import com.bosch.OrderState.service.OrderState;
import org.springframework.stereotype.Service;

@Service
public class ReturnConfirmedState implements OrderState {

    private static final String STATE = ApplicationMessageConstants.STATES.RETURN_CONFIRMED.toString();


    @Override
    public String getState() {
        return STATE;
    }

}
