package com.yukun.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LdwUnitExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LdwUnitExample() {
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

        public Criteria andUnitTypeIdIsNull() {
            addCriterion("unit_type_id is null");
            return (Criteria) this;
        }

        public Criteria andUnitTypeIdIsNotNull() {
            addCriterion("unit_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andUnitTypeIdEqualTo(Long value) {
            addCriterion("unit_type_id =", value, "unitTypeId");
            return (Criteria) this;
        }

        public Criteria andUnitTypeIdNotEqualTo(Long value) {
            addCriterion("unit_type_id <>", value, "unitTypeId");
            return (Criteria) this;
        }

        public Criteria andUnitTypeIdGreaterThan(Long value) {
            addCriterion("unit_type_id >", value, "unitTypeId");
            return (Criteria) this;
        }

        public Criteria andUnitTypeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("unit_type_id >=", value, "unitTypeId");
            return (Criteria) this;
        }

        public Criteria andUnitTypeIdLessThan(Long value) {
            addCriterion("unit_type_id <", value, "unitTypeId");
            return (Criteria) this;
        }

        public Criteria andUnitTypeIdLessThanOrEqualTo(Long value) {
            addCriterion("unit_type_id <=", value, "unitTypeId");
            return (Criteria) this;
        }

        public Criteria andUnitTypeIdIn(List<Long> values) {
            addCriterion("unit_type_id in", values, "unitTypeId");
            return (Criteria) this;
        }

        public Criteria andUnitTypeIdNotIn(List<Long> values) {
            addCriterion("unit_type_id not in", values, "unitTypeId");
            return (Criteria) this;
        }

        public Criteria andUnitTypeIdBetween(Long value1, Long value2) {
            addCriterion("unit_type_id between", value1, value2, "unitTypeId");
            return (Criteria) this;
        }

        public Criteria andUnitTypeIdNotBetween(Long value1, Long value2) {
            addCriterion("unit_type_id not between", value1, value2, "unitTypeId");
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

        public Criteria andUnitExplainIsNull() {
            addCriterion("unit_explain is null");
            return (Criteria) this;
        }

        public Criteria andUnitExplainIsNotNull() {
            addCriterion("unit_explain is not null");
            return (Criteria) this;
        }

        public Criteria andUnitExplainEqualTo(String value) {
            addCriterion("unit_explain =", value, "unitExplain");
            return (Criteria) this;
        }

        public Criteria andUnitExplainNotEqualTo(String value) {
            addCriterion("unit_explain <>", value, "unitExplain");
            return (Criteria) this;
        }

        public Criteria andUnitExplainGreaterThan(String value) {
            addCriterion("unit_explain >", value, "unitExplain");
            return (Criteria) this;
        }

        public Criteria andUnitExplainGreaterThanOrEqualTo(String value) {
            addCriterion("unit_explain >=", value, "unitExplain");
            return (Criteria) this;
        }

        public Criteria andUnitExplainLessThan(String value) {
            addCriterion("unit_explain <", value, "unitExplain");
            return (Criteria) this;
        }

        public Criteria andUnitExplainLessThanOrEqualTo(String value) {
            addCriterion("unit_explain <=", value, "unitExplain");
            return (Criteria) this;
        }

        public Criteria andUnitExplainLike(String value) {
            addCriterion("unit_explain like", value, "unitExplain");
            return (Criteria) this;
        }

        public Criteria andUnitExplainNotLike(String value) {
            addCriterion("unit_explain not like", value, "unitExplain");
            return (Criteria) this;
        }

        public Criteria andUnitExplainIn(List<String> values) {
            addCriterion("unit_explain in", values, "unitExplain");
            return (Criteria) this;
        }

        public Criteria andUnitExplainNotIn(List<String> values) {
            addCriterion("unit_explain not in", values, "unitExplain");
            return (Criteria) this;
        }

        public Criteria andUnitExplainBetween(String value1, String value2) {
            addCriterion("unit_explain between", value1, value2, "unitExplain");
            return (Criteria) this;
        }

        public Criteria andUnitExplainNotBetween(String value1, String value2) {
            addCriterion("unit_explain not between", value1, value2, "unitExplain");
            return (Criteria) this;
        }

        public Criteria andIsStandardUnitIsNull() {
            addCriterion("is_standard_unit is null");
            return (Criteria) this;
        }

        public Criteria andIsStandardUnitIsNotNull() {
            addCriterion("is_standard_unit is not null");
            return (Criteria) this;
        }

        public Criteria andIsStandardUnitEqualTo(Boolean value) {
            addCriterion("is_standard_unit =", value, "isStandardUnit");
            return (Criteria) this;
        }

        public Criteria andIsStandardUnitNotEqualTo(Boolean value) {
            addCriterion("is_standard_unit <>", value, "isStandardUnit");
            return (Criteria) this;
        }

        public Criteria andIsStandardUnitGreaterThan(Boolean value) {
            addCriterion("is_standard_unit >", value, "isStandardUnit");
            return (Criteria) this;
        }

        public Criteria andIsStandardUnitGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_standard_unit >=", value, "isStandardUnit");
            return (Criteria) this;
        }

        public Criteria andIsStandardUnitLessThan(Boolean value) {
            addCriterion("is_standard_unit <", value, "isStandardUnit");
            return (Criteria) this;
        }

        public Criteria andIsStandardUnitLessThanOrEqualTo(Boolean value) {
            addCriterion("is_standard_unit <=", value, "isStandardUnit");
            return (Criteria) this;
        }

        public Criteria andIsStandardUnitIn(List<Boolean> values) {
            addCriterion("is_standard_unit in", values, "isStandardUnit");
            return (Criteria) this;
        }

        public Criteria andIsStandardUnitNotIn(List<Boolean> values) {
            addCriterion("is_standard_unit not in", values, "isStandardUnit");
            return (Criteria) this;
        }

        public Criteria andIsStandardUnitBetween(Boolean value1, Boolean value2) {
            addCriterion("is_standard_unit between", value1, value2, "isStandardUnit");
            return (Criteria) this;
        }

        public Criteria andIsStandardUnitNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_standard_unit not between", value1, value2, "isStandardUnit");
            return (Criteria) this;
        }

        public Criteria andRatioIsNull() {
            addCriterion("ratio is null");
            return (Criteria) this;
        }

        public Criteria andRatioIsNotNull() {
            addCriterion("ratio is not null");
            return (Criteria) this;
        }

        public Criteria andRatioEqualTo(BigDecimal value) {
            addCriterion("ratio =", value, "ratio");
            return (Criteria) this;
        }

        public Criteria andRatioNotEqualTo(BigDecimal value) {
            addCriterion("ratio <>", value, "ratio");
            return (Criteria) this;
        }

        public Criteria andRatioGreaterThan(BigDecimal value) {
            addCriterion("ratio >", value, "ratio");
            return (Criteria) this;
        }

        public Criteria andRatioGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ratio >=", value, "ratio");
            return (Criteria) this;
        }

        public Criteria andRatioLessThan(BigDecimal value) {
            addCriterion("ratio <", value, "ratio");
            return (Criteria) this;
        }

        public Criteria andRatioLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ratio <=", value, "ratio");
            return (Criteria) this;
        }

        public Criteria andRatioIn(List<BigDecimal> values) {
            addCriterion("ratio in", values, "ratio");
            return (Criteria) this;
        }

        public Criteria andRatioNotIn(List<BigDecimal> values) {
            addCriterion("ratio not in", values, "ratio");
            return (Criteria) this;
        }

        public Criteria andRatioBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ratio between", value1, value2, "ratio");
            return (Criteria) this;
        }

        public Criteria andRatioNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ratio not between", value1, value2, "ratio");
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

        public Criteria andUnitLogoIsNull() {
            addCriterion("unit_logo is null");
            return (Criteria) this;
        }

        public Criteria andUnitLogoIsNotNull() {
            addCriterion("unit_logo is not null");
            return (Criteria) this;
        }

        public Criteria andUnitLogoEqualTo(String value) {
            addCriterion("unit_logo =", value, "unitLogo");
            return (Criteria) this;
        }

        public Criteria andUnitLogoNotEqualTo(String value) {
            addCriterion("unit_logo <>", value, "unitLogo");
            return (Criteria) this;
        }

        public Criteria andUnitLogoGreaterThan(String value) {
            addCriterion("unit_logo >", value, "unitLogo");
            return (Criteria) this;
        }

        public Criteria andUnitLogoGreaterThanOrEqualTo(String value) {
            addCriterion("unit_logo >=", value, "unitLogo");
            return (Criteria) this;
        }

        public Criteria andUnitLogoLessThan(String value) {
            addCriterion("unit_logo <", value, "unitLogo");
            return (Criteria) this;
        }

        public Criteria andUnitLogoLessThanOrEqualTo(String value) {
            addCriterion("unit_logo <=", value, "unitLogo");
            return (Criteria) this;
        }

        public Criteria andUnitLogoLike(String value) {
            addCriterion("unit_logo like", value, "unitLogo");
            return (Criteria) this;
        }

        public Criteria andUnitLogoNotLike(String value) {
            addCriterion("unit_logo not like", value, "unitLogo");
            return (Criteria) this;
        }

        public Criteria andUnitLogoIn(List<String> values) {
            addCriterion("unit_logo in", values, "unitLogo");
            return (Criteria) this;
        }

        public Criteria andUnitLogoNotIn(List<String> values) {
            addCriterion("unit_logo not in", values, "unitLogo");
            return (Criteria) this;
        }

        public Criteria andUnitLogoBetween(String value1, String value2) {
            addCriterion("unit_logo between", value1, value2, "unitLogo");
            return (Criteria) this;
        }

        public Criteria andUnitLogoNotBetween(String value1, String value2) {
            addCriterion("unit_logo not between", value1, value2, "unitLogo");
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