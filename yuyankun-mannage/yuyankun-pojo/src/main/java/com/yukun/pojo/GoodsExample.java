package com.yukun.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNull() {
            addCriterion("is_delete is null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNotNull() {
            addCriterion("is_delete is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteEqualTo(Integer value) {
            addCriterion("is_delete =", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotEqualTo(Integer value) {
            addCriterion("is_delete <>", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThan(Integer value) {
            addCriterion("is_delete >", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_delete >=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThan(Integer value) {
            addCriterion("is_delete <", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThanOrEqualTo(Integer value) {
            addCriterion("is_delete <=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIn(List<Integer> values) {
            addCriterion("is_delete in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotIn(List<Integer> values) {
            addCriterion("is_delete not in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteBetween(Integer value1, Integer value2) {
            addCriterion("is_delete between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotBetween(Integer value1, Integer value2) {
            addCriterion("is_delete not between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNull() {
            addCriterion("goods_name is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNotNull() {
            addCriterion("goods_name is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameEqualTo(String value) {
            addCriterion("goods_name =", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotEqualTo(String value) {
            addCriterion("goods_name <>", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThan(String value) {
            addCriterion("goods_name >", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThanOrEqualTo(String value) {
            addCriterion("goods_name >=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThan(String value) {
            addCriterion("goods_name <", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThanOrEqualTo(String value) {
            addCriterion("goods_name <=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLike(String value) {
            addCriterion("goods_name like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotLike(String value) {
            addCriterion("goods_name not like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIn(List<String> values) {
            addCriterion("goods_name in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotIn(List<String> values) {
            addCriterion("goods_name not in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameBetween(String value1, String value2) {
            addCriterion("goods_name between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotBetween(String value1, String value2) {
            addCriterion("goods_name not between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIdIsNull() {
            addCriterion("goods_type_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIdIsNotNull() {
            addCriterion("goods_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIdEqualTo(Integer value) {
            addCriterion("goods_type_id =", value, "goodsTypeId");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIdNotEqualTo(Integer value) {
            addCriterion("goods_type_id <>", value, "goodsTypeId");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIdGreaterThan(Integer value) {
            addCriterion("goods_type_id >", value, "goodsTypeId");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_type_id >=", value, "goodsTypeId");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIdLessThan(Integer value) {
            addCriterion("goods_type_id <", value, "goodsTypeId");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("goods_type_id <=", value, "goodsTypeId");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIdIn(List<Integer> values) {
            addCriterion("goods_type_id in", values, "goodsTypeId");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIdNotIn(List<Integer> values) {
            addCriterion("goods_type_id not in", values, "goodsTypeId");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("goods_type_id between", value1, value2, "goodsTypeId");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_type_id not between", value1, value2, "goodsTypeId");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNameIsNull() {
            addCriterion("goods_type_name is null");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNameIsNotNull() {
            addCriterion("goods_type_name is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNameEqualTo(String value) {
            addCriterion("goods_type_name =", value, "goodsTypeName");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNameNotEqualTo(String value) {
            addCriterion("goods_type_name <>", value, "goodsTypeName");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNameGreaterThan(String value) {
            addCriterion("goods_type_name >", value, "goodsTypeName");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("goods_type_name >=", value, "goodsTypeName");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNameLessThan(String value) {
            addCriterion("goods_type_name <", value, "goodsTypeName");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNameLessThanOrEqualTo(String value) {
            addCriterion("goods_type_name <=", value, "goodsTypeName");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNameLike(String value) {
            addCriterion("goods_type_name like", value, "goodsTypeName");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNameNotLike(String value) {
            addCriterion("goods_type_name not like", value, "goodsTypeName");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNameIn(List<String> values) {
            addCriterion("goods_type_name in", values, "goodsTypeName");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNameNotIn(List<String> values) {
            addCriterion("goods_type_name not in", values, "goodsTypeName");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNameBetween(String value1, String value2) {
            addCriterion("goods_type_name between", value1, value2, "goodsTypeName");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNameNotBetween(String value1, String value2) {
            addCriterion("goods_type_name not between", value1, value2, "goodsTypeName");
            return (Criteria) this;
        }

        public Criteria andGoodsIdentifierIsNull() {
            addCriterion("goods_identifier is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdentifierIsNotNull() {
            addCriterion("goods_identifier is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdentifierEqualTo(String value) {
            addCriterion("goods_identifier =", value, "goodsIdentifier");
            return (Criteria) this;
        }

        public Criteria andGoodsIdentifierNotEqualTo(String value) {
            addCriterion("goods_identifier <>", value, "goodsIdentifier");
            return (Criteria) this;
        }

        public Criteria andGoodsIdentifierGreaterThan(String value) {
            addCriterion("goods_identifier >", value, "goodsIdentifier");
            return (Criteria) this;
        }

        public Criteria andGoodsIdentifierGreaterThanOrEqualTo(String value) {
            addCriterion("goods_identifier >=", value, "goodsIdentifier");
            return (Criteria) this;
        }

        public Criteria andGoodsIdentifierLessThan(String value) {
            addCriterion("goods_identifier <", value, "goodsIdentifier");
            return (Criteria) this;
        }

        public Criteria andGoodsIdentifierLessThanOrEqualTo(String value) {
            addCriterion("goods_identifier <=", value, "goodsIdentifier");
            return (Criteria) this;
        }

        public Criteria andGoodsIdentifierLike(String value) {
            addCriterion("goods_identifier like", value, "goodsIdentifier");
            return (Criteria) this;
        }

        public Criteria andGoodsIdentifierNotLike(String value) {
            addCriterion("goods_identifier not like", value, "goodsIdentifier");
            return (Criteria) this;
        }

        public Criteria andGoodsIdentifierIn(List<String> values) {
            addCriterion("goods_identifier in", values, "goodsIdentifier");
            return (Criteria) this;
        }

        public Criteria andGoodsIdentifierNotIn(List<String> values) {
            addCriterion("goods_identifier not in", values, "goodsIdentifier");
            return (Criteria) this;
        }

        public Criteria andGoodsIdentifierBetween(String value1, String value2) {
            addCriterion("goods_identifier between", value1, value2, "goodsIdentifier");
            return (Criteria) this;
        }

        public Criteria andGoodsIdentifierNotBetween(String value1, String value2) {
            addCriterion("goods_identifier not between", value1, value2, "goodsIdentifier");
            return (Criteria) this;
        }

        public Criteria andGoodsGradeIdIsNull() {
            addCriterion("goods_grade_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsGradeIdIsNotNull() {
            addCriterion("goods_grade_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsGradeIdEqualTo(Integer value) {
            addCriterion("goods_grade_id =", value, "goodsGradeId");
            return (Criteria) this;
        }

        public Criteria andGoodsGradeIdNotEqualTo(Integer value) {
            addCriterion("goods_grade_id <>", value, "goodsGradeId");
            return (Criteria) this;
        }

        public Criteria andGoodsGradeIdGreaterThan(Integer value) {
            addCriterion("goods_grade_id >", value, "goodsGradeId");
            return (Criteria) this;
        }

        public Criteria andGoodsGradeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_grade_id >=", value, "goodsGradeId");
            return (Criteria) this;
        }

        public Criteria andGoodsGradeIdLessThan(Integer value) {
            addCriterion("goods_grade_id <", value, "goodsGradeId");
            return (Criteria) this;
        }

        public Criteria andGoodsGradeIdLessThanOrEqualTo(Integer value) {
            addCriterion("goods_grade_id <=", value, "goodsGradeId");
            return (Criteria) this;
        }

        public Criteria andGoodsGradeIdIn(List<Integer> values) {
            addCriterion("goods_grade_id in", values, "goodsGradeId");
            return (Criteria) this;
        }

        public Criteria andGoodsGradeIdNotIn(List<Integer> values) {
            addCriterion("goods_grade_id not in", values, "goodsGradeId");
            return (Criteria) this;
        }

        public Criteria andGoodsGradeIdBetween(Integer value1, Integer value2) {
            addCriterion("goods_grade_id between", value1, value2, "goodsGradeId");
            return (Criteria) this;
        }

        public Criteria andGoodsGradeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_grade_id not between", value1, value2, "goodsGradeId");
            return (Criteria) this;
        }

        public Criteria andGoodsGradeNameIsNull() {
            addCriterion("goods_grade_name is null");
            return (Criteria) this;
        }

        public Criteria andGoodsGradeNameIsNotNull() {
            addCriterion("goods_grade_name is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsGradeNameEqualTo(String value) {
            addCriterion("goods_grade_name =", value, "goodsGradeName");
            return (Criteria) this;
        }

        public Criteria andGoodsGradeNameNotEqualTo(String value) {
            addCriterion("goods_grade_name <>", value, "goodsGradeName");
            return (Criteria) this;
        }

        public Criteria andGoodsGradeNameGreaterThan(String value) {
            addCriterion("goods_grade_name >", value, "goodsGradeName");
            return (Criteria) this;
        }

        public Criteria andGoodsGradeNameGreaterThanOrEqualTo(String value) {
            addCriterion("goods_grade_name >=", value, "goodsGradeName");
            return (Criteria) this;
        }

        public Criteria andGoodsGradeNameLessThan(String value) {
            addCriterion("goods_grade_name <", value, "goodsGradeName");
            return (Criteria) this;
        }

        public Criteria andGoodsGradeNameLessThanOrEqualTo(String value) {
            addCriterion("goods_grade_name <=", value, "goodsGradeName");
            return (Criteria) this;
        }

        public Criteria andGoodsGradeNameLike(String value) {
            addCriterion("goods_grade_name like", value, "goodsGradeName");
            return (Criteria) this;
        }

        public Criteria andGoodsGradeNameNotLike(String value) {
            addCriterion("goods_grade_name not like", value, "goodsGradeName");
            return (Criteria) this;
        }

        public Criteria andGoodsGradeNameIn(List<String> values) {
            addCriterion("goods_grade_name in", values, "goodsGradeName");
            return (Criteria) this;
        }

        public Criteria andGoodsGradeNameNotIn(List<String> values) {
            addCriterion("goods_grade_name not in", values, "goodsGradeName");
            return (Criteria) this;
        }

        public Criteria andGoodsGradeNameBetween(String value1, String value2) {
            addCriterion("goods_grade_name between", value1, value2, "goodsGradeName");
            return (Criteria) this;
        }

        public Criteria andGoodsGradeNameNotBetween(String value1, String value2) {
            addCriterion("goods_grade_name not between", value1, value2, "goodsGradeName");
            return (Criteria) this;
        }

        public Criteria andGoodsFormatIsNull() {
            addCriterion("goods_format is null");
            return (Criteria) this;
        }

        public Criteria andGoodsFormatIsNotNull() {
            addCriterion("goods_format is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsFormatEqualTo(String value) {
            addCriterion("goods_format =", value, "goodsFormat");
            return (Criteria) this;
        }

        public Criteria andGoodsFormatNotEqualTo(String value) {
            addCriterion("goods_format <>", value, "goodsFormat");
            return (Criteria) this;
        }

        public Criteria andGoodsFormatGreaterThan(String value) {
            addCriterion("goods_format >", value, "goodsFormat");
            return (Criteria) this;
        }

        public Criteria andGoodsFormatGreaterThanOrEqualTo(String value) {
            addCriterion("goods_format >=", value, "goodsFormat");
            return (Criteria) this;
        }

        public Criteria andGoodsFormatLessThan(String value) {
            addCriterion("goods_format <", value, "goodsFormat");
            return (Criteria) this;
        }

        public Criteria andGoodsFormatLessThanOrEqualTo(String value) {
            addCriterion("goods_format <=", value, "goodsFormat");
            return (Criteria) this;
        }

        public Criteria andGoodsFormatLike(String value) {
            addCriterion("goods_format like", value, "goodsFormat");
            return (Criteria) this;
        }

        public Criteria andGoodsFormatNotLike(String value) {
            addCriterion("goods_format not like", value, "goodsFormat");
            return (Criteria) this;
        }

        public Criteria andGoodsFormatIn(List<String> values) {
            addCriterion("goods_format in", values, "goodsFormat");
            return (Criteria) this;
        }

        public Criteria andGoodsFormatNotIn(List<String> values) {
            addCriterion("goods_format not in", values, "goodsFormat");
            return (Criteria) this;
        }

        public Criteria andGoodsFormatBetween(String value1, String value2) {
            addCriterion("goods_format between", value1, value2, "goodsFormat");
            return (Criteria) this;
        }

        public Criteria andGoodsFormatNotBetween(String value1, String value2) {
            addCriterion("goods_format not between", value1, value2, "goodsFormat");
            return (Criteria) this;
        }

        public Criteria andUnitIdIsNull() {
            addCriterion("unit_id is null");
            return (Criteria) this;
        }

        public Criteria andUnitIdIsNotNull() {
            addCriterion("unit_id is not null");
            return (Criteria) this;
        }

        public Criteria andUnitIdEqualTo(Integer value) {
            addCriterion("unit_id =", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdNotEqualTo(Integer value) {
            addCriterion("unit_id <>", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdGreaterThan(Integer value) {
            addCriterion("unit_id >", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("unit_id >=", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdLessThan(Integer value) {
            addCriterion("unit_id <", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdLessThanOrEqualTo(Integer value) {
            addCriterion("unit_id <=", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdIn(List<Integer> values) {
            addCriterion("unit_id in", values, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdNotIn(List<Integer> values) {
            addCriterion("unit_id not in", values, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdBetween(Integer value1, Integer value2) {
            addCriterion("unit_id between", value1, value2, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdNotBetween(Integer value1, Integer value2) {
            addCriterion("unit_id not between", value1, value2, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitNameIsNull() {
            addCriterion("unit_name is null");
            return (Criteria) this;
        }

        public Criteria andUnitNameIsNotNull() {
            addCriterion("unit_name is not null");
            return (Criteria) this;
        }

        public Criteria andUnitNameEqualTo(String value) {
            addCriterion("unit_name =", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameNotEqualTo(String value) {
            addCriterion("unit_name <>", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameGreaterThan(String value) {
            addCriterion("unit_name >", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameGreaterThanOrEqualTo(String value) {
            addCriterion("unit_name >=", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameLessThan(String value) {
            addCriterion("unit_name <", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameLessThanOrEqualTo(String value) {
            addCriterion("unit_name <=", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameLike(String value) {
            addCriterion("unit_name like", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameNotLike(String value) {
            addCriterion("unit_name not like", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameIn(List<String> values) {
            addCriterion("unit_name in", values, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameNotIn(List<String> values) {
            addCriterion("unit_name not in", values, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameBetween(String value1, String value2) {
            addCriterion("unit_name between", value1, value2, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameNotBetween(String value1, String value2) {
            addCriterion("unit_name not between", value1, value2, "unitName");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Integer value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Integer value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Integer value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Integer value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Integer value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Integer> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Integer> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Integer value1, Integer value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andMinBatchIsNull() {
            addCriterion("min_batch is null");
            return (Criteria) this;
        }

        public Criteria andMinBatchIsNotNull() {
            addCriterion("min_batch is not null");
            return (Criteria) this;
        }

        public Criteria andMinBatchEqualTo(Integer value) {
            addCriterion("min_batch =", value, "minBatch");
            return (Criteria) this;
        }

        public Criteria andMinBatchNotEqualTo(Integer value) {
            addCriterion("min_batch <>", value, "minBatch");
            return (Criteria) this;
        }

        public Criteria andMinBatchGreaterThan(Integer value) {
            addCriterion("min_batch >", value, "minBatch");
            return (Criteria) this;
        }

        public Criteria andMinBatchGreaterThanOrEqualTo(Integer value) {
            addCriterion("min_batch >=", value, "minBatch");
            return (Criteria) this;
        }

        public Criteria andMinBatchLessThan(Integer value) {
            addCriterion("min_batch <", value, "minBatch");
            return (Criteria) this;
        }

        public Criteria andMinBatchLessThanOrEqualTo(Integer value) {
            addCriterion("min_batch <=", value, "minBatch");
            return (Criteria) this;
        }

        public Criteria andMinBatchIn(List<Integer> values) {
            addCriterion("min_batch in", values, "minBatch");
            return (Criteria) this;
        }

        public Criteria andMinBatchNotIn(List<Integer> values) {
            addCriterion("min_batch not in", values, "minBatch");
            return (Criteria) this;
        }

        public Criteria andMinBatchBetween(Integer value1, Integer value2) {
            addCriterion("min_batch between", value1, value2, "minBatch");
            return (Criteria) this;
        }

        public Criteria andMinBatchNotBetween(Integer value1, Integer value2) {
            addCriterion("min_batch not between", value1, value2, "minBatch");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountIsNull() {
            addCriterion("goods_amount is null");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountIsNotNull() {
            addCriterion("goods_amount is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountEqualTo(Integer value) {
            addCriterion("goods_amount =", value, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountNotEqualTo(Integer value) {
            addCriterion("goods_amount <>", value, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountGreaterThan(Integer value) {
            addCriterion("goods_amount >", value, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_amount >=", value, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountLessThan(Integer value) {
            addCriterion("goods_amount <", value, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountLessThanOrEqualTo(Integer value) {
            addCriterion("goods_amount <=", value, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountIn(List<Integer> values) {
            addCriterion("goods_amount in", values, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountNotIn(List<Integer> values) {
            addCriterion("goods_amount not in", values, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountBetween(Integer value1, Integer value2) {
            addCriterion("goods_amount between", value1, value2, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_amount not between", value1, value2, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andRetroactiveInformationIsNull() {
            addCriterion("retroactive_information is null");
            return (Criteria) this;
        }

        public Criteria andRetroactiveInformationIsNotNull() {
            addCriterion("retroactive_information is not null");
            return (Criteria) this;
        }

        public Criteria andRetroactiveInformationEqualTo(String value) {
            addCriterion("retroactive_information =", value, "retroactiveInformation");
            return (Criteria) this;
        }

        public Criteria andRetroactiveInformationNotEqualTo(String value) {
            addCriterion("retroactive_information <>", value, "retroactiveInformation");
            return (Criteria) this;
        }

        public Criteria andRetroactiveInformationGreaterThan(String value) {
            addCriterion("retroactive_information >", value, "retroactiveInformation");
            return (Criteria) this;
        }

        public Criteria andRetroactiveInformationGreaterThanOrEqualTo(String value) {
            addCriterion("retroactive_information >=", value, "retroactiveInformation");
            return (Criteria) this;
        }

        public Criteria andRetroactiveInformationLessThan(String value) {
            addCriterion("retroactive_information <", value, "retroactiveInformation");
            return (Criteria) this;
        }

        public Criteria andRetroactiveInformationLessThanOrEqualTo(String value) {
            addCriterion("retroactive_information <=", value, "retroactiveInformation");
            return (Criteria) this;
        }

        public Criteria andRetroactiveInformationLike(String value) {
            addCriterion("retroactive_information like", value, "retroactiveInformation");
            return (Criteria) this;
        }

        public Criteria andRetroactiveInformationNotLike(String value) {
            addCriterion("retroactive_information not like", value, "retroactiveInformation");
            return (Criteria) this;
        }

        public Criteria andRetroactiveInformationIn(List<String> values) {
            addCriterion("retroactive_information in", values, "retroactiveInformation");
            return (Criteria) this;
        }

        public Criteria andRetroactiveInformationNotIn(List<String> values) {
            addCriterion("retroactive_information not in", values, "retroactiveInformation");
            return (Criteria) this;
        }

        public Criteria andRetroactiveInformationBetween(String value1, String value2) {
            addCriterion("retroactive_information between", value1, value2, "retroactiveInformation");
            return (Criteria) this;
        }

        public Criteria andRetroactiveInformationNotBetween(String value1, String value2) {
            addCriterion("retroactive_information not between", value1, value2, "retroactiveInformation");
            return (Criteria) this;
        }

        public Criteria andPublisherAccountIsNull() {
            addCriterion("publisher_account is null");
            return (Criteria) this;
        }

        public Criteria andPublisherAccountIsNotNull() {
            addCriterion("publisher_account is not null");
            return (Criteria) this;
        }

        public Criteria andPublisherAccountEqualTo(String value) {
            addCriterion("publisher_account =", value, "publisherAccount");
            return (Criteria) this;
        }

        public Criteria andPublisherAccountNotEqualTo(String value) {
            addCriterion("publisher_account <>", value, "publisherAccount");
            return (Criteria) this;
        }

        public Criteria andPublisherAccountGreaterThan(String value) {
            addCriterion("publisher_account >", value, "publisherAccount");
            return (Criteria) this;
        }

        public Criteria andPublisherAccountGreaterThanOrEqualTo(String value) {
            addCriterion("publisher_account >=", value, "publisherAccount");
            return (Criteria) this;
        }

        public Criteria andPublisherAccountLessThan(String value) {
            addCriterion("publisher_account <", value, "publisherAccount");
            return (Criteria) this;
        }

        public Criteria andPublisherAccountLessThanOrEqualTo(String value) {
            addCriterion("publisher_account <=", value, "publisherAccount");
            return (Criteria) this;
        }

        public Criteria andPublisherAccountLike(String value) {
            addCriterion("publisher_account like", value, "publisherAccount");
            return (Criteria) this;
        }

        public Criteria andPublisherAccountNotLike(String value) {
            addCriterion("publisher_account not like", value, "publisherAccount");
            return (Criteria) this;
        }

        public Criteria andPublisherAccountIn(List<String> values) {
            addCriterion("publisher_account in", values, "publisherAccount");
            return (Criteria) this;
        }

        public Criteria andPublisherAccountNotIn(List<String> values) {
            addCriterion("publisher_account not in", values, "publisherAccount");
            return (Criteria) this;
        }

        public Criteria andPublisherAccountBetween(String value1, String value2) {
            addCriterion("publisher_account between", value1, value2, "publisherAccount");
            return (Criteria) this;
        }

        public Criteria andPublisherAccountNotBetween(String value1, String value2) {
            addCriterion("publisher_account not between", value1, value2, "publisherAccount");
            return (Criteria) this;
        }

        public Criteria andRealNameIsNull() {
            addCriterion("real_name is null");
            return (Criteria) this;
        }

        public Criteria andRealNameIsNotNull() {
            addCriterion("real_name is not null");
            return (Criteria) this;
        }

        public Criteria andRealNameEqualTo(String value) {
            addCriterion("real_name =", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotEqualTo(String value) {
            addCriterion("real_name <>", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameGreaterThan(String value) {
            addCriterion("real_name >", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameGreaterThanOrEqualTo(String value) {
            addCriterion("real_name >=", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLessThan(String value) {
            addCriterion("real_name <", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLessThanOrEqualTo(String value) {
            addCriterion("real_name <=", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLike(String value) {
            addCriterion("real_name like", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotLike(String value) {
            addCriterion("real_name not like", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameIn(List<String> values) {
            addCriterion("real_name in", values, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotIn(List<String> values) {
            addCriterion("real_name not in", values, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameBetween(String value1, String value2) {
            addCriterion("real_name between", value1, value2, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotBetween(String value1, String value2) {
            addCriterion("real_name not between", value1, value2, "realName");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressDetailIsNull() {
            addCriterion("address_detail is null");
            return (Criteria) this;
        }

        public Criteria andAddressDetailIsNotNull() {
            addCriterion("address_detail is not null");
            return (Criteria) this;
        }

        public Criteria andAddressDetailEqualTo(String value) {
            addCriterion("address_detail =", value, "addressDetail");
            return (Criteria) this;
        }

        public Criteria andAddressDetailNotEqualTo(String value) {
            addCriterion("address_detail <>", value, "addressDetail");
            return (Criteria) this;
        }

        public Criteria andAddressDetailGreaterThan(String value) {
            addCriterion("address_detail >", value, "addressDetail");
            return (Criteria) this;
        }

        public Criteria andAddressDetailGreaterThanOrEqualTo(String value) {
            addCriterion("address_detail >=", value, "addressDetail");
            return (Criteria) this;
        }

        public Criteria andAddressDetailLessThan(String value) {
            addCriterion("address_detail <", value, "addressDetail");
            return (Criteria) this;
        }

        public Criteria andAddressDetailLessThanOrEqualTo(String value) {
            addCriterion("address_detail <=", value, "addressDetail");
            return (Criteria) this;
        }

        public Criteria andAddressDetailLike(String value) {
            addCriterion("address_detail like", value, "addressDetail");
            return (Criteria) this;
        }

        public Criteria andAddressDetailNotLike(String value) {
            addCriterion("address_detail not like", value, "addressDetail");
            return (Criteria) this;
        }

        public Criteria andAddressDetailIn(List<String> values) {
            addCriterion("address_detail in", values, "addressDetail");
            return (Criteria) this;
        }

        public Criteria andAddressDetailNotIn(List<String> values) {
            addCriterion("address_detail not in", values, "addressDetail");
            return (Criteria) this;
        }

        public Criteria andAddressDetailBetween(String value1, String value2) {
            addCriterion("address_detail between", value1, value2, "addressDetail");
            return (Criteria) this;
        }

        public Criteria andAddressDetailNotBetween(String value1, String value2) {
            addCriterion("address_detail not between", value1, value2, "addressDetail");
            return (Criteria) this;
        }

        public Criteria andServiceIsNull() {
            addCriterion("service is null");
            return (Criteria) this;
        }

        public Criteria andServiceIsNotNull() {
            addCriterion("service is not null");
            return (Criteria) this;
        }

        public Criteria andServiceEqualTo(String value) {
            addCriterion("service =", value, "service");
            return (Criteria) this;
        }

        public Criteria andServiceNotEqualTo(String value) {
            addCriterion("service <>", value, "service");
            return (Criteria) this;
        }

        public Criteria andServiceGreaterThan(String value) {
            addCriterion("service >", value, "service");
            return (Criteria) this;
        }

        public Criteria andServiceGreaterThanOrEqualTo(String value) {
            addCriterion("service >=", value, "service");
            return (Criteria) this;
        }

        public Criteria andServiceLessThan(String value) {
            addCriterion("service <", value, "service");
            return (Criteria) this;
        }

        public Criteria andServiceLessThanOrEqualTo(String value) {
            addCriterion("service <=", value, "service");
            return (Criteria) this;
        }

        public Criteria andServiceLike(String value) {
            addCriterion("service like", value, "service");
            return (Criteria) this;
        }

        public Criteria andServiceNotLike(String value) {
            addCriterion("service not like", value, "service");
            return (Criteria) this;
        }

        public Criteria andServiceIn(List<String> values) {
            addCriterion("service in", values, "service");
            return (Criteria) this;
        }

        public Criteria andServiceNotIn(List<String> values) {
            addCriterion("service not in", values, "service");
            return (Criteria) this;
        }

        public Criteria andServiceBetween(String value1, String value2) {
            addCriterion("service between", value1, value2, "service");
            return (Criteria) this;
        }

        public Criteria andServiceNotBetween(String value1, String value2) {
            addCriterion("service not between", value1, value2, "service");
            return (Criteria) this;
        }

        public Criteria andImageUrlIsNull() {
            addCriterion("image_url is null");
            return (Criteria) this;
        }

        public Criteria andImageUrlIsNotNull() {
            addCriterion("image_url is not null");
            return (Criteria) this;
        }

        public Criteria andImageUrlEqualTo(String value) {
            addCriterion("image_url =", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlNotEqualTo(String value) {
            addCriterion("image_url <>", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlGreaterThan(String value) {
            addCriterion("image_url >", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlGreaterThanOrEqualTo(String value) {
            addCriterion("image_url >=", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlLessThan(String value) {
            addCriterion("image_url <", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlLessThanOrEqualTo(String value) {
            addCriterion("image_url <=", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlLike(String value) {
            addCriterion("image_url like", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlNotLike(String value) {
            addCriterion("image_url not like", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlIn(List<String> values) {
            addCriterion("image_url in", values, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlNotIn(List<String> values) {
            addCriterion("image_url not in", values, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlBetween(String value1, String value2) {
            addCriterion("image_url between", value1, value2, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlNotBetween(String value1, String value2) {
            addCriterion("image_url not between", value1, value2, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andDirectorNameIsNull() {
            addCriterion("director_name is null");
            return (Criteria) this;
        }

        public Criteria andDirectorNameIsNotNull() {
            addCriterion("director_name is not null");
            return (Criteria) this;
        }

        public Criteria andDirectorNameEqualTo(String value) {
            addCriterion("director_name =", value, "directorName");
            return (Criteria) this;
        }

        public Criteria andDirectorNameNotEqualTo(String value) {
            addCriterion("director_name <>", value, "directorName");
            return (Criteria) this;
        }

        public Criteria andDirectorNameGreaterThan(String value) {
            addCriterion("director_name >", value, "directorName");
            return (Criteria) this;
        }

        public Criteria andDirectorNameGreaterThanOrEqualTo(String value) {
            addCriterion("director_name >=", value, "directorName");
            return (Criteria) this;
        }

        public Criteria andDirectorNameLessThan(String value) {
            addCriterion("director_name <", value, "directorName");
            return (Criteria) this;
        }

        public Criteria andDirectorNameLessThanOrEqualTo(String value) {
            addCriterion("director_name <=", value, "directorName");
            return (Criteria) this;
        }

        public Criteria andDirectorNameLike(String value) {
            addCriterion("director_name like", value, "directorName");
            return (Criteria) this;
        }

        public Criteria andDirectorNameNotLike(String value) {
            addCriterion("director_name not like", value, "directorName");
            return (Criteria) this;
        }

        public Criteria andDirectorNameIn(List<String> values) {
            addCriterion("director_name in", values, "directorName");
            return (Criteria) this;
        }

        public Criteria andDirectorNameNotIn(List<String> values) {
            addCriterion("director_name not in", values, "directorName");
            return (Criteria) this;
        }

        public Criteria andDirectorNameBetween(String value1, String value2) {
            addCriterion("director_name between", value1, value2, "directorName");
            return (Criteria) this;
        }

        public Criteria andDirectorNameNotBetween(String value1, String value2) {
            addCriterion("director_name not between", value1, value2, "directorName");
            return (Criteria) this;
        }

        public Criteria andCertificationAuthIdIsNull() {
            addCriterion("certification_auth_id is null");
            return (Criteria) this;
        }

        public Criteria andCertificationAuthIdIsNotNull() {
            addCriterion("certification_auth_id is not null");
            return (Criteria) this;
        }

        public Criteria andCertificationAuthIdEqualTo(Integer value) {
            addCriterion("certification_auth_id =", value, "certificationAuthId");
            return (Criteria) this;
        }

        public Criteria andCertificationAuthIdNotEqualTo(Integer value) {
            addCriterion("certification_auth_id <>", value, "certificationAuthId");
            return (Criteria) this;
        }

        public Criteria andCertificationAuthIdGreaterThan(Integer value) {
            addCriterion("certification_auth_id >", value, "certificationAuthId");
            return (Criteria) this;
        }

        public Criteria andCertificationAuthIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("certification_auth_id >=", value, "certificationAuthId");
            return (Criteria) this;
        }

        public Criteria andCertificationAuthIdLessThan(Integer value) {
            addCriterion("certification_auth_id <", value, "certificationAuthId");
            return (Criteria) this;
        }

        public Criteria andCertificationAuthIdLessThanOrEqualTo(Integer value) {
            addCriterion("certification_auth_id <=", value, "certificationAuthId");
            return (Criteria) this;
        }

        public Criteria andCertificationAuthIdIn(List<Integer> values) {
            addCriterion("certification_auth_id in", values, "certificationAuthId");
            return (Criteria) this;
        }

        public Criteria andCertificationAuthIdNotIn(List<Integer> values) {
            addCriterion("certification_auth_id not in", values, "certificationAuthId");
            return (Criteria) this;
        }

        public Criteria andCertificationAuthIdBetween(Integer value1, Integer value2) {
            addCriterion("certification_auth_id between", value1, value2, "certificationAuthId");
            return (Criteria) this;
        }

        public Criteria andCertificationAuthIdNotBetween(Integer value1, Integer value2) {
            addCriterion("certification_auth_id not between", value1, value2, "certificationAuthId");
            return (Criteria) this;
        }

        public Criteria andCertificationAuthBrandNameIsNull() {
            addCriterion("certification_auth_brand_name is null");
            return (Criteria) this;
        }

        public Criteria andCertificationAuthBrandNameIsNotNull() {
            addCriterion("certification_auth_brand_name is not null");
            return (Criteria) this;
        }

        public Criteria andCertificationAuthBrandNameEqualTo(String value) {
            addCriterion("certification_auth_brand_name =", value, "certificationAuthBrandName");
            return (Criteria) this;
        }

        public Criteria andCertificationAuthBrandNameNotEqualTo(String value) {
            addCriterion("certification_auth_brand_name <>", value, "certificationAuthBrandName");
            return (Criteria) this;
        }

        public Criteria andCertificationAuthBrandNameGreaterThan(String value) {
            addCriterion("certification_auth_brand_name >", value, "certificationAuthBrandName");
            return (Criteria) this;
        }

        public Criteria andCertificationAuthBrandNameGreaterThanOrEqualTo(String value) {
            addCriterion("certification_auth_brand_name >=", value, "certificationAuthBrandName");
            return (Criteria) this;
        }

        public Criteria andCertificationAuthBrandNameLessThan(String value) {
            addCriterion("certification_auth_brand_name <", value, "certificationAuthBrandName");
            return (Criteria) this;
        }

        public Criteria andCertificationAuthBrandNameLessThanOrEqualTo(String value) {
            addCriterion("certification_auth_brand_name <=", value, "certificationAuthBrandName");
            return (Criteria) this;
        }

        public Criteria andCertificationAuthBrandNameLike(String value) {
            addCriterion("certification_auth_brand_name like", value, "certificationAuthBrandName");
            return (Criteria) this;
        }

        public Criteria andCertificationAuthBrandNameNotLike(String value) {
            addCriterion("certification_auth_brand_name not like", value, "certificationAuthBrandName");
            return (Criteria) this;
        }

        public Criteria andCertificationAuthBrandNameIn(List<String> values) {
            addCriterion("certification_auth_brand_name in", values, "certificationAuthBrandName");
            return (Criteria) this;
        }

        public Criteria andCertificationAuthBrandNameNotIn(List<String> values) {
            addCriterion("certification_auth_brand_name not in", values, "certificationAuthBrandName");
            return (Criteria) this;
        }

        public Criteria andCertificationAuthBrandNameBetween(String value1, String value2) {
            addCriterion("certification_auth_brand_name between", value1, value2, "certificationAuthBrandName");
            return (Criteria) this;
        }

        public Criteria andCertificationAuthBrandNameNotBetween(String value1, String value2) {
            addCriterion("certification_auth_brand_name not between", value1, value2, "certificationAuthBrandName");
            return (Criteria) this;
        }

        public Criteria andIdentityIdIsNull() {
            addCriterion("identity_id is null");
            return (Criteria) this;
        }

        public Criteria andIdentityIdIsNotNull() {
            addCriterion("identity_id is not null");
            return (Criteria) this;
        }

        public Criteria andIdentityIdEqualTo(String value) {
            addCriterion("identity_id =", value, "identityId");
            return (Criteria) this;
        }

        public Criteria andIdentityIdNotEqualTo(String value) {
            addCriterion("identity_id <>", value, "identityId");
            return (Criteria) this;
        }

        public Criteria andIdentityIdGreaterThan(String value) {
            addCriterion("identity_id >", value, "identityId");
            return (Criteria) this;
        }

        public Criteria andIdentityIdGreaterThanOrEqualTo(String value) {
            addCriterion("identity_id >=", value, "identityId");
            return (Criteria) this;
        }

        public Criteria andIdentityIdLessThan(String value) {
            addCriterion("identity_id <", value, "identityId");
            return (Criteria) this;
        }

        public Criteria andIdentityIdLessThanOrEqualTo(String value) {
            addCriterion("identity_id <=", value, "identityId");
            return (Criteria) this;
        }

        public Criteria andIdentityIdLike(String value) {
            addCriterion("identity_id like", value, "identityId");
            return (Criteria) this;
        }

        public Criteria andIdentityIdNotLike(String value) {
            addCriterion("identity_id not like", value, "identityId");
            return (Criteria) this;
        }

        public Criteria andIdentityIdIn(List<String> values) {
            addCriterion("identity_id in", values, "identityId");
            return (Criteria) this;
        }

        public Criteria andIdentityIdNotIn(List<String> values) {
            addCriterion("identity_id not in", values, "identityId");
            return (Criteria) this;
        }

        public Criteria andIdentityIdBetween(String value1, String value2) {
            addCriterion("identity_id between", value1, value2, "identityId");
            return (Criteria) this;
        }

        public Criteria andIdentityIdNotBetween(String value1, String value2) {
            addCriterion("identity_id not between", value1, value2, "identityId");
            return (Criteria) this;
        }

        public Criteria andIdentityNameIsNull() {
            addCriterion("identity_name is null");
            return (Criteria) this;
        }

        public Criteria andIdentityNameIsNotNull() {
            addCriterion("identity_name is not null");
            return (Criteria) this;
        }

        public Criteria andIdentityNameEqualTo(String value) {
            addCriterion("identity_name =", value, "identityName");
            return (Criteria) this;
        }

        public Criteria andIdentityNameNotEqualTo(String value) {
            addCriterion("identity_name <>", value, "identityName");
            return (Criteria) this;
        }

        public Criteria andIdentityNameGreaterThan(String value) {
            addCriterion("identity_name >", value, "identityName");
            return (Criteria) this;
        }

        public Criteria andIdentityNameGreaterThanOrEqualTo(String value) {
            addCriterion("identity_name >=", value, "identityName");
            return (Criteria) this;
        }

        public Criteria andIdentityNameLessThan(String value) {
            addCriterion("identity_name <", value, "identityName");
            return (Criteria) this;
        }

        public Criteria andIdentityNameLessThanOrEqualTo(String value) {
            addCriterion("identity_name <=", value, "identityName");
            return (Criteria) this;
        }

        public Criteria andIdentityNameLike(String value) {
            addCriterion("identity_name like", value, "identityName");
            return (Criteria) this;
        }

        public Criteria andIdentityNameNotLike(String value) {
            addCriterion("identity_name not like", value, "identityName");
            return (Criteria) this;
        }

        public Criteria andIdentityNameIn(List<String> values) {
            addCriterion("identity_name in", values, "identityName");
            return (Criteria) this;
        }

        public Criteria andIdentityNameNotIn(List<String> values) {
            addCriterion("identity_name not in", values, "identityName");
            return (Criteria) this;
        }

        public Criteria andIdentityNameBetween(String value1, String value2) {
            addCriterion("identity_name between", value1, value2, "identityName");
            return (Criteria) this;
        }

        public Criteria andIdentityNameNotBetween(String value1, String value2) {
            addCriterion("identity_name not between", value1, value2, "identityName");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdIsNull() {
            addCriterion("update_user_id is null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdIsNotNull() {
            addCriterion("update_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdEqualTo(String value) {
            addCriterion("update_user_id =", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdNotEqualTo(String value) {
            addCriterion("update_user_id <>", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdGreaterThan(String value) {
            addCriterion("update_user_id >", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("update_user_id >=", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdLessThan(String value) {
            addCriterion("update_user_id <", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdLessThanOrEqualTo(String value) {
            addCriterion("update_user_id <=", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdLike(String value) {
            addCriterion("update_user_id like", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdNotLike(String value) {
            addCriterion("update_user_id not like", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdIn(List<String> values) {
            addCriterion("update_user_id in", values, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdNotIn(List<String> values) {
            addCriterion("update_user_id not in", values, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdBetween(String value1, String value2) {
            addCriterion("update_user_id between", value1, value2, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdNotBetween(String value1, String value2) {
            addCriterion("update_user_id not between", value1, value2, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIsNull() {
            addCriterion("create_user_id is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIsNotNull() {
            addCriterion("create_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdEqualTo(String value) {
            addCriterion("create_user_id =", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotEqualTo(String value) {
            addCriterion("create_user_id <>", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdGreaterThan(String value) {
            addCriterion("create_user_id >", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("create_user_id >=", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLessThan(String value) {
            addCriterion("create_user_id <", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLessThanOrEqualTo(String value) {
            addCriterion("create_user_id <=", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLike(String value) {
            addCriterion("create_user_id like", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotLike(String value) {
            addCriterion("create_user_id not like", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIn(List<String> values) {
            addCriterion("create_user_id in", values, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotIn(List<String> values) {
            addCriterion("create_user_id not in", values, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdBetween(String value1, String value2) {
            addCriterion("create_user_id between", value1, value2, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotBetween(String value1, String value2) {
            addCriterion("create_user_id not between", value1, value2, "createUserId");
            return (Criteria) this;
        }

        public Criteria andSellpointIsNull() {
            addCriterion("sellPoint is null");
            return (Criteria) this;
        }

        public Criteria andSellpointIsNotNull() {
            addCriterion("sellPoint is not null");
            return (Criteria) this;
        }

        public Criteria andSellpointEqualTo(String value) {
            addCriterion("sellPoint =", value, "sellpoint");
            return (Criteria) this;
        }

        public Criteria andSellpointNotEqualTo(String value) {
            addCriterion("sellPoint <>", value, "sellpoint");
            return (Criteria) this;
        }

        public Criteria andSellpointGreaterThan(String value) {
            addCriterion("sellPoint >", value, "sellpoint");
            return (Criteria) this;
        }

        public Criteria andSellpointGreaterThanOrEqualTo(String value) {
            addCriterion("sellPoint >=", value, "sellpoint");
            return (Criteria) this;
        }

        public Criteria andSellpointLessThan(String value) {
            addCriterion("sellPoint <", value, "sellpoint");
            return (Criteria) this;
        }

        public Criteria andSellpointLessThanOrEqualTo(String value) {
            addCriterion("sellPoint <=", value, "sellpoint");
            return (Criteria) this;
        }

        public Criteria andSellpointLike(String value) {
            addCriterion("sellPoint like", value, "sellpoint");
            return (Criteria) this;
        }

        public Criteria andSellpointNotLike(String value) {
            addCriterion("sellPoint not like", value, "sellpoint");
            return (Criteria) this;
        }

        public Criteria andSellpointIn(List<String> values) {
            addCriterion("sellPoint in", values, "sellpoint");
            return (Criteria) this;
        }

        public Criteria andSellpointNotIn(List<String> values) {
            addCriterion("sellPoint not in", values, "sellpoint");
            return (Criteria) this;
        }

        public Criteria andSellpointBetween(String value1, String value2) {
            addCriterion("sellPoint between", value1, value2, "sellpoint");
            return (Criteria) this;
        }

        public Criteria andSellpointNotBetween(String value1, String value2) {
            addCriterion("sellPoint not between", value1, value2, "sellpoint");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}