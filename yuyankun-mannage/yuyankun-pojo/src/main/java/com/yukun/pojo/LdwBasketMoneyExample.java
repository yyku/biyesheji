package com.yukun.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LdwBasketMoneyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LdwBasketMoneyExample() {
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

        public Criteria andCustomerIdIsNull() {
            addCriterion("customer_id is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNotNull() {
            addCriterion("customer_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdEqualTo(Long value) {
            addCriterion("customer_id =", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotEqualTo(Long value) {
            addCriterion("customer_id <>", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThan(Long value) {
            addCriterion("customer_id >", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("customer_id >=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThan(Long value) {
            addCriterion("customer_id <", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThanOrEqualTo(Long value) {
            addCriterion("customer_id <=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIn(List<Long> values) {
            addCriterion("customer_id in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotIn(List<Long> values) {
            addCriterion("customer_id not in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdBetween(Long value1, Long value2) {
            addCriterion("customer_id between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotBetween(Long value1, Long value2) {
            addCriterion("customer_id not between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerAccountIsNull() {
            addCriterion("customer_account is null");
            return (Criteria) this;
        }

        public Criteria andCustomerAccountIsNotNull() {
            addCriterion("customer_account is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerAccountEqualTo(String value) {
            addCriterion("customer_account =", value, "customerAccount");
            return (Criteria) this;
        }

        public Criteria andCustomerAccountNotEqualTo(String value) {
            addCriterion("customer_account <>", value, "customerAccount");
            return (Criteria) this;
        }

        public Criteria andCustomerAccountGreaterThan(String value) {
            addCriterion("customer_account >", value, "customerAccount");
            return (Criteria) this;
        }

        public Criteria andCustomerAccountGreaterThanOrEqualTo(String value) {
            addCriterion("customer_account >=", value, "customerAccount");
            return (Criteria) this;
        }

        public Criteria andCustomerAccountLessThan(String value) {
            addCriterion("customer_account <", value, "customerAccount");
            return (Criteria) this;
        }

        public Criteria andCustomerAccountLessThanOrEqualTo(String value) {
            addCriterion("customer_account <=", value, "customerAccount");
            return (Criteria) this;
        }

        public Criteria andCustomerAccountLike(String value) {
            addCriterion("customer_account like", value, "customerAccount");
            return (Criteria) this;
        }

        public Criteria andCustomerAccountNotLike(String value) {
            addCriterion("customer_account not like", value, "customerAccount");
            return (Criteria) this;
        }

        public Criteria andCustomerAccountIn(List<String> values) {
            addCriterion("customer_account in", values, "customerAccount");
            return (Criteria) this;
        }

        public Criteria andCustomerAccountNotIn(List<String> values) {
            addCriterion("customer_account not in", values, "customerAccount");
            return (Criteria) this;
        }

        public Criteria andCustomerAccountBetween(String value1, String value2) {
            addCriterion("customer_account between", value1, value2, "customerAccount");
            return (Criteria) this;
        }

        public Criteria andCustomerAccountNotBetween(String value1, String value2) {
            addCriterion("customer_account not between", value1, value2, "customerAccount");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNull() {
            addCriterion("customer_name is null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNotNull() {
            addCriterion("customer_name is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameEqualTo(String value) {
            addCriterion("customer_name =", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotEqualTo(String value) {
            addCriterion("customer_name <>", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThan(String value) {
            addCriterion("customer_name >", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThanOrEqualTo(String value) {
            addCriterion("customer_name >=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThan(String value) {
            addCriterion("customer_name <", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThanOrEqualTo(String value) {
            addCriterion("customer_name <=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLike(String value) {
            addCriterion("customer_name like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotLike(String value) {
            addCriterion("customer_name not like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIn(List<String> values) {
            addCriterion("customer_name in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotIn(List<String> values) {
            addCriterion("customer_name not in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameBetween(String value1, String value2) {
            addCriterion("customer_name between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotBetween(String value1, String value2) {
            addCriterion("customer_name not between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andOperationTypeIsNull() {
            addCriterion("operation_type is null");
            return (Criteria) this;
        }

        public Criteria andOperationTypeIsNotNull() {
            addCriterion("operation_type is not null");
            return (Criteria) this;
        }

        public Criteria andOperationTypeEqualTo(String value) {
            addCriterion("operation_type =", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeNotEqualTo(String value) {
            addCriterion("operation_type <>", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeGreaterThan(String value) {
            addCriterion("operation_type >", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeGreaterThanOrEqualTo(String value) {
            addCriterion("operation_type >=", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeLessThan(String value) {
            addCriterion("operation_type <", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeLessThanOrEqualTo(String value) {
            addCriterion("operation_type <=", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeLike(String value) {
            addCriterion("operation_type like", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeNotLike(String value) {
            addCriterion("operation_type not like", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeIn(List<String> values) {
            addCriterion("operation_type in", values, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeNotIn(List<String> values) {
            addCriterion("operation_type not in", values, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeBetween(String value1, String value2) {
            addCriterion("operation_type between", value1, value2, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeNotBetween(String value1, String value2) {
            addCriterion("operation_type not between", value1, value2, "operationType");
            return (Criteria) this;
        }

        public Criteria andAlipayIsNull() {
            addCriterion("alipay is null");
            return (Criteria) this;
        }

        public Criteria andAlipayIsNotNull() {
            addCriterion("alipay is not null");
            return (Criteria) this;
        }

        public Criteria andAlipayEqualTo(String value) {
            addCriterion("alipay =", value, "alipay");
            return (Criteria) this;
        }

        public Criteria andAlipayNotEqualTo(String value) {
            addCriterion("alipay <>", value, "alipay");
            return (Criteria) this;
        }

        public Criteria andAlipayGreaterThan(String value) {
            addCriterion("alipay >", value, "alipay");
            return (Criteria) this;
        }

        public Criteria andAlipayGreaterThanOrEqualTo(String value) {
            addCriterion("alipay >=", value, "alipay");
            return (Criteria) this;
        }

        public Criteria andAlipayLessThan(String value) {
            addCriterion("alipay <", value, "alipay");
            return (Criteria) this;
        }

        public Criteria andAlipayLessThanOrEqualTo(String value) {
            addCriterion("alipay <=", value, "alipay");
            return (Criteria) this;
        }

        public Criteria andAlipayLike(String value) {
            addCriterion("alipay like", value, "alipay");
            return (Criteria) this;
        }

        public Criteria andAlipayNotLike(String value) {
            addCriterion("alipay not like", value, "alipay");
            return (Criteria) this;
        }

        public Criteria andAlipayIn(List<String> values) {
            addCriterion("alipay in", values, "alipay");
            return (Criteria) this;
        }

        public Criteria andAlipayNotIn(List<String> values) {
            addCriterion("alipay not in", values, "alipay");
            return (Criteria) this;
        }

        public Criteria andAlipayBetween(String value1, String value2) {
            addCriterion("alipay between", value1, value2, "alipay");
            return (Criteria) this;
        }

        public Criteria andAlipayNotBetween(String value1, String value2) {
            addCriterion("alipay not between", value1, value2, "alipay");
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

        public Criteria andMoneyIsNull() {
            addCriterion("money is null");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNotNull() {
            addCriterion("money is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyEqualTo(BigDecimal value) {
            addCriterion("money =", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotEqualTo(BigDecimal value) {
            addCriterion("money <>", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThan(BigDecimal value) {
            addCriterion("money >", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("money >=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThan(BigDecimal value) {
            addCriterion("money <", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("money <=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyIn(List<BigDecimal> values) {
            addCriterion("money in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotIn(List<BigDecimal> values) {
            addCriterion("money not in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("money between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("money not between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andServiceChargeIsNull() {
            addCriterion("service_charge is null");
            return (Criteria) this;
        }

        public Criteria andServiceChargeIsNotNull() {
            addCriterion("service_charge is not null");
            return (Criteria) this;
        }

        public Criteria andServiceChargeEqualTo(String value) {
            addCriterion("service_charge =", value, "serviceCharge");
            return (Criteria) this;
        }

        public Criteria andServiceChargeNotEqualTo(String value) {
            addCriterion("service_charge <>", value, "serviceCharge");
            return (Criteria) this;
        }

        public Criteria andServiceChargeGreaterThan(String value) {
            addCriterion("service_charge >", value, "serviceCharge");
            return (Criteria) this;
        }

        public Criteria andServiceChargeGreaterThanOrEqualTo(String value) {
            addCriterion("service_charge >=", value, "serviceCharge");
            return (Criteria) this;
        }

        public Criteria andServiceChargeLessThan(String value) {
            addCriterion("service_charge <", value, "serviceCharge");
            return (Criteria) this;
        }

        public Criteria andServiceChargeLessThanOrEqualTo(String value) {
            addCriterion("service_charge <=", value, "serviceCharge");
            return (Criteria) this;
        }

        public Criteria andServiceChargeLike(String value) {
            addCriterion("service_charge like", value, "serviceCharge");
            return (Criteria) this;
        }

        public Criteria andServiceChargeNotLike(String value) {
            addCriterion("service_charge not like", value, "serviceCharge");
            return (Criteria) this;
        }

        public Criteria andServiceChargeIn(List<String> values) {
            addCriterion("service_charge in", values, "serviceCharge");
            return (Criteria) this;
        }

        public Criteria andServiceChargeNotIn(List<String> values) {
            addCriterion("service_charge not in", values, "serviceCharge");
            return (Criteria) this;
        }

        public Criteria andServiceChargeBetween(String value1, String value2) {
            addCriterion("service_charge between", value1, value2, "serviceCharge");
            return (Criteria) this;
        }

        public Criteria andServiceChargeNotBetween(String value1, String value2) {
            addCriterion("service_charge not between", value1, value2, "serviceCharge");
            return (Criteria) this;
        }

        public Criteria andBeforeMoneyIsNull() {
            addCriterion("before_money is null");
            return (Criteria) this;
        }

        public Criteria andBeforeMoneyIsNotNull() {
            addCriterion("before_money is not null");
            return (Criteria) this;
        }

        public Criteria andBeforeMoneyEqualTo(BigDecimal value) {
            addCriterion("before_money =", value, "beforeMoney");
            return (Criteria) this;
        }

        public Criteria andBeforeMoneyNotEqualTo(BigDecimal value) {
            addCriterion("before_money <>", value, "beforeMoney");
            return (Criteria) this;
        }

        public Criteria andBeforeMoneyGreaterThan(BigDecimal value) {
            addCriterion("before_money >", value, "beforeMoney");
            return (Criteria) this;
        }

        public Criteria andBeforeMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("before_money >=", value, "beforeMoney");
            return (Criteria) this;
        }

        public Criteria andBeforeMoneyLessThan(BigDecimal value) {
            addCriterion("before_money <", value, "beforeMoney");
            return (Criteria) this;
        }

        public Criteria andBeforeMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("before_money <=", value, "beforeMoney");
            return (Criteria) this;
        }

        public Criteria andBeforeMoneyIn(List<BigDecimal> values) {
            addCriterion("before_money in", values, "beforeMoney");
            return (Criteria) this;
        }

        public Criteria andBeforeMoneyNotIn(List<BigDecimal> values) {
            addCriterion("before_money not in", values, "beforeMoney");
            return (Criteria) this;
        }

        public Criteria andBeforeMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("before_money between", value1, value2, "beforeMoney");
            return (Criteria) this;
        }

        public Criteria andBeforeMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("before_money not between", value1, value2, "beforeMoney");
            return (Criteria) this;
        }

        public Criteria andNewMoneyIsNull() {
            addCriterion("new_money is null");
            return (Criteria) this;
        }

        public Criteria andNewMoneyIsNotNull() {
            addCriterion("new_money is not null");
            return (Criteria) this;
        }

        public Criteria andNewMoneyEqualTo(BigDecimal value) {
            addCriterion("new_money =", value, "newMoney");
            return (Criteria) this;
        }

        public Criteria andNewMoneyNotEqualTo(BigDecimal value) {
            addCriterion("new_money <>", value, "newMoney");
            return (Criteria) this;
        }

        public Criteria andNewMoneyGreaterThan(BigDecimal value) {
            addCriterion("new_money >", value, "newMoney");
            return (Criteria) this;
        }

        public Criteria andNewMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("new_money >=", value, "newMoney");
            return (Criteria) this;
        }

        public Criteria andNewMoneyLessThan(BigDecimal value) {
            addCriterion("new_money <", value, "newMoney");
            return (Criteria) this;
        }

        public Criteria andNewMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("new_money <=", value, "newMoney");
            return (Criteria) this;
        }

        public Criteria andNewMoneyIn(List<BigDecimal> values) {
            addCriterion("new_money in", values, "newMoney");
            return (Criteria) this;
        }

        public Criteria andNewMoneyNotIn(List<BigDecimal> values) {
            addCriterion("new_money not in", values, "newMoney");
            return (Criteria) this;
        }

        public Criteria andNewMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("new_money between", value1, value2, "newMoney");
            return (Criteria) this;
        }

        public Criteria andNewMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("new_money not between", value1, value2, "newMoney");
            return (Criteria) this;
        }

        public Criteria andMoneySourceIsNull() {
            addCriterion("money_source is null");
            return (Criteria) this;
        }

        public Criteria andMoneySourceIsNotNull() {
            addCriterion("money_source is not null");
            return (Criteria) this;
        }

        public Criteria andMoneySourceEqualTo(String value) {
            addCriterion("money_source =", value, "moneySource");
            return (Criteria) this;
        }

        public Criteria andMoneySourceNotEqualTo(String value) {
            addCriterion("money_source <>", value, "moneySource");
            return (Criteria) this;
        }

        public Criteria andMoneySourceGreaterThan(String value) {
            addCriterion("money_source >", value, "moneySource");
            return (Criteria) this;
        }

        public Criteria andMoneySourceGreaterThanOrEqualTo(String value) {
            addCriterion("money_source >=", value, "moneySource");
            return (Criteria) this;
        }

        public Criteria andMoneySourceLessThan(String value) {
            addCriterion("money_source <", value, "moneySource");
            return (Criteria) this;
        }

        public Criteria andMoneySourceLessThanOrEqualTo(String value) {
            addCriterion("money_source <=", value, "moneySource");
            return (Criteria) this;
        }

        public Criteria andMoneySourceLike(String value) {
            addCriterion("money_source like", value, "moneySource");
            return (Criteria) this;
        }

        public Criteria andMoneySourceNotLike(String value) {
            addCriterion("money_source not like", value, "moneySource");
            return (Criteria) this;
        }

        public Criteria andMoneySourceIn(List<String> values) {
            addCriterion("money_source in", values, "moneySource");
            return (Criteria) this;
        }

        public Criteria andMoneySourceNotIn(List<String> values) {
            addCriterion("money_source not in", values, "moneySource");
            return (Criteria) this;
        }

        public Criteria andMoneySourceBetween(String value1, String value2) {
            addCriterion("money_source between", value1, value2, "moneySource");
            return (Criteria) this;
        }

        public Criteria andMoneySourceNotBetween(String value1, String value2) {
            addCriterion("money_source not between", value1, value2, "moneySource");
            return (Criteria) this;
        }

        public Criteria andMoneyWhereAboutsIsNull() {
            addCriterion("money_where_abouts is null");
            return (Criteria) this;
        }

        public Criteria andMoneyWhereAboutsIsNotNull() {
            addCriterion("money_where_abouts is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyWhereAboutsEqualTo(String value) {
            addCriterion("money_where_abouts =", value, "moneyWhereAbouts");
            return (Criteria) this;
        }

        public Criteria andMoneyWhereAboutsNotEqualTo(String value) {
            addCriterion("money_where_abouts <>", value, "moneyWhereAbouts");
            return (Criteria) this;
        }

        public Criteria andMoneyWhereAboutsGreaterThan(String value) {
            addCriterion("money_where_abouts >", value, "moneyWhereAbouts");
            return (Criteria) this;
        }

        public Criteria andMoneyWhereAboutsGreaterThanOrEqualTo(String value) {
            addCriterion("money_where_abouts >=", value, "moneyWhereAbouts");
            return (Criteria) this;
        }

        public Criteria andMoneyWhereAboutsLessThan(String value) {
            addCriterion("money_where_abouts <", value, "moneyWhereAbouts");
            return (Criteria) this;
        }

        public Criteria andMoneyWhereAboutsLessThanOrEqualTo(String value) {
            addCriterion("money_where_abouts <=", value, "moneyWhereAbouts");
            return (Criteria) this;
        }

        public Criteria andMoneyWhereAboutsLike(String value) {
            addCriterion("money_where_abouts like", value, "moneyWhereAbouts");
            return (Criteria) this;
        }

        public Criteria andMoneyWhereAboutsNotLike(String value) {
            addCriterion("money_where_abouts not like", value, "moneyWhereAbouts");
            return (Criteria) this;
        }

        public Criteria andMoneyWhereAboutsIn(List<String> values) {
            addCriterion("money_where_abouts in", values, "moneyWhereAbouts");
            return (Criteria) this;
        }

        public Criteria andMoneyWhereAboutsNotIn(List<String> values) {
            addCriterion("money_where_abouts not in", values, "moneyWhereAbouts");
            return (Criteria) this;
        }

        public Criteria andMoneyWhereAboutsBetween(String value1, String value2) {
            addCriterion("money_where_abouts between", value1, value2, "moneyWhereAbouts");
            return (Criteria) this;
        }

        public Criteria andMoneyWhereAboutsNotBetween(String value1, String value2) {
            addCriterion("money_where_abouts not between", value1, value2, "moneyWhereAbouts");
            return (Criteria) this;
        }

        public Criteria andDataSourceIsNull() {
            addCriterion("data_source is null");
            return (Criteria) this;
        }

        public Criteria andDataSourceIsNotNull() {
            addCriterion("data_source is not null");
            return (Criteria) this;
        }

        public Criteria andDataSourceEqualTo(String value) {
            addCriterion("data_source =", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceNotEqualTo(String value) {
            addCriterion("data_source <>", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceGreaterThan(String value) {
            addCriterion("data_source >", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceGreaterThanOrEqualTo(String value) {
            addCriterion("data_source >=", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceLessThan(String value) {
            addCriterion("data_source <", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceLessThanOrEqualTo(String value) {
            addCriterion("data_source <=", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceLike(String value) {
            addCriterion("data_source like", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceNotLike(String value) {
            addCriterion("data_source not like", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceIn(List<String> values) {
            addCriterion("data_source in", values, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceNotIn(List<String> values) {
            addCriterion("data_source not in", values, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceBetween(String value1, String value2) {
            addCriterion("data_source between", value1, value2, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceNotBetween(String value1, String value2) {
            addCriterion("data_source not between", value1, value2, "dataSource");
            return (Criteria) this;
        }

        public Criteria andZhifubaoSnIsNull() {
            addCriterion("zhifubao_sn is null");
            return (Criteria) this;
        }

        public Criteria andZhifubaoSnIsNotNull() {
            addCriterion("zhifubao_sn is not null");
            return (Criteria) this;
        }

        public Criteria andZhifubaoSnEqualTo(String value) {
            addCriterion("zhifubao_sn =", value, "zhifubaoSn");
            return (Criteria) this;
        }

        public Criteria andZhifubaoSnNotEqualTo(String value) {
            addCriterion("zhifubao_sn <>", value, "zhifubaoSn");
            return (Criteria) this;
        }

        public Criteria andZhifubaoSnGreaterThan(String value) {
            addCriterion("zhifubao_sn >", value, "zhifubaoSn");
            return (Criteria) this;
        }

        public Criteria andZhifubaoSnGreaterThanOrEqualTo(String value) {
            addCriterion("zhifubao_sn >=", value, "zhifubaoSn");
            return (Criteria) this;
        }

        public Criteria andZhifubaoSnLessThan(String value) {
            addCriterion("zhifubao_sn <", value, "zhifubaoSn");
            return (Criteria) this;
        }

        public Criteria andZhifubaoSnLessThanOrEqualTo(String value) {
            addCriterion("zhifubao_sn <=", value, "zhifubaoSn");
            return (Criteria) this;
        }

        public Criteria andZhifubaoSnLike(String value) {
            addCriterion("zhifubao_sn like", value, "zhifubaoSn");
            return (Criteria) this;
        }

        public Criteria andZhifubaoSnNotLike(String value) {
            addCriterion("zhifubao_sn not like", value, "zhifubaoSn");
            return (Criteria) this;
        }

        public Criteria andZhifubaoSnIn(List<String> values) {
            addCriterion("zhifubao_sn in", values, "zhifubaoSn");
            return (Criteria) this;
        }

        public Criteria andZhifubaoSnNotIn(List<String> values) {
            addCriterion("zhifubao_sn not in", values, "zhifubaoSn");
            return (Criteria) this;
        }

        public Criteria andZhifubaoSnBetween(String value1, String value2) {
            addCriterion("zhifubao_sn between", value1, value2, "zhifubaoSn");
            return (Criteria) this;
        }

        public Criteria andZhifubaoSnNotBetween(String value1, String value2) {
            addCriterion("zhifubao_sn not between", value1, value2, "zhifubaoSn");
            return (Criteria) this;
        }

        public Criteria andWeixinSnIsNull() {
            addCriterion("weixin_sn is null");
            return (Criteria) this;
        }

        public Criteria andWeixinSnIsNotNull() {
            addCriterion("weixin_sn is not null");
            return (Criteria) this;
        }

        public Criteria andWeixinSnEqualTo(String value) {
            addCriterion("weixin_sn =", value, "weixinSn");
            return (Criteria) this;
        }

        public Criteria andWeixinSnNotEqualTo(String value) {
            addCriterion("weixin_sn <>", value, "weixinSn");
            return (Criteria) this;
        }

        public Criteria andWeixinSnGreaterThan(String value) {
            addCriterion("weixin_sn >", value, "weixinSn");
            return (Criteria) this;
        }

        public Criteria andWeixinSnGreaterThanOrEqualTo(String value) {
            addCriterion("weixin_sn >=", value, "weixinSn");
            return (Criteria) this;
        }

        public Criteria andWeixinSnLessThan(String value) {
            addCriterion("weixin_sn <", value, "weixinSn");
            return (Criteria) this;
        }

        public Criteria andWeixinSnLessThanOrEqualTo(String value) {
            addCriterion("weixin_sn <=", value, "weixinSn");
            return (Criteria) this;
        }

        public Criteria andWeixinSnLike(String value) {
            addCriterion("weixin_sn like", value, "weixinSn");
            return (Criteria) this;
        }

        public Criteria andWeixinSnNotLike(String value) {
            addCriterion("weixin_sn not like", value, "weixinSn");
            return (Criteria) this;
        }

        public Criteria andWeixinSnIn(List<String> values) {
            addCriterion("weixin_sn in", values, "weixinSn");
            return (Criteria) this;
        }

        public Criteria andWeixinSnNotIn(List<String> values) {
            addCriterion("weixin_sn not in", values, "weixinSn");
            return (Criteria) this;
        }

        public Criteria andWeixinSnBetween(String value1, String value2) {
            addCriterion("weixin_sn between", value1, value2, "weixinSn");
            return (Criteria) this;
        }

        public Criteria andWeixinSnNotBetween(String value1, String value2) {
            addCriterion("weixin_sn not between", value1, value2, "weixinSn");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
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

        public Criteria andCreateDateStringIsNull() {
            addCriterion("create_date_string is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateStringIsNotNull() {
            addCriterion("create_date_string is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateStringEqualTo(String value) {
            addCriterion("create_date_string =", value, "createDateString");
            return (Criteria) this;
        }

        public Criteria andCreateDateStringNotEqualTo(String value) {
            addCriterion("create_date_string <>", value, "createDateString");
            return (Criteria) this;
        }

        public Criteria andCreateDateStringGreaterThan(String value) {
            addCriterion("create_date_string >", value, "createDateString");
            return (Criteria) this;
        }

        public Criteria andCreateDateStringGreaterThanOrEqualTo(String value) {
            addCriterion("create_date_string >=", value, "createDateString");
            return (Criteria) this;
        }

        public Criteria andCreateDateStringLessThan(String value) {
            addCriterion("create_date_string <", value, "createDateString");
            return (Criteria) this;
        }

        public Criteria andCreateDateStringLessThanOrEqualTo(String value) {
            addCriterion("create_date_string <=", value, "createDateString");
            return (Criteria) this;
        }

        public Criteria andCreateDateStringLike(String value) {
            addCriterion("create_date_string like", value, "createDateString");
            return (Criteria) this;
        }

        public Criteria andCreateDateStringNotLike(String value) {
            addCriterion("create_date_string not like", value, "createDateString");
            return (Criteria) this;
        }

        public Criteria andCreateDateStringIn(List<String> values) {
            addCriterion("create_date_string in", values, "createDateString");
            return (Criteria) this;
        }

        public Criteria andCreateDateStringNotIn(List<String> values) {
            addCriterion("create_date_string not in", values, "createDateString");
            return (Criteria) this;
        }

        public Criteria andCreateDateStringBetween(String value1, String value2) {
            addCriterion("create_date_string between", value1, value2, "createDateString");
            return (Criteria) this;
        }

        public Criteria andCreateDateStringNotBetween(String value1, String value2) {
            addCriterion("create_date_string not between", value1, value2, "createDateString");
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