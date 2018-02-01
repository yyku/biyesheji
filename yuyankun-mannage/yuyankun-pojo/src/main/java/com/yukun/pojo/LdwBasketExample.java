package com.yukun.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LdwBasketExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LdwBasketExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andBasketNumberIsNull() {
            addCriterion("basket_number is null");
            return (Criteria) this;
        }

        public Criteria andBasketNumberIsNotNull() {
            addCriterion("basket_number is not null");
            return (Criteria) this;
        }

        public Criteria andBasketNumberEqualTo(String value) {
            addCriterion("basket_number =", value, "basketNumber");
            return (Criteria) this;
        }

        public Criteria andBasketNumberNotEqualTo(String value) {
            addCriterion("basket_number <>", value, "basketNumber");
            return (Criteria) this;
        }

        public Criteria andBasketNumberGreaterThan(String value) {
            addCriterion("basket_number >", value, "basketNumber");
            return (Criteria) this;
        }

        public Criteria andBasketNumberGreaterThanOrEqualTo(String value) {
            addCriterion("basket_number >=", value, "basketNumber");
            return (Criteria) this;
        }

        public Criteria andBasketNumberLessThan(String value) {
            addCriterion("basket_number <", value, "basketNumber");
            return (Criteria) this;
        }

        public Criteria andBasketNumberLessThanOrEqualTo(String value) {
            addCriterion("basket_number <=", value, "basketNumber");
            return (Criteria) this;
        }

        public Criteria andBasketNumberLike(String value) {
            addCriterion("basket_number like", value, "basketNumber");
            return (Criteria) this;
        }

        public Criteria andBasketNumberNotLike(String value) {
            addCriterion("basket_number not like", value, "basketNumber");
            return (Criteria) this;
        }

        public Criteria andBasketNumberIn(List<String> values) {
            addCriterion("basket_number in", values, "basketNumber");
            return (Criteria) this;
        }

        public Criteria andBasketNumberNotIn(List<String> values) {
            addCriterion("basket_number not in", values, "basketNumber");
            return (Criteria) this;
        }

        public Criteria andBasketNumberBetween(String value1, String value2) {
            addCriterion("basket_number between", value1, value2, "basketNumber");
            return (Criteria) this;
        }

        public Criteria andBasketNumberNotBetween(String value1, String value2) {
            addCriterion("basket_number not between", value1, value2, "basketNumber");
            return (Criteria) this;
        }

        public Criteria andRfIdIsNull() {
            addCriterion("rf_id is null");
            return (Criteria) this;
        }

        public Criteria andRfIdIsNotNull() {
            addCriterion("rf_id is not null");
            return (Criteria) this;
        }

        public Criteria andRfIdEqualTo(String value) {
            addCriterion("rf_id =", value, "rfId");
            return (Criteria) this;
        }

        public Criteria andRfIdNotEqualTo(String value) {
            addCriterion("rf_id <>", value, "rfId");
            return (Criteria) this;
        }

        public Criteria andRfIdGreaterThan(String value) {
            addCriterion("rf_id >", value, "rfId");
            return (Criteria) this;
        }

        public Criteria andRfIdGreaterThanOrEqualTo(String value) {
            addCriterion("rf_id >=", value, "rfId");
            return (Criteria) this;
        }

        public Criteria andRfIdLessThan(String value) {
            addCriterion("rf_id <", value, "rfId");
            return (Criteria) this;
        }

        public Criteria andRfIdLessThanOrEqualTo(String value) {
            addCriterion("rf_id <=", value, "rfId");
            return (Criteria) this;
        }

        public Criteria andRfIdLike(String value) {
            addCriterion("rf_id like", value, "rfId");
            return (Criteria) this;
        }

        public Criteria andRfIdNotLike(String value) {
            addCriterion("rf_id not like", value, "rfId");
            return (Criteria) this;
        }

        public Criteria andRfIdIn(List<String> values) {
            addCriterion("rf_id in", values, "rfId");
            return (Criteria) this;
        }

        public Criteria andRfIdNotIn(List<String> values) {
            addCriterion("rf_id not in", values, "rfId");
            return (Criteria) this;
        }

        public Criteria andRfIdBetween(String value1, String value2) {
            addCriterion("rf_id between", value1, value2, "rfId");
            return (Criteria) this;
        }

        public Criteria andRfIdNotBetween(String value1, String value2) {
            addCriterion("rf_id not between", value1, value2, "rfId");
            return (Criteria) this;
        }

        public Criteria andBasketTypeIdIsNull() {
            addCriterion("basket_type_id is null");
            return (Criteria) this;
        }

        public Criteria andBasketTypeIdIsNotNull() {
            addCriterion("basket_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andBasketTypeIdEqualTo(Long value) {
            addCriterion("basket_type_id =", value, "basketTypeId");
            return (Criteria) this;
        }

        public Criteria andBasketTypeIdNotEqualTo(Long value) {
            addCriterion("basket_type_id <>", value, "basketTypeId");
            return (Criteria) this;
        }

        public Criteria andBasketTypeIdGreaterThan(Long value) {
            addCriterion("basket_type_id >", value, "basketTypeId");
            return (Criteria) this;
        }

        public Criteria andBasketTypeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("basket_type_id >=", value, "basketTypeId");
            return (Criteria) this;
        }

        public Criteria andBasketTypeIdLessThan(Long value) {
            addCriterion("basket_type_id <", value, "basketTypeId");
            return (Criteria) this;
        }

        public Criteria andBasketTypeIdLessThanOrEqualTo(Long value) {
            addCriterion("basket_type_id <=", value, "basketTypeId");
            return (Criteria) this;
        }

        public Criteria andBasketTypeIdIn(List<Long> values) {
            addCriterion("basket_type_id in", values, "basketTypeId");
            return (Criteria) this;
        }

        public Criteria andBasketTypeIdNotIn(List<Long> values) {
            addCriterion("basket_type_id not in", values, "basketTypeId");
            return (Criteria) this;
        }

        public Criteria andBasketTypeIdBetween(Long value1, Long value2) {
            addCriterion("basket_type_id between", value1, value2, "basketTypeId");
            return (Criteria) this;
        }

        public Criteria andBasketTypeIdNotBetween(Long value1, Long value2) {
            addCriterion("basket_type_id not between", value1, value2, "basketTypeId");
            return (Criteria) this;
        }

        public Criteria andBasketTypeNameIsNull() {
            addCriterion("basket_type_name is null");
            return (Criteria) this;
        }

        public Criteria andBasketTypeNameIsNotNull() {
            addCriterion("basket_type_name is not null");
            return (Criteria) this;
        }

        public Criteria andBasketTypeNameEqualTo(String value) {
            addCriterion("basket_type_name =", value, "basketTypeName");
            return (Criteria) this;
        }

        public Criteria andBasketTypeNameNotEqualTo(String value) {
            addCriterion("basket_type_name <>", value, "basketTypeName");
            return (Criteria) this;
        }

        public Criteria andBasketTypeNameGreaterThan(String value) {
            addCriterion("basket_type_name >", value, "basketTypeName");
            return (Criteria) this;
        }

        public Criteria andBasketTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("basket_type_name >=", value, "basketTypeName");
            return (Criteria) this;
        }

        public Criteria andBasketTypeNameLessThan(String value) {
            addCriterion("basket_type_name <", value, "basketTypeName");
            return (Criteria) this;
        }

        public Criteria andBasketTypeNameLessThanOrEqualTo(String value) {
            addCriterion("basket_type_name <=", value, "basketTypeName");
            return (Criteria) this;
        }

        public Criteria andBasketTypeNameLike(String value) {
            addCriterion("basket_type_name like", value, "basketTypeName");
            return (Criteria) this;
        }

        public Criteria andBasketTypeNameNotLike(String value) {
            addCriterion("basket_type_name not like", value, "basketTypeName");
            return (Criteria) this;
        }

        public Criteria andBasketTypeNameIn(List<String> values) {
            addCriterion("basket_type_name in", values, "basketTypeName");
            return (Criteria) this;
        }

        public Criteria andBasketTypeNameNotIn(List<String> values) {
            addCriterion("basket_type_name not in", values, "basketTypeName");
            return (Criteria) this;
        }

        public Criteria andBasketTypeNameBetween(String value1, String value2) {
            addCriterion("basket_type_name between", value1, value2, "basketTypeName");
            return (Criteria) this;
        }

        public Criteria andBasketTypeNameNotBetween(String value1, String value2) {
            addCriterion("basket_type_name not between", value1, value2, "basketTypeName");
            return (Criteria) this;
        }

        public Criteria andBasketStatusIsNull() {
            addCriterion("basket_status is null");
            return (Criteria) this;
        }

        public Criteria andBasketStatusIsNotNull() {
            addCriterion("basket_status is not null");
            return (Criteria) this;
        }

        public Criteria andBasketStatusEqualTo(Integer value) {
            addCriterion("basket_status =", value, "basketStatus");
            return (Criteria) this;
        }

        public Criteria andBasketStatusNotEqualTo(Integer value) {
            addCriterion("basket_status <>", value, "basketStatus");
            return (Criteria) this;
        }

        public Criteria andBasketStatusGreaterThan(Integer value) {
            addCriterion("basket_status >", value, "basketStatus");
            return (Criteria) this;
        }

        public Criteria andBasketStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("basket_status >=", value, "basketStatus");
            return (Criteria) this;
        }

        public Criteria andBasketStatusLessThan(Integer value) {
            addCriterion("basket_status <", value, "basketStatus");
            return (Criteria) this;
        }

        public Criteria andBasketStatusLessThanOrEqualTo(Integer value) {
            addCriterion("basket_status <=", value, "basketStatus");
            return (Criteria) this;
        }

        public Criteria andBasketStatusIn(List<Integer> values) {
            addCriterion("basket_status in", values, "basketStatus");
            return (Criteria) this;
        }

        public Criteria andBasketStatusNotIn(List<Integer> values) {
            addCriterion("basket_status not in", values, "basketStatus");
            return (Criteria) this;
        }

        public Criteria andBasketStatusBetween(Integer value1, Integer value2) {
            addCriterion("basket_status between", value1, value2, "basketStatus");
            return (Criteria) this;
        }

        public Criteria andBasketStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("basket_status not between", value1, value2, "basketStatus");
            return (Criteria) this;
        }

        public Criteria andBasketUseNumberIsNull() {
            addCriterion("basket_use_number is null");
            return (Criteria) this;
        }

        public Criteria andBasketUseNumberIsNotNull() {
            addCriterion("basket_use_number is not null");
            return (Criteria) this;
        }

        public Criteria andBasketUseNumberEqualTo(Integer value) {
            addCriterion("basket_use_number =", value, "basketUseNumber");
            return (Criteria) this;
        }

        public Criteria andBasketUseNumberNotEqualTo(Integer value) {
            addCriterion("basket_use_number <>", value, "basketUseNumber");
            return (Criteria) this;
        }

        public Criteria andBasketUseNumberGreaterThan(Integer value) {
            addCriterion("basket_use_number >", value, "basketUseNumber");
            return (Criteria) this;
        }

        public Criteria andBasketUseNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("basket_use_number >=", value, "basketUseNumber");
            return (Criteria) this;
        }

        public Criteria andBasketUseNumberLessThan(Integer value) {
            addCriterion("basket_use_number <", value, "basketUseNumber");
            return (Criteria) this;
        }

        public Criteria andBasketUseNumberLessThanOrEqualTo(Integer value) {
            addCriterion("basket_use_number <=", value, "basketUseNumber");
            return (Criteria) this;
        }

        public Criteria andBasketUseNumberIn(List<Integer> values) {
            addCriterion("basket_use_number in", values, "basketUseNumber");
            return (Criteria) this;
        }

        public Criteria andBasketUseNumberNotIn(List<Integer> values) {
            addCriterion("basket_use_number not in", values, "basketUseNumber");
            return (Criteria) this;
        }

        public Criteria andBasketUseNumberBetween(Integer value1, Integer value2) {
            addCriterion("basket_use_number between", value1, value2, "basketUseNumber");
            return (Criteria) this;
        }

        public Criteria andBasketUseNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("basket_use_number not between", value1, value2, "basketUseNumber");
            return (Criteria) this;
        }

        public Criteria andOperationCenterIdIsNull() {
            addCriterion("operation_center_id is null");
            return (Criteria) this;
        }

        public Criteria andOperationCenterIdIsNotNull() {
            addCriterion("operation_center_id is not null");
            return (Criteria) this;
        }

        public Criteria andOperationCenterIdEqualTo(Long value) {
            addCriterion("operation_center_id =", value, "operationCenterId");
            return (Criteria) this;
        }

        public Criteria andOperationCenterIdNotEqualTo(Long value) {
            addCriterion("operation_center_id <>", value, "operationCenterId");
            return (Criteria) this;
        }

        public Criteria andOperationCenterIdGreaterThan(Long value) {
            addCriterion("operation_center_id >", value, "operationCenterId");
            return (Criteria) this;
        }

        public Criteria andOperationCenterIdGreaterThanOrEqualTo(Long value) {
            addCriterion("operation_center_id >=", value, "operationCenterId");
            return (Criteria) this;
        }

        public Criteria andOperationCenterIdLessThan(Long value) {
            addCriterion("operation_center_id <", value, "operationCenterId");
            return (Criteria) this;
        }

        public Criteria andOperationCenterIdLessThanOrEqualTo(Long value) {
            addCriterion("operation_center_id <=", value, "operationCenterId");
            return (Criteria) this;
        }

        public Criteria andOperationCenterIdIn(List<Long> values) {
            addCriterion("operation_center_id in", values, "operationCenterId");
            return (Criteria) this;
        }

        public Criteria andOperationCenterIdNotIn(List<Long> values) {
            addCriterion("operation_center_id not in", values, "operationCenterId");
            return (Criteria) this;
        }

        public Criteria andOperationCenterIdBetween(Long value1, Long value2) {
            addCriterion("operation_center_id between", value1, value2, "operationCenterId");
            return (Criteria) this;
        }

        public Criteria andOperationCenterIdNotBetween(Long value1, Long value2) {
            addCriterion("operation_center_id not between", value1, value2, "operationCenterId");
            return (Criteria) this;
        }

        public Criteria andNowUserIdIsNull() {
            addCriterion("now_user_id is null");
            return (Criteria) this;
        }

        public Criteria andNowUserIdIsNotNull() {
            addCriterion("now_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andNowUserIdEqualTo(Long value) {
            addCriterion("now_user_id =", value, "nowUserId");
            return (Criteria) this;
        }

        public Criteria andNowUserIdNotEqualTo(Long value) {
            addCriterion("now_user_id <>", value, "nowUserId");
            return (Criteria) this;
        }

        public Criteria andNowUserIdGreaterThan(Long value) {
            addCriterion("now_user_id >", value, "nowUserId");
            return (Criteria) this;
        }

        public Criteria andNowUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("now_user_id >=", value, "nowUserId");
            return (Criteria) this;
        }

        public Criteria andNowUserIdLessThan(Long value) {
            addCriterion("now_user_id <", value, "nowUserId");
            return (Criteria) this;
        }

        public Criteria andNowUserIdLessThanOrEqualTo(Long value) {
            addCriterion("now_user_id <=", value, "nowUserId");
            return (Criteria) this;
        }

        public Criteria andNowUserIdIn(List<Long> values) {
            addCriterion("now_user_id in", values, "nowUserId");
            return (Criteria) this;
        }

        public Criteria andNowUserIdNotIn(List<Long> values) {
            addCriterion("now_user_id not in", values, "nowUserId");
            return (Criteria) this;
        }

        public Criteria andNowUserIdBetween(Long value1, Long value2) {
            addCriterion("now_user_id between", value1, value2, "nowUserId");
            return (Criteria) this;
        }

        public Criteria andNowUserIdNotBetween(Long value1, Long value2) {
            addCriterion("now_user_id not between", value1, value2, "nowUserId");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNull() {
            addCriterion("update_date is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("update_date is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(Date value) {
            addCriterion("update_date =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterion("update_date <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterion("update_date >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("update_date >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterion("update_date <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("update_date <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<Date> values) {
            addCriterion("update_date in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<Date> values) {
            addCriterion("update_date not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(Date value1, Date value2) {
            addCriterion("update_date between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("update_date not between", value1, value2, "updateDate");
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

        public Criteria andCreateUserIdEqualTo(Long value) {
            addCriterion("create_user_id =", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotEqualTo(Long value) {
            addCriterion("create_user_id <>", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdGreaterThan(Long value) {
            addCriterion("create_user_id >", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("create_user_id >=", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLessThan(Long value) {
            addCriterion("create_user_id <", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLessThanOrEqualTo(Long value) {
            addCriterion("create_user_id <=", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIn(List<Long> values) {
            addCriterion("create_user_id in", values, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotIn(List<Long> values) {
            addCriterion("create_user_id not in", values, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdBetween(Long value1, Long value2) {
            addCriterion("create_user_id between", value1, value2, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotBetween(Long value1, Long value2) {
            addCriterion("create_user_id not between", value1, value2, "createUserId");
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

        public Criteria andUpdateUserIdEqualTo(Long value) {
            addCriterion("update_user_id =", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdNotEqualTo(Long value) {
            addCriterion("update_user_id <>", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdGreaterThan(Long value) {
            addCriterion("update_user_id >", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("update_user_id >=", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdLessThan(Long value) {
            addCriterion("update_user_id <", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdLessThanOrEqualTo(Long value) {
            addCriterion("update_user_id <=", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdIn(List<Long> values) {
            addCriterion("update_user_id in", values, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdNotIn(List<Long> values) {
            addCriterion("update_user_id not in", values, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdBetween(Long value1, Long value2) {
            addCriterion("update_user_id between", value1, value2, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdNotBetween(Long value1, Long value2) {
            addCriterion("update_user_id not between", value1, value2, "updateUserId");
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

        public Criteria andIsDeleteEqualTo(Byte value) {
            addCriterion("is_delete =", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotEqualTo(Byte value) {
            addCriterion("is_delete <>", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThan(Byte value) {
            addCriterion("is_delete >", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_delete >=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThan(Byte value) {
            addCriterion("is_delete <", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThanOrEqualTo(Byte value) {
            addCriterion("is_delete <=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIn(List<Byte> values) {
            addCriterion("is_delete in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotIn(List<Byte> values) {
            addCriterion("is_delete not in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteBetween(Byte value1, Byte value2) {
            addCriterion("is_delete between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotBetween(Byte value1, Byte value2) {
            addCriterion("is_delete not between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andBasketLeaseIdIsNull() {
            addCriterion("basket_lease_id is null");
            return (Criteria) this;
        }

        public Criteria andBasketLeaseIdIsNotNull() {
            addCriterion("basket_lease_id is not null");
            return (Criteria) this;
        }

        public Criteria andBasketLeaseIdEqualTo(Long value) {
            addCriterion("basket_lease_id =", value, "basketLeaseId");
            return (Criteria) this;
        }

        public Criteria andBasketLeaseIdNotEqualTo(Long value) {
            addCriterion("basket_lease_id <>", value, "basketLeaseId");
            return (Criteria) this;
        }

        public Criteria andBasketLeaseIdGreaterThan(Long value) {
            addCriterion("basket_lease_id >", value, "basketLeaseId");
            return (Criteria) this;
        }

        public Criteria andBasketLeaseIdGreaterThanOrEqualTo(Long value) {
            addCriterion("basket_lease_id >=", value, "basketLeaseId");
            return (Criteria) this;
        }

        public Criteria andBasketLeaseIdLessThan(Long value) {
            addCriterion("basket_lease_id <", value, "basketLeaseId");
            return (Criteria) this;
        }

        public Criteria andBasketLeaseIdLessThanOrEqualTo(Long value) {
            addCriterion("basket_lease_id <=", value, "basketLeaseId");
            return (Criteria) this;
        }

        public Criteria andBasketLeaseIdIn(List<Long> values) {
            addCriterion("basket_lease_id in", values, "basketLeaseId");
            return (Criteria) this;
        }

        public Criteria andBasketLeaseIdNotIn(List<Long> values) {
            addCriterion("basket_lease_id not in", values, "basketLeaseId");
            return (Criteria) this;
        }

        public Criteria andBasketLeaseIdBetween(Long value1, Long value2) {
            addCriterion("basket_lease_id between", value1, value2, "basketLeaseId");
            return (Criteria) this;
        }

        public Criteria andBasketLeaseIdNotBetween(Long value1, Long value2) {
            addCriterion("basket_lease_id not between", value1, value2, "basketLeaseId");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("version is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("version is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(Integer value) {
            addCriterion("version =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(Integer value) {
            addCriterion("version <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(Integer value) {
            addCriterion("version >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(Integer value) {
            addCriterion("version >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(Integer value) {
            addCriterion("version <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(Integer value) {
            addCriterion("version <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<Integer> values) {
            addCriterion("version in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<Integer> values) {
            addCriterion("version not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(Integer value1, Integer value2) {
            addCriterion("version between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(Integer value1, Integer value2) {
            addCriterion("version not between", value1, value2, "version");
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