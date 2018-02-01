package com.yukun.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class LdwBasketLease implements Serializable{
    private Long id;

    private Long customerId;

    private String customerAccount;

    private String customerName;

    private String operationType;

    private Integer basketCount;

    private BigDecimal depositTotal;

    private BigDecimal rentTotal;

    private Integer payMethod;

    private Byte isPayMoney;

    private Integer status;

    private Date createDate;

    private Date updateDate;

    private Long createUserId;

    private Long updateUserId;

    private String updateUserName;

    private Long leaseOperationCenterId;

    private String leaseOperationCenterName;

    private Byte isDelete;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName == null ? null : customerName.trim();
    }

    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType == null ? null : operationType.trim();
    }

    public Integer getBasketCount() {
        return basketCount;
    }

    public void setBasketCount(Integer basketCount) {
        this.basketCount = basketCount;
    }

    public BigDecimal getDepositTotal() {
        return depositTotal;
    }

    public void setDepositTotal(BigDecimal depositTotal) {
        this.depositTotal = depositTotal;
    }

    public BigDecimal getRentTotal() {
        return rentTotal;
    }

    public void setRentTotal(BigDecimal rentTotal) {
        this.rentTotal = rentTotal;
    }

    public Integer getPayMethod() {
        return payMethod;
    }

    public void setPayMethod(Integer payMethod) {
        this.payMethod = payMethod;
    }

    public Byte getIsPayMoney() {
        return isPayMoney;
    }

    public void setIsPayMoney(Byte isPayMoney) {
        this.isPayMoney = isPayMoney;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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

    public String getUpdateUserName() {
        return updateUserName;
    }

    public void setUpdateUserName(String updateUserName) {
        this.updateUserName = updateUserName == null ? null : updateUserName.trim();
    }

    public Long getLeaseOperationCenterId() {
        return leaseOperationCenterId;
    }

    public void setLeaseOperationCenterId(Long leaseOperationCenterId) {
        this.leaseOperationCenterId = leaseOperationCenterId;
    }

    public String getLeaseOperationCenterName() {
        return leaseOperationCenterName;
    }

    public void setLeaseOperationCenterName(String leaseOperationCenterName) {
        this.leaseOperationCenterName = leaseOperationCenterName == null ? null : leaseOperationCenterName.trim();
    }

    public Byte getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }
}