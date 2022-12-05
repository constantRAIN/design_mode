package com.example.zxcpractice.repository;

import com.example.zxcpractice.repository.entity.CaseInfo;
import com.example.zxcpractice.repository.entity.CaseInfoWithBLOBs;

public interface CaseInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CaseInfoWithBLOBs row);

    int insertSelective(CaseInfoWithBLOBs row);

    CaseInfoWithBLOBs selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CaseInfoWithBLOBs row);

    int updateByPrimaryKeyWithBLOBs(CaseInfoWithBLOBs row);

    int updateByPrimaryKey(CaseInfo row);
}