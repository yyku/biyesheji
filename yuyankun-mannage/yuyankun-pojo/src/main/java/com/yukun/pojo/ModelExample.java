package com.yukun.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ModelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ModelExample() {
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

        public Criteria andAddTimeIsNull() {
            addCriterion("add_time is null");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNotNull() {
            addCriterion("add_time is not null");
            return (Criteria) this;
        }

        public Criteria andAddTimeEqualTo(Date value) {
            addCriterion("add_time =", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotEqualTo(Date value) {
            addCriterion("add_time <>", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThan(Date value) {
            addCriterion("add_time >", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("add_time >=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThan(Date value) {
            addCriterion("add_time <", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("add_time <=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeIn(List<Date> values) {
            addCriterion("add_time in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotIn(List<Date> values) {
            addCriterion("add_time not in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeBetween(Date value1, Date value2) {
            addCriterion("add_time between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("add_time not between", value1, value2, "addTime");
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

        public Criteria andModeTypeIdIsNull() {
            addCriterion("mode_type_id is null");
            return (Criteria) this;
        }

        public Criteria andModeTypeIdIsNotNull() {
            addCriterion("mode_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andModeTypeIdEqualTo(Long value) {
            addCriterion("mode_type_id =", value, "modeTypeId");
            return (Criteria) this;
        }

        public Criteria andModeTypeIdNotEqualTo(Long value) {
            addCriterion("mode_type_id <>", value, "modeTypeId");
            return (Criteria) this;
        }

        public Criteria andModeTypeIdGreaterThan(Long value) {
            addCriterion("mode_type_id >", value, "modeTypeId");
            return (Criteria) this;
        }

        public Criteria andModeTypeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("mode_type_id >=", value, "modeTypeId");
            return (Criteria) this;
        }

        public Criteria andModeTypeIdLessThan(Long value) {
            addCriterion("mode_type_id <", value, "modeTypeId");
            return (Criteria) this;
        }

        public Criteria andModeTypeIdLessThanOrEqualTo(Long value) {
            addCriterion("mode_type_id <=", value, "modeTypeId");
            return (Criteria) this;
        }

        public Criteria andModeTypeIdIn(List<Long> values) {
            addCriterion("mode_type_id in", values, "modeTypeId");
            return (Criteria) this;
        }

        public Criteria andModeTypeIdNotIn(List<Long> values) {
            addCriterion("mode_type_id not in", values, "modeTypeId");
            return (Criteria) this;
        }

        public Criteria andModeTypeIdBetween(Long value1, Long value2) {
            addCriterion("mode_type_id between", value1, value2, "modeTypeId");
            return (Criteria) this;
        }

        public Criteria andModeTypeIdNotBetween(Long value1, Long value2) {
            addCriterion("mode_type_id not between", value1, value2, "modeTypeId");
            return (Criteria) this;
        }

        public Criteria andModeNameIsNull() {
            addCriterion("mode_name is null");
            return (Criteria) this;
        }

        public Criteria andModeNameIsNotNull() {
            addCriterion("mode_name is not null");
            return (Criteria) this;
        }

        public Criteria andModeNameEqualTo(String value) {
            addCriterion("mode_name =", value, "modeName");
            return (Criteria) this;
        }

        public Criteria andModeNameNotEqualTo(String value) {
            addCriterion("mode_name <>", value, "modeName");
            return (Criteria) this;
        }

        public Criteria andModeNameGreaterThan(String value) {
            addCriterion("mode_name >", value, "modeName");
            return (Criteria) this;
        }

        public Criteria andModeNameGreaterThanOrEqualTo(String value) {
            addCriterion("mode_name >=", value, "modeName");
            return (Criteria) this;
        }

        public Criteria andModeNameLessThan(String value) {
            addCriterion("mode_name <", value, "modeName");
            return (Criteria) this;
        }

        public Criteria andModeNameLessThanOrEqualTo(String value) {
            addCriterion("mode_name <=", value, "modeName");
            return (Criteria) this;
        }

        public Criteria andModeNameLike(String value) {
            addCriterion("mode_name like", value, "modeName");
            return (Criteria) this;
        }

        public Criteria andModeNameNotLike(String value) {
            addCriterion("mode_name not like", value, "modeName");
            return (Criteria) this;
        }

        public Criteria andModeNameIn(List<String> values) {
            addCriterion("mode_name in", values, "modeName");
            return (Criteria) this;
        }

        public Criteria andModeNameNotIn(List<String> values) {
            addCriterion("mode_name not in", values, "modeName");
            return (Criteria) this;
        }

        public Criteria andModeNameBetween(String value1, String value2) {
            addCriterion("mode_name between", value1, value2, "modeName");
            return (Criteria) this;
        }

        public Criteria andModeNameNotBetween(String value1, String value2) {
            addCriterion("mode_name not between", value1, value2, "modeName");
            return (Criteria) this;
        }

        public Criteria andModeCodeIsNull() {
            addCriterion("mode_code is null");
            return (Criteria) this;
        }

        public Criteria andModeCodeIsNotNull() {
            addCriterion("mode_code is not null");
            return (Criteria) this;
        }

        public Criteria andModeCodeEqualTo(String value) {
            addCriterion("mode_code =", value, "modeCode");
            return (Criteria) this;
        }

        public Criteria andModeCodeNotEqualTo(String value) {
            addCriterion("mode_code <>", value, "modeCode");
            return (Criteria) this;
        }

        public Criteria andModeCodeGreaterThan(String value) {
            addCriterion("mode_code >", value, "modeCode");
            return (Criteria) this;
        }

        public Criteria andModeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("mode_code >=", value, "modeCode");
            return (Criteria) this;
        }

        public Criteria andModeCodeLessThan(String value) {
            addCriterion("mode_code <", value, "modeCode");
            return (Criteria) this;
        }

        public Criteria andModeCodeLessThanOrEqualTo(String value) {
            addCriterion("mode_code <=", value, "modeCode");
            return (Criteria) this;
        }

        public Criteria andModeCodeLike(String value) {
            addCriterion("mode_code like", value, "modeCode");
            return (Criteria) this;
        }

        public Criteria andModeCodeNotLike(String value) {
            addCriterion("mode_code not like", value, "modeCode");
            return (Criteria) this;
        }

        public Criteria andModeCodeIn(List<String> values) {
            addCriterion("mode_code in", values, "modeCode");
            return (Criteria) this;
        }

        public Criteria andModeCodeNotIn(List<String> values) {
            addCriterion("mode_code not in", values, "modeCode");
            return (Criteria) this;
        }

        public Criteria andModeCodeBetween(String value1, String value2) {
            addCriterion("mode_code between", value1, value2, "modeCode");
            return (Criteria) this;
        }

        public Criteria andModeCodeNotBetween(String value1, String value2) {
            addCriterion("mode_code not between", value1, value2, "modeCode");
            return (Criteria) this;
        }

        public Criteria andModeTypeCodeIsNull() {
            addCriterion("mode_type_code is null");
            return (Criteria) this;
        }

        public Criteria andModeTypeCodeIsNotNull() {
            addCriterion("mode_type_code is not null");
            return (Criteria) this;
        }

        public Criteria andModeTypeCodeEqualTo(String value) {
            addCriterion("mode_type_code =", value, "modeTypeCode");
            return (Criteria) this;
        }

        public Criteria andModeTypeCodeNotEqualTo(String value) {
            addCriterion("mode_type_code <>", value, "modeTypeCode");
            return (Criteria) this;
        }

        public Criteria andModeTypeCodeGreaterThan(String value) {
            addCriterion("mode_type_code >", value, "modeTypeCode");
            return (Criteria) this;
        }

        public Criteria andModeTypeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("mode_type_code >=", value, "modeTypeCode");
            return (Criteria) this;
        }

        public Criteria andModeTypeCodeLessThan(String value) {
            addCriterion("mode_type_code <", value, "modeTypeCode");
            return (Criteria) this;
        }

        public Criteria andModeTypeCodeLessThanOrEqualTo(String value) {
            addCriterion("mode_type_code <=", value, "modeTypeCode");
            return (Criteria) this;
        }

        public Criteria andModeTypeCodeLike(String value) {
            addCriterion("mode_type_code like", value, "modeTypeCode");
            return (Criteria) this;
        }

        public Criteria andModeTypeCodeNotLike(String value) {
            addCriterion("mode_type_code not like", value, "modeTypeCode");
            return (Criteria) this;
        }

        public Criteria andModeTypeCodeIn(List<String> values) {
            addCriterion("mode_type_code in", values, "modeTypeCode");
            return (Criteria) this;
        }

        public Criteria andModeTypeCodeNotIn(List<String> values) {
            addCriterion("mode_type_code not in", values, "modeTypeCode");
            return (Criteria) this;
        }

        public Criteria andModeTypeCodeBetween(String value1, String value2) {
            addCriterion("mode_type_code between", value1, value2, "modeTypeCode");
            return (Criteria) this;
        }

        public Criteria andModeTypeCodeNotBetween(String value1, String value2) {
            addCriterion("mode_type_code not between", value1, value2, "modeTypeCode");
            return (Criteria) this;
        }

        public Criteria andDecribeIsNull() {
            addCriterion("decribe is null");
            return (Criteria) this;
        }

        public Criteria andDecribeIsNotNull() {
            addCriterion("decribe is not null");
            return (Criteria) this;
        }

        public Criteria andDecribeEqualTo(String value) {
            addCriterion("decribe =", value, "decribe");
            return (Criteria) this;
        }

        public Criteria andDecribeNotEqualTo(String value) {
            addCriterion("decribe <>", value, "decribe");
            return (Criteria) this;
        }

        public Criteria andDecribeGreaterThan(String value) {
            addCriterion("decribe >", value, "decribe");
            return (Criteria) this;
        }

        public Criteria andDecribeGreaterThanOrEqualTo(String value) {
            addCriterion("decribe >=", value, "decribe");
            return (Criteria) this;
        }

        public Criteria andDecribeLessThan(String value) {
            addCriterion("decribe <", value, "decribe");
            return (Criteria) this;
        }

        public Criteria andDecribeLessThanOrEqualTo(String value) {
            addCriterion("decribe <=", value, "decribe");
            return (Criteria) this;
        }

        public Criteria andDecribeLike(String value) {
            addCriterion("decribe like", value, "decribe");
            return (Criteria) this;
        }

        public Criteria andDecribeNotLike(String value) {
            addCriterion("decribe not like", value, "decribe");
            return (Criteria) this;
        }

        public Criteria andDecribeIn(List<String> values) {
            addCriterion("decribe in", values, "decribe");
            return (Criteria) this;
        }

        public Criteria andDecribeNotIn(List<String> values) {
            addCriterion("decribe not in", values, "decribe");
            return (Criteria) this;
        }

        public Criteria andDecribeBetween(String value1, String value2) {
            addCriterion("decribe between", value1, value2, "decribe");
            return (Criteria) this;
        }

        public Criteria andDecribeNotBetween(String value1, String value2) {
            addCriterion("decribe not between", value1, value2, "decribe");
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