package com.newcore.task.platform.model.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BatchTaskExample {
    /**
     * batch_task
     */
    protected String orderByClause;

    /**
     * batch_task
     */
    protected boolean distinct;

    /**
     * batch_task
     */
    protected List<Criteria> oredCriteria;

    /**
     * BatchTaskExample 方法
     *
     * @date 2022-11-27 15:46:17
     */
    public BatchTaskExample() {
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
     * batch_task 2022-11-27 15:46:17
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

        public Criteria andTaskNameIsNull() {
            addCriterion("task_name is null");
            return (Criteria) this;
        }

        public Criteria andTaskNameIsNotNull() {
            addCriterion("task_name is not null");
            return (Criteria) this;
        }

        public Criteria andTaskNameEqualTo(String value) {
            addCriterion("task_name =", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotEqualTo(String value) {
            addCriterion("task_name <>", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameGreaterThan(String value) {
            addCriterion("task_name >", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameGreaterThanOrEqualTo(String value) {
            addCriterion("task_name >=", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameLessThan(String value) {
            addCriterion("task_name <", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameLessThanOrEqualTo(String value) {
            addCriterion("task_name <=", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameLike(String value) {
            addCriterion("task_name like", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotLike(String value) {
            addCriterion("task_name not like", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameIn(List<String> values) {
            addCriterion("task_name in", values, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotIn(List<String> values) {
            addCriterion("task_name not in", values, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameBetween(String value1, String value2) {
            addCriterion("task_name between", value1, value2, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotBetween(String value1, String value2) {
            addCriterion("task_name not between", value1, value2, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskDescriptionIsNull() {
            addCriterion("task_description is null");
            return (Criteria) this;
        }

        public Criteria andTaskDescriptionIsNotNull() {
            addCriterion("task_description is not null");
            return (Criteria) this;
        }

        public Criteria andTaskDescriptionEqualTo(String value) {
            addCriterion("task_description =", value, "taskDescription");
            return (Criteria) this;
        }

        public Criteria andTaskDescriptionNotEqualTo(String value) {
            addCriterion("task_description <>", value, "taskDescription");
            return (Criteria) this;
        }

        public Criteria andTaskDescriptionGreaterThan(String value) {
            addCriterion("task_description >", value, "taskDescription");
            return (Criteria) this;
        }

        public Criteria andTaskDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("task_description >=", value, "taskDescription");
            return (Criteria) this;
        }

        public Criteria andTaskDescriptionLessThan(String value) {
            addCriterion("task_description <", value, "taskDescription");
            return (Criteria) this;
        }

        public Criteria andTaskDescriptionLessThanOrEqualTo(String value) {
            addCriterion("task_description <=", value, "taskDescription");
            return (Criteria) this;
        }

        public Criteria andTaskDescriptionLike(String value) {
            addCriterion("task_description like", value, "taskDescription");
            return (Criteria) this;
        }

        public Criteria andTaskDescriptionNotLike(String value) {
            addCriterion("task_description not like", value, "taskDescription");
            return (Criteria) this;
        }

        public Criteria andTaskDescriptionIn(List<String> values) {
            addCriterion("task_description in", values, "taskDescription");
            return (Criteria) this;
        }

        public Criteria andTaskDescriptionNotIn(List<String> values) {
            addCriterion("task_description not in", values, "taskDescription");
            return (Criteria) this;
        }

        public Criteria andTaskDescriptionBetween(String value1, String value2) {
            addCriterion("task_description between", value1, value2, "taskDescription");
            return (Criteria) this;
        }

        public Criteria andTaskDescriptionNotBetween(String value1, String value2) {
            addCriterion("task_description not between", value1, value2, "taskDescription");
            return (Criteria) this;
        }

        public Criteria andTaskCronExpressionIsNull() {
            addCriterion("task_cron_expression is null");
            return (Criteria) this;
        }

        public Criteria andTaskCronExpressionIsNotNull() {
            addCriterion("task_cron_expression is not null");
            return (Criteria) this;
        }

        public Criteria andTaskCronExpressionEqualTo(String value) {
            addCriterion("task_cron_expression =", value, "taskCronExpression");
            return (Criteria) this;
        }

        public Criteria andTaskCronExpressionNotEqualTo(String value) {
            addCriterion("task_cron_expression <>", value, "taskCronExpression");
            return (Criteria) this;
        }

        public Criteria andTaskCronExpressionGreaterThan(String value) {
            addCriterion("task_cron_expression >", value, "taskCronExpression");
            return (Criteria) this;
        }

        public Criteria andTaskCronExpressionGreaterThanOrEqualTo(String value) {
            addCriterion("task_cron_expression >=", value, "taskCronExpression");
            return (Criteria) this;
        }

        public Criteria andTaskCronExpressionLessThan(String value) {
            addCriterion("task_cron_expression <", value, "taskCronExpression");
            return (Criteria) this;
        }

        public Criteria andTaskCronExpressionLessThanOrEqualTo(String value) {
            addCriterion("task_cron_expression <=", value, "taskCronExpression");
            return (Criteria) this;
        }

        public Criteria andTaskCronExpressionLike(String value) {
            addCriterion("task_cron_expression like", value, "taskCronExpression");
            return (Criteria) this;
        }

        public Criteria andTaskCronExpressionNotLike(String value) {
            addCriterion("task_cron_expression not like", value, "taskCronExpression");
            return (Criteria) this;
        }

        public Criteria andTaskCronExpressionIn(List<String> values) {
            addCriterion("task_cron_expression in", values, "taskCronExpression");
            return (Criteria) this;
        }

        public Criteria andTaskCronExpressionNotIn(List<String> values) {
            addCriterion("task_cron_expression not in", values, "taskCronExpression");
            return (Criteria) this;
        }

        public Criteria andTaskCronExpressionBetween(String value1, String value2) {
            addCriterion("task_cron_expression between", value1, value2, "taskCronExpression");
            return (Criteria) this;
        }

        public Criteria andTaskCronExpressionNotBetween(String value1, String value2) {
            addCriterion("task_cron_expression not between", value1, value2, "taskCronExpression");
            return (Criteria) this;
        }

        public Criteria andBeanClassPathIsNull() {
            addCriterion("bean_class_path is null");
            return (Criteria) this;
        }

        public Criteria andBeanClassPathIsNotNull() {
            addCriterion("bean_class_path is not null");
            return (Criteria) this;
        }

        public Criteria andBeanClassPathEqualTo(String value) {
            addCriterion("bean_class_path =", value, "beanClassPath");
            return (Criteria) this;
        }

        public Criteria andBeanClassPathNotEqualTo(String value) {
            addCriterion("bean_class_path <>", value, "beanClassPath");
            return (Criteria) this;
        }

        public Criteria andBeanClassPathGreaterThan(String value) {
            addCriterion("bean_class_path >", value, "beanClassPath");
            return (Criteria) this;
        }

        public Criteria andBeanClassPathGreaterThanOrEqualTo(String value) {
            addCriterion("bean_class_path >=", value, "beanClassPath");
            return (Criteria) this;
        }

        public Criteria andBeanClassPathLessThan(String value) {
            addCriterion("bean_class_path <", value, "beanClassPath");
            return (Criteria) this;
        }

        public Criteria andBeanClassPathLessThanOrEqualTo(String value) {
            addCriterion("bean_class_path <=", value, "beanClassPath");
            return (Criteria) this;
        }

        public Criteria andBeanClassPathLike(String value) {
            addCriterion("bean_class_path like", value, "beanClassPath");
            return (Criteria) this;
        }

        public Criteria andBeanClassPathNotLike(String value) {
            addCriterion("bean_class_path not like", value, "beanClassPath");
            return (Criteria) this;
        }

        public Criteria andBeanClassPathIn(List<String> values) {
            addCriterion("bean_class_path in", values, "beanClassPath");
            return (Criteria) this;
        }

        public Criteria andBeanClassPathNotIn(List<String> values) {
            addCriterion("bean_class_path not in", values, "beanClassPath");
            return (Criteria) this;
        }

        public Criteria andBeanClassPathBetween(String value1, String value2) {
            addCriterion("bean_class_path between", value1, value2, "beanClassPath");
            return (Criteria) this;
        }

        public Criteria andBeanClassPathNotBetween(String value1, String value2) {
            addCriterion("bean_class_path not between", value1, value2, "beanClassPath");
            return (Criteria) this;
        }

        public Criteria andJobStatusIsNull() {
            addCriterion("job_status is null");
            return (Criteria) this;
        }

        public Criteria andJobStatusIsNotNull() {
            addCriterion("job_status is not null");
            return (Criteria) this;
        }

        public Criteria andJobStatusEqualTo(Integer value) {
            addCriterion("job_status =", value, "jobStatus");
            return (Criteria) this;
        }

        public Criteria andJobStatusNotEqualTo(Integer value) {
            addCriterion("job_status <>", value, "jobStatus");
            return (Criteria) this;
        }

        public Criteria andJobStatusGreaterThan(Integer value) {
            addCriterion("job_status >", value, "jobStatus");
            return (Criteria) this;
        }

        public Criteria andJobStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("job_status >=", value, "jobStatus");
            return (Criteria) this;
        }

        public Criteria andJobStatusLessThan(Integer value) {
            addCriterion("job_status <", value, "jobStatus");
            return (Criteria) this;
        }

        public Criteria andJobStatusLessThanOrEqualTo(Integer value) {
            addCriterion("job_status <=", value, "jobStatus");
            return (Criteria) this;
        }

        public Criteria andJobStatusIn(List<Integer> values) {
            addCriterion("job_status in", values, "jobStatus");
            return (Criteria) this;
        }

        public Criteria andJobStatusNotIn(List<Integer> values) {
            addCriterion("job_status not in", values, "jobStatus");
            return (Criteria) this;
        }

        public Criteria andJobStatusBetween(Integer value1, Integer value2) {
            addCriterion("job_status between", value1, value2, "jobStatus");
            return (Criteria) this;
        }

        public Criteria andJobStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("job_status not between", value1, value2, "jobStatus");
            return (Criteria) this;
        }

        public Criteria andJobGroupIsNull() {
            addCriterion("job_group is null");
            return (Criteria) this;
        }

        public Criteria andJobGroupIsNotNull() {
            addCriterion("job_group is not null");
            return (Criteria) this;
        }

        public Criteria andJobGroupEqualTo(String value) {
            addCriterion("job_group =", value, "jobGroup");
            return (Criteria) this;
        }

        public Criteria andJobGroupNotEqualTo(String value) {
            addCriterion("job_group <>", value, "jobGroup");
            return (Criteria) this;
        }

        public Criteria andJobGroupGreaterThan(String value) {
            addCriterion("job_group >", value, "jobGroup");
            return (Criteria) this;
        }

        public Criteria andJobGroupGreaterThanOrEqualTo(String value) {
            addCriterion("job_group >=", value, "jobGroup");
            return (Criteria) this;
        }

        public Criteria andJobGroupLessThan(String value) {
            addCriterion("job_group <", value, "jobGroup");
            return (Criteria) this;
        }

        public Criteria andJobGroupLessThanOrEqualTo(String value) {
            addCriterion("job_group <=", value, "jobGroup");
            return (Criteria) this;
        }

        public Criteria andJobGroupLike(String value) {
            addCriterion("job_group like", value, "jobGroup");
            return (Criteria) this;
        }

        public Criteria andJobGroupNotLike(String value) {
            addCriterion("job_group not like", value, "jobGroup");
            return (Criteria) this;
        }

        public Criteria andJobGroupIn(List<String> values) {
            addCriterion("job_group in", values, "jobGroup");
            return (Criteria) this;
        }

        public Criteria andJobGroupNotIn(List<String> values) {
            addCriterion("job_group not in", values, "jobGroup");
            return (Criteria) this;
        }

        public Criteria andJobGroupBetween(String value1, String value2) {
            addCriterion("job_group between", value1, value2, "jobGroup");
            return (Criteria) this;
        }

        public Criteria andJobGroupNotBetween(String value1, String value2) {
            addCriterion("job_group not between", value1, value2, "jobGroup");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNull() {
            addCriterion("create_user is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNotNull() {
            addCriterion("create_user is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserEqualTo(String value) {
            addCriterion("create_user =", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotEqualTo(String value) {
            addCriterion("create_user <>", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThan(String value) {
            addCriterion("create_user >", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("create_user >=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThan(String value) {
            addCriterion("create_user <", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThanOrEqualTo(String value) {
            addCriterion("create_user <=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLike(String value) {
            addCriterion("create_user like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotLike(String value) {
            addCriterion("create_user not like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserIn(List<String> values) {
            addCriterion("create_user in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotIn(List<String> values) {
            addCriterion("create_user not in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserBetween(String value1, String value2) {
            addCriterion("create_user between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotBetween(String value1, String value2) {
            addCriterion("create_user not between", value1, value2, "createUser");
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

        public Criteria andUpdateUserIsNull() {
            addCriterion("update_user is null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNotNull() {
            addCriterion("update_user is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserEqualTo(String value) {
            addCriterion("update_user =", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotEqualTo(String value) {
            addCriterion("update_user <>", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThan(String value) {
            addCriterion("update_user >", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThanOrEqualTo(String value) {
            addCriterion("update_user >=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThan(String value) {
            addCriterion("update_user <", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThanOrEqualTo(String value) {
            addCriterion("update_user <=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLike(String value) {
            addCriterion("update_user like", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotLike(String value) {
            addCriterion("update_user not like", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIn(List<String> values) {
            addCriterion("update_user in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotIn(List<String> values) {
            addCriterion("update_user not in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserBetween(String value1, String value2) {
            addCriterion("update_user between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotBetween(String value1, String value2) {
            addCriterion("update_user not between", value1, value2, "updateUser");
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
     * batch_task
     *
     * @date 2022-11-27 15:46:17
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * batch_task 2022-11-27 15:46:17
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