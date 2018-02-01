package com.yukun.pojo;

import java.io.Serializable;
import java.util.Date;

public class Model implements Serializable{
    private Long id;

    private Date addTime;

    private Date updateTime;

    private Byte isDelete;

    private Long modeTypeId;

    private String modeName;

    private String modeCode;

    private String modeTypeCode;

    private String decribe;

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

    public Long getModeTypeId() {
        return modeTypeId;
    }

    public void setModeTypeId(Long modeTypeId) {
        this.modeTypeId = modeTypeId;
    }

    public String getModeName() {
        return modeName;
    }

    public void setModeName(String modeName) {
        this.modeName = modeName == null ? null : modeName.trim();
    }

    public String getModeCode() {
        return modeCode;
    }

    public void setModeCode(String modeCode) {
        this.modeCode = modeCode == null ? null : modeCode.trim();
    }

    public String getModeTypeCode() {
        return modeTypeCode;
    }

    public void setModeTypeCode(String modeTypeCode) {
        this.modeTypeCode = modeTypeCode == null ? null : modeTypeCode.trim();
    }

    public String getDecribe() {
        return decribe;
    }

    public void setDecribe(String decribe) {
        this.decribe = decribe == null ? null : decribe.trim();
    }
}