package com.yukun.pojo;

import java.io.Serializable;
import java.util.Date;

public class LdwArea implements Serializable{
    private Long id;

    private String areaName;

    private Long createUserId;

    private Integer areaLevel;

    private Long parentId;

    private Long firstId;

    private Date createDate;

    private Integer updateUserId;

    private Date updateDate;

    private String areaNameSpell;

    private String areaNameAbridge;

    private Byte isDelete;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName == null ? null : areaName.trim();
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

    public Integer getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(Integer updateUserId) {
        this.updateUserId = updateUserId;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getAreaNameSpell() {
        return areaNameSpell;
    }

    public void setAreaNameSpell(String areaNameSpell) {
        this.areaNameSpell = areaNameSpell == null ? null : areaNameSpell.trim();
    }

    public String getAreaNameAbridge() {
        return areaNameAbridge;
    }

    public void setAreaNameAbridge(String areaNameAbridge) {
        this.areaNameAbridge = areaNameAbridge == null ? null : areaNameAbridge.trim();
    }

    public Byte getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }
}