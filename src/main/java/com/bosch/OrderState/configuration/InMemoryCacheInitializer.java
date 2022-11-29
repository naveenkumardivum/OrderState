/*Copyright © 2019 Robert Bosch Engineering and Business Solutions Private Limited. All Rights Reserved.

NOTICE:  All information contained herein is, and remains the property of Robert Bosch Engineering and Business Solutions Private Limited.
Dissemination of this information or reproduction of this material is strictly forbidden unless prior written permission is obtained from
Robert Bosch Engineering and Business Solutions Private Limited.

*/
package com.bosch.OrderState.configuration;

import com.bosch.OrderState.service.MasterDataCacheService;
import com.bosch.OrderState.service.WorkflowTransitionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.stream.Stream;

@Component
public class InMemoryCacheInitializer implements CommandLineRunner {

    @Autowired
    private WorkflowTransitionService workflowTransitionService;

    @Override
    public void run(String... args) throws Exception {

        Stream.<Runnable>of(
                        () -> MasterDataCacheService.prepareWorkflow(workflowTransitionService.findAll())).parallel()
                .forEach(Runnable::run);
    }

}
