package com.example.zxcpractice.common.error;

public interface CommonError {

    /**
     * Method description
     *
     * @return
     */
    int getErrCode();

    /**
     * Method description
     *
     * @return
     */
    String getErrMsg();

    /**
     * Method description
     *
     * @param errMsg
     * @return
     */
    CommonError setErrMsg(String errMsg);
}