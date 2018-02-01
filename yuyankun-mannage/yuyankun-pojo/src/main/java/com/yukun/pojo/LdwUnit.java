package com.yukun.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class LdwUnit implements Serializable{
    private Long id;

    private Long unitTypeId;

    private String unitName;

    private String unitExplain;

    private Boolean isStandardUnit;

    private BigDecimal ratio;

    private Byte isDelete;

    private Long createUserId;

    private Long updateUserId;

    private Date createDate;

    private Date updateDate;

    private String unitLogo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUnitTypeId() {
        return unitTypeId;
    }

    public void setUnitTypeId(Long unitTypeId) {
        this.unitTypeId = unitTypeId;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName == null ? null : unitName.trim();
    }

    public String getUnitExplain() {
        return unitExplain;
    }

    public void setUnitExplain(String unitExplain) {
        this.unitExplain = unitExplain == null ? null : unitExplain.trim();
    }

    public Boolean getIsStandardUnit() {
        return isStandardUnit;
    }

    public void setIsStandardUnit(Boolean isStandardUnit) {
        this.isStandardUnit = isStandardUnit;
    }

    public BigDecimal getRatio() {
        return ratio;
    }

    public void setRatio(BigDecimal ratio) {
        this.ratio = ratio;
    }

    public Byte getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
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

    public String getUnitLogo() {
        return unitLogo;
    }

    public void setUnitLogo(String unitLogo) {
        this.unitLogo = unitLogo == null ? null : unitLogo.trim();
    }
}