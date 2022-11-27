package com.newcore.task.platform.persistence;

import com.newcore.task.platform.model.po.BatchWorkFlowTask;
import com.newcore.task.platform.model.po.BatchWorkFlowTaskExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BatchWorkFlowTaskMapper {
    /**
     * countByExample 方法
     *
     * @date 2022-11-27 15:46:17
     */
    int countByExample(BatchWorkFlowTaskExample example);

    /**
     * deleteByExample 方法
     *
     * @date 2022-11-27 15:46:17
     */
    int deleteByExample(BatchWorkFlowTaskExample example);

    /**
     * deleteByPrimaryKey 方法
     *
     * @date 2022-11-27 15:46:17
     */
    int deleteByPrimaryKey(Long workFlowTaskId);

    /**
     * insert 方法
     *
     * @date 2022-11-27 15:46:17
     */
    int insert(BatchWorkFlowTask record);

    /**
     * insertSelective 方法
     *
     * @date 2022-11-27 15:46:17
     */
    int insertSelective(BatchWorkFlowTask record);

    /**
     * selectByExample 方法
     *
     * @date 2022-11-27 15:46:17
     */
    List<BatchWorkFlowTask> selectByExample(BatchWorkFlowTaskExample example);

    /**
     * selectByPrimaryKey 方法
     *
     * @date 2022-11-27 15:46:17
     */
    BatchWorkFlowTask selectByPrimaryKey(Long workFlowTaskId);

    /**
     * updateByExampleSelective 方法
     *
     * @date 2022-11-27 15:46:17
     */
    int updateByExampleSelective(@Param("record") BatchWorkFlowTask record, @Param("example") BatchWorkFlowTaskExample example);

    /**
     * updateByExample 方法
     *
     * @date 2022-11-27 15:46:17
     */
    int updateByExample(@Param("record") BatchWorkFlowTask record, @Param("example") BatchWorkFlowTaskExample example);

    /**
     * updateByPrimaryKeySelective 方法
     *
     * @date 2022-11-27 15:46:17
     */
    int updateByPrimaryKeySelective(BatchWorkFlowTask record);

    /**
     * updateByPrimaryKey 方法
     *
     * @date 2022-11-27 15:46:17
     */
    int updateByPrimaryKey(BatchWorkFlowTask record);
}