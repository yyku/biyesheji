package com.yukun.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class LdwBasketMoney implements Serializable{
    private Long id;

    private Long customerId;

    private String customerAccount;

    private String customerName;

    private String operationType;

    private String alipay;

    private String realName;

    private BigDecimal money;

    private String serviceCharge;

    private BigDecimal beforeMoney;

    private BigDecimal newMoney;

    private String moneySource;

    private String moneyWhereAbouts;

    private String dataSource;

    private String zhifubaoSn;

    private String weixinSn;

    private Integer status;

    private Date createDate;

    private String createDateString;

    private Date updateDate;

    private Long createUserId;

    private Long updateUserId;

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

    public String getAlipay() {
        return alipay;
    }

    public void setAlipay(String alipay) {
        this.alipay = alipay == null ? null : alipay.trim();
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public String getServiceCharge() {
        return serviceCharge;
    }

    public void setServiceCharge(String serviceCharge) {
        this.serviceCharge = serviceCharge == null ? null : serviceCharge.trim();
    }

    public BigDecimal getBeforeMoney() {
        return beforeMoney;
    }

    public void setBeforeMoney(BigDecimal beforeMoney) {
        this.beforeMoney = beforeMoney;
    }

    public BigDecimal getNewMoney() {
        return newMoney;
    }

    public void setNewMoney(BigDecimal newMoney) {
        this.newMoney = newMoney;
    }

    public String getMoneySource() {
        return moneySource;
    }

    public void setMoneySource(String moneySource) {
        this.moneySource = moneySource == null ? null : moneySource.trim();
    }

    public String getMoneyWhereAbouts() {
        return moneyWhereAbouts;
    }

    public void setMoneyWhereAbouts(String moneyWhereAbouts) {
        this.moneyWhereAbouts = moneyWhereAbouts == null ? null : moneyWhereAbouts.trim();
    }

    public String getDataSource() {
        return dataSource;
    }

    public void setDataSource(String dataSource) {
        this.dataSource = dataSource == null ? null : dataSource.trim();
    }

    public String getZhifubaoSn() {
        return zhifubaoSn;
    }

    public void setZhifubaoSn(String zhifubaoSn) {
        this.zhifubaoSn = zhifubaoSn == null ? null : zhifubaoSn.trim();
    }

    public String getWeixinSn() {
        return weixinSn;
    }

    public void setWeixinSn(String weixinSn) {
        this.weixinSn = weixinSn == null ? null : weixinSn.trim();
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

    public String getCreateDateString() {
        return createDateString;
    }

    public void setCreateDateString(String createDateString) {
        this.createDateString = createDateString == null ? null : createDateString.trim();
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
}