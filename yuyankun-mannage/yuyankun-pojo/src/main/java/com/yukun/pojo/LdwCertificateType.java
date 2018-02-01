package com.yukun.pojo;

import java.io.Serializable;
import java.util.Date;

public class LdwCertificateType implements Serializable{
    private Long id;

    private String certificateTypeName;

    private Integer areaLevel;

    private Long parentId;

    private Long firstId;

    private Long createUserId;

    private Long updateUserId;

    private Date createDate;

    private Date updateDate;

    private Byte isDelete;

    private String certificateTypeLogo;

    private Byte isHaveChild;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCertificateTypeName() {
        return certificateTypeName;
    }

    public void setCertificateTypeName(String certificateTypeName) {
        this.certificateTypeName = certificateTypeName == null ? null : certificateTypeName.trim();
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

    public Byte getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }

    public String getCertificateTypeLogo() {
        return certificateTypeLogo;
    }

    public void setCertificateTypeLogo(String certificateTypeLogo) {
        this.certificateTypeLogo = certificateTypeLogo == null ? null : certificateTypeLogo.trim();
    }

    public Byte getIsHaveChild() {
        return isHaveChild;
    }

    public void setIsHaveChild(Byte isHaveChild) {
        this.isHaveChild = isHaveChild;
    }
}