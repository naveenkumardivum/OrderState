package com.bosch.OrderState.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@ToString
@Entity
@Table(name = "TBL_PRODUCT_ORDER_HISTORY")
public class ProductOrderHistory extends AuditTrail implements Serializable
{
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @Column(name = "PRODUCT_ORDER_ID")
    private String productOrderId;

    @Column(name = "PREVIOUS_STATUS")
    private String previousStatus;

    @Column(name = "CURRENT_STATUS")
    private String currentStatus;

    @Column(name = "COMMENT")
    private String comment;
}
