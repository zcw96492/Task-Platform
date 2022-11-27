package com.newcore.task.platform.model.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BatchExportTaskExample {
    /**
     * batch_export_task
     */
    protected String orderByClause;

    /**
     * batch_export_task
     */
    protected boolean distinct;

    /**
     * batch_export_task
     */
    protected List<Criteria> oredCriteria;

    /**
     * BatchExportTaskExample 方法
     *
     * @date 2022-11-27 15:46:17
     */
    public BatchExportTaskExample() {
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
     * batch_export_task 2022-11-27 15:46:17
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

        public Criteria andBatchExportTaskIdIsNull() {
            addCriterion("batch_export_task_id is null");
            return (Criteria) this;
        }

        public Criteria andBatchExportTaskIdIsNotNull() {
            addCriterion("batch_export_task_id is not null");
            return (Criteria) this;
        }

        public Criteria andBatchExportTaskIdEqualTo(Long value) {
            addCriterion("batch_export_task_id =", value, "batchExportTaskId");
            return (Criteria) this;
        }

        public Criteria andBatchExportTaskIdNotEqualTo(Long value) {
            addCriterion("batch_export_task_id <>", value, "batchExportTaskId");
            return (Criteria) this;
        }

        public Criteria andBatchExportTaskIdGreaterThan(Long value) {
            addCriterion("batch_export_task_id >", value, "batchExportTaskId");
            return (Criteria) this;
        }

        public Criteria andBatchExportTaskIdGreaterThanOrEqualTo(Long value) {
            addCriterion("batch_export_task_id >=", value, "batchExportTaskId");
            return (Criteria) this;
        }

        public Criteria andBatchExportTaskIdLessThan(Long value) {
            addCriterion("batch_export_task_id <", value, "batchExportTaskId");
            return (Criteria) this;
        }

        public Criteria andBatchExportTaskIdLessThanOrEqualTo(Long value) {
            addCriterion("batch_export_task_id <=", value, "batchExportTaskId");
            return (Criteria) this;
        }

        public Criteria andBatchExportTaskIdIn(List<Long> values) {
            addCriterion("batch_export_task_id in", values, "batchExportTaskId");
            return (Criteria) this;
        }

        public Criteria andBatchExportTaskIdNotIn(List<Long> values) {
            addCriterion("batch_export_task_id not in", values, "batchExportTaskId");
            return (Criteria) this;
        }

        public Criteria andBatchExportTaskIdBetween(Long value1, Long value2) {
            addCriterion("batch_export_task_id between", value1, value2, "batchExportTaskId");
            return (Criteria) this;
        }

        public Criteria andBatchExportTaskIdNotBetween(Long value1, Long value2) {
            addCriterion("batch_export_task_id not between", value1, value2, "batchExportTaskId");
            return (Criteria) this;
        }

        public Criteria andExportServiceNameIsNull() {
            addCriterion("export_service_name is null");
            return (Criteria) this;
        }

        public Criteria andExportServiceNameIsNotNull() {
            addCriterion("export_service_name is not null");
            return (Criteria) this;
        }

        public Criteria andExportServiceNameEqualTo(String value) {
            addCriterion("export_service_name =", value, "exportServiceName");
            return (Criteria) this;
        }

        public Criteria andExportServiceNameNotEqualTo(String value) {
            addCriterion("export_service_name <>", value, "exportServiceName");
            return (Criteria) this;
        }

        public Criteria andExportServiceNameGreaterThan(String value) {
            addCriterion("export_service_name >", value, "exportServiceName");
            return (Criteria) this;
        }

        public Criteria andExportServiceNameGreaterThanOrEqualTo(String value) {
            addCriterion("export_service_name >=", value, "exportServiceName");
            return (Criteria) this;
        }

        public Criteria andExportServiceNameLessThan(String value) {
            addCriterion("export_service_name <", value, "exportServiceName");
            return (Criteria) this;
        }

        public Criteria andExportServiceNameLessThanOrEqualTo(String value) {
            addCriterion("export_service_name <=", value, "exportServiceName");
            return (Criteria) this;
        }

        public Criteria andExportServiceNameLike(String value) {
            addCriterion("export_service_name like", value, "exportServiceName");
            return (Criteria) this;
        }

        public Criteria andExportServiceNameNotLike(String value) {
            addCriterion("export_service_name not like", value, "exportServiceName");
            return (Criteria) this;
        }

        public Criteria andExportServiceNameIn(List<String> values) {
            addCriterion("export_service_name in", values, "exportServiceName");
            return (Criteria) this;
        }

        public Criteria andExportServiceNameNotIn(List<String> values) {
            addCriterion("export_service_name not in", values, "exportServiceName");
            return (Criteria) this;
        }

        public Criteria andExportServiceNameBetween(String value1, String value2) {
            addCriterion("export_service_name between", value1, value2, "exportServiceName");
            return (Criteria) this;
        }

        public Criteria andExportServiceNameNotBetween(String value1, String value2) {
            addCriterion("export_service_name not between", value1, value2, "exportServiceName");
            return (Criteria) this;
        }

        public Criteria andExportStatusIsNull() {
            addCriterion("export_status is null");
            return (Criteria) this;
        }

        public Criteria andExportStatusIsNotNull() {
            addCriterion("export_status is not null");
            return (Criteria) this;
        }

        public Criteria andExportStatusEqualTo(Integer value) {
            addCriterion("export_status =", value, "exportStatus");
            return (Criteria) this;
        }

        public Criteria andExportStatusNotEqualTo(Integer value) {
            addCriterion("export_status <>", value, "exportStatus");
            return (Criteria) this;
        }

        public Criteria andExportStatusGreaterThan(Integer value) {
            addCriterion("export_status >", value, "exportStatus");
            return (Criteria) this;
        }

        public Criteria andExportStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("export_status >=", value, "exportStatus");
            return (Criteria) this;
        }

        public Criteria andExportStatusLessThan(Integer value) {
            addCriterion("export_status <", value, "exportStatus");
            return (Criteria) this;
        }

        public Criteria andExportStatusLessThanOrEqualTo(Integer value) {
            addCriterion("export_status <=", value, "exportStatus");
            return (Criteria) this;
        }

        public Criteria andExportStatusIn(List<Integer> values) {
            addCriterion("export_status in", values, "exportStatus");
            return (Criteria) this;
        }

        public Criteria andExportStatusNotIn(List<Integer> values) {
            addCriterion("export_status not in", values, "exportStatus");
            return (Criteria) this;
        }

        public Criteria andExportStatusBetween(Integer value1, Integer value2) {
            addCriterion("export_status between", value1, value2, "exportStatus");
            return (Criteria) this;
        }

        public Criteria andExportStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("export_status not between", value1, value2, "exportStatus");
            return (Criteria) this;
        }

        public Criteria andExportOptClerkBranchNoIsNull() {
            addCriterion("export_opt_clerk_branch_no is null");
            return (Criteria) this;
        }

        public Criteria andExportOptClerkBranchNoIsNotNull() {
            addCriterion("export_opt_clerk_branch_no is not null");
            return (Criteria) this;
        }

        public Criteria andExportOptClerkBranchNoEqualTo(String value) {
            addCriterion("export_opt_clerk_branch_no =", value, "exportOptClerkBranchNo");
            return (Criteria) this;
        }

        public Criteria andExportOptClerkBranchNoNotEqualTo(String value) {
            addCriterion("export_opt_clerk_branch_no <>", value, "exportOptClerkBranchNo");
            return (Criteria) this;
        }

        public Criteria andExportOptClerkBranchNoGreaterThan(String value) {
            addCriterion("export_opt_clerk_branch_no >", value, "exportOptClerkBranchNo");
            return (Criteria) this;
        }

        public Criteria andExportOptClerkBranchNoGreaterThanOrEqualTo(String value) {
            addCriterion("export_opt_clerk_branch_no >=", value, "exportOptClerkBranchNo");
            return (Criteria) this;
        }

        public Criteria andExportOptClerkBranchNoLessThan(String value) {
            addCriterion("export_opt_clerk_branch_no <", value, "exportOptClerkBranchNo");
            return (Criteria) this;
        }

        public Criteria andExportOptClerkBranchNoLessThanOrEqualTo(String value) {
            addCriterion("export_opt_clerk_branch_no <=", value, "exportOptClerkBranchNo");
            return (Criteria) this;
        }

        public Criteria andExportOptClerkBranchNoLike(String value) {
            addCriterion("export_opt_clerk_branch_no like", value, "exportOptClerkBranchNo");
            return (Criteria) this;
        }

        public Criteria andExportOptClerkBranchNoNotLike(String value) {
            addCriterion("export_opt_clerk_branch_no not like", value, "exportOptClerkBranchNo");
            return (Criteria) this;
        }

        public Criteria andExportOptClerkBranchNoIn(List<String> values) {
            addCriterion("export_opt_clerk_branch_no in", values, "exportOptClerkBranchNo");
            return (Criteria) this;
        }

        public Criteria andExportOptClerkBranchNoNotIn(List<String> values) {
            addCriterion("export_opt_clerk_branch_no not in", values, "exportOptClerkBranchNo");
            return (Criteria) this;
        }

        public Criteria andExportOptClerkBranchNoBetween(String value1, String value2) {
            addCriterion("export_opt_clerk_branch_no between", value1, value2, "exportOptClerkBranchNo");
            return (Criteria) this;
        }

        public Criteria andExportOptClerkBranchNoNotBetween(String value1, String value2) {
            addCriterion("export_opt_clerk_branch_no not between", value1, value2, "exportOptClerkBranchNo");
            return (Criteria) this;
        }

        public Criteria andExportOptClerkNoIsNull() {
            addCriterion("export_opt_clerk_no is null");
            return (Criteria) this;
        }

        public Criteria andExportOptClerkNoIsNotNull() {
            addCriterion("export_opt_clerk_no is not null");
            return (Criteria) this;
        }

        public Criteria andExportOptClerkNoEqualTo(String value) {
            addCriterion("export_opt_clerk_no =", value, "exportOptClerkNo");
            return (Criteria) this;
        }

        public Criteria andExportOptClerkNoNotEqualTo(String value) {
            addCriterion("export_opt_clerk_no <>", value, "exportOptClerkNo");
            return (Criteria) this;
        }

        public Criteria andExportOptClerkNoGreaterThan(String value) {
            addCriterion("export_opt_clerk_no >", value, "exportOptClerkNo");
            return (Criteria) this;
        }

        public Criteria andExportOptClerkNoGreaterThanOrEqualTo(String value) {
            addCriterion("export_opt_clerk_no >=", value, "exportOptClerkNo");
            return (Criteria) this;
        }

        public Criteria andExportOptClerkNoLessThan(String value) {
            addCriterion("export_opt_clerk_no <", value, "exportOptClerkNo");
            return (Criteria) this;
        }

        public Criteria andExportOptClerkNoLessThanOrEqualTo(String value) {
            addCriterion("export_opt_clerk_no <=", value, "exportOptClerkNo");
            return (Criteria) this;
        }

        public Criteria andExportOptClerkNoLike(String value) {
            addCriterion("export_opt_clerk_no like", value, "exportOptClerkNo");
            return (Criteria) this;
        }

        public Criteria andExportOptClerkNoNotLike(String value) {
            addCriterion("export_opt_clerk_no not like", value, "exportOptClerkNo");
            return (Criteria) this;
        }

        public Criteria andExportOptClerkNoIn(List<String> values) {
            addCriterion("export_opt_clerk_no in", values, "exportOptClerkNo");
            return (Criteria) this;
        }

        public Criteria andExportOptClerkNoNotIn(List<String> values) {
            addCriterion("export_opt_clerk_no not in", values, "exportOptClerkNo");
            return (Criteria) this;
        }

        public Criteria andExportOptClerkNoBetween(String value1, String value2) {
            addCriterion("export_opt_clerk_no between", value1, value2, "exportOptClerkNo");
            return (Criteria) this;
        }

        public Criteria andExportOptClerkNoNotBetween(String value1, String value2) {
            addCriterion("export_opt_clerk_no not between", value1, value2, "exportOptClerkNo");
            return (Criteria) this;
        }

        public Criteria andExportOptClerkNameIsNull() {
            addCriterion("export_opt_clerk_name is null");
            return (Criteria) this;
        }

        public Criteria andExportOptClerkNameIsNotNull() {
            addCriterion("export_opt_clerk_name is not null");
            return (Criteria) this;
        }

        public Criteria andExportOptClerkNameEqualTo(String value) {
            addCriterion("export_opt_clerk_name =", value, "exportOptClerkName");
            return (Criteria) this;
        }

        public Criteria andExportOptClerkNameNotEqualTo(String value) {
            addCriterion("export_opt_clerk_name <>", value, "exportOptClerkName");
            return (Criteria) this;
        }

        public Criteria andExportOptClerkNameGreaterThan(String value) {
            addCriterion("export_opt_clerk_name >", value, "exportOptClerkName");
            return (Criteria) this;
        }

        public Criteria andExportOptClerkNameGreaterThanOrEqualTo(String value) {
            addCriterion("export_opt_clerk_name >=", value, "exportOptClerkName");
            return (Criteria) this;
        }

        public Criteria andExportOptClerkNameLessThan(String value) {
            addCriterion("export_opt_clerk_name <", value, "exportOptClerkName");
            return (Criteria) this;
        }

        public Criteria andExportOptClerkNameLessThanOrEqualTo(String value) {
            addCriterion("export_opt_clerk_name <=", value, "exportOptClerkName");
            return (Criteria) this;
        }

        public Criteria andExportOptClerkNameLike(String value) {
            addCriterion("export_opt_clerk_name like", value, "exportOptClerkName");
            return (Criteria) this;
        }

        public Criteria andExportOptClerkNameNotLike(String value) {
            addCriterion("export_opt_clerk_name not like", value, "exportOptClerkName");
            return (Criteria) this;
        }

        public Criteria andExportOptClerkNameIn(List<String> values) {
            addCriterion("export_opt_clerk_name in", values, "exportOptClerkName");
            return (Criteria) this;
        }

        public Criteria andExportOptClerkNameNotIn(List<String> values) {
            addCriterion("export_opt_clerk_name not in", values, "exportOptClerkName");
            return (Criteria) this;
        }

        public Criteria andExportOptClerkNameBetween(String value1, String value2) {
            addCriterion("export_opt_clerk_name between", value1, value2, "exportOptClerkName");
            return (Criteria) this;
        }

        public Criteria andExportOptClerkNameNotBetween(String value1, String value2) {
            addCriterion("export_opt_clerk_name not between", value1, value2, "exportOptClerkName");
            return (Criteria) this;
        }

        public Criteria andExportTaskRemarkIsNull() {
            addCriterion("export_task_remark is null");
            return (Criteria) this;
        }

        public Criteria andExportTaskRemarkIsNotNull() {
            addCriterion("export_task_remark is not null");
            return (Criteria) this;
        }

        public Criteria andExportTaskRemarkEqualTo(String value) {
            addCriterion("export_task_remark =", value, "exportTaskRemark");
            return (Criteria) this;
        }

        public Criteria andExportTaskRemarkNotEqualTo(String value) {
            addCriterion("export_task_remark <>", value, "exportTaskRemark");
            return (Criteria) this;
        }

        public Criteria andExportTaskRemarkGreaterThan(String value) {
            addCriterion("export_task_remark >", value, "exportTaskRemark");
            return (Criteria) this;
        }

        public Criteria andExportTaskRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("export_task_remark >=", value, "exportTaskRemark");
            return (Criteria) this;
        }

        public Criteria andExportTaskRemarkLessThan(String value) {
            addCriterion("export_task_remark <", value, "exportTaskRemark");
            return (Criteria) this;
        }

        public Criteria andExportTaskRemarkLessThanOrEqualTo(String value) {
            addCriterion("export_task_remark <=", value, "exportTaskRemark");
            return (Criteria) this;
        }

        public Criteria andExportTaskRemarkLike(String value) {
            addCriterion("export_task_remark like", value, "exportTaskRemark");
            return (Criteria) this;
        }

        public Criteria andExportTaskRemarkNotLike(String value) {
            addCriterion("export_task_remark not like", value, "exportTaskRemark");
            return (Criteria) this;
        }

        public Criteria andExportTaskRemarkIn(List<String> values) {
            addCriterion("export_task_remark in", values, "exportTaskRemark");
            return (Criteria) this;
        }

        public Criteria andExportTaskRemarkNotIn(List<String> values) {
            addCriterion("export_task_remark not in", values, "exportTaskRemark");
            return (Criteria) this;
        }

        public Criteria andExportTaskRemarkBetween(String value1, String value2) {
            addCriterion("export_task_remark between", value1, value2, "exportTaskRemark");
            return (Criteria) this;
        }

        public Criteria andExportTaskRemarkNotBetween(String value1, String value2) {
            addCriterion("export_task_remark not between", value1, value2, "exportTaskRemark");
            return (Criteria) this;
        }

        public Criteria andExportTaskFinishDateIsNull() {
            addCriterion("export_task_finish_date is null");
            return (Criteria) this;
        }

        public Criteria andExportTaskFinishDateIsNotNull() {
            addCriterion("export_task_finish_date is not null");
            return (Criteria) this;
        }

        public Criteria andExportTaskFinishDateEqualTo(Date value) {
            addCriterion("export_task_finish_date =", value, "exportTaskFinishDate");
            return (Criteria) this;
        }

        public Criteria andExportTaskFinishDateNotEqualTo(Date value) {
            addCriterion("export_task_finish_date <>", value, "exportTaskFinishDate");
            return (Criteria) this;
        }

        public Criteria andExportTaskFinishDateGreaterThan(Date value) {
            addCriterion("export_task_finish_date >", value, "exportTaskFinishDate");
            return (Criteria) this;
        }

        public Criteria andExportTaskFinishDateGreaterThanOrEqualTo(Date value) {
            addCriterion("export_task_finish_date >=", value, "exportTaskFinishDate");
            return (Criteria) this;
        }

        public Criteria andExportTaskFinishDateLessThan(Date value) {
            addCriterion("export_task_finish_date <", value, "exportTaskFinishDate");
            return (Criteria) this;
        }

        public Criteria andExportTaskFinishDateLessThanOrEqualTo(Date value) {
            addCriterion("export_task_finish_date <=", value, "exportTaskFinishDate");
            return (Criteria) this;
        }

        public Criteria andExportTaskFinishDateIn(List<Date> values) {
            addCriterion("export_task_finish_date in", values, "exportTaskFinishDate");
            return (Criteria) this;
        }

        public Criteria andExportTaskFinishDateNotIn(List<Date> values) {
            addCriterion("export_task_finish_date not in", values, "exportTaskFinishDate");
            return (Criteria) this;
        }

        public Criteria andExportTaskFinishDateBetween(Date value1, Date value2) {
            addCriterion("export_task_finish_date between", value1, value2, "exportTaskFinishDate");
            return (Criteria) this;
        }

        public Criteria andExportTaskFinishDateNotBetween(Date value1, Date value2) {
            addCriterion("export_task_finish_date not between", value1, value2, "exportTaskFinishDate");
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
     * batch_export_task
     *
     * @date 2022-11-27 15:46:17
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * batch_export_task 2022-11-27 15:46:17
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