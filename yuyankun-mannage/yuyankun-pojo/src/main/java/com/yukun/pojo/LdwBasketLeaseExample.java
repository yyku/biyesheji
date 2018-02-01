package com.yukun.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LdwBasketLeaseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LdwBasketLeaseExample() {
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

        public Criteria andBasketCountIsNull() {
            addCriterion("basket_count is null");
            return (Criteria) this;
        }

        public Criteria andBasketCountIsNotNull() {
            addCriterion("basket_count is not null");
            return (Criteria) this;
        }

        public Criteria andBasketCountEqualTo(Integer value) {
            addCriterion("basket_count =", value, "basketCount");
            return (Criteria) this;
        }

        public Criteria andBasketCountNotEqualTo(Integer value) {
            addCriterion("basket_count <>", value, "basketCount");
            return (Criteria) this;
        }

        public Criteria andBasketCountGreaterThan(Integer value) {
            addCriterion("basket_count >", value, "basketCount");
            return (Criteria) this;
        }

        public Criteria andBasketCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("basket_count >=", value, "basketCount");
            return (Criteria) this;
        }

        public Criteria andBasketCountLessThan(Integer value) {
            addCriterion("basket_count <", value, "basketCount");
            return (Criteria) this;
        }

        public Criteria andBasketCountLessThanOrEqualTo(Integer value) {
            addCriterion("basket_count <=", value, "basketCount");
            return (Criteria) this;
        }

        public Criteria andBasketCountIn(List<Integer> values) {
            addCriterion("basket_count in", values, "basketCount");
            return (Criteria) this;
        }

        public Criteria andBasketCountNotIn(List<Integer> values) {
            addCriterion("basket_count not in", values, "basketCount");
            return (Criteria) this;
        }

        public Criteria andBasketCountBetween(Integer value1, Integer value2) {
            addCriterion("basket_count between", value1, value2, "basketCount");
            return (Criteria) this;
        }

        public Criteria andBasketCountNotBetween(Integer value1, Integer value2) {
            addCriterion("basket_count not between", value1, value2, "basketCount");
            return (Criteria) this;
        }

        public Criteria andDepositTotalIsNull() {
            addCriterion("deposit_total is null");
            return (Criteria) this;
        }

        public Criteria andDepositTotalIsNotNull() {
            addCriterion("deposit_total is not null");
            return (Criteria) this;
        }

        public Criteria andDepositTotalEqualTo(BigDecimal value) {
            addCriterion("deposit_total =", value, "depositTotal");
            return (Criteria) this;
        }

        public Criteria andDepositTotalNotEqualTo(BigDecimal value) {
            addCriterion("deposit_total <>", value, "depositTotal");
            return (Criteria) this;
        }

        public Criteria andDepositTotalGreaterThan(BigDecimal value) {
            addCriterion("deposit_total >", value, "depositTotal");
            return (Criteria) this;
        }

        public Criteria andDepositTotalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("deposit_total >=", value, "depositTotal");
            return (Criteria) this;
        }

        public Criteria andDepositTotalLessThan(BigDecimal value) {
            addCriterion("deposit_total <", value, "depositTotal");
            return (Criteria) this;
        }

        public Criteria andDepositTotalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("deposit_total <=", value, "depositTotal");
            return (Criteria) this;
        }

        public Criteria andDepositTotalIn(List<BigDecimal> values) {
            addCriterion("deposit_total in", values, "depositTotal");
            return (Criteria) this;
        }

        public Criteria andDepositTotalNotIn(List<BigDecimal> values) {
            addCriterion("deposit_total not in", values, "depositTotal");
            return (Criteria) this;
        }

        public Criteria andDepositTotalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("deposit_total between", value1, value2, "depositTotal");
            return (Criteria) this;
        }

        public Criteria andDepositTotalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("deposit_total not between", value1, value2, "depositTotal");
            return (Criteria) this;
        }

        public Criteria andRentTotalIsNull() {
            addCriterion("rent_total is null");
            return (Criteria) this;
        }

        public Criteria andRentTotalIsNotNull() {
            addCriterion("rent_total is not null");
            return (Criteria) this;
        }

        public Criteria andRentTotalEqualTo(BigDecimal value) {
            addCriterion("rent_total =", value, "rentTotal");
            return (Criteria) this;
        }

        public Criteria andRentTotalNotEqualTo(BigDecimal value) {
            addCriterion("rent_total <>", value, "rentTotal");
            return (Criteria) this;
        }

        public Criteria andRentTotalGreaterThan(BigDecimal value) {
            addCriterion("rent_total >", value, "rentTotal");
            return (Criteria) this;
        }

        public Criteria andRentTotalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("rent_total >=", value, "rentTotal");
            return (Criteria) this;
        }

        public Criteria andRentTotalLessThan(BigDecimal value) {
            addCriterion("rent_total <", value, "rentTotal");
            return (Criteria) this;
        }

        public Criteria andRentTotalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("rent_total <=", value, "rentTotal");
            return (Criteria) this;
        }

        public Criteria andRentTotalIn(List<BigDecimal> values) {
            addCriterion("rent_total in", values, "rentTotal");
            return (Criteria) this;
        }

        public Criteria andRentTotalNotIn(List<BigDecimal> values) {
            addCriterion("rent_total not in", values, "rentTotal");
            return (Criteria) this;
        }

        public Criteria andRentTotalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rent_total between", value1, value2, "rentTotal");
            return (Criteria) this;
        }

        public Criteria andRentTotalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rent_total not between", value1, value2, "rentTotal");
            return (Criteria) this;
        }

        public Criteria andPayMethodIsNull() {
            addCriterion("pay_method is null");
            return (Criteria) this;
        }

        public Criteria andPayMethodIsNotNull() {
            addCriterion("pay_method is not null");
            return (Criteria) this;
        }

        public Criteria andPayMethodEqualTo(Integer value) {
            addCriterion("pay_method =", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodNotEqualTo(Integer value) {
            addCriterion("pay_method <>", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodGreaterThan(Integer value) {
            addCriterion("pay_method >", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_method >=", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodLessThan(Integer value) {
            addCriterion("pay_method <", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodLessThanOrEqualTo(Integer value) {
            addCriterion("pay_method <=", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodIn(List<Integer> values) {
            addCriterion("pay_method in", values, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodNotIn(List<Integer> values) {
            addCriterion("pay_method not in", values, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodBetween(Integer value1, Integer value2) {
            addCriterion("pay_method between", value1, value2, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_method not between", value1, value2, "payMethod");
            return (Criteria) this;
        }

        public Criteria andIsPayMoneyIsNull() {
            addCriterion("is_pay_money is null");
            return (Criteria) this;
        }

        public Criteria andIsPayMoneyIsNotNull() {
            addCriterion("is_pay_money is not null");
            return (Criteria) this;
        }

        public Criteria andIsPayMoneyEqualTo(Byte value) {
            addCriterion("is_pay_money =", value, "isPayMoney");
            return (Criteria) this;
        }

        public Criteria andIsPayMoneyNotEqualTo(Byte value) {
            addCriterion("is_pay_money <>", value, "isPayMoney");
            return (Criteria) this;
        }

        public Criteria andIsPayMoneyGreaterThan(Byte value) {
            addCriterion("is_pay_money >", value, "isPayMoney");
            return (Criteria) this;
        }

        public Criteria andIsPayMoneyGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_pay_money >=", value, "isPayMoney");
            return (Criteria) this;
        }

        public Criteria andIsPayMoneyLessThan(Byte value) {
            addCriterion("is_pay_money <", value, "isPayMoney");
            return (Criteria) this;
        }

        public Criteria andIsPayMoneyLessThanOrEqualTo(Byte value) {
            addCriterion("is_pay_money <=", value, "isPayMoney");
            return (Criteria) this;
        }

        public Criteria andIsPayMoneyIn(List<Byte> values) {
            addCriterion("is_pay_money in", values, "isPayMoney");
            return (Criteria) this;
        }

        public Criteria andIsPayMoneyNotIn(List<Byte> values) {
            addCriterion("is_pay_money not in", values, "isPayMoney");
            return (Criteria) this;
        }

        public Criteria andIsPayMoneyBetween(Byte value1, Byte value2) {
            addCriterion("is_pay_money between", value1, value2, "isPayMoney");
            return (Criteria) this;
        }

        public Criteria andIsPayMoneyNotBetween(Byte value1, Byte value2) {
            addCriterion("is_pay_money not between", value1, value2, "isPayMoney");
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

        public Criteria andUpdateUserNameIsNull() {
            addCriterion("update_user_name is null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNameIsNotNull() {
            addCriterion("update_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNameEqualTo(String value) {
            addCriterion("update_user_name =", value, "updateUserName");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNameNotEqualTo(String value) {
            addCriterion("update_user_name <>", value, "updateUserName");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNameGreaterThan(String value) {
            addCriterion("update_user_name >", value, "updateUserName");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("update_user_name >=", value, "updateUserName");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNameLessThan(String value) {
            addCriterion("update_user_name <", value, "updateUserName");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNameLessThanOrEqualTo(String value) {
            addCriterion("update_user_name <=", value, "updateUserName");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNameLike(String value) {
            addCriterion("update_user_name like", value, "updateUserName");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNameNotLike(String value) {
            addCriterion("update_user_name not like", value, "updateUserName");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNameIn(List<String> values) {
            addCriterion("update_user_name in", values, "updateUserName");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNameNotIn(List<String> values) {
            addCriterion("update_user_name not in", values, "updateUserName");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNameBetween(String value1, String value2) {
            addCriterion("update_user_name between", value1, value2, "updateUserName");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNameNotBetween(String value1, String value2) {
            addCriterion("update_user_name not between", value1, value2, "updateUserName");
            return (Criteria) this;
        }

        public Criteria andLeaseOperationCenterIdIsNull() {
            addCriterion("lease_operation_center_id is null");
            return (Criteria) this;
        }

        public Criteria andLeaseOperationCenterIdIsNotNull() {
            addCriterion("lease_operation_center_id is not null");
            return (Criteria) this;
        }

        public Criteria andLeaseOperationCenterIdEqualTo(Long value) {
            addCriterion("lease_operation_center_id =", value, "leaseOperationCenterId");
            return (Criteria) this;
        }

        public Criteria andLeaseOperationCenterIdNotEqualTo(Long value) {
            addCriterion("lease_operation_center_id <>", value, "leaseOperationCenterId");
            return (Criteria) this;
        }

        public Criteria andLeaseOperationCenterIdGreaterThan(Long value) {
            addCriterion("lease_operation_center_id >", value, "leaseOperationCenterId");
            return (Criteria) this;
        }

        public Criteria andLeaseOperationCenterIdGreaterThanOrEqualTo(Long value) {
            addCriterion("lease_operation_center_id >=", value, "leaseOperationCenterId");
            return (Criteria) this;
        }

        public Criteria andLeaseOperationCenterIdLessThan(Long value) {
            addCriterion("lease_operation_center_id <", value, "leaseOperationCenterId");
            return (Criteria) this;
        }

        public Criteria andLeaseOperationCenterIdLessThanOrEqualTo(Long value) {
            addCriterion("lease_operation_center_id <=", value, "leaseOperationCenterId");
            return (Criteria) this;
        }

        public Criteria andLeaseOperationCenterIdIn(List<Long> values) {
            addCriterion("lease_operation_center_id in", values, "leaseOperationCenterId");
            return (Criteria) this;
        }

        public Criteria andLeaseOperationCenterIdNotIn(List<Long> values) {
            addCriterion("lease_operation_center_id not in", values, "leaseOperationCenterId");
            return (Criteria) this;
        }

        public Criteria andLeaseOperationCenterIdBetween(Long value1, Long value2) {
            addCriterion("lease_operation_center_id between", value1, value2, "leaseOperationCenterId");
            return (Criteria) this;
        }

        public Criteria andLeaseOperationCenterIdNotBetween(Long value1, Long value2) {
            addCriterion("lease_operation_center_id not between", value1, value2, "leaseOperationCenterId");
            return (Criteria) this;
        }

        public Criteria andLeaseOperationCenterNameIsNull() {
            addCriterion("lease_operation_center_name is null");
            return (Criteria) this;
        }

        public Criteria andLeaseOperationCenterNameIsNotNull() {
            addCriterion("lease_operation_center_name is not null");
            return (Criteria) this;
        }

        public Criteria andLeaseOperationCenterNameEqualTo(String value) {
            addCriterion("lease_operation_center_name =", value, "leaseOperationCenterName");
            return (Criteria) this;
        }

        public Criteria andLeaseOperationCenterNameNotEqualTo(String value) {
            addCriterion("lease_operation_center_name <>", value, "leaseOperationCenterName");
            return (Criteria) this;
        }

        public Criteria andLeaseOperationCenterNameGreaterThan(String value) {
            addCriterion("lease_operation_center_name >", value, "leaseOperationCenterName");
            return (Criteria) this;
        }

        public Criteria andLeaseOperationCenterNameGreaterThanOrEqualTo(String value) {
            addCriterion("lease_operation_center_name >=", value, "leaseOperationCenterName");
            return (Criteria) this;
        }

        public Criteria andLeaseOperationCenterNameLessThan(String value) {
            addCriterion("lease_operation_center_name <", value, "leaseOperationCenterName");
            return (Criteria) this;
        }

        public Criteria andLeaseOperationCenterNameLessThanOrEqualTo(String value) {
            addCriterion("lease_operation_center_name <=", value, "leaseOperationCenterName");
            return (Criteria) this;
        }

        public Criteria andLeaseOperationCenterNameLike(String value) {
            addCriterion("lease_operation_center_name like", value, "leaseOperationCenterName");
            return (Criteria) this;
        }

        public Criteria andLeaseOperationCenterNameNotLike(String value) {
            addCriterion("lease_operation_center_name not like", value, "leaseOperationCenterName");
            return (Criteria) this;
        }

        public Criteria andLeaseOperationCenterNameIn(List<String> values) {
            addCriterion("lease_operation_center_name in", values, "leaseOperationCenterName");
            return (Criteria) this;
        }

        public Criteria andLeaseOperationCenterNameNotIn(List<String> values) {
            addCriterion("lease_operation_center_name not in", values, "leaseOperationCenterName");
            return (Criteria) this;
        }

        public Criteria andLeaseOperationCenterNameBetween(String value1, String value2) {
            addCriterion("lease_operation_center_name between", value1, value2, "leaseOperationCenterName");
            return (Criteria) this;
        }

        public Criteria andLeaseOperationCenterNameNotBetween(String value1, String value2) {
            addCriterion("lease_operation_center_name not between", value1, value2, "leaseOperationCenterName");
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