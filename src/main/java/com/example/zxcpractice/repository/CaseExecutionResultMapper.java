package com.example.zxcpractice.repository;

import com.example.zxcpractice.repository.entity.CaseExecutionResult;
import com.example.zxcpractice.repository.entity.CaseExecutionResultWithBLOBs;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface CaseExecutionResultMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CaseExecutionResultWithBLOBs row);

    int insertSelective(CaseExecutionResultWithBLOBs row);

    CaseExecutionResultWithBLOBs selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CaseExecutionResultWithBLOBs row);

    int updateByPrimaryKeyWithBLOBs(CaseExecutionResultWithBLOBs row);

    int updateByPrimaryKey(CaseExecutionResult row);
}