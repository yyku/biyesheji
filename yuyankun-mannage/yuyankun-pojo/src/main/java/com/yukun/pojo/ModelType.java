package com.yukun.pojo;

import java.io.Serializable;
import java.util.Date;

public class ModelType implements Serializable{
    private Long id;

    private Date addTime;

    private Date updateTime;

    private Byte isDelete;

    private String modeTypeName;

    private String modeTypeCode;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Byte getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }

    public String getModeTypeName() {
        return modeTypeName;
    }

    public void setModeTypeName(String modeTypeName) {
        this.modeTypeName = modeTypeName == null ? null : modeTypeName.trim();
    }

    public String getModeTypeCode() {
        return modeTypeCode;
    }

    public void setModeTypeCode(String modeTypeCode) {
        this.modeTypeCode = modeTypeCode == null ? null : modeTypeCode.trim();
    }
}