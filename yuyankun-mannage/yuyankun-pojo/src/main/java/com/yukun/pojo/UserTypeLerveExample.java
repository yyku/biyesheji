package com.yukun.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class UserTypeLerveExample implements Serializable{
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserTypeLerveExample() {
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

        public Criteria andUsertypenameIsNull() {
            addCriterion("userTypeName is null");
            return (Criteria) this;
        }

        public Criteria andUsertypenameIsNotNull() {
            addCriterion("userTypeName is not null");
            return (Criteria) this;
        }

        public Criteria andUsertypenameEqualTo(String value) {
            addCriterion("userTypeName =", value, "usertypename");
            return (Criteria) this;
        }

        public Criteria andUsertypenameNotEqualTo(String value) {
            addCriterion("userTypeName <>", value, "usertypename");
            return (Criteria) this;
        }

        public Criteria andUsertypenameGreaterThan(String value) {
            addCriterion("userTypeName >", value, "usertypename");
            return (Criteria) this;
        }

        public Criteria andUsertypenameGreaterThanOrEqualTo(String value) {
            addCriterion("userTypeName >=", value, "usertypename");
            return (Criteria) this;
        }

        public Criteria andUsertypenameLessThan(String value) {
            addCriterion("userTypeName <", value, "usertypename");
            return (Criteria) this;
        }

        public Criteria andUsertypenameLessThanOrEqualTo(String value) {
            addCriterion("userTypeName <=", value, "usertypename");
            return (Criteria) this;
        }

        public Criteria andUsertypenameLike(String value) {
            addCriterion("userTypeName like", value, "usertypename");
            return (Criteria) this;
        }

        public Criteria andUsertypenameNotLike(String value) {
            addCriterion("userTypeName not like", value, "usertypename");
            return (Criteria) this;
        }

        public Criteria andUsertypenameIn(List<String> values) {
            addCriterion("userTypeName in", values, "usertypename");
            return (Criteria) this;
        }

        public Criteria andUsertypenameNotIn(List<String> values) {
            addCriterion("userTypeName not in", values, "usertypename");
            return (Criteria) this;
        }

        public Criteria andUsertypenameBetween(String value1, String value2) {
            addCriterion("userTypeName between", value1, value2, "usertypename");
            return (Criteria) this;
        }

        public Criteria andUsertypenameNotBetween(String value1, String value2) {
            addCriterion("userTypeName not between", value1, value2, "usertypename");
            return (Criteria) this;
        }

        public Criteria andUsertypenameidIsNull() {
            addCriterion("userTypeNameId is null");
            return (Criteria) this;
        }

        public Criteria andUsertypenameidIsNotNull() {
            addCriterion("userTypeNameId is not null");
            return (Criteria) this;
        }

        public Criteria andUsertypenameidEqualTo(String value) {
            addCriterion("userTypeNameId =", value, "usertypenameid");
            return (Criteria) this;
        }

        public Criteria andUsertypenameidNotEqualTo(String value) {
            addCriterion("userTypeNameId <>", value, "usertypenameid");
            return (Criteria) this;
        }

        public Criteria andUsertypenameidGreaterThan(String value) {
            addCriterion("userTypeNameId >", value, "usertypenameid");
            return (Criteria) this;
        }

        public Criteria andUsertypenameidGreaterThanOrEqualTo(String value) {
            addCriterion("userTypeNameId >=", value, "usertypenameid");
            return (Criteria) this;
        }

        public Criteria andUsertypenameidLessThan(String value) {
            addCriterion("userTypeNameId <", value, "usertypenameid");
            return (Criteria) this;
        }

        public Criteria andUsertypenameidLessThanOrEqualTo(String value) {
            addCriterion("userTypeNameId <=", value, "usertypenameid");
            return (Criteria) this;
        }

        public Criteria andUsertypenameidLike(String value) {
            addCriterion("userTypeNameId like", value, "usertypenameid");
            return (Criteria) this;
        }

        public Criteria andUsertypenameidNotLike(String value) {
            addCriterion("userTypeNameId not like", value, "usertypenameid");
            return (Criteria) this;
        }

        public Criteria andUsertypenameidIn(List<String> values) {
            addCriterion("userTypeNameId in", values, "usertypenameid");
            return (Criteria) this;
        }

        public Criteria andUsertypenameidNotIn(List<String> values) {
            addCriterion("userTypeNameId not in", values, "usertypenameid");
            return (Criteria) this;
        }

        public Criteria andUsertypenameidBetween(String value1, String value2) {
            addCriterion("userTypeNameId between", value1, value2, "usertypenameid");
            return (Criteria) this;
        }

        public Criteria andUsertypenameidNotBetween(String value1, String value2) {
            addCriterion("userTypeNameId not between", value1, value2, "usertypenameid");
            return (Criteria) this;
        }

        public Criteria andUserLerveIsNull() {
            addCriterion("user_lerve is null");
            return (Criteria) this;
        }

        public Criteria andUserLerveIsNotNull() {
            addCriterion("user_lerve is not null");
            return (Criteria) this;
        }

        public Criteria andUserLerveEqualTo(Integer value) {
            addCriterion("user_lerve =", value, "userLerve");
            return (Criteria) this;
        }

        public Criteria andUserLerveNotEqualTo(Integer value) {
            addCriterion("user_lerve <>", value, "userLerve");
            return (Criteria) this;
        }

        public Criteria andUserLerveGreaterThan(Integer value) {
            addCriterion("user_lerve >", value, "userLerve");
            return (Criteria) this;
        }

        public Criteria andUserLerveGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_lerve >=", value, "userLerve");
            return (Criteria) this;
        }

        public Criteria andUserLerveLessThan(Integer value) {
            addCriterion("user_lerve <", value, "userLerve");
            return (Criteria) this;
        }

        public Criteria andUserLerveLessThanOrEqualTo(Integer value) {
            addCriterion("user_lerve <=", value, "userLerve");
            return (Criteria) this;
        }

        public Criteria andUserLerveIn(List<Integer> values) {
            addCriterion("user_lerve in", values, "userLerve");
            return (Criteria) this;
        }

        public Criteria andUserLerveNotIn(List<Integer> values) {
            addCriterion("user_lerve not in", values, "userLerve");
            return (Criteria) this;
        }

        public Criteria andUserLerveBetween(Integer value1, Integer value2) {
            addCriterion("user_lerve between", value1, value2, "userLerve");
            return (Criteria) this;
        }

        public Criteria andUserLerveNotBetween(Integer value1, Integer value2) {
            addCriterion("user_lerve not between", value1, value2, "userLerve");
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