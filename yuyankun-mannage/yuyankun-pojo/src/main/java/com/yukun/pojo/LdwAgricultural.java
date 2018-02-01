package com.yukun.pojo;

import java.io.Serializable;
import java.util.Date;

public class LdwAgricultural implements Serializable{
    private Long id;

    private String agriculturalName;

    private Integer type;

    private Integer agriculturalGrade;

    private String agriculturalGradeName;

    private Date createDate;

    private Date updateDate;

    private Long createUserId;

    private Long updateUserId;

    private Integer areaLevel;

    private Long parentId;

    private Byte isDelete;

    private String agriculturalNameSpell;

    private String agriculturalNameAbridge;

    private Long firstId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAgriculturalName() {
        return agriculturalName;
    }

    public void setAgriculturalName(String agriculturalName) {
        this.agriculturalName = agriculturalName == null ? null : agriculturalName.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getAgriculturalGrade() {
        return agriculturalGrade;
    }

    public void setAgriculturalGrade(Integer agriculturalGrade) {
        this.agriculturalGrade = agriculturalGrade;
    }

    public String getAgriculturalGradeName() {
        return agriculturalGradeName;
    }

    public void setAgriculturalGradeName(String agriculturalGradeName) {
        this.agriculturalGradeName = agriculturalGradeName == null ? null : agriculturalGradeName.trim();
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

    public Byte getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }

    public String getAgriculturalNameSpell() {
        return agriculturalNameSpell;
    }

    public void setAgriculturalNameSpell(String agriculturalNameSpell) {
        this.agriculturalNameSpell = agriculturalNameSpell == null ? null : agriculturalNameSpell.trim();
    }

    public String getAgriculturalNameAbridge() {
        return agriculturalNameAbridge;
    }

    public void setAgriculturalNameAbridge(String agriculturalNameAbridge) {
        this.agriculturalNameAbridge = agriculturalNameAbridge == null ? null : agriculturalNameAbridge.trim();
    }

    public Long getFirstId() {
        return firstId;
    }

    public void setFirstId(Long firstId) {
        this.firstId = firstId;
    }
}