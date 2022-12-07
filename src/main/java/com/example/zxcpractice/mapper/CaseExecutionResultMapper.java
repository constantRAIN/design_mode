package com.example.zxcpractice.mapper;

import com.example.zxcpractice.entity.CaseExecutionResult;
import com.example.zxcpractice.entity.CaseExecutionResultWithBLOBs;


public interface CaseExecutionResultMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CaseExecutionResultWithBLOBs row);

    int insertSelective(CaseExecutionResultWithBLOBs row);

    CaseExecutionResultWithBLOBs selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CaseExecutionResultWithBLOBs row);

    int updateByPrimaryKeyWithBLOBs(CaseExecutionResultWithBLOBs row);

    int updateByPrimaryKey(CaseExecutionResult row);
}