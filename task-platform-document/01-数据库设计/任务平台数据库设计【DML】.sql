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
-- 1.初始化批作业任务表数据
insert into batch_task(`batch_task_id`,`task_name`,`task_description`,`task_cron_expression`,`bean_class_path`,`job_status`,`job_group`,`create_user`,`create_time`,`update_user`,`update_time`) values (1,'DataExportJob','示例定时任务配置','0/3 * * * * ?','com.newcore.task.platform.job.DataExportJob',1,'default group','周超伟',sysdate(),'周超伟',sysdate());