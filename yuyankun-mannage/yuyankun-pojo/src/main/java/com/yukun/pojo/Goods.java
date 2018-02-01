package com.yukun.pojo;

import java.util.Date;

public class Goods {
    private String id;

    private Date createTime;

    private Date updateTime;

    private Integer isDelete;

    private String goodsName;

    private Integer goodsTypeId;

    private String goodsTypeName;

    private String goodsIdentifier;

    private Integer goodsGradeId;

    private String goodsGradeName;

    private String goodsFormat;

    private Integer unitId;

    private String unitName;

    private Integer price;

    private Integer minBatch;

    private Integer goodsAmount;

    private Integer state;

    private String retroactiveInformation;

    private String publisherAccount;

    private String realName;

    private String address;

    private String addressDetail;

    private String service;

    private String imageUrl;

    private String directorName;

    private Integer certificationAuthId;

    private String certificationAuthBrandName;

    private String identityId;

    private String identityName;

    private String updateUserId;

    private String createUserId;

    private String sellpoint;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public Integer getGoodsTypeId() {
        return goodsTypeId;
    }

    public void setGoodsTypeId(Integer goodsTypeId) {
        this.goodsTypeId = goodsTypeId;
    }

    public String getGoodsTypeName() {
        return goodsTypeName;
    }

    public void setGoodsTypeName(String goodsTypeName) {
        this.goodsTypeName = goodsTypeName == null ? null : goodsTypeName.trim();
    }

    public String getGoodsIdentifier() {
        return goodsIdentifier;
    }

    public void setGoodsIdentifier(String goodsIdentifier) {
        this.goodsIdentifier = goodsIdentifier == null ? null : goodsIdentifier.trim();
    }

    public Integer getGoodsGradeId() {
        return goodsGradeId;
    }

    public void setGoodsGradeId(Integer goodsGradeId) {
        this.goodsGradeId = goodsGradeId;
    }

    public String getGoodsGradeName() {
        return goodsGradeName;
    }

    public void setGoodsGradeName(String goodsGradeName) {
        this.goodsGradeName = goodsGradeName == null ? null : goodsGradeName.trim();
    }

    public String getGoodsFormat() {
        return goodsFormat;
    }

    public void setGoodsFormat(String goodsFormat) {
        this.goodsFormat = goodsFormat == null ? null : goodsFormat.trim();
    }

    public Integer getUnitId() {
        return unitId;
    }

    public void setUnitId(Integer unitId) {
        this.unitId = unitId;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName == null ? null : unitName.trim();
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getMinBatch() {
        return minBatch;
    }

    public void setMinBatch(Integer minBatch) {
        this.minBatch = minBatch;
    }

    public Integer getGoodsAmount() {
        return goodsAmount;
    }

    public void setGoodsAmount(Integer goodsAmount) {
        this.goodsAmount = goodsAmount;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getRetroactiveInformation() {
        return retroactiveInformation;
    }

    public void setRetroactiveInformation(String retroactiveInformation) {
        this.retroactiveInformation = retroactiveInformation == null ? null : retroactiveInformation.trim();
    }

    public String getPublisherAccount() {
        return publisherAccount;
    }

    public void setPublisherAccount(String publisherAccount) {
        this.publisherAccount = publisherAccount == null ? null : publisherAccount.trim();
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getAddressDetail() {
        return addressDetail;
    }

    public void setAddressDetail(String addressDetail) {
        this.addressDetail = addressDetail == null ? null : addressDetail.trim();
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service == null ? null : service.trim();
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl == null ? null : imageUrl.trim();
    }

    public String getDirectorName() {
        return directorName;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName == null ? null : directorName.trim();
    }

    public Integer getCertificationAuthId() {
        return certificationAuthId;
    }

    public void setCertificationAuthId(Integer certificationAuthId) {
        this.certificationAuthId = certificationAuthId;
    }

    public String getCertificationAuthBrandName() {
        return certificationAuthBrandName;
    }

    public void setCertificationAuthBrandName(String certificationAuthBrandName) {
        this.certificationAuthBrandName = certificationAuthBrandName == null ? null : certificationAuthBrandName.trim();
    }

    public String getIdentityId() {
        return identityId;
    }

    public void setIdentityId(String identityId) {
        this.identityId = identityId == null ? null : identityId.trim();
    }

    public String getIdentityName() {
        return identityName;
    }

    public void setIdentityName(String identityName) {
        this.identityName = identityName == null ? null : identityName.trim();
    }

    public String getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(String updateUserId) {
        this.updateUserId = updateUserId == null ? null : updateUserId.trim();
    }

    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId == null ? null : createUserId.trim();
    }

    public String getSellpoint() {
        return sellpoint;
    }

    public void setSellpoint(String sellpoint) {
        this.sellpoint = sellpoint == null ? null : sellpoint.trim();
    }

	@Override
	public String toString() {
		return "Goods [id=" + id + ", createTime=" + createTime + ", updateTime=" + updateTime + ", isDelete="
				+ isDelete + ", goodsName=" + goodsName + ", goodsTypeId=" + goodsTypeId + ", goodsTypeName="
				+ goodsTypeName + ", goodsIdentifier=" + goodsIdentifier + ", goodsGradeId=" + goodsGradeId
				+ ", goodsGradeName=" + goodsGradeName + ", goodsFormat=" + goodsFormat + ", unitId=" + unitId
				+ ", unitName=" + unitName + ", price=" + price + ", minBatch=" + minBatch + ", goodsAmount="
				+ goodsAmount + ", state=" + state + ", retroactiveInformation=" + retroactiveInformation
				+ ", publisherAccount=" + publisherAccount + ", realName=" + realName + ", address=" + address
				+ ", addressDetail=" + addressDetail + ", service=" + service + ", imageUrl=" + imageUrl
				+ ", directorName=" + directorName + ", certificationAuthId=" + certificationAuthId
				+ ", certificationAuthBrandName=" + certificationAuthBrandName + ", identityId=" + identityId
				+ ", identityName=" + identityName + ", updateUserId=" + updateUserId + ", createUserId=" + createUserId
				+ ", sellpoint=" + sellpoint + "]";
	}
    
	public String[] getImageUrls() {
 		if (imageUrl != null && !"".equals(imageUrl)) {
 			String[] strings = imageUrl.split(",");
 			return strings;
 		}
 		return null;
 	}
}