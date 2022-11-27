package com.newcore.task.platform.model.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BatchDatasourceConfigExample {
    /**
     * batch_datasource_config
     */
    protected String orderByClause;

    /**
     * batch_datasource_config
     */
    protected boolean distinct;

    /**
     * batch_datasource_config
     */
    protected List<Criteria> oredCriteria;

    /**
     * BatchDatasourceConfigExample 方法
     *
     * @date 2022-11-27 15:46:17
     */
    public BatchDatasourceConfigExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * setOrderByClause 方法
     *
     * @date 2022-11-27 15:46:17
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * getOrderByClause 方法
     *
     * @date 2022-11-27 15:46:17
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * setDistinct 方法
     *
     * @date 2022-11-27 15:46:17
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * isDistinct 方法
     *
     * @date 2022-11-27 15:46:17
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * getOredCriteria 方法
     *
     * @date 2022-11-27 15:46:17
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * or 方法
     *
     * @date 2022-11-27 15:46:17
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * or 方法
     *
     * @date 2022-11-27 15:46:17
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * createCriteria 方法
     *
     * @date 2022-11-27 15:46:17
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * createCriteriaInternal 方法
     *
     * @date 2022-11-27 15:46:17
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * clear 方法
     *
     * @date 2022-11-27 15:46:17
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * batch_datasource_config 2022-11-27 15:46:17
     */
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

        public Criteria andBatchDatasourceCodeIsNull() {
            addCriterion("batch_datasource_code is null");
            return (Criteria) this;
        }

        public Criteria andBatchDatasourceCodeIsNotNull() {
            addCriterion("batch_datasource_code is not null");
            return (Criteria) this;
        }

        public Criteria andBatchDatasourceCodeEqualTo(String value) {
            addCriterion("batch_datasource_code =", value, "batchDatasourceCode");
            return (Criteria) this;
        }

        public Criteria andBatchDatasourceCodeNotEqualTo(String value) {
            addCriterion("batch_datasource_code <>", value, "batchDatasourceCode");
            return (Criteria) this;
        }

        public Criteria andBatchDatasourceCodeGreaterThan(String value) {
            addCriterion("batch_datasource_code >", value, "batchDatasourceCode");
            return (Criteria) this;
        }

        public Criteria andBatchDatasourceCodeGreaterThanOrEqualTo(String value) {
            addCriterion("batch_datasource_code >=", value, "batchDatasourceCode");
            return (Criteria) this;
        }

        public Criteria andBatchDatasourceCodeLessThan(String value) {
            addCriterion("batch_datasource_code <", value, "batchDatasourceCode");
            return (Criteria) this;
        }

        public Criteria andBatchDatasourceCodeLessThanOrEqualTo(String value) {
            addCriterion("batch_datasource_code <=", value, "batchDatasourceCode");
            return (Criteria) this;
        }

        public Criteria andBatchDatasourceCodeLike(String value) {
            addCriterion("batch_datasource_code like", value, "batchDatasourceCode");
            return (Criteria) this;
        }

        public Criteria andBatchDatasourceCodeNotLike(String value) {
            addCriterion("batch_datasource_code not like", value, "batchDatasourceCode");
            return (Criteria) this;
        }

        public Criteria andBatchDatasourceCodeIn(List<String> values) {
            addCriterion("batch_datasource_code in", values, "batchDatasourceCode");
            return (Criteria) this;
        }

        public Criteria andBatchDatasourceCodeNotIn(List<String> values) {
            addCriterion("batch_datasource_code not in", values, "batchDatasourceCode");
            return (Criteria) this;
        }

        public Criteria andBatchDatasourceCodeBetween(String value1, String value2) {
            addCriterion("batch_datasource_code between", value1, value2, "batchDatasourceCode");
            return (Criteria) this;
        }

        public Criteria andBatchDatasourceCodeNotBetween(String value1, String value2) {
            addCriterion("batch_datasource_code not between", value1, value2, "batchDatasourceCode");
            return (Criteria) this;
        }

        public Criteria andBatchDatasourceNameIsNull() {
            addCriterion("batch_datasource_name is null");
            return (Criteria) this;
        }

        public Criteria andBatchDatasourceNameIsNotNull() {
            addCriterion("batch_datasource_name is not null");
            return (Criteria) this;
        }

        public Criteria andBatchDatasourceNameEqualTo(String value) {
            addCriterion("batch_datasource_name =", value, "batchDatasourceName");
            return (Criteria) this;
        }

        public Criteria andBatchDatasourceNameNotEqualTo(String value) {
            addCriterion("batch_datasource_name <>", value, "batchDatasourceName");
            return (Criteria) this;
        }

        public Criteria andBatchDatasourceNameGreaterThan(String value) {
            addCriterion("batch_datasource_name >", value, "batchDatasourceName");
            return (Criteria) this;
        }

        public Criteria andBatchDatasourceNameGreaterThanOrEqualTo(String value) {
            addCriterion("batch_datasource_name >=", value, "batchDatasourceName");
            return (Criteria) this;
        }

        public Criteria andBatchDatasourceNameLessThan(String value) {
            addCriterion("batch_datasource_name <", value, "batchDatasourceName");
            return (Criteria) this;
        }

        public Criteria andBatchDatasourceNameLessThanOrEqualTo(String value) {
            addCriterion("batch_datasource_name <=", value, "batchDatasourceName");
            return (Criteria) this;
        }

        public Criteria andBatchDatasourceNameLike(String value) {
            addCriterion("batch_datasource_name like", value, "batchDatasourceName");
            return (Criteria) this;
        }

        public Criteria andBatchDatasourceNameNotLike(String value) {
            addCriterion("batch_datasource_name not like", value, "batchDatasourceName");
            return (Criteria) this;
        }

        public Criteria andBatchDatasourceNameIn(List<String> values) {
            addCriterion("batch_datasource_name in", values, "batchDatasourceName");
            return (Criteria) this;
        }

        public Criteria andBatchDatasourceNameNotIn(List<String> values) {
            addCriterion("batch_datasource_name not in", values, "batchDatasourceName");
            return (Criteria) this;
        }

        public Criteria andBatchDatasourceNameBetween(String value1, String value2) {
            addCriterion("batch_datasource_name between", value1, value2, "batchDatasourceName");
            return (Criteria) this;
        }

        public Criteria andBatchDatasourceNameNotBetween(String value1, String value2) {
            addCriterion("batch_datasource_name not between", value1, value2, "batchDatasourceName");
            return (Criteria) this;
        }

        public Criteria andDatasourceUrlIsNull() {
            addCriterion("datasource_url is null");
            return (Criteria) this;
        }

        public Criteria andDatasourceUrlIsNotNull() {
            addCriterion("datasource_url is not null");
            return (Criteria) this;
        }

        public Criteria andDatasourceUrlEqualTo(String value) {
            addCriterion("datasource_url =", value, "datasourceUrl");
            return (Criteria) this;
        }

        public Criteria andDatasourceUrlNotEqualTo(String value) {
            addCriterion("datasource_url <>", value, "datasourceUrl");
            return (Criteria) this;
        }

        public Criteria andDatasourceUrlGreaterThan(String value) {
            addCriterion("datasource_url >", value, "datasourceUrl");
            return (Criteria) this;
        }

        public Criteria andDatasourceUrlGreaterThanOrEqualTo(String value) {
            addCriterion("datasource_url >=", value, "datasourceUrl");
            return (Criteria) this;
        }

        public Criteria andDatasourceUrlLessThan(String value) {
            addCriterion("datasource_url <", value, "datasourceUrl");
            return (Criteria) this;
        }

        public Criteria andDatasourceUrlLessThanOrEqualTo(String value) {
            addCriterion("datasource_url <=", value, "datasourceUrl");
            return (Criteria) this;
        }

        public Criteria andDatasourceUrlLike(String value) {
            addCriterion("datasource_url like", value, "datasourceUrl");
            return (Criteria) this;
        }

        public Criteria andDatasourceUrlNotLike(String value) {
            addCriterion("datasource_url not like", value, "datasourceUrl");
            return (Criteria) this;
        }

        public Criteria andDatasourceUrlIn(List<String> values) {
            addCriterion("datasource_url in", values, "datasourceUrl");
            return (Criteria) this;
        }

        public Criteria andDatasourceUrlNotIn(List<String> values) {
            addCriterion("datasource_url not in", values, "datasourceUrl");
            return (Criteria) this;
        }

        public Criteria andDatasourceUrlBetween(String value1, String value2) {
            addCriterion("datasource_url between", value1, value2, "datasourceUrl");
            return (Criteria) this;
        }

        public Criteria andDatasourceUrlNotBetween(String value1, String value2) {
            addCriterion("datasource_url not between", value1, value2, "datasourceUrl");
            return (Criteria) this;
        }

        public Criteria andDatasourceConnectUsernameIsNull() {
            addCriterion("datasource_connect_username is null");
            return (Criteria) this;
        }

        public Criteria andDatasourceConnectUsernameIsNotNull() {
            addCriterion("datasource_connect_username is not null");
            return (Criteria) this;
        }

        public Criteria andDatasourceConnectUsernameEqualTo(String value) {
            addCriterion("datasource_connect_username =", value, "datasourceConnectUsername");
            return (Criteria) this;
        }

        public Criteria andDatasourceConnectUsernameNotEqualTo(String value) {
            addCriterion("datasource_connect_username <>", value, "datasourceConnectUsername");
            return (Criteria) this;
        }

        public Criteria andDatasourceConnectUsernameGreaterThan(String value) {
            addCriterion("datasource_connect_username >", value, "datasourceConnectUsername");
            return (Criteria) this;
        }

        public Criteria andDatasourceConnectUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("datasource_connect_username >=", value, "datasourceConnectUsername");
            return (Criteria) this;
        }

        public Criteria andDatasourceConnectUsernameLessThan(String value) {
            addCriterion("datasource_connect_username <", value, "datasourceConnectUsername");
            return (Criteria) this;
        }

        public Criteria andDatasourceConnectUsernameLessThanOrEqualTo(String value) {
            addCriterion("datasource_connect_username <=", value, "datasourceConnectUsername");
            return (Criteria) this;
        }

        public Criteria andDatasourceConnectUsernameLike(String value) {
            addCriterion("datasource_connect_username like", value, "datasourceConnectUsername");
            return (Criteria) this;
        }

        public Criteria andDatasourceConnectUsernameNotLike(String value) {
            addCriterion("datasource_connect_username not like", value, "datasourceConnectUsername");
            return (Criteria) this;
        }

        public Criteria andDatasourceConnectUsernameIn(List<String> values) {
            addCriterion("datasource_connect_username in", values, "datasourceConnectUsername");
            return (Criteria) this;
        }

        public Criteria andDatasourceConnectUsernameNotIn(List<String> values) {
            addCriterion("datasource_connect_username not in", values, "datasourceConnectUsername");
            return (Criteria) this;
        }

        public Criteria andDatasourceConnectUsernameBetween(String value1, String value2) {
            addCriterion("datasource_connect_username between", value1, value2, "datasourceConnectUsername");
            return (Criteria) this;
        }

        public Criteria andDatasourceConnectUsernameNotBetween(String value1, String value2) {
            addCriterion("datasource_connect_username not between", value1, value2, "datasourceConnectUsername");
            return (Criteria) this;
        }

        public Criteria andDatasourceConnectPasswordIsNull() {
            addCriterion("datasource_connect_password is null");
            return (Criteria) this;
        }

        public Criteria andDatasourceConnectPasswordIsNotNull() {
            addCriterion("datasource_connect_password is not null");
            return (Criteria) this;
        }

        public Criteria andDatasourceConnectPasswordEqualTo(String value) {
            addCriterion("datasource_connect_password =", value, "datasourceConnectPassword");
            return (Criteria) this;
        }

        public Criteria andDatasourceConnectPasswordNotEqualTo(String value) {
            addCriterion("datasource_connect_password <>", value, "datasourceConnectPassword");
            return (Criteria) this;
        }

        public Criteria andDatasourceConnectPasswordGreaterThan(String value) {
            addCriterion("datasource_connect_password >", value, "datasourceConnectPassword");
            return (Criteria) this;
        }

        public Criteria andDatasourceConnectPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("datasource_connect_password >=", value, "datasourceConnectPassword");
            return (Criteria) this;
        }

        public Criteria andDatasourceConnectPasswordLessThan(String value) {
            addCriterion("datasource_connect_password <", value, "datasourceConnectPassword");
            return (Criteria) this;
        }

        public Criteria andDatasourceConnectPasswordLessThanOrEqualTo(String value) {
            addCriterion("datasource_connect_password <=", value, "datasourceConnectPassword");
            return (Criteria) this;
        }

        public Criteria andDatasourceConnectPasswordLike(String value) {
            addCriterion("datasource_connect_password like", value, "datasourceConnectPassword");
            return (Criteria) this;
        }

        public Criteria andDatasourceConnectPasswordNotLike(String value) {
            addCriterion("datasource_connect_password not like", value, "datasourceConnectPassword");
            return (Criteria) this;
        }

        public Criteria andDatasourceConnectPasswordIn(List<String> values) {
            addCriterion("datasource_connect_password in", values, "datasourceConnectPassword");
            return (Criteria) this;
        }

        public Criteria andDatasourceConnectPasswordNotIn(List<String> values) {
            addCriterion("datasource_connect_password not in", values, "datasourceConnectPassword");
            return (Criteria) this;
        }

        public Criteria andDatasourceConnectPasswordBetween(String value1, String value2) {
            addCriterion("datasource_connect_password between", value1, value2, "datasourceConnectPassword");
            return (Criteria) this;
        }

        public Criteria andDatasourceConnectPasswordNotBetween(String value1, String value2) {
            addCriterion("datasource_connect_password not between", value1, value2, "datasourceConnectPassword");
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
    }

    /**
     * batch_datasource_config
     *
     * @date 2022-11-27 15:46:17
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * batch_datasource_config 2022-11-27 15:46:17
     */
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