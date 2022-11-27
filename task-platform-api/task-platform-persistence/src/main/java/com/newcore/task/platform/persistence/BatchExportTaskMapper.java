package com.newcore.task.platform.persistence;

import com.newcore.task.platform.model.po.BatchExportTask;
import com.newcore.task.platform.model.po.BatchExportTaskExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BatchExportTaskMapper {
    /**
     * countByExample 方法
     *
     * @date 2022-11-27 15:46:17
     */
    int countByExample(BatchExportTaskExample example);

    /**
     * deleteByExample 方法
     *
     * @date 2022-11-27 15:46:17
     */
    int deleteByExample(BatchExportTaskExample example);

    /**
     * deleteByPrimaryKey 方法
     *
     * @date 2022-11-27 15:46:17
     */
    int deleteByPrimaryKey(Long batchExportTaskId);

    /**
     * insert 方法
     *
     * @date 2022-11-27 15:46:17
     */
    int insert(BatchExportTask record);

    /**
     * insertSelective 方法
     *
     * @date 2022-11-27 15:46:17
     */
    int insertSelective(BatchExportTask record);

    /**
     * selectByExample 方法
     *
     * @date 2022-11-27 15:46:17
     */
    List<BatchExportTask> selectByExample(BatchExportTaskExample example);

    /**
     * selectByPrimaryKey 方法
     *
     * @date 2022-11-27 15:46:17
     */
    BatchExportTask selectByPrimaryKey(Long batchExportTaskId);

    /**
     * updateByExampleSelective 方法
     *
     * @date 2022-11-27 15:46:17
     */
    int updateByExampleSelective(@Param("record") BatchExportTask record, @Param("example") BatchExportTaskExample example);

    /**
     * updateByExample 方法
     *
     * @date 2022-11-27 15:46:17
     */
    int updateByExample(@Param("record") BatchExportTask record, @Param("example") BatchExportTaskExample example);

    /**
     * updateByPrimaryKeySelective 方法
     *
     * @date 2022-11-27 15:46:17
     */
    int updateByPrimaryKeySelective(BatchExportTask record);

    /**
     * updateByPrimaryKey 方法
     *
     * @date 2022-11-27 15:46:17
     */
    int updateByPrimaryKey(BatchExportTask record);
}