
package com.bosch.OrderState.service;

import com.bosch.OrderState.constants.ApplicationMessageConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductStateFactory {

    @Autowired
    private BuyerApprovedState buyerApprovedState;

    @Autowired
    private BuyerRejectedState buyerRejectedState;

    @Autowired
    private IntransitState intransitState;

    @Autowired
    private OrderCancelConfirmedState orderCancelConfirmedState;

    @Autowired
    private OrderCancelInitiatedState orderCancelInitiatedState;

    @Autowired
    private OrderConfirmedState orderConfirmedState;

    @Autowired
    private OrderPlacedState orderPlacedState;

    @Autowired
    private OrderReturnedState orderReturnedState;

    @Autowired
    private PaymentProcessedState paymentProcessedState;

    @Autowired
    private PODUploadedState podUploadedState;

    @Autowired
    private ReadyToShipState readyToShipState;

    @Autowired
    private RefundInitiatedState refundInitiatedState;

    @Autowired
    private RejectedState rejectedState;

    @Autowired
    private RejectedWithPODState rejectedWithPODState;

    @Autowired
    private ReplacementConfirmedState replacementConfirmedState;

    @Autowired
    private ReplacementInitiatedState replacementInitiatedState;

    @Autowired
    private ReturnConfirmedState returnConfirmedState;

    @Autowired
    private ReturnInitiatedState returnInitiatedState;

    public OrderState getState(String newState) {

        ApplicationMessageConstants.STATES stateString = ApplicationMessageConstants.STATES.valueOf(newState.trim().toUpperCase());

        OrderState orderState;
        switch (stateString) {
            case ORDER_CONFIRMED:
                orderState = orderConfirmedState;
                break;
            case READY_TO_SHIP:
                orderState = readyToShipState;
                break;
            case REJECTED:
                orderState = rejectedState;
                break;
            case INTRANSIT:
                orderState = intransitState;
                break;
            case POD_UPLOADED:
                orderState = podUploadedState;
                break;
            case BUYER_APPROVED:
                orderState = buyerApprovedState;
                break;
            case PAYMENT_PROCESSED:
                orderState = paymentProcessedState;
                break;
            case REPLACMENT_INITIATED:
                orderState = replacementInitiatedState;
                break;
            case REPLACEMENT_CONFIRMED:
                orderState = replacementConfirmedState;
                break;
            case RETURN_INITIATED:
                orderState = returnInitiatedState;
                break;
            case RETURN_CONFIRMED:
                orderState = returnConfirmedState;
                break;
            case ORDER_RETURNED:
                orderState = orderReturnedState;
                break;
            case REFUND_INITIATED:
                orderState = refundInitiatedState;
                break;
            case BUYER_REJECTED:
                orderState = buyerRejectedState;
                break;
            case REJECTED_WITH_POD:
                orderState = rejectedWithPODState;
                break;
            case ORDER_CANCEL_CONFIRMED:
                orderState = orderCancelConfirmedState;
                break;
            case ORDER_CANCEL_INITIATED:
                orderState = orderCancelInitiatedState;
                break;
            default:
                orderState = orderPlacedState;
                break;
        }

        return orderState;
    }
}
