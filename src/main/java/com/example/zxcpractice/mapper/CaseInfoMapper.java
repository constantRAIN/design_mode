package com.example.zxcpractice.mapper;

import com.example.zxcpractice.entity.CaseInfo;
import com.example.zxcpractice.entity.CaseInfoWithBLOBs;

public interface CaseInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CaseInfoWithBLOBs row);

    int insertSelective(CaseInfoWithBLOBs row);

    CaseInfoWithBLOBs selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CaseInfoWithBLOBs row);

    int updateByPrimaryKeyWithBLOBs(CaseInfoWithBLOBs row);

    int updateByPrimaryKey(CaseInfo row);
}