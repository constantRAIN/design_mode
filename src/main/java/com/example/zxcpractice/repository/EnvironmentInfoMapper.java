package com.example.zxcpractice.repository;

import com.example.zxcpractice.repository.entity.EnvironmentInfo;
import org.springframework.stereotype.Component;

@Component
public interface EnvironmentInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(EnvironmentInfo row);

    int insertSelective(EnvironmentInfo row);

    EnvironmentInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(EnvironmentInfo row);

    int updateByPrimaryKey(EnvironmentInfo row);
}