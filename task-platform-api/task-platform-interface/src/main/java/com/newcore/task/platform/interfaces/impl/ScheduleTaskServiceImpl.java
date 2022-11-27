package com.newcore.task.platform.interfaces.impl;

import com.newcore.task.platform.interfaces.ScheduleTaskService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 定时任务服务实现类
 * @author zhouchaowei
 */
@Service("scheduleTaskService")
public class ScheduleTaskServiceImpl implements ScheduleTaskService {

    private static final Logger logger = LoggerFactory.getLogger(ScheduleTaskServiceImpl.class);

    /**
     * 初始化定时任务方法
     */
    @Override
    public void initSchedule() {
        logger.info("定时任务已初始化......");
    }
}
