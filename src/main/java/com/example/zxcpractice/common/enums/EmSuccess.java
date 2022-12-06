package com.example.zxcpractice.common.enums;

public enum EmSuccess {

  /**
   * 内部接口请求成功信息
   */
  SUCCESS(200, "成功"),

  /**
   * 飞书接口请求成功信息
   */
  FEISHUSUCCESS(0, "success");

  /**
   * 状态码
   */
  private final int code;
  /**
   * 错误描述
   */
  private String messageDesc;

  public int getCode() {
    return code;
  }

  public String getMessageDesc() {
    return messageDesc;
  }

  public void setMessageDesc(String messageDesc) {
    this.messageDesc = messageDesc;
  }

  EmSuccess(int code, String messageDesc) {
    this.code = code;
    this.messageDesc = messageDesc;
  }
}