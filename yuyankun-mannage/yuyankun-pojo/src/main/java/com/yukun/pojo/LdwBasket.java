package com.yukun.pojo;

import java.io.Serializable;
import java.util.Date;

public class LdwBasket implements Serializable{
    private Long id;

    private String basketNumber;

    private String rfId;

    private Long basketTypeId;

    private String basketTypeName;

    private Integer basketStatus;

    private Integer basketUseNumber;

    private Long operationCenterId;

    private Long nowUserId;

    private Date createDate;

    private Date updateDate;

    private Long createUserId;

    private Long updateUserId;

    private Byte isDelete;

    private Long basketLeaseId;

    private Integer version;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBasketNumber() {
        return basketNumber;
    }

    public void setBasketNumber(String basketNumber) {
        this.basketNumber = basketNumber == null ? null : basketNumber.trim();
    }

    public String getRfId() {
        return rfId;
    }

    public void setRfId(String rfId) {
        this.rfId = rfId == null ? null : rfId.trim();
    }

    public Long getBasketTypeId() {
        return basketTypeId;
    }

    public void setBasketTypeId(Long basketTypeId) {
        this.basketTypeId = basketTypeId;
    }

    public String getBasketTypeName() {
        return basketTypeName;
    }

    public void setBasketTypeName(String basketTypeName) {
        this.basketTypeName = basketTypeName == null ? null : basketTypeName.trim();
    }

    public Integer getBasketStatus() {
        return basketStatus;
    }

    public void setBasketStatus(Integer basketStatus) {
        this.basketStatus = basketStatus;
    }

    public Integer getBasketUseNumber() {
        return basketUseNumber;
    }

    public void setBasketUseNumber(Integer basketUseNumber) {
        this.basketUseNumber = basketUseNumber;
    }

    public Long getOperationCenterId() {
        return operationCenterId;
    }

    public void setOperationCenterId(Long operationCenterId) {
        this.operationCenterId = operationCenterId;
    }

    public Long getNowUserId() {
        return nowUserId;
    }

    public void setNowUserId(Long nowUserId) {
        this.nowUserId = nowUserId;
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

    public Byte getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }

    public Long getBasketLeaseId() {
        return basketLeaseId;
    }

    public void setBasketLeaseId(Long basketLeaseId) {
        this.basketLeaseId = basketLeaseId;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
}