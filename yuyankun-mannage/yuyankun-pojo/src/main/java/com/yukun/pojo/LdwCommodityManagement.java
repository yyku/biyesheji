package com.yukun.pojo;

import java.io.Serializable;
import java.util.Date;

public class LdwCommodityManagement implements Serializable{
    private Long id;

    private String commodityName;

    private String commodityPicture;

    private Long customerId;

    private String customerAccount;

    private String commodityUrl;

    private Byte displayStatus;

    private Date systemRecordingTime;

    private Date createDate;

    private Date updateDate;

    private Long createUserId;

    private Long updateUserId;

    private Byte isDel;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName == null ? null : commodityName.trim();
    }

    public String getCommodityPicture() {
        return commodityPicture;
    }

    public void setCommodityPicture(String commodityPicture) {
        this.commodityPicture = commodityPicture == null ? null : commodityPicture.trim();
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getCustomerAccount() {
        return customerAccount;
    }

    public void setCustomerAccount(String customerAccount) {
        this.customerAccount = customerAccount == null ? null : customerAccount.trim();
    }

    public String getCommodityUrl() {
        return commodityUrl;
    }

    public void setCommodityUrl(String commodityUrl) {
        this.commodityUrl = commodityUrl == null ? null : commodityUrl.trim();
    }

    public Byte getDisplayStatus() {
        return displayStatus;
    }

    public void setDisplayStatus(Byte displayStatus) {
        this.displayStatus = displayStatus;
    }

    public Date getSystemRecordingTime() {
        return systemRecordingTime;
    }

    public void setSystemRecordingTime(Date systemRecordingTime) {
        this.systemRecordingTime = systemRecordingTime;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Long getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(Long createUserId) {
        this.createUserId = createUserId;
    }

    public Long getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(Long updateUserId) {
        this.updateUserId = updateUserId;
    }

    public Byte getIsDel() {
        return isDel;
    }

    public void setIsDel(Byte isDel) {
        this.isDel = isDel;
    }
}