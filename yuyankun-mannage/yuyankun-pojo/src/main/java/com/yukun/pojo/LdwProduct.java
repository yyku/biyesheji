package com.yukun.pojo;

import java.io.Serializable;
import java.util.Date;

public class LdwProduct implements Serializable{
    private Long id;

    private String productName;

    private Long createUserId;

    private Integer areaLevel;

    private Long parentId;

    private Long firstId;

    private Date createDate;

    private Long updateUserId;

    private Date updateDate;

    private String productNameSpell;

    private String productNameAbridge;

    private Byte categoryStatus;

    private Byte processingStatus;

    private Byte isDelete;

    private Byte status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public Long getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(Long createUserId) {
        this.createUserId = createUserId;
    }

    public Integer getAreaLevel() {
        return areaLevel;
    }

    public void setAreaLevel(Integer areaLevel) {
        this.areaLevel = areaLevel;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Long getFirstId() {
        return firstId;
    }

    public void setFirstId(Long firstId) {
        this.firstId = firstId;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Long getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(Long updateUserId) {
        this.updateUserId = updateUserId;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getProductNameSpell() {
        return productNameSpell;
    }

    public void setProductNameSpell(String productNameSpell) {
        this.productNameSpell = productNameSpell == null ? null : productNameSpell.trim();
    }

    public String getProductNameAbridge() {
        return productNameAbridge;
    }

    public void setProductNameAbridge(String productNameAbridge) {
        this.productNameAbridge = productNameAbridge == null ? null : productNameAbridge.trim();
    }

    public Byte getCategoryStatus() {
        return categoryStatus;
    }

    public void setCategoryStatus(Byte categoryStatus) {
        this.categoryStatus = categoryStatus;
    }

    public Byte getProcessingStatus() {
        return processingStatus;
    }

    public void setProcessingStatus(Byte processingStatus) {
        this.processingStatus = processingStatus;
    }

    public Byte getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }
}