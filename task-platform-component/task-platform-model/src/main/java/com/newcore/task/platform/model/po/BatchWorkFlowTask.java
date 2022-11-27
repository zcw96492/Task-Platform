package com.newcore.task.platform.model.po;

import java.io.Serializable;
import java.util.Date;

public class BatchWorkFlowTask implements Serializable {
    /**
     * 工作流任务ID
     *
     * @date 2022-11-27 15:46:17
     */
    private Long workFlowTaskId;

    /**
     * 工作流代码
     *
     * @date 2022-11-27 15:46:17
     */
    private String workFlowCode;

    /**
     * 工作流名称
     *
     * @date 2022-11-27 15:46:17
     */
    private String workFlowName;

    /**
     * 工作流类型
     *
     * @date 2022-11-27 15:46:17
     */
    private String workFlowType;

    /**
     * 工作流启用状态（ON-启用，OFF-关闭）
     *
     * @date 2022-11-27 15:46:17
     */
    private String workFlowStatus;

    /**
     * 工作流所属系统
     *
     * @date 2022-11-27 15:46:17
     */
    private String workFlowSystem;

    /**
     * 是否上传工作流文件(Y-是,N-否)
     *
     * @date 2022-11-27 15:46:17
     */
    private String uploadFile;

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
     * batch_work_flow_task
     */
    private static final long serialVersionUID = 1L;

    /**
     * 获取工作流任务ID
     *
     * @date 2022-11-27 15:46:17
     * @return  
     */
    public Long getWorkFlowTaskId() {
        return workFlowTaskId;
    }

    /**
     * 设置工作流任务ID
     * @param workFlowTaskId 工作流任务ID
     *
     * @date 2022-11-27 15:46:17
     */
    public void setWorkFlowTaskId(Long workFlowTaskId) {
        this.workFlowTaskId = workFlowTaskId;
    }

    /**
     * 获取工作流代码
     *
     * @date 2022-11-27 15:46:17
     * @return  
     */
    public String getWorkFlowCode() {
        return workFlowCode;
    }

    /**
     * 设置工作流代码
     * @param workFlowCode 工作流代码
     *
     * @date 2022-11-27 15:46:17
     */
    public void setWorkFlowCode(String workFlowCode) {
        this.workFlowCode = workFlowCode;
    }

    /**
     * 获取工作流名称
     *
     * @date 2022-11-27 15:46:17
     * @return  
     */
    public String getWorkFlowName() {
        return workFlowName;
    }

    /**
     * 设置工作流名称
     * @param workFlowName 工作流名称
     *
     * @date 2022-11-27 15:46:17
     */
    public void setWorkFlowName(String workFlowName) {
        this.workFlowName = workFlowName;
    }

    /**
     * 获取工作流类型
     *
     * @date 2022-11-27 15:46:17
     * @return  
     */
    public String getWorkFlowType() {
        return workFlowType;
    }

    /**
     * 设置工作流类型
     * @param workFlowType 工作流类型
     *
     * @date 2022-11-27 15:46:17
     */
    public void setWorkFlowType(String workFlowType) {
        this.workFlowType = workFlowType;
    }

    /**
     * 获取工作流启用状态（ON-启用，OFF-关闭）
     *
     * @date 2022-11-27 15:46:17
     * @return  
     */
    public String getWorkFlowStatus() {
        return workFlowStatus;
    }

    /**
     * 设置工作流启用状态（ON-启用，OFF-关闭）
     * @param workFlowStatus 工作流启用状态（ON-启用，OFF-关闭）
     *
     * @date 2022-11-27 15:46:17
     */
    public void setWorkFlowStatus(String workFlowStatus) {
        this.workFlowStatus = workFlowStatus;
    }

    /**
     * 获取工作流所属系统
     *
     * @date 2022-11-27 15:46:17
     * @return  
     */
    public String getWorkFlowSystem() {
        return workFlowSystem;
    }

    /**
     * 设置工作流所属系统
     * @param workFlowSystem 工作流所属系统
     *
     * @date 2022-11-27 15:46:17
     */
    public void setWorkFlowSystem(String workFlowSystem) {
        this.workFlowSystem = workFlowSystem;
    }

    /**
     * 获取是否上传工作流文件(Y-是,N-否)
     *
     * @date 2022-11-27 15:46:17
     * @return  
     */
    public String getUploadFile() {
        return uploadFile;
    }

    /**
     * 设置是否上传工作流文件(Y-是,N-否)
     * @param uploadFile 是否上传工作流文件(Y-是,N-否)
     *
     * @date 2022-11-27 15:46:17
     */
    public void setUploadFile(String uploadFile) {
        this.uploadFile = uploadFile;
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
        sb.append(", workFlowTaskId=").append(workFlowTaskId);
        sb.append(", workFlowCode=").append(workFlowCode);
        sb.append(", workFlowName=").append(workFlowName);
        sb.append(", workFlowType=").append(workFlowType);
        sb.append(", workFlowStatus=").append(workFlowStatus);
        sb.append(", workFlowSystem=").append(workFlowSystem);
        sb.append(", uploadFile=").append(uploadFile);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}