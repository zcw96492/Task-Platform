package com.newcore.task.platform.job;

import org.quartz.DisallowConcurrentExecution;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * 数据导出批作业
 * @author zhouchaowei
 */
@DisallowConcurrentExecution
@Component
public class DataExportJob implements Job {

    private static final Logger logger = LoggerFactory.getLogger(DataExportJob.class);

    /**
     * 执行方法
     * @param jobExecutionContext 批作业执行上下文
     * @throws JobExecutionException 批作业执行异常
     */
    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        logger.info("批处理服务 || 数据导出批作业 || 开始执行......");
    }
}
