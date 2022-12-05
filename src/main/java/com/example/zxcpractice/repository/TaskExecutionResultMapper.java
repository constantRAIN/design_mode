package com.example.zxcpractice.repository;

import com.example.zxcpractice.repository.entity.TaskExecutionResult;

public interface TaskExecutionResultMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TaskExecutionResult row);

    int insertSelective(TaskExecutionResult row);

    TaskExecutionResult selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TaskExecutionResult row);

    int updateByPrimaryKey(TaskExecutionResult row);
}