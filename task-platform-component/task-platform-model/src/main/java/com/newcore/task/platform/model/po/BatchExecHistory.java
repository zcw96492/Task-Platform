package com.newcore.task.platform.model.po;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class BatchExecHistory implements Serializable {
    /**
     * 
     *
     * @date 2022-11-27 15:46:17
     */
    private Long batchExecuteId;

    /**
     * 
     *
     * @date 2022-11-27 15:46:17
     */
    private Long batchTaskId;

    /**
     * 批处理任务开始执行时间
     *
     * @date 2022-11-27 15:46:17
     */
    private Date taskExecuteStartTime;

    /**
     * 批处理任务结束执行时间
     *
     * @date 2022-11-27 15:46:17
     */
    private Date taskExecuteEndTime;

    /**
     * 批处理任务执行时长单位(S-秒，M-分，H-小时，D-天)
     *
     * @date 2022-11-27 15:46:17
     */
    private String taskExecuteDurationUnit;

    /**
     * 批处理任务执行时长数值
     *
     * @date 2022-11-27 15:46:17
     */
    private BigDecimal taskExecuteDuration;

    /**
     * 创建时间
     *
     * @date 2022-11-27 15:46:17
     */
    private Date createTime;

    /**
     * 更新时间
     *
     * @date 2022-11-27 15:46:17
     */
    private Date updateTime;

    /**
     * batch_exec_history
     */
    private static final long serialVersionUID = 1L;

    /**
     * 获取
     *
     * @date 2022-11-27 15:46:17
     * @return  
     */
    public Long getBatchExecuteId() {
        return batchExecuteId;
    }

    /**
     * 设置
     * @param batchExecuteId 
     *
     * @date 2022-11-27 15:46:17
     */
    public void setBatchExecuteId(Long batchExecuteId) {
        this.batchExecuteId = batchExecuteId;
    }

    /**
     * 获取
     *
     * @date 2022-11-27 15:46:17
     * @return  
     */
    public Long getBatchTaskId() {
        return batchTaskId;
    }

    /**
     * 设置
     * @param batchTaskId 
     *
     * @date 2022-11-27 15:46:17
     */
    public void setBatchTaskId(Long batchTaskId) {
        this.batchTaskId = batchTaskId;
    }

    /**
     * 获取批处理任务开始执行时间
     *
     * @date 2022-11-27 15:46:17
     * @return  
     */
    public Date getTaskExecuteStartTime() {
        return taskExecuteStartTime;
    }

    /**
     * 设置批处理任务开始执行时间
     * @param taskExecuteStartTime 批处理任务开始执行时间
     *
     * @date 2022-11-27 15:46:17
     */
    public void setTaskExecuteStartTime(Date taskExecuteStartTime) {
        this.taskExecuteStartTime = taskExecuteStartTime;
    }

    /**
     * 获取批处理任务结束执行时间
     *
     * @date 2022-11-27 15:46:17
     * @return  
     */
    public Date getTaskExecuteEndTime() {
        return taskExecuteEndTime;
    }

    /**
     * 设置批处理任务结束执行时间
     * @param taskExecuteEndTime 批处理任务结束执行时间
     *
     * @date 2022-11-27 15:46:17
     */
    public void setTaskExecuteEndTime(Date taskExecuteEndTime) {
        this.taskExecuteEndTime = taskExecuteEndTime;
    }

    /**
     * 获取批处理任务执行时长单位(S-秒，M-分，H-小时，D-天)
     *
     * @date 2022-11-27 15:46:17
     * @return  
     */
    public String getTaskExecuteDurationUnit() {
        return taskExecuteDurationUnit;
    }

    /**
     * 设置批处理任务执行时长单位(S-秒，M-分，H-小时，D-天)
     * @param taskExecuteDurationUnit 批处理任务执行时长单位(S-秒，M-分，H-小时，D-天)
     *
     * @date 2022-11-27 15:46:17
     */
    public void setTaskExecuteDurationUnit(String taskExecuteDurationUnit) {
        this.taskExecuteDurationUnit = taskExecuteDurationUnit;
    }

    /**
     * 获取批处理任务执行时长数值
     *
     * @date 2022-11-27 15:46:17
     * @return  
     */
    public BigDecimal getTaskExecuteDuration() {
        return taskExecuteDuration;
    }

    /**
     * 设置批处理任务执行时长数值
     * @param taskExecuteDuration 批处理任务执行时长数值
     *
     * @date 2022-11-27 15:46:17
     */
    public void setTaskExecuteDuration(BigDecimal taskExecuteDuration) {
        this.taskExecuteDuration = taskExecuteDuration;
    }

    /**
     * 获取创建时间
     *
     * @date 2022-11-27 15:46:17
     * @return  
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     * @param createTime 创建时间
     *
     * @date 2022-11-27 15:46:17
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取更新时间
     *
     * @date 2022-11-27 15:46:17
     * @return  
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     * @param updateTime 更新时间
     *
     * @date 2022-11-27 15:46:17
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * toString 方法
     *
     * @date 2022-11-27 15:46:17
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", batchExecuteId=").append(batchExecuteId);
        sb.append(", batchTaskId=").append(batchTaskId);
        sb.append(", taskExecuteStartTime=").append(taskExecuteStartTime);
        sb.append(", taskExecuteEndTime=").append(taskExecuteEndTime);
        sb.append(", taskExecuteDurationUnit=").append(taskExecuteDurationUnit);
        sb.append(", taskExecuteDuration=").append(taskExecuteDuration);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}