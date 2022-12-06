package com.example.zxcpractice.repository;

import com.example.zxcpractice.repository.entity.ApiInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface ApiInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ApiInfo row);

    int insertSelective(ApiInfo row);

    ApiInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ApiInfo row);

    int updateByPrimaryKey(ApiInfo row);
}