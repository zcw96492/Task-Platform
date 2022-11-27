package com.newcore.task.platform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 任务平台主启动类
 * @author zhouchaowei
 */
@SpringBootApplication
public class TaskPlatformApplication {

    /**
     * 启动方法
     * @param args 启动参数
     */
    public static void main(String[] args) {
        SpringApplication.run(TaskPlatformApplication.class,args);
    }
}
