package com.newcore.task.platform.interfaces.impl;

import com.newcore.task.platform.interfaces.ScheduleTaskService;
import com.newcore.task.platform.model.po.BatchTask;
import com.newcore.task.platform.model.po.BatchTaskExample;
import com.newcore.task.platform.persistence.BatchTaskMapper;
import com.newcore.task.platform.utils.QuartzManager;
import com.newcore.task.platform.utils.enums.TASK_STATUS;
import com.newcore.task.platform.utils.model.TaskBO;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * 定时任务服务实现类
 * @author zhouchaowei
 */
@Service("scheduleTaskService")
@MapperScan(basePackages = "com.newcore.task.platform.persistence")
public class ScheduleTaskServiceImpl implements ScheduleTaskService {

    private static final Logger logger = LoggerFactory.getLogger(ScheduleTaskServiceImpl.class);

    @Autowired
    private QuartzManager quartzManager;

    @Autowired
    private BatchTaskMapper batchTaskMapper;

    /**
     * 初始化定时任务方法
     */
    @Override
    public void initSchedule() {
        BatchTaskExample batchTaskExample = new BatchTaskExample();
        List<BatchTask> batchTaskList = batchTaskMapper.selectByExample(batchTaskExample);
        if(!CollectionUtils.isEmpty(batchTaskList)){
            for (BatchTask batchTask : batchTaskList){
                TaskBO taskBO = new TaskBO();
                taskBO.setId(batchTask.getBatchTaskId());
                taskBO.setDescription(batchTask.getTaskDescription());
                taskBO.setCronExpression(batchTask.getTaskCronExpression());
                taskBO.setBeanClass(batchTask.getBeanClassPath());
                taskBO.setJobName(batchTask.getTaskName());
                taskBO.setJobStatus(TASK_STATUS.valueOfKey(batchTask.getJobStatus()).getDescription());
                taskBO.setJobGroup(batchTask.getJobGroup());
                taskBO.setCreateUser(batchTask.getCreateUser());
                taskBO.setCreateTime(batchTask.getCreateTime());
                taskBO.setUpdateUser(batchTask.getUpdateUser());
                taskBO.setUpdateTime(batchTask.getUpdateTime());
                if (TASK_STATUS.PROCESSING.getCode().equals(batchTask.getJobStatus())) {
                    quartzManager.addJob(taskBO);
                }
            }
        }
    }
}
