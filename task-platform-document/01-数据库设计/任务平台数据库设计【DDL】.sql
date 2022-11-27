/*
 契约个单系统数据库模型
 Source Server         : tencent_mysql
 Source Server Type    : MySQL
 Source Server Version : 50724
 Source Host           : cdb-19urcqui.cd.tencentcdb.com:10057
 Source Schema         : BATCH_PLATFORM
 Target Server Type    : MySQL
 Target Server Version : 50724
 File Encoding         : 65001
 Table Count           : 84
 Date                  : 15/07/2022 17:16:23
*/
-- 1.批作业任务表
CREATE TABLE `batch_task` (
    `batch_task_id` bigint(15) NOT NULL AUTO_INCREMENT COMMENT '批作业任务ID',
    `task_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '批作业任务名称',
    `task_description` varchar(1000) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '批作业任务描述',
    `task_cron_expression` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT 'cron定时器表达式',
    `bean_class_path` varchar(1000) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '任务执行时调用哪个类的方法(包名 + 类名)',
    `job_status` int(10) NOT NULL DEFAULT 0 COMMENT '任务状态(0-未启动，1-正常运行，2-停用下线)',
    `job_group` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '任务分组',
    `create_user` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '批作业任务创建者',
    `create_time` datetime NOT NULL COMMENT '创建时间',
    `update_user` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '批作业任务更新者',
    `update_time` datetime NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`batch_task_id`)
) ENGINE = InnoDB DEFAULT CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '批作业任务表';


-- 2.批作业数据源配置表
CREATE TABLE `batch_datasource_config` (
    `batch_datasource_code` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '批作业数据源代码',
    `batch_datasource_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '批作业数据源名称',
    `datasource_url` varchar(2000) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '数据源地址',
    `datasource_connect_username` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '数据源用户名',
    `datasource_connect_password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '数据源密码',
    `create_time` datetime NOT NULL COMMENT '创建时间',
    `update_time` datetime NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`batch_datasource_code`)
) ENGINE = InnoDB DEFAULT CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '批作业数据源配置表';


-- 3.批作业执行历史记录表
CREATE TABLE `batch_exec_history` (
    `batch_execute_id` bigint(20) NOT NULL AUTO_INCREMENT,
    `batch_task_id` bigint(20) NOT NULL,
    `task_execute_start_time` datetime NULL DEFAULT NULL COMMENT '批处理任务开始执行时间',
    `task_execute_end_time` datetime NULL DEFAULT NULL COMMENT '批处理任务结束执行时间',
    `task_execute_duration_unit` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '批处理任务执行时长单位(S-秒，M-分，H-小时，D-天)',
    `task_execute_duration` decimal(5,2) NULL DEFAULT NULL COMMENT '批处理任务执行时长数值',
    `create_time` datetime NOT NULL COMMENT '创建时间',
    `update_time` datetime NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`batch_execute_id`)
) ENGINE = InnoDB DEFAULT CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '批作业执行历史记录表';


-- 4.导出数据任务表
CREATE TABLE `batch_export_task` (
    `batch_export_task_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '导出任务ID',
    `export_service_name` varchar(2000) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '导出服务名',
    `export_status` int(8) NULL DEFAULT NULL COMMENT '导出任务状态(0-导出下载中，1-已完成，2-未执行)',
    `export_opt_clerk_branch_no` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '导出操作员所在机构号',
    `export_opt_clerk_no` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '导出操作员工号',
    `export_opt_clerk_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '导出操作员姓名',
    `export_task_remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '导出任务备注',
    `export_task_finish_date` datetime NULL DEFAULT NULL COMMENT '导出任务完成时间',
    `create_time` datetime NOT NULL COMMENT '创建时间',
    `update_time` datetime NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`batch_export_task_id`)
) ENGINE = InnoDB DEFAULT CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '导出数据任务表';


-- 5.工作流(任务流)表
CREATE TABLE `batch_work_flow_task` (
    `work_flow_task_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '工作流任务ID',
    `work_flow_code` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '工作流代码',
    `work_flow_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '工作流名称',
    `work_flow_type` varchar(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '工作流类型',
    `work_flow_status` varchar(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '工作流启用状态（ON-启用，OFF-关闭）',
    `work_flow_system` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '工作流所属系统',
    `upload_file` varchar(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '是否上传工作流文件(Y-是,N-否)',
    `create_time` datetime NOT NULL COMMENT '创建时间',
    `update_time` datetime NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`work_flow_task_id`)
) ENGINE = InnoDB DEFAULT CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '工作流(任务流)表';