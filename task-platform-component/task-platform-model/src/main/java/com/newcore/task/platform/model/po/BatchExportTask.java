package com.newcore.task.platform.model.po;

import java.io.Serializable;
import java.util.Date;

public class BatchExportTask implements Serializable {
    /**
     * 导出任务ID
     *
     * @date 2022-11-27 15:46:17
     */
    private Long batchExportTaskId;

    /**
     * 导出服务名
     *
     * @date 2022-11-27 15:46:17
     */
    private String exportServiceName;

    /**
     * 导出任务状态(0-导出下载中，1-已完成，2-未执行)
     *
     * @date 2022-11-27 15:46:17
     */
    private Integer exportStatus;

    /**
     * 导出操作员所在机构号
     *
     * @date 2022-11-27 15:46:17
     */
    private String exportOptClerkBranchNo;

    /**
     * 导出操作员工号
     *
     * @date 2022-11-27 15:46:17
     */
    private String exportOptClerkNo;

    /**
     * 导出操作员姓名
     *
     * @date 2022-11-27 15:46:17
     */
    private String exportOptClerkName;

    /**
     * 导出任务备注
     *
     * @date 2022-11-27 15:46:17
     */
    private String exportTaskRemark;

    /**
     * 导出任务完成时间
     *
     * @date 2022-11-27 15:46:17
     */
    private Date exportTaskFinishDate;

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
     * batch_export_task
     */
    private static final long serialVersionUID = 1L;

    /**
     * 获取导出任务ID
     *
     * @date 2022-11-27 15:46:17
     * @return  
     */
    public Long getBatchExportTaskId() {
        return batchExportTaskId;
    }

    /**
     * 设置导出任务ID
     * @param batchExportTaskId 导出任务ID
     *
     * @date 2022-11-27 15:46:17
     */
    public void setBatchExportTaskId(Long batchExportTaskId) {
        this.batchExportTaskId = batchExportTaskId;
    }

    /**
     * 获取导出服务名
     *
     * @date 2022-11-27 15:46:17
     * @return  
     */
    public String getExportServiceName() {
        return exportServiceName;
    }

    /**
     * 设置导出服务名
     * @param exportServiceName 导出服务名
     *
     * @date 2022-11-27 15:46:17
     */
    public void setExportServiceName(String exportServiceName) {
        this.exportServiceName = exportServiceName;
    }

    /**
     * 获取导出任务状态(0-导出下载中，1-已完成，2-未执行)
     *
     * @date 2022-11-27 15:46:17
     * @return  
     */
    public Integer getExportStatus() {
        return exportStatus;
    }

    /**
     * 设置导出任务状态(0-导出下载中，1-已完成，2-未执行)
     * @param exportStatus 导出任务状态(0-导出下载中，1-已完成，2-未执行)
     *
     * @date 2022-11-27 15:46:17
     */
    public void setExportStatus(Integer exportStatus) {
        this.exportStatus = exportStatus;
    }

    /**
     * 获取导出操作员所在机构号
     *
     * @date 2022-11-27 15:46:17
     * @return  
     */
    public String getExportOptClerkBranchNo() {
        return exportOptClerkBranchNo;
    }

    /**
     * 设置导出操作员所在机构号
     * @param exportOptClerkBranchNo 导出操作员所在机构号
     *
     * @date 2022-11-27 15:46:17
     */
    public void setExportOptClerkBranchNo(String exportOptClerkBranchNo) {
        this.exportOptClerkBranchNo = exportOptClerkBranchNo;
    }

    /**
     * 获取导出操作员工号
     *
     * @date 2022-11-27 15:46:17
     * @return  
     */
    public String getExportOptClerkNo() {
        return exportOptClerkNo;
    }

    /**
     * 设置导出操作员工号
     * @param exportOptClerkNo 导出操作员工号
     *
     * @date 2022-11-27 15:46:17
     */
    public void setExportOptClerkNo(String exportOptClerkNo) {
        this.exportOptClerkNo = exportOptClerkNo;
    }

    /**
     * 获取导出操作员姓名
     *
     * @date 2022-11-27 15:46:17
     * @return  
     */
    public String getExportOptClerkName() {
        return exportOptClerkName;
    }

    /**
     * 设置导出操作员姓名
     * @param exportOptClerkName 导出操作员姓名
     *
     * @date 2022-11-27 15:46:17
     */
    public void setExportOptClerkName(String exportOptClerkName) {
        this.exportOptClerkName = exportOptClerkName;
    }

    /**
     * 获取导出任务备注
     *
     * @date 2022-11-27 15:46:17
     * @return  
     */
    public String getExportTaskRemark() {
        return exportTaskRemark;
    }

    /**
     * 设置导出任务备注
     * @param exportTaskRemark 导出任务备注
     *
     * @date 2022-11-27 15:46:17
     */
    public void setExportTaskRemark(String exportTaskRemark) {
        this.exportTaskRemark = exportTaskRemark;
    }

    /**
     * 获取导出任务完成时间
     *
     * @date 2022-11-27 15:46:17
     * @return  
     */
    public Date getExportTaskFinishDate() {
        return exportTaskFinishDate;
    }

    /**
     * 设置导出任务完成时间
     * @param exportTaskFinishDate 导出任务完成时间
     *
     * @date 2022-11-27 15:46:17
     */
    public void setExportTaskFinishDate(Date exportTaskFinishDate) {
        this.exportTaskFinishDate = exportTaskFinishDate;
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
        sb.append(", batchExportTaskId=").append(batchExportTaskId);
        sb.append(", exportServiceName=").append(exportServiceName);
        sb.append(", exportStatus=").append(exportStatus);
        sb.append(", exportOptClerkBranchNo=").append(exportOptClerkBranchNo);
        sb.append(", exportOptClerkNo=").append(exportOptClerkNo);
        sb.append(", exportOptClerkName=").append(exportOptClerkName);
        sb.append(", exportTaskRemark=").append(exportTaskRemark);
        sb.append(", exportTaskFinishDate=").append(exportTaskFinishDate);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}