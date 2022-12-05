
package com.bosch.OrderState.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * @author IMM8KOR
 */
@Entity
@Table(name = "TBL_ORDER_WORKFLOW_TRANSITION")
public class OrderWorkflowTransition {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @Column(name = "ORDER_WORKFLOW_TRANSITION_ID")
    private String uid;
    @Column(name = "PRODUCT_CATEGORY_ID")
    private String productCategoryId;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Column(name = "VERSION")
    private String version;
    @Column(name = "FILE_NAME")
    private String filename;
    @Column(name = "IS_ACTIVE")
    private boolean active;

    public OrderWorkflowTransition() {
        super();
    }

    public OrderWorkflowTransition(String uid, String productCategoryId, String version, String filename, boolean active) {
        super();
        this.uid = uid;
        this.productCategoryId = productCategoryId;
        this.filename = filename;
        this.active = active;
        this.version = version;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(String productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }


}
