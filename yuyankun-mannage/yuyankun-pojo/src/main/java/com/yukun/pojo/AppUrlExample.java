package com.yukun.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AppUrlExample implements Serializable{
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AppUrlExample() {
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAppurlIsNull() {
            addCriterion("AppUrl is null");
            return (Criteria) this;
        }

        public Criteria andAppurlIsNotNull() {
            addCriterion("AppUrl is not null");
            return (Criteria) this;
        }

        public Criteria andAppurlEqualTo(String value) {
            addCriterion("AppUrl =", value, "appurl");
            return (Criteria) this;
        }

        public Criteria andAppurlNotEqualTo(String value) {
            addCriterion("AppUrl <>", value, "appurl");
            return (Criteria) this;
        }

        public Criteria andAppurlGreaterThan(String value) {
            addCriterion("AppUrl >", value, "appurl");
            return (Criteria) this;
        }

        public Criteria andAppurlGreaterThanOrEqualTo(String value) {
            addCriterion("AppUrl >=", value, "appurl");
            return (Criteria) this;
        }

        public Criteria andAppurlLessThan(String value) {
            addCriterion("AppUrl <", value, "appurl");
            return (Criteria) this;
        }

        public Criteria andAppurlLessThanOrEqualTo(String value) {
            addCriterion("AppUrl <=", value, "appurl");
            return (Criteria) this;
        }

        public Criteria andAppurlLike(String value) {
            addCriterion("AppUrl like", value, "appurl");
            return (Criteria) this;
        }

        public Criteria andAppurlNotLike(String value) {
            addCriterion("AppUrl not like", value, "appurl");
            return (Criteria) this;
        }

        public Criteria andAppurlIn(List<String> values) {
            addCriterion("AppUrl in", values, "appurl");
            return (Criteria) this;
        }

        public Criteria andAppurlNotIn(List<String> values) {
            addCriterion("AppUrl not in", values, "appurl");
            return (Criteria) this;
        }

        public Criteria andAppurlBetween(String value1, String value2) {
            addCriterion("AppUrl between", value1, value2, "appurl");
            return (Criteria) this;
        }

        public Criteria andAppurlNotBetween(String value1, String value2) {
            addCriterion("AppUrl not between", value1, value2, "appurl");
            return (Criteria) this;
        }

        public Criteria andVersionscodeIsNull() {
            addCriterion("VersionsCode is null");
            return (Criteria) this;
        }

        public Criteria andVersionscodeIsNotNull() {
            addCriterion("VersionsCode is not null");
            return (Criteria) this;
        }

        public Criteria andVersionscodeEqualTo(String value) {
            addCriterion("VersionsCode =", value, "versionscode");
            return (Criteria) this;
        }

        public Criteria andVersionscodeNotEqualTo(String value) {
            addCriterion("VersionsCode <>", value, "versionscode");
            return (Criteria) this;
        }

        public Criteria andVersionscodeGreaterThan(String value) {
            addCriterion("VersionsCode >", value, "versionscode");
            return (Criteria) this;
        }

        public Criteria andVersionscodeGreaterThanOrEqualTo(String value) {
            addCriterion("VersionsCode >=", value, "versionscode");
            return (Criteria) this;
        }

        public Criteria andVersionscodeLessThan(String value) {
            addCriterion("VersionsCode <", value, "versionscode");
            return (Criteria) this;
        }

        public Criteria andVersionscodeLessThanOrEqualTo(String value) {
            addCriterion("VersionsCode <=", value, "versionscode");
            return (Criteria) this;
        }

        public Criteria andVersionscodeLike(String value) {
            addCriterion("VersionsCode like", value, "versionscode");
            return (Criteria) this;
        }

        public Criteria andVersionscodeNotLike(String value) {
            addCriterion("VersionsCode not like", value, "versionscode");
            return (Criteria) this;
        }

        public Criteria andVersionscodeIn(List<String> values) {
            addCriterion("VersionsCode in", values, "versionscode");
            return (Criteria) this;
        }

        public Criteria andVersionscodeNotIn(List<String> values) {
            addCriterion("VersionsCode not in", values, "versionscode");
            return (Criteria) this;
        }

        public Criteria andVersionscodeBetween(String value1, String value2) {
            addCriterion("VersionsCode between", value1, value2, "versionscode");
            return (Criteria) this;
        }

        public Criteria andVersionscodeNotBetween(String value1, String value2) {
            addCriterion("VersionsCode not between", value1, value2, "versionscode");
            return (Criteria) this;
        }

        public Criteria andVersionsnameIsNull() {
            addCriterion("VersionsName is null");
            return (Criteria) this;
        }

        public Criteria andVersionsnameIsNotNull() {
            addCriterion("VersionsName is not null");
            return (Criteria) this;
        }

        public Criteria andVersionsnameEqualTo(String value) {
            addCriterion("VersionsName =", value, "versionsname");
            return (Criteria) this;
        }

        public Criteria andVersionsnameNotEqualTo(String value) {
            addCriterion("VersionsName <>", value, "versionsname");
            return (Criteria) this;
        }

        public Criteria andVersionsnameGreaterThan(String value) {
            addCriterion("VersionsName >", value, "versionsname");
            return (Criteria) this;
        }

        public Criteria andVersionsnameGreaterThanOrEqualTo(String value) {
            addCriterion("VersionsName >=", value, "versionsname");
            return (Criteria) this;
        }

        public Criteria andVersionsnameLessThan(String value) {
            addCriterion("VersionsName <", value, "versionsname");
            return (Criteria) this;
        }

        public Criteria andVersionsnameLessThanOrEqualTo(String value) {
            addCriterion("VersionsName <=", value, "versionsname");
            return (Criteria) this;
        }

        public Criteria andVersionsnameLike(String value) {
            addCriterion("VersionsName like", value, "versionsname");
            return (Criteria) this;
        }

        public Criteria andVersionsnameNotLike(String value) {
            addCriterion("VersionsName not like", value, "versionsname");
            return (Criteria) this;
        }

        public Criteria andVersionsnameIn(List<String> values) {
            addCriterion("VersionsName in", values, "versionsname");
            return (Criteria) this;
        }

        public Criteria andVersionsnameNotIn(List<String> values) {
            addCriterion("VersionsName not in", values, "versionsname");
            return (Criteria) this;
        }

        public Criteria andVersionsnameBetween(String value1, String value2) {
            addCriterion("VersionsName between", value1, value2, "versionsname");
            return (Criteria) this;
        }

        public Criteria andVersionsnameNotBetween(String value1, String value2) {
            addCriterion("VersionsName not between", value1, value2, "versionsname");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("UpdateTime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("UpdateTime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("UpdateTime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("UpdateTime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("UpdateTime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UpdateTime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("UpdateTime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("UpdateTime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("UpdateTime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("UpdateTime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("UpdateTime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("UpdateTime not between", value1, value2, "updatetime");
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