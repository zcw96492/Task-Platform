package com.newcore.task.platform.persistence;

import com.newcore.task.platform.model.po.BatchExecHistory;
import com.newcore.task.platform.model.po.BatchExecHistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BatchExecHistoryMapper {
    /**
     * countByExample 方法
     *
     * @date 2022-11-27 15:46:17
     */
    int countByExample(BatchExecHistoryExample example);

    /**
     * deleteByExample 方法
     *
     * @date 2022-11-27 15:46:17
     */
    int deleteByExample(BatchExecHistoryExample example);

    /**
     * deleteByPrimaryKey 方法
     *
     * @date 2022-11-27 15:46:17
     */
    int deleteByPrimaryKey(Long batchExecuteId);

    /**
     * insert 方法
     *
     * @date 2022-11-27 15:46:17
     */
    int insert(BatchExecHistory record);

    /**
     * insertSelective 方法
     *
     * @date 2022-11-27 15:46:17
     */
    int insertSelective(BatchExecHistory record);

    /**
     * selectByExample 方法
     *
     * @date 2022-11-27 15:46:17
     */
    List<BatchExecHistory> selectByExample(BatchExecHistoryExample example);

    /**
     * selectByPrimaryKey 方法
     *
     * @date 2022-11-27 15:46:17
     */
    BatchExecHistory selectByPrimaryKey(Long batchExecuteId);

    /**
     * updateByExampleSelective 方法
     *
     * @date 2022-11-27 15:46:17
     */
    int updateByExampleSelective(@Param("record") BatchExecHistory record, @Param("example") BatchExecHistoryExample example);

    /**
     * updateByExample 方法
     *
     * @date 2022-11-27 15:46:17
     */
    int updateByExample(@Param("record") BatchExecHistory record, @Param("example") BatchExecHistoryExample example);

    /**
     * updateByPrimaryKeySelective 方法
     *
     * @date 2022-11-27 15:46:17
     */
    int updateByPrimaryKeySelective(BatchExecHistory record);

    /**
     * updateByPrimaryKey 方法
     *
     * @date 2022-11-27 15:46:17
     */
    int updateByPrimaryKey(BatchExecHistory record);
}