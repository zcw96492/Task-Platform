package com.newcore.task.platform.model.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BatchWorkFlowTaskExample {
    /**
     * batch_work_flow_task
     */
    protected String orderByClause;

    /**
     * batch_work_flow_task
     */
    protected boolean distinct;

    /**
     * batch_work_flow_task
     */
    protected List<Criteria> oredCriteria;

    /**
     * BatchWorkFlowTaskExample 方法
     *
     * @date 2022-11-27 15:46:17
     */
    public BatchWorkFlowTaskExample() {
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
     * batch_work_flow_task 2022-11-27 15:46:17
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

        public Criteria andWorkFlowTaskIdIsNull() {
            addCriterion("work_flow_task_id is null");
            return (Criteria) this;
        }

        public Criteria andWorkFlowTaskIdIsNotNull() {
            addCriterion("work_flow_task_id is not null");
            return (Criteria) this;
        }

        public Criteria andWorkFlowTaskIdEqualTo(Long value) {
            addCriterion("work_flow_task_id =", value, "workFlowTaskId");
            return (Criteria) this;
        }

        public Criteria andWorkFlowTaskIdNotEqualTo(Long value) {
            addCriterion("work_flow_task_id <>", value, "workFlowTaskId");
            return (Criteria) this;
        }

        public Criteria andWorkFlowTaskIdGreaterThan(Long value) {
            addCriterion("work_flow_task_id >", value, "workFlowTaskId");
            return (Criteria) this;
        }

        public Criteria andWorkFlowTaskIdGreaterThanOrEqualTo(Long value) {
            addCriterion("work_flow_task_id >=", value, "workFlowTaskId");
            return (Criteria) this;
        }

        public Criteria andWorkFlowTaskIdLessThan(Long value) {
            addCriterion("work_flow_task_id <", value, "workFlowTaskId");
            return (Criteria) this;
        }

        public Criteria andWorkFlowTaskIdLessThanOrEqualTo(Long value) {
            addCriterion("work_flow_task_id <=", value, "workFlowTaskId");
            return (Criteria) this;
        }

        public Criteria andWorkFlowTaskIdIn(List<Long> values) {
            addCriterion("work_flow_task_id in", values, "workFlowTaskId");
            return (Criteria) this;
        }

        public Criteria andWorkFlowTaskIdNotIn(List<Long> values) {
            addCriterion("work_flow_task_id not in", values, "workFlowTaskId");
            return (Criteria) this;
        }

        public Criteria andWorkFlowTaskIdBetween(Long value1, Long value2) {
            addCriterion("work_flow_task_id between", value1, value2, "workFlowTaskId");
            return (Criteria) this;
        }

        public Criteria andWorkFlowTaskIdNotBetween(Long value1, Long value2) {
            addCriterion("work_flow_task_id not between", value1, value2, "workFlowTaskId");
            return (Criteria) this;
        }

        public Criteria andWorkFlowCodeIsNull() {
            addCriterion("work_flow_code is null");
            return (Criteria) this;
        }

        public Criteria andWorkFlowCodeIsNotNull() {
            addCriterion("work_flow_code is not null");
            return (Criteria) this;
        }

        public Criteria andWorkFlowCodeEqualTo(String value) {
            addCriterion("work_flow_code =", value, "workFlowCode");
            return (Criteria) this;
        }

        public Criteria andWorkFlowCodeNotEqualTo(String value) {
            addCriterion("work_flow_code <>", value, "workFlowCode");
            return (Criteria) this;
        }

        public Criteria andWorkFlowCodeGreaterThan(String value) {
            addCriterion("work_flow_code >", value, "workFlowCode");
            return (Criteria) this;
        }

        public Criteria andWorkFlowCodeGreaterThanOrEqualTo(String value) {
            addCriterion("work_flow_code >=", value, "workFlowCode");
            return (Criteria) this;
        }

        public Criteria andWorkFlowCodeLessThan(String value) {
            addCriterion("work_flow_code <", value, "workFlowCode");
            return (Criteria) this;
        }

        public Criteria andWorkFlowCodeLessThanOrEqualTo(String value) {
            addCriterion("work_flow_code <=", value, "workFlowCode");
            return (Criteria) this;
        }

        public Criteria andWorkFlowCodeLike(String value) {
            addCriterion("work_flow_code like", value, "workFlowCode");
            return (Criteria) this;
        }

        public Criteria andWorkFlowCodeNotLike(String value) {
            addCriterion("work_flow_code not like", value, "workFlowCode");
            return (Criteria) this;
        }

        public Criteria andWorkFlowCodeIn(List<String> values) {
            addCriterion("work_flow_code in", values, "workFlowCode");
            return (Criteria) this;
        }

        public Criteria andWorkFlowCodeNotIn(List<String> values) {
            addCriterion("work_flow_code not in", values, "workFlowCode");
            return (Criteria) this;
        }

        public Criteria andWorkFlowCodeBetween(String value1, String value2) {
            addCriterion("work_flow_code between", value1, value2, "workFlowCode");
            return (Criteria) this;
        }

        public Criteria andWorkFlowCodeNotBetween(String value1, String value2) {
            addCriterion("work_flow_code not between", value1, value2, "workFlowCode");
            return (Criteria) this;
        }

        public Criteria andWorkFlowNameIsNull() {
            addCriterion("work_flow_name is null");
            return (Criteria) this;
        }

        public Criteria andWorkFlowNameIsNotNull() {
            addCriterion("work_flow_name is not null");
            return (Criteria) this;
        }

        public Criteria andWorkFlowNameEqualTo(String value) {
            addCriterion("work_flow_name =", value, "workFlowName");
            return (Criteria) this;
        }

        public Criteria andWorkFlowNameNotEqualTo(String value) {
            addCriterion("work_flow_name <>", value, "workFlowName");
            return (Criteria) this;
        }

        public Criteria andWorkFlowNameGreaterThan(String value) {
            addCriterion("work_flow_name >", value, "workFlowName");
            return (Criteria) this;
        }

        public Criteria andWorkFlowNameGreaterThanOrEqualTo(String value) {
            addCriterion("work_flow_name >=", value, "workFlowName");
            return (Criteria) this;
        }

        public Criteria andWorkFlowNameLessThan(String value) {
            addCriterion("work_flow_name <", value, "workFlowName");
            return (Criteria) this;
        }

        public Criteria andWorkFlowNameLessThanOrEqualTo(String value) {
            addCriterion("work_flow_name <=", value, "workFlowName");
            return (Criteria) this;
        }

        public Criteria andWorkFlowNameLike(String value) {
            addCriterion("work_flow_name like", value, "workFlowName");
            return (Criteria) this;
        }

        public Criteria andWorkFlowNameNotLike(String value) {
            addCriterion("work_flow_name not like", value, "workFlowName");
            return (Criteria) this;
        }

        public Criteria andWorkFlowNameIn(List<String> values) {
            addCriterion("work_flow_name in", values, "workFlowName");
            return (Criteria) this;
        }

        public Criteria andWorkFlowNameNotIn(List<String> values) {
            addCriterion("work_flow_name not in", values, "workFlowName");
            return (Criteria) this;
        }

        public Criteria andWorkFlowNameBetween(String value1, String value2) {
            addCriterion("work_flow_name between", value1, value2, "workFlowName");
            return (Criteria) this;
        }

        public Criteria andWorkFlowNameNotBetween(String value1, String value2) {
            addCriterion("work_flow_name not between", value1, value2, "workFlowName");
            return (Criteria) this;
        }

        public Criteria andWorkFlowTypeIsNull() {
            addCriterion("work_flow_type is null");
            return (Criteria) this;
        }

        public Criteria andWorkFlowTypeIsNotNull() {
            addCriterion("work_flow_type is not null");
            return (Criteria) this;
        }

        public Criteria andWorkFlowTypeEqualTo(String value) {
            addCriterion("work_flow_type =", value, "workFlowType");
            return (Criteria) this;
        }

        public Criteria andWorkFlowTypeNotEqualTo(String value) {
            addCriterion("work_flow_type <>", value, "workFlowType");
            return (Criteria) this;
        }

        public Criteria andWorkFlowTypeGreaterThan(String value) {
            addCriterion("work_flow_type >", value, "workFlowType");
            return (Criteria) this;
        }

        public Criteria andWorkFlowTypeGreaterThanOrEqualTo(String value) {
            addCriterion("work_flow_type >=", value, "workFlowType");
            return (Criteria) this;
        }

        public Criteria andWorkFlowTypeLessThan(String value) {
            addCriterion("work_flow_type <", value, "workFlowType");
            return (Criteria) this;
        }

        public Criteria andWorkFlowTypeLessThanOrEqualTo(String value) {
            addCriterion("work_flow_type <=", value, "workFlowType");
            return (Criteria) this;
        }

        public Criteria andWorkFlowTypeLike(String value) {
            addCriterion("work_flow_type like", value, "workFlowType");
            return (Criteria) this;
        }

        public Criteria andWorkFlowTypeNotLike(String value) {
            addCriterion("work_flow_type not like", value, "workFlowType");
            return (Criteria) this;
        }

        public Criteria andWorkFlowTypeIn(List<String> values) {
            addCriterion("work_flow_type in", values, "workFlowType");
            return (Criteria) this;
        }

        public Criteria andWorkFlowTypeNotIn(List<String> values) {
            addCriterion("work_flow_type not in", values, "workFlowType");
            return (Criteria) this;
        }

        public Criteria andWorkFlowTypeBetween(String value1, String value2) {
            addCriterion("work_flow_type between", value1, value2, "workFlowType");
            return (Criteria) this;
        }

        public Criteria andWorkFlowTypeNotBetween(String value1, String value2) {
            addCriterion("work_flow_type not between", value1, value2, "workFlowType");
            return (Criteria) this;
        }

        public Criteria andWorkFlowStatusIsNull() {
            addCriterion("work_flow_status is null");
            return (Criteria) this;
        }

        public Criteria andWorkFlowStatusIsNotNull() {
            addCriterion("work_flow_status is not null");
            return (Criteria) this;
        }

        public Criteria andWorkFlowStatusEqualTo(String value) {
            addCriterion("work_flow_status =", value, "workFlowStatus");
            return (Criteria) this;
        }

        public Criteria andWorkFlowStatusNotEqualTo(String value) {
            addCriterion("work_flow_status <>", value, "workFlowStatus");
            return (Criteria) this;
        }

        public Criteria andWorkFlowStatusGreaterThan(String value) {
            addCriterion("work_flow_status >", value, "workFlowStatus");
            return (Criteria) this;
        }

        public Criteria andWorkFlowStatusGreaterThanOrEqualTo(String value) {
            addCriterion("work_flow_status >=", value, "workFlowStatus");
            return (Criteria) this;
        }

        public Criteria andWorkFlowStatusLessThan(String value) {
            addCriterion("work_flow_status <", value, "workFlowStatus");
            return (Criteria) this;
        }

        public Criteria andWorkFlowStatusLessThanOrEqualTo(String value) {
            addCriterion("work_flow_status <=", value, "workFlowStatus");
            return (Criteria) this;
        }

        public Criteria andWorkFlowStatusLike(String value) {
            addCriterion("work_flow_status like", value, "workFlowStatus");
            return (Criteria) this;
        }

        public Criteria andWorkFlowStatusNotLike(String value) {
            addCriterion("work_flow_status not like", value, "workFlowStatus");
            return (Criteria) this;
        }

        public Criteria andWorkFlowStatusIn(List<String> values) {
            addCriterion("work_flow_status in", values, "workFlowStatus");
            return (Criteria) this;
        }

        public Criteria andWorkFlowStatusNotIn(List<String> values) {
            addCriterion("work_flow_status not in", values, "workFlowStatus");
            return (Criteria) this;
        }

        public Criteria andWorkFlowStatusBetween(String value1, String value2) {
            addCriterion("work_flow_status between", value1, value2, "workFlowStatus");
            return (Criteria) this;
        }

        public Criteria andWorkFlowStatusNotBetween(String value1, String value2) {
            addCriterion("work_flow_status not between", value1, value2, "workFlowStatus");
            return (Criteria) this;
        }

        public Criteria andWorkFlowSystemIsNull() {
            addCriterion("work_flow_system is null");
            return (Criteria) this;
        }

        public Criteria andWorkFlowSystemIsNotNull() {
            addCriterion("work_flow_system is not null");
            return (Criteria) this;
        }

        public Criteria andWorkFlowSystemEqualTo(String value) {
            addCriterion("work_flow_system =", value, "workFlowSystem");
            return (Criteria) this;
        }

        public Criteria andWorkFlowSystemNotEqualTo(String value) {
            addCriterion("work_flow_system <>", value, "workFlowSystem");
            return (Criteria) this;
        }

        public Criteria andWorkFlowSystemGreaterThan(String value) {
            addCriterion("work_flow_system >", value, "workFlowSystem");
            return (Criteria) this;
        }

        public Criteria andWorkFlowSystemGreaterThanOrEqualTo(String value) {
            addCriterion("work_flow_system >=", value, "workFlowSystem");
            return (Criteria) this;
        }

        public Criteria andWorkFlowSystemLessThan(String value) {
            addCriterion("work_flow_system <", value, "workFlowSystem");
            return (Criteria) this;
        }

        public Criteria andWorkFlowSystemLessThanOrEqualTo(String value) {
            addCriterion("work_flow_system <=", value, "workFlowSystem");
            return (Criteria) this;
        }

        public Criteria andWorkFlowSystemLike(String value) {
            addCriterion("work_flow_system like", value, "workFlowSystem");
            return (Criteria) this;
        }

        public Criteria andWorkFlowSystemNotLike(String value) {
            addCriterion("work_flow_system not like", value, "workFlowSystem");
            return (Criteria) this;
        }

        public Criteria andWorkFlowSystemIn(List<String> values) {
            addCriterion("work_flow_system in", values, "workFlowSystem");
            return (Criteria) this;
        }

        public Criteria andWorkFlowSystemNotIn(List<String> values) {
            addCriterion("work_flow_system not in", values, "workFlowSystem");
            return (Criteria) this;
        }

        public Criteria andWorkFlowSystemBetween(String value1, String value2) {
            addCriterion("work_flow_system between", value1, value2, "workFlowSystem");
            return (Criteria) this;
        }

        public Criteria andWorkFlowSystemNotBetween(String value1, String value2) {
            addCriterion("work_flow_system not between", value1, value2, "workFlowSystem");
            return (Criteria) this;
        }

        public Criteria andUploadFileIsNull() {
            addCriterion("upload_file is null");
            return (Criteria) this;
        }

        public Criteria andUploadFileIsNotNull() {
            addCriterion("upload_file is not null");
            return (Criteria) this;
        }

        public Criteria andUploadFileEqualTo(String value) {
            addCriterion("upload_file =", value, "uploadFile");
            return (Criteria) this;
        }

        public Criteria andUploadFileNotEqualTo(String value) {
            addCriterion("upload_file <>", value, "uploadFile");
            return (Criteria) this;
        }

        public Criteria andUploadFileGreaterThan(String value) {
            addCriterion("upload_file >", value, "uploadFile");
            return (Criteria) this;
        }

        public Criteria andUploadFileGreaterThanOrEqualTo(String value) {
            addCriterion("upload_file >=", value, "uploadFile");
            return (Criteria) this;
        }

        public Criteria andUploadFileLessThan(String value) {
            addCriterion("upload_file <", value, "uploadFile");
            return (Criteria) this;
        }

        public Criteria andUploadFileLessThanOrEqualTo(String value) {
            addCriterion("upload_file <=", value, "uploadFile");
            return (Criteria) this;
        }

        public Criteria andUploadFileLike(String value) {
            addCriterion("upload_file like", value, "uploadFile");
            return (Criteria) this;
        }

        public Criteria andUploadFileNotLike(String value) {
            addCriterion("upload_file not like", value, "uploadFile");
            return (Criteria) this;
        }

        public Criteria andUploadFileIn(List<String> values) {
            addCriterion("upload_file in", values, "uploadFile");
            return (Criteria) this;
        }

        public Criteria andUploadFileNotIn(List<String> values) {
            addCriterion("upload_file not in", values, "uploadFile");
            return (Criteria) this;
        }

        public Criteria andUploadFileBetween(String value1, String value2) {
            addCriterion("upload_file between", value1, value2, "uploadFile");
            return (Criteria) this;
        }

        public Criteria andUploadFileNotBetween(String value1, String value2) {
            addCriterion("upload_file not between", value1, value2, "uploadFile");
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
     * batch_work_flow_task
     *
     * @date 2022-11-27 15:46:17
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * batch_work_flow_task 2022-11-27 15:46:17
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