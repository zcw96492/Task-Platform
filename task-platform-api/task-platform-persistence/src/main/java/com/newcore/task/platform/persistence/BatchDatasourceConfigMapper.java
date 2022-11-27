package com.newcore.task.platform.persistence;

import com.newcore.task.platform.model.po.BatchDatasourceConfig;
import com.newcore.task.platform.model.po.BatchDatasourceConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BatchDatasourceConfigMapper {
    /**
     * countByExample 方法
     *
     * @date 2022-11-27 15:46:17
     */
    int countByExample(BatchDatasourceConfigExample example);

    /**
     * deleteByExample 方法
     *
     * @date 2022-11-27 15:46:17
     */
    int deleteByExample(BatchDatasourceConfigExample example);

    /**
     * deleteByPrimaryKey 方法
     *
     * @date 2022-11-27 15:46:17
     */
    int deleteByPrimaryKey(String batchDatasourceCode);

    /**
     * insert 方法
     *
     * @date 2022-11-27 15:46:17
     */
    int insert(BatchDatasourceConfig record);

    /**
     * insertSelective 方法
     *
     * @date 2022-11-27 15:46:17
     */
    int insertSelective(BatchDatasourceConfig record);

    /**
     * selectByExample 方法
     *
     * @date 2022-11-27 15:46:17
     */
    List<BatchDatasourceConfig> selectByExample(BatchDatasourceConfigExample example);

    /**
     * selectByPrimaryKey 方法
     *
     * @date 2022-11-27 15:46:17
     */
    BatchDatasourceConfig selectByPrimaryKey(String batchDatasourceCode);

    /**
     * updateByExampleSelective 方法
     *
     * @date 2022-11-27 15:46:17
     */
    int updateByExampleSelective(@Param("record") BatchDatasourceConfig record, @Param("example") BatchDatasourceConfigExample example);

    /**
     * updateByExample 方法
     *
     * @date 2022-11-27 15:46:17
     */
    int updateByExample(@Param("record") BatchDatasourceConfig record, @Param("example") BatchDatasourceConfigExample example);

    /**
     * updateByPrimaryKeySelective 方法
     *
     * @date 2022-11-27 15:46:17
     */
    int updateByPrimaryKeySelective(BatchDatasourceConfig record);

    /**
     * updateByPrimaryKey 方法
     *
     * @date 2022-11-27 15:46:17
     */
    int updateByPrimaryKey(BatchDatasourceConfig record);
}