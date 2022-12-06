package com.example.zxcpractice.common.response;

import com.example.zxcpractice.common.enums.EmBusinessError;
import com.example.zxcpractice.common.enums.EmSuccess;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
public class CommonResult {

  /**
   * 自定义处理码
   */
  private int code;

  /**
   * 自定义处理结果
   */
  private String message;

  /**
   * success=true， 则data内返回前端需要的json数据 success=false，则data内使用通用的错误码格式
   */
  @JsonInclude(JsonInclude.Include.NON_NULL)
  private Object data;

  /**
   * 定义一个通用的创建方法
   *
   * @param result
   * @return CommonResult
   */
  public static CommonResult create(Object result) {
    return CommonResult
        .create(result, EmSuccess.SUCCESS.getCode(), EmSuccess.SUCCESS.getMessageDesc());
  }

  /**
   * 正常返回
   *
   * @param result
   * @param code
   * @param message
   * @return CommonResult
   */
  public static CommonResult create(Object result, int code, String message) {
    CommonResult commonResult = new CommonResult();
    commonResult.setCode(code);
    commonResult.setMessage(message);
    commonResult.setData(result);
    return commonResult;
  }

  /**
   * 异常返回
   *
   * @param code
   * @param message
   * @return CommonResult
   */
  public static CommonResult createException(int code, String message) {
    CommonResult commonResult = new CommonResult();
    commonResult.setCode(code);
    commonResult.setMessage(message);
    return commonResult;
  }

  /**
   * 异常返回
   *
   * @param emBusinessError
   * @return CommonResult
   */
  public static CommonResult createException(EmBusinessError emBusinessError) {
    CommonResult commonResult = new CommonResult();
    commonResult.setCode(emBusinessError.getErrCode());
    commonResult.setMessage(emBusinessError.getErrMsg());
    return commonResult;
  }

  @Override
  public String toString() {
    return "CommonResult{" + "code=" + code + ", message='" + message + '\'' + ", data=" + data
        + '}';
  }
}