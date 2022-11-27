package com.newcore.task.platform.model.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BatchExecHistoryExample {
    /**
     * batch_exec_history
     */
    protected String orderByClause;

    /**
     * batch_exec_history
     */
    protected boolean distinct;

    /**
     * batch_exec_history
     */
    protected List<Criteria> oredCriteria;

    /**
     * BatchExecHistoryExample 方法
     *
     * @date 2022-11-27 15:46:17
     */
    public BatchExecHistoryExample() {
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
     * batch_exec_history 2022-11-27 15:46:17
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

        public Criteria andBatchExecuteIdIsNull() {
            addCriterion("batch_execute_id is null");
            return (Criteria) this;
        }

        public Criteria andBatchExecuteIdIsNotNull() {
            addCriterion("batch_execute_id is not null");
            return (Criteria) this;
        }

        public Criteria andBatchExecuteIdEqualTo(Long value) {
            addCriterion("batch_execute_id =", value, "batchExecuteId");
            return (Criteria) this;
        }

        public Criteria andBatchExecuteIdNotEqualTo(Long value) {
            addCriterion("batch_execute_id <>", value, "batchExecuteId");
            return (Criteria) this;
        }

        public Criteria andBatchExecuteIdGreaterThan(Long value) {
            addCriterion("batch_execute_id >", value, "batchExecuteId");
            return (Criteria) this;
        }

        public Criteria andBatchExecuteIdGreaterThanOrEqualTo(Long value) {
            addCriterion("batch_execute_id >=", value, "batchExecuteId");
            return (Criteria) this;
        }

        public Criteria andBatchExecuteIdLessThan(Long value) {
            addCriterion("batch_execute_id <", value, "batchExecuteId");
            return (Criteria) this;
        }

        public Criteria andBatchExecuteIdLessThanOrEqualTo(Long value) {
            addCriterion("batch_execute_id <=", value, "batchExecuteId");
            return (Criteria) this;
        }

        public Criteria andBatchExecuteIdIn(List<Long> values) {
            addCriterion("batch_execute_id in", values, "batchExecuteId");
            return (Criteria) this;
        }

        public Criteria andBatchExecuteIdNotIn(List<Long> values) {
            addCriterion("batch_execute_id not in", values, "batchExecuteId");
            return (Criteria) this;
        }

        public Criteria andBatchExecuteIdBetween(Long value1, Long value2) {
            addCriterion("batch_execute_id between", value1, value2, "batchExecuteId");
            return (Criteria) this;
        }

        public Criteria andBatchExecuteIdNotBetween(Long value1, Long value2) {
            addCriterion("batch_execute_id not between", value1, value2, "batchExecuteId");
            return (Criteria) this;
        }

        public Criteria andBatchTaskIdIsNull() {
            addCriterion("batch_task_id is null");
            return (Criteria) this;
        }

        public Criteria andBatchTaskIdIsNotNull() {
            addCriterion("batch_task_id is not null");
            return (Criteria) this;
        }

        public Criteria andBatchTaskIdEqualTo(Long value) {
            addCriterion("batch_task_id =", value, "batchTaskId");
            return (Criteria) this;
        }

        public Criteria andBatchTaskIdNotEqualTo(Long value) {
            addCriterion("batch_task_id <>", value, "batchTaskId");
            return (Criteria) this;
        }

        public Criteria andBatchTaskIdGreaterThan(Long value) {
            addCriterion("batch_task_id >", value, "batchTaskId");
            return (Criteria) this;
        }

        public Criteria andBatchTaskIdGreaterThanOrEqualTo(Long value) {
            addCriterion("batch_task_id >=", value, "batchTaskId");
            return (Criteria) this;
        }

        public Criteria andBatchTaskIdLessThan(Long value) {
            addCriterion("batch_task_id <", value, "batchTaskId");
            return (Criteria) this;
        }

        public Criteria andBatchTaskIdLessThanOrEqualTo(Long value) {
            addCriterion("batch_task_id <=", value, "batchTaskId");
            return (Criteria) this;
        }

        public Criteria andBatchTaskIdIn(List<Long> values) {
            addCriterion("batch_task_id in", values, "batchTaskId");
            return (Criteria) this;
        }

        public Criteria andBatchTaskIdNotIn(List<Long> values) {
            addCriterion("batch_task_id not in", values, "batchTaskId");
            return (Criteria) this;
        }

        public Criteria andBatchTaskIdBetween(Long value1, Long value2) {
            addCriterion("batch_task_id between", value1, value2, "batchTaskId");
            return (Criteria) this;
        }

        public Criteria andBatchTaskIdNotBetween(Long value1, Long value2) {
            addCriterion("batch_task_id not between", value1, value2, "batchTaskId");
            return (Criteria) this;
        }

        public Criteria andTaskExecuteStartTimeIsNull() {
            addCriterion("task_execute_start_time is null");
            return (Criteria) this;
        }

        public Criteria andTaskExecuteStartTimeIsNotNull() {
            addCriterion("task_execute_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andTaskExecuteStartTimeEqualTo(Date value) {
            addCriterion("task_execute_start_time =", value, "taskExecuteStartTime");
            return (Criteria) this;
        }

        public Criteria andTaskExecuteStartTimeNotEqualTo(Date value) {
            addCriterion("task_execute_start_time <>", value, "taskExecuteStartTime");
            return (Criteria) this;
        }

        public Criteria andTaskExecuteStartTimeGreaterThan(Date value) {
            addCriterion("task_execute_start_time >", value, "taskExecuteStartTime");
            return (Criteria) this;
        }

        public Criteria andTaskExecuteStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("task_execute_start_time >=", value, "taskExecuteStartTime");
            return (Criteria) this;
        }

        public Criteria andTaskExecuteStartTimeLessThan(Date value) {
            addCriterion("task_execute_start_time <", value, "taskExecuteStartTime");
            return (Criteria) this;
        }

        public Criteria andTaskExecuteStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("task_execute_start_time <=", value, "taskExecuteStartTime");
            return (Criteria) this;
        }

        public Criteria andTaskExecuteStartTimeIn(List<Date> values) {
            addCriterion("task_execute_start_time in", values, "taskExecuteStartTime");
            return (Criteria) this;
        }

        public Criteria andTaskExecuteStartTimeNotIn(List<Date> values) {
            addCriterion("task_execute_start_time not in", values, "taskExecuteStartTime");
            return (Criteria) this;
        }

        public Criteria andTaskExecuteStartTimeBetween(Date value1, Date value2) {
            addCriterion("task_execute_start_time between", value1, value2, "taskExecuteStartTime");
            return (Criteria) this;
        }

        public Criteria andTaskExecuteStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("task_execute_start_time not between", value1, value2, "taskExecuteStartTime");
            return (Criteria) this;
        }

        public Criteria andTaskExecuteEndTimeIsNull() {
            addCriterion("task_execute_end_time is null");
            return (Criteria) this;
        }

        public Criteria andTaskExecuteEndTimeIsNotNull() {
            addCriterion("task_execute_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andTaskExecuteEndTimeEqualTo(Date value) {
            addCriterion("task_execute_end_time =", value, "taskExecuteEndTime");
            return (Criteria) this;
        }

        public Criteria andTaskExecuteEndTimeNotEqualTo(Date value) {
            addCriterion("task_execute_end_time <>", value, "taskExecuteEndTime");
            return (Criteria) this;
        }

        public Criteria andTaskExecuteEndTimeGreaterThan(Date value) {
            addCriterion("task_execute_end_time >", value, "taskExecuteEndTime");
            return (Criteria) this;
        }

        public Criteria andTaskExecuteEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("task_execute_end_time >=", value, "taskExecuteEndTime");
            return (Criteria) this;
        }

        public Criteria andTaskExecuteEndTimeLessThan(Date value) {
            addCriterion("task_execute_end_time <", value, "taskExecuteEndTime");
            return (Criteria) this;
        }

        public Criteria andTaskExecuteEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("task_execute_end_time <=", value, "taskExecuteEndTime");
            return (Criteria) this;
        }

        public Criteria andTaskExecuteEndTimeIn(List<Date> values) {
            addCriterion("task_execute_end_time in", values, "taskExecuteEndTime");
            return (Criteria) this;
        }

        public Criteria andTaskExecuteEndTimeNotIn(List<Date> values) {
            addCriterion("task_execute_end_time not in", values, "taskExecuteEndTime");
            return (Criteria) this;
        }

        public Criteria andTaskExecuteEndTimeBetween(Date value1, Date value2) {
            addCriterion("task_execute_end_time between", value1, value2, "taskExecuteEndTime");
            return (Criteria) this;
        }

        public Criteria andTaskExecuteEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("task_execute_end_time not between", value1, value2, "taskExecuteEndTime");
            return (Criteria) this;
        }

        public Criteria andTaskExecuteDurationUnitIsNull() {
            addCriterion("task_execute_duration_unit is null");
            return (Criteria) this;
        }

        public Criteria andTaskExecuteDurationUnitIsNotNull() {
            addCriterion("task_execute_duration_unit is not null");
            return (Criteria) this;
        }

        public Criteria andTaskExecuteDurationUnitEqualTo(String value) {
            addCriterion("task_execute_duration_unit =", value, "taskExecuteDurationUnit");
            return (Criteria) this;
        }

        public Criteria andTaskExecuteDurationUnitNotEqualTo(String value) {
            addCriterion("task_execute_duration_unit <>", value, "taskExecuteDurationUnit");
            return (Criteria) this;
        }

        public Criteria andTaskExecuteDurationUnitGreaterThan(String value) {
            addCriterion("task_execute_duration_unit >", value, "taskExecuteDurationUnit");
            return (Criteria) this;
        }

        public Criteria andTaskExecuteDurationUnitGreaterThanOrEqualTo(String value) {
            addCriterion("task_execute_duration_unit >=", value, "taskExecuteDurationUnit");
            return (Criteria) this;
        }

        public Criteria andTaskExecuteDurationUnitLessThan(String value) {
            addCriterion("task_execute_duration_unit <", value, "taskExecuteDurationUnit");
            return (Criteria) this;
        }

        public Criteria andTaskExecuteDurationUnitLessThanOrEqualTo(String value) {
            addCriterion("task_execute_duration_unit <=", value, "taskExecuteDurationUnit");
            return (Criteria) this;
        }

        public Criteria andTaskExecuteDurationUnitLike(String value) {
            addCriterion("task_execute_duration_unit like", value, "taskExecuteDurationUnit");
            return (Criteria) this;
        }

        public Criteria andTaskExecuteDurationUnitNotLike(String value) {
            addCriterion("task_execute_duration_unit not like", value, "taskExecuteDurationUnit");
            return (Criteria) this;
        }

        public Criteria andTaskExecuteDurationUnitIn(List<String> values) {
            addCriterion("task_execute_duration_unit in", values, "taskExecuteDurationUnit");
            return (Criteria) this;
        }

        public Criteria andTaskExecuteDurationUnitNotIn(List<String> values) {
            addCriterion("task_execute_duration_unit not in", values, "taskExecuteDurationUnit");
            return (Criteria) this;
        }

        public Criteria andTaskExecuteDurationUnitBetween(String value1, String value2) {
            addCriterion("task_execute_duration_unit between", value1, value2, "taskExecuteDurationUnit");
            return (Criteria) this;
        }

        public Criteria andTaskExecuteDurationUnitNotBetween(String value1, String value2) {
            addCriterion("task_execute_duration_unit not between", value1, value2, "taskExecuteDurationUnit");
            return (Criteria) this;
        }

        public Criteria andTaskExecuteDurationIsNull() {
            addCriterion("task_execute_duration is null");
            return (Criteria) this;
        }

        public Criteria andTaskExecuteDurationIsNotNull() {
            addCriterion("task_execute_duration is not null");
            return (Criteria) this;
        }

        public Criteria andTaskExecuteDurationEqualTo(BigDecimal value) {
            addCriterion("task_execute_duration =", value, "taskExecuteDuration");
            return (Criteria) this;
        }

        public Criteria andTaskExecuteDurationNotEqualTo(BigDecimal value) {
            addCriterion("task_execute_duration <>", value, "taskExecuteDuration");
            return (Criteria) this;
        }

        public Criteria andTaskExecuteDurationGreaterThan(BigDecimal value) {
            addCriterion("task_execute_duration >", value, "taskExecuteDuration");
            return (Criteria) this;
        }

        public Criteria andTaskExecuteDurationGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("task_execute_duration >=", value, "taskExecuteDuration");
            return (Criteria) this;
        }

        public Criteria andTaskExecuteDurationLessThan(BigDecimal value) {
            addCriterion("task_execute_duration <", value, "taskExecuteDuration");
            return (Criteria) this;
        }

        public Criteria andTaskExecuteDurationLessThanOrEqualTo(BigDecimal value) {
            addCriterion("task_execute_duration <=", value, "taskExecuteDuration");
            return (Criteria) this;
        }

        public Criteria andTaskExecuteDurationIn(List<BigDecimal> values) {
            addCriterion("task_execute_duration in", values, "taskExecuteDuration");
            return (Criteria) this;
        }

        public Criteria andTaskExecuteDurationNotIn(List<BigDecimal> values) {
            addCriterion("task_execute_duration not in", values, "taskExecuteDuration");
            return (Criteria) this;
        }

        public Criteria andTaskExecuteDurationBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("task_execute_duration between", value1, value2, "taskExecuteDuration");
            return (Criteria) this;
        }

        public Criteria andTaskExecuteDurationNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("task_execute_duration not between", value1, value2, "taskExecuteDuration");
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
     * batch_exec_history
     *
     * @date 2022-11-27 15:46:17
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * batch_exec_history 2022-11-27 15:46:17
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