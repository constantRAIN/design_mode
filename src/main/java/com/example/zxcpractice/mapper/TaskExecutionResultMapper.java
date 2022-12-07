package com.example.zxcpractice.mapper;

import com.example.zxcpractice.entity.TaskExecutionResult;

public interface TaskExecutionResultMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TaskExecutionResult row);

    int insertSelective(TaskExecutionResult row);

    TaskExecutionResult selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TaskExecutionResult row);

    int updateByPrimaryKey(TaskExecutionResult row);
}