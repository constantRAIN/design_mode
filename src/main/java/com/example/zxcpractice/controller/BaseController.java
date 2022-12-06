package com.example.zxcpractice.controller;

import com.example.zxcpractice.common.enums.EmBusinessError;
import com.example.zxcpractice.common.error.BussinessException;
import com.example.zxcpractice.common.response.CommonResult;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.text.SimpleDateFormat;
import java.util.Date;

public class BaseController {

  public static final String CONTENT_TYPE_FORMED = "application/x-www-form-urlencoded";

  /**
   * 定义exceptionghandler解决为被controller层吸收的exception
   *
   * @param ex
   * @return
   */
  @ExceptionHandler(Exception.class)
  @ResponseStatus(HttpStatus.OK)
  @ResponseBody
  public Object handlerException(Exception ex) {

    if (ex instanceof BussinessException) {
      BussinessException bussinessException = (BussinessException) ex;
      return CommonResult
          .createException(bussinessException.getErrCode(), bussinessException.getErrMsg());
    } else {
      return CommonResult.createException(EmBusinessError.UNKNOW_ERROR.getErrCode(),
          EmBusinessError.UNKNOW_ERROR.getErrMsg());
    }

  }

  /**
   * GET请求，传递时间类型的字符串，后台无法解析(post请求可以解析）,需要在controller中加入此方法
   */
  @InitBinder
  public void initBinder(WebDataBinder binder) {
    SimpleDateFormat dateFormat = null;
    dateFormat = new SimpleDateFormat("yyyyMMdd");
    dateFormat.setLenient(false);
    binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
  }

}