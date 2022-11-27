package com.newcore.task.platform.model.po;

import java.io.Serializable;
import java.util.Date;

public class BatchDatasourceConfig implements Serializable {
    /**
     * 批作业数据源代码
     *
     * @date 2022-11-27 15:46:17
     */
    private String batchDatasourceCode;

    /**
     * 批作业数据源名称
     *
     * @date 2022-11-27 15:46:17
     */
    private String batchDatasourceName;

    /**
     * 数据源地址
     *
     * @date 2022-11-27 15:46:17
     */
    private String datasourceUrl;

    /**
     * 数据源用户名
     *
     * @date 2022-11-27 15:46:17
     */
    private String datasourceConnectUsername;

    /**
     * 数据源密码
     *
     * @date 2022-11-27 15:46:17
     */
    private String datasourceConnectPassword;

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
     * batch_datasource_config
     */
    private static final long serialVersionUID = 1L;

    /**
     * 获取批作业数据源代码
     *
     * @date 2022-11-27 15:46:17
     * @return  
     */
    public String getBatchDatasourceCode() {
        return batchDatasourceCode;
    }

    /**
     * 设置批作业数据源代码
     * @param batchDatasourceCode 批作业数据源代码
     *
     * @date 2022-11-27 15:46:17
     */
    public void setBatchDatasourceCode(String batchDatasourceCode) {
        this.batchDatasourceCode = batchDatasourceCode;
    }

    /**
     * 获取批作业数据源名称
     *
     * @date 2022-11-27 15:46:17
     * @return  
     */
    public String getBatchDatasourceName() {
        return batchDatasourceName;
    }

    /**
     * 设置批作业数据源名称
     * @param batchDatasourceName 批作业数据源名称
     *
     * @date 2022-11-27 15:46:17
     */
    public void setBatchDatasourceName(String batchDatasourceName) {
        this.batchDatasourceName = batchDatasourceName;
    }

    /**
     * 获取数据源地址
     *
     * @date 2022-11-27 15:46:17
     * @return  
     */
    public String getDatasourceUrl() {
        return datasourceUrl;
    }

    /**
     * 设置数据源地址
     * @param datasourceUrl 数据源地址
     *
     * @date 2022-11-27 15:46:17
     */
    public void setDatasourceUrl(String datasourceUrl) {
        this.datasourceUrl = datasourceUrl;
    }

    /**
     * 获取数据源用户名
     *
     * @date 2022-11-27 15:46:17
     * @return  
     */
    public String getDatasourceConnectUsername() {
        return datasourceConnectUsername;
    }

    /**
     * 设置数据源用户名
     * @param datasourceConnectUsername 数据源用户名
     *
     * @date 2022-11-27 15:46:17
     */
    public void setDatasourceConnectUsername(String datasourceConnectUsername) {
        this.datasourceConnectUsername = datasourceConnectUsername;
    }

    /**
     * 获取数据源密码
     *
     * @date 2022-11-27 15:46:17
     * @return  
     */
    public String getDatasourceConnectPassword() {
        return datasourceConnectPassword;
    }

    /**
     * 设置数据源密码
     * @param datasourceConnectPassword 数据源密码
     *
     * @date 2022-11-27 15:46:17
     */
    public void setDatasourceConnectPassword(String datasourceConnectPassword) {
        this.datasourceConnectPassword = datasourceConnectPassword;
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
        sb.append(", batchDatasourceCode=").append(batchDatasourceCode);
        sb.append(", batchDatasourceName=").append(batchDatasourceName);
        sb.append(", datasourceUrl=").append(datasourceUrl);
        sb.append(", datasourceConnectUsername=").append(datasourceConnectUsername);
        sb.append(", datasourceConnectPassword=").append(datasourceConnectPassword);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}