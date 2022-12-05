package com.example.zxcpractice.repository;

import com.example.zxcpractice.repository.entity.TaskInfo;

public interface TaskInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TaskInfo row);

    int insertSelective(TaskInfo row);

    TaskInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TaskInfo row);

    int updateByPrimaryKeyWithBLOBs(TaskInfo row);

    int updateByPrimaryKey(TaskInfo row);
}