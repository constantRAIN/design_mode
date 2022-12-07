package com.example.zxcpractice.mapper;

import com.example.zxcpractice.entity.ApiInfo;

public interface ApiInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ApiInfo row);

    int insertSelective(ApiInfo row);

    ApiInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ApiInfo row);

    int updateByPrimaryKey(ApiInfo row);
}