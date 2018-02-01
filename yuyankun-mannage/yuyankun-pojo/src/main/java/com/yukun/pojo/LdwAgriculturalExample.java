package com.yukun.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LdwAgriculturalExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LdwAgriculturalExample() {
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

        public Criteria andAgriculturalNameIsNull() {
            addCriterion("agricultural_name is null");
            return (Criteria) this;
        }

        public Criteria andAgriculturalNameIsNotNull() {
            addCriterion("agricultural_name is not null");
            return (Criteria) this;
        }

        public Criteria andAgriculturalNameEqualTo(String value) {
            addCriterion("agricultural_name =", value, "agriculturalName");
            return (Criteria) this;
        }

        public Criteria andAgriculturalNameNotEqualTo(String value) {
            addCriterion("agricultural_name <>", value, "agriculturalName");
            return (Criteria) this;
        }

        public Criteria andAgriculturalNameGreaterThan(String value) {
            addCriterion("agricultural_name >", value, "agriculturalName");
            return (Criteria) this;
        }

        public Criteria andAgriculturalNameGreaterThanOrEqualTo(String value) {
            addCriterion("agricultural_name >=", value, "agriculturalName");
            return (Criteria) this;
        }

        public Criteria andAgriculturalNameLessThan(String value) {
            addCriterion("agricultural_name <", value, "agriculturalName");
            return (Criteria) this;
        }

        public Criteria andAgriculturalNameLessThanOrEqualTo(String value) {
            addCriterion("agricultural_name <=", value, "agriculturalName");
            return (Criteria) this;
        }

        public Criteria andAgriculturalNameLike(String value) {
            addCriterion("agricultural_name like", value, "agriculturalName");
            return (Criteria) this;
        }

        public Criteria andAgriculturalNameNotLike(String value) {
            addCriterion("agricultural_name not like", value, "agriculturalName");
            return (Criteria) this;
        }

        public Criteria andAgriculturalNameIn(List<String> values) {
            addCriterion("agricultural_name in", values, "agriculturalName");
            return (Criteria) this;
        }

        public Criteria andAgriculturalNameNotIn(List<String> values) {
            addCriterion("agricultural_name not in", values, "agriculturalName");
            return (Criteria) this;
        }

        public Criteria andAgriculturalNameBetween(String value1, String value2) {
            addCriterion("agricultural_name between", value1, value2, "agriculturalName");
            return (Criteria) this;
        }

        public Criteria andAgriculturalNameNotBetween(String value1, String value2) {
            addCriterion("agricultural_name not between", value1, value2, "agriculturalName");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andAgriculturalGradeIsNull() {
            addCriterion("agricultural_grade is null");
            return (Criteria) this;
        }

        public Criteria andAgriculturalGradeIsNotNull() {
            addCriterion("agricultural_grade is not null");
            return (Criteria) this;
        }

        public Criteria andAgriculturalGradeEqualTo(Integer value) {
            addCriterion("agricultural_grade =", value, "agriculturalGrade");
            return (Criteria) this;
        }

        public Criteria andAgriculturalGradeNotEqualTo(Integer value) {
            addCriterion("agricultural_grade <>", value, "agriculturalGrade");
            return (Criteria) this;
        }

        public Criteria andAgriculturalGradeGreaterThan(Integer value) {
            addCriterion("agricultural_grade >", value, "agriculturalGrade");
            return (Criteria) this;
        }

        public Criteria andAgriculturalGradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("agricultural_grade >=", value, "agriculturalGrade");
            return (Criteria) this;
        }

        public Criteria andAgriculturalGradeLessThan(Integer value) {
            addCriterion("agricultural_grade <", value, "agriculturalGrade");
            return (Criteria) this;
        }

        public Criteria andAgriculturalGradeLessThanOrEqualTo(Integer value) {
            addCriterion("agricultural_grade <=", value, "agriculturalGrade");
            return (Criteria) this;
        }

        public Criteria andAgriculturalGradeIn(List<Integer> values) {
            addCriterion("agricultural_grade in", values, "agriculturalGrade");
            return (Criteria) this;
        }

        public Criteria andAgriculturalGradeNotIn(List<Integer> values) {
            addCriterion("agricultural_grade not in", values, "agriculturalGrade");
            return (Criteria) this;
        }

        public Criteria andAgriculturalGradeBetween(Integer value1, Integer value2) {
            addCriterion("agricultural_grade between", value1, value2, "agriculturalGrade");
            return (Criteria) this;
        }

        public Criteria andAgriculturalGradeNotBetween(Integer value1, Integer value2) {
            addCriterion("agricultural_grade not between", value1, value2, "agriculturalGrade");
            return (Criteria) this;
        }

        public Criteria andAgriculturalGradeNameIsNull() {
            addCriterion("agricultural_grade_name is null");
            return (Criteria) this;
        }

        public Criteria andAgriculturalGradeNameIsNotNull() {
            addCriterion("agricultural_grade_name is not null");
            return (Criteria) this;
        }

        public Criteria andAgriculturalGradeNameEqualTo(String value) {
            addCriterion("agricultural_grade_name =", value, "agriculturalGradeName");
            return (Criteria) this;
        }

        public Criteria andAgriculturalGradeNameNotEqualTo(String value) {
            addCriterion("agricultural_grade_name <>", value, "agriculturalGradeName");
            return (Criteria) this;
        }

        public Criteria andAgriculturalGradeNameGreaterThan(String value) {
            addCriterion("agricultural_grade_name >", value, "agriculturalGradeName");
            return (Criteria) this;
        }

        public Criteria andAgriculturalGradeNameGreaterThanOrEqualTo(String value) {
            addCriterion("agricultural_grade_name >=", value, "agriculturalGradeName");
            return (Criteria) this;
        }

        public Criteria andAgriculturalGradeNameLessThan(String value) {
            addCriterion("agricultural_grade_name <", value, "agriculturalGradeName");
            return (Criteria) this;
        }

        public Criteria andAgriculturalGradeNameLessThanOrEqualTo(String value) {
            addCriterion("agricultural_grade_name <=", value, "agriculturalGradeName");
            return (Criteria) this;
        }

        public Criteria andAgriculturalGradeNameLike(String value) {
            addCriterion("agricultural_grade_name like", value, "agriculturalGradeName");
            return (Criteria) this;
        }

        public Criteria andAgriculturalGradeNameNotLike(String value) {
            addCriterion("agricultural_grade_name not like", value, "agriculturalGradeName");
            return (Criteria) this;
        }

        public Criteria andAgriculturalGradeNameIn(List<String> values) {
            addCriterion("agricultural_grade_name in", values, "agriculturalGradeName");
            return (Criteria) this;
        }

        public Criteria andAgriculturalGradeNameNotIn(List<String> values) {
            addCriterion("agricultural_grade_name not in", values, "agriculturalGradeName");
            return (Criteria) this;
        }

        public Criteria andAgriculturalGradeNameBetween(String value1, String value2) {
            addCriterion("agricultural_grade_name between", value1, value2, "agriculturalGradeName");
            return (Criteria) this;
        }

        public Criteria andAgriculturalGradeNameNotBetween(String value1, String value2) {
            addCriterion("agricultural_grade_name not between", value1, value2, "agriculturalGradeName");
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

        public Criteria andAreaLevelIsNull() {
            addCriterion("area_level is null");
            return (Criteria) this;
        }

        public Criteria andAreaLevelIsNotNull() {
            addCriterion("area_level is not null");
            return (Criteria) this;
        }

        public Criteria andAreaLevelEqualTo(Integer value) {
            addCriterion("area_level =", value, "areaLevel");
            return (Criteria) this;
        }

        public Criteria andAreaLevelNotEqualTo(Integer value) {
            addCriterion("area_level <>", value, "areaLevel");
            return (Criteria) this;
        }

        public Criteria andAreaLevelGreaterThan(Integer value) {
            addCriterion("area_level >", value, "areaLevel");
            return (Criteria) this;
        }

        public Criteria andAreaLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("area_level >=", value, "areaLevel");
            return (Criteria) this;
        }

        public Criteria andAreaLevelLessThan(Integer value) {
            addCriterion("area_level <", value, "areaLevel");
            return (Criteria) this;
        }

        public Criteria andAreaLevelLessThanOrEqualTo(Integer value) {
            addCriterion("area_level <=", value, "areaLevel");
            return (Criteria) this;
        }

        public Criteria andAreaLevelIn(List<Integer> values) {
            addCriterion("area_level in", values, "areaLevel");
            return (Criteria) this;
        }

        public Criteria andAreaLevelNotIn(List<Integer> values) {
            addCriterion("area_level not in", values, "areaLevel");
            return (Criteria) this;
        }

        public Criteria andAreaLevelBetween(Integer value1, Integer value2) {
            addCriterion("area_level between", value1, value2, "areaLevel");
            return (Criteria) this;
        }

        public Criteria andAreaLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("area_level not between", value1, value2, "areaLevel");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNull() {
            addCriterion("parent_id is null");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNotNull() {
            addCriterion("parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdEqualTo(Long value) {
            addCriterion("parent_id =", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotEqualTo(Long value) {
            addCriterion("parent_id <>", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThan(Long value) {
            addCriterion("parent_id >", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("parent_id >=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThan(Long value) {
            addCriterion("parent_id <", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanOrEqualTo(Long value) {
            addCriterion("parent_id <=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdIn(List<Long> values) {
            addCriterion("parent_id in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotIn(List<Long> values) {
            addCriterion("parent_id not in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdBetween(Long value1, Long value2) {
            addCriterion("parent_id between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotBetween(Long value1, Long value2) {
            addCriterion("parent_id not between", value1, value2, "parentId");
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

        public Criteria andAgriculturalNameSpellIsNull() {
            addCriterion("agricultural_name_spell is null");
            return (Criteria) this;
        }

        public Criteria andAgriculturalNameSpellIsNotNull() {
            addCriterion("agricultural_name_spell is not null");
            return (Criteria) this;
        }

        public Criteria andAgriculturalNameSpellEqualTo(String value) {
            addCriterion("agricultural_name_spell =", value, "agriculturalNameSpell");
            return (Criteria) this;
        }

        public Criteria andAgriculturalNameSpellNotEqualTo(String value) {
            addCriterion("agricultural_name_spell <>", value, "agriculturalNameSpell");
            return (Criteria) this;
        }

        public Criteria andAgriculturalNameSpellGreaterThan(String value) {
            addCriterion("agricultural_name_spell >", value, "agriculturalNameSpell");
            return (Criteria) this;
        }

        public Criteria andAgriculturalNameSpellGreaterThanOrEqualTo(String value) {
            addCriterion("agricultural_name_spell >=", value, "agriculturalNameSpell");
            return (Criteria) this;
        }

        public Criteria andAgriculturalNameSpellLessThan(String value) {
            addCriterion("agricultural_name_spell <", value, "agriculturalNameSpell");
            return (Criteria) this;
        }

        public Criteria andAgriculturalNameSpellLessThanOrEqualTo(String value) {
            addCriterion("agricultural_name_spell <=", value, "agriculturalNameSpell");
            return (Criteria) this;
        }

        public Criteria andAgriculturalNameSpellLike(String value) {
            addCriterion("agricultural_name_spell like", value, "agriculturalNameSpell");
            return (Criteria) this;
        }

        public Criteria andAgriculturalNameSpellNotLike(String value) {
            addCriterion("agricultural_name_spell not like", value, "agriculturalNameSpell");
            return (Criteria) this;
        }

        public Criteria andAgriculturalNameSpellIn(List<String> values) {
            addCriterion("agricultural_name_spell in", values, "agriculturalNameSpell");
            return (Criteria) this;
        }

        public Criteria andAgriculturalNameSpellNotIn(List<String> values) {
            addCriterion("agricultural_name_spell not in", values, "agriculturalNameSpell");
            return (Criteria) this;
        }

        public Criteria andAgriculturalNameSpellBetween(String value1, String value2) {
            addCriterion("agricultural_name_spell between", value1, value2, "agriculturalNameSpell");
            return (Criteria) this;
        }

        public Criteria andAgriculturalNameSpellNotBetween(String value1, String value2) {
            addCriterion("agricultural_name_spell not between", value1, value2, "agriculturalNameSpell");
            return (Criteria) this;
        }

        public Criteria andAgriculturalNameAbridgeIsNull() {
            addCriterion("agricultural_name_abridge is null");
            return (Criteria) this;
        }

        public Criteria andAgriculturalNameAbridgeIsNotNull() {
            addCriterion("agricultural_name_abridge is not null");
            return (Criteria) this;
        }

        public Criteria andAgriculturalNameAbridgeEqualTo(String value) {
            addCriterion("agricultural_name_abridge =", value, "agriculturalNameAbridge");
            return (Criteria) this;
        }

        public Criteria andAgriculturalNameAbridgeNotEqualTo(String value) {
            addCriterion("agricultural_name_abridge <>", value, "agriculturalNameAbridge");
            return (Criteria) this;
        }

        public Criteria andAgriculturalNameAbridgeGreaterThan(String value) {
            addCriterion("agricultural_name_abridge >", value, "agriculturalNameAbridge");
            return (Criteria) this;
        }

        public Criteria andAgriculturalNameAbridgeGreaterThanOrEqualTo(String value) {
            addCriterion("agricultural_name_abridge >=", value, "agriculturalNameAbridge");
            return (Criteria) this;
        }

        public Criteria andAgriculturalNameAbridgeLessThan(String value) {
            addCriterion("agricultural_name_abridge <", value, "agriculturalNameAbridge");
            return (Criteria) this;
        }

        public Criteria andAgriculturalNameAbridgeLessThanOrEqualTo(String value) {
            addCriterion("agricultural_name_abridge <=", value, "agriculturalNameAbridge");
            return (Criteria) this;
        }

        public Criteria andAgriculturalNameAbridgeLike(String value) {
            addCriterion("agricultural_name_abridge like", value, "agriculturalNameAbridge");
            return (Criteria) this;
        }

        public Criteria andAgriculturalNameAbridgeNotLike(String value) {
            addCriterion("agricultural_name_abridge not like", value, "agriculturalNameAbridge");
            return (Criteria) this;
        }

        public Criteria andAgriculturalNameAbridgeIn(List<String> values) {
            addCriterion("agricultural_name_abridge in", values, "agriculturalNameAbridge");
            return (Criteria) this;
        }

        public Criteria andAgriculturalNameAbridgeNotIn(List<String> values) {
            addCriterion("agricultural_name_abridge not in", values, "agriculturalNameAbridge");
            return (Criteria) this;
        }

        public Criteria andAgriculturalNameAbridgeBetween(String value1, String value2) {
            addCriterion("agricultural_name_abridge between", value1, value2, "agriculturalNameAbridge");
            return (Criteria) this;
        }

        public Criteria andAgriculturalNameAbridgeNotBetween(String value1, String value2) {
            addCriterion("agricultural_name_abridge not between", value1, value2, "agriculturalNameAbridge");
            return (Criteria) this;
        }

        public Criteria andFirstIdIsNull() {
            addCriterion("first_id is null");
            return (Criteria) this;
        }

        public Criteria andFirstIdIsNotNull() {
            addCriterion("first_id is not null");
            return (Criteria) this;
        }

        public Criteria andFirstIdEqualTo(Long value) {
            addCriterion("first_id =", value, "firstId");
            return (Criteria) this;
        }

        public Criteria andFirstIdNotEqualTo(Long value) {
            addCriterion("first_id <>", value, "firstId");
            return (Criteria) this;
        }

        public Criteria andFirstIdGreaterThan(Long value) {
            addCriterion("first_id >", value, "firstId");
            return (Criteria) this;
        }

        public Criteria andFirstIdGreaterThanOrEqualTo(Long value) {
            addCriterion("first_id >=", value, "firstId");
            return (Criteria) this;
        }

        public Criteria andFirstIdLessThan(Long value) {
            addCriterion("first_id <", value, "firstId");
            return (Criteria) this;
        }

        public Criteria andFirstIdLessThanOrEqualTo(Long value) {
            addCriterion("first_id <=", value, "firstId");
            return (Criteria) this;
        }

        public Criteria andFirstIdIn(List<Long> values) {
            addCriterion("first_id in", values, "firstId");
            return (Criteria) this;
        }

        public Criteria andFirstIdNotIn(List<Long> values) {
            addCriterion("first_id not in", values, "firstId");
            return (Criteria) this;
        }

        public Criteria andFirstIdBetween(Long value1, Long value2) {
            addCriterion("first_id between", value1, value2, "firstId");
            return (Criteria) this;
        }

        public Criteria andFirstIdNotBetween(Long value1, Long value2) {
            addCriterion("first_id not between", value1, value2, "firstId");
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