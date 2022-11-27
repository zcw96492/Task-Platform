package com.newcore.task.platform.persistence;

import com.newcore.task.platform.model.po.BatchTask;
import com.newcore.task.platform.model.po.BatchTaskExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BatchTaskMapper {
    /**
     * countByExample 方法
     *
     * @date 2022-11-27 15:46:17
     */
    int countByExample(BatchTaskExample example);

    /**
     * deleteByExample 方法
     *
     * @date 2022-11-27 15:46:17
     */
    int deleteByExample(BatchTaskExample example);

    /**
     * deleteByPrimaryKey 方法
     *
     * @date 2022-11-27 15:46:17
     */
    int deleteByPrimaryKey(Long batchTaskId);

    /**
     * insert 方法
     *
     * @date 2022-11-27 15:46:17
     */
    int insert(BatchTask record);

    /**
     * insertSelective 方法
     *
     * @date 2022-11-27 15:46:17
     */
    int insertSelective(BatchTask record);

    /**
     * selectByExample 方法
     *
     * @date 2022-11-27 15:46:17
     */
    List<BatchTask> selectByExample(BatchTaskExample example);

    /**
     * selectByPrimaryKey 方法
     *
     * @date 2022-11-27 15:46:17
     */
    BatchTask selectByPrimaryKey(Long batchTaskId);

    /**
     * updateByExampleSelective 方法
     *
     * @date 2022-11-27 15:46:17
     */
    int updateByExampleSelective(@Param("record") BatchTask record, @Param("example") BatchTaskExample example);

    /**
     * updateByExample 方法
     *
     * @date 2022-11-27 15:46:17
     */
    int updateByExample(@Param("record") BatchTask record, @Param("example") BatchTaskExample example);

    /**
     * updateByPrimaryKeySelective 方法
     *
     * @date 2022-11-27 15:46:17
     */
    int updateByPrimaryKeySelective(BatchTask record);

    /**
     * updateByPrimaryKey 方法
     *
     * @date 2022-11-27 15:46:17
     */
    int updateByPrimaryKey(BatchTask record);
}