/*Copyright © 2019 Robert Bosch Engineering and Business Solutions Private Limited. All Rights Reserved.

NOTICE:  All information contained herein is, and remains the property of Robert Bosch Engineering and Business Solutions Private Limited.
Dissemination of this information or reproduction of this material is strictly forbidden unless prior written permission is obtained from 
Robert Bosch Engineering and Business Solutions Private Limited.

*/
package com.bosch.OrderState.service;

import com.bosch.OrderState.model.OrderWorkflowTransition;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author IMM8KOR
 */
@Service
public interface WorkflowTransitionService {

    /**
     * @return List<WorkflowTransition>
     */
    public List<OrderWorkflowTransition> findAll();


}
