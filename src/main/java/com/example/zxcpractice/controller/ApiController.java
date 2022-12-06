package com.example.zxcpractice.controller;

import com.example.zxcpractice.common.response.CommonResult;
import com.example.zxcpractice.common.vo.ApiInfoListVO;
import com.example.zxcpractice.service.ApiInfoService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author xuce.zhang
 * @date 2022/12/6
 */
@RestController
@RequestMapping("/automate")
public class ApiController extends BaseController {

    @Resource
    ApiInfoService apiInfoService;

    @PostMapping("/select")
    public CommonResult selectApi(@RequestBody ApiInfoListVO apiInfoListVO) {

        return apiInfoService.getApiInfoByApiId(apiInfoListVO);
    }



}
