/*Copyright © 2019 Robert Bosch Engineering and Business Solutions Private Limited. All Rights Reserved.

NOTICE:  All information contained herein is, and remains the property of Robert Bosch Engineering and Business Solutions Private Limited.
Dissemination of this information or reproduction of this material is strictly forbidden unless prior written permission is obtained from 
Robert Bosch Engineering and Business Solutions Private Limited.

*/
package com.bosch.OrderState.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@ToString
@Entity
@Table(name = "TBL_PRODUCT_ORDER")
public class ProductOrder extends AuditTrail implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @Column(name = "PRODUCT_ORDER_ID")
    private String productOrderId;

    @Column(name = "DCS_ORDER_ID")
    private String orderId;

    @Column(name = "PRODUCT_CATEGORY")
    private String productCategory;

    @Column(name = "ORDER_DATE")
    private String orderDate;

    @Column(name = "ORDER_END_DATE")
    private Date orderEndDate;

    @Column(name = "ORDER_STATUS")
    private String orderStatus;

    @Column(name = "COMPANY_ID")
    private String companyId;

    @Column(name = "CART_ITEM_COUNT")
    private int cartItemCount;

    @Version
    @Column(name = "VERSION_NUMBER")
    private int version;
}
