/*Copyright © 2019 Robert Bosch Engineering and Business Solutions Private Limited. All Rights Reserved.

NOTICE:  All information contained herein is, and remains the property of Robert Bosch Engineering and Business Solutions Private Limited.
Dissemination of this information or reproduction of this material is strictly forbidden unless prior written permission is obtained from 
Robert Bosch Engineering and Business Solutions Private Limited.

*/
package com.bosch.OrderState.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @author IMM8KOR
 */
@Service
public class StatusRepositoryServiceImpl implements StatusRepositoryService {

    @Autowired
    StatusRepository statusRepository;

    @Override
    public Optional<String> findByStatus(String status) {
        return statusRepository.findByStatus(status);
    }

}
