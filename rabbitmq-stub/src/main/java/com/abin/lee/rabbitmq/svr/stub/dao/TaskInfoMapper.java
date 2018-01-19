package com.abin.lee.rabbitmq.svr.stub.dao;

import com.abin.lee.rabbitmq.svr.stub.model.TaskInfo;
import com.abin.lee.rabbitmq.svr.stub.model.TaskInfoExample;
import com.abin.lee.rabbitmq.svr.stub.model.TaskInfoWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TaskInfoMapper {
    int countByExample(TaskInfoExample example);

    int deleteByExample(TaskInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TaskInfoWithBLOBs record);

    int insertSelective(TaskInfoWithBLOBs record);

    List<TaskInfoWithBLOBs> selectByExampleWithBLOBs(TaskInfoExample example);

    List<TaskInfo> selectByExample(TaskInfoExample example);

    TaskInfoWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TaskInfoWithBLOBs record, @Param("example") TaskInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") TaskInfoWithBLOBs record, @Param("example") TaskInfoExample example);

    int updateByExample(@Param("record") TaskInfo record, @Param("example") TaskInfoExample example);

    int updateByPrimaryKeySelective(TaskInfoWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(TaskInfoWithBLOBs record);

    int updateByPrimaryKey(TaskInfo record);
}