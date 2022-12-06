package com.example.zxcpractice.service;

import com.example.zxcpractice.common.response.CommonResult;
import com.example.zxcpractice.common.vo.ApiInfoListVO;

/**
 * @author xuce.zhang
 * @date 2022/12/6
 */
public interface ApiInfoService {

    CommonResult getApiInfoByApiId(ApiInfoListVO apiId);

}
