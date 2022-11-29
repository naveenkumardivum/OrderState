/*Copyright © 2019 Robert Bosch Engineering and Business Solutions Private Limited. All Rights Reserved.

NOTICE:  All information contained herein is, and remains the property of Robert Bosch Engineering and Business Solutions Private Limited.
Dissemination of this information or reproduction of this material is strictly forbidden unless prior written permission is obtained from 
Robert Bosch Engineering and Business Solutions Private Limited.

*/
package com.bosch.OrderState.configuration;

public class MSSInternalException extends RuntimeException {

    private static final long serialVersionUID = -3404549279956874173L;
    private final String error;

    public MSSInternalException(String error, String message) {
        super(message);
        this.error = error;
    }

    public String getError() {
        return error;
    }
}