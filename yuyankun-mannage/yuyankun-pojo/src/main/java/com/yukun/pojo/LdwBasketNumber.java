package com.yukun.pojo;

import java.io.Serializable;
import java.util.Date;

public class LdwBasketNumber implements Serializable{
    private Long id;

    private String beforeBasketNumber;

    private Integer number;

    private String newBasketNumber;

    private Date createDate;

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

    public String getBeforeBasketNumber() {
        return beforeBasketNumber;
    }

    public void setBeforeBasketNumber(String beforeBasketNumber) {
        this.beforeBasketNumber = beforeBasketNumber == null ? null : beforeBasketNumber.trim();
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getNewBasketNumber() {
        return newBasketNumber;
    }

    public void setNewBasketNumber(String newBasketNumber) {
        this.newBasketNumber = newBasketNumber == null ? null : newBasketNumber.trim();
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
}