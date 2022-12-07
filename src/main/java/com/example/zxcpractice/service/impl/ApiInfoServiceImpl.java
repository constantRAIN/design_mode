package com.example.zxcpractice.service.impl;

import com.example.zxcpractice.common.response.CommonResult;
import com.example.zxcpractice.common.vo.ApiInfoListVO;
import com.example.zxcpractice.mapper.ApiInfoMapper;
import com.example.zxcpractice.service.ApiInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author xuce.zhang
 * @date 2022/12/6
 */
@Slf4j
@Service
public class ApiInfoServiceImpl implements ApiInfoService {
    @Resource
    private ApiInfoMapper apiInfoMapper;

    @Override
    public CommonResult getApiInfoByApiId(ApiInfoListVO apiId) {
        return CommonResult.create(apiInfoMapper.selectByPrimaryKey(apiId.getApiId()));
    }
}
