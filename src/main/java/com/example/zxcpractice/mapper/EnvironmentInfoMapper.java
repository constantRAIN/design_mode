package com.example.zxcpractice.mapper;

import com.example.zxcpractice.entity.EnvironmentInfo;

public interface EnvironmentInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(EnvironmentInfo row);

    int insertSelective(EnvironmentInfo row);

    EnvironmentInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(EnvironmentInfo row);

    int updateByPrimaryKey(EnvironmentInfo row);
}