package com.example.zxcpractice.common.enums;

/**
 * @author xuce.zhang
 * @date 2022/12/6
 */
public enum ResultEnum {


    //    0-pass,1-fail,2-skip
    PASS(0,"pass"),
    FAIL(1,"fail"),
    SKIP(2,"skip");
    private final Integer typeCode;
    private final String value;

    ResultEnum(Integer typeCode,String value){
        this.typeCode = typeCode;
        this.value = value;
    }

    public Integer getTypeCode() {
        return typeCode;
    }

    public String getValue() {
        return value;
    }
    /**
     * 是否包含.
     *
     * @param type 类型
     * @return boolean
     */
    public static boolean contains(String type) {
        for (ResultEnum ivrCustInfoType : ResultEnum.values()) {
            if (ivrCustInfoType.name().equals(type)) {
                return true;
            }
        }
        return false;
    }

    /**
     * 通过code获取枚举.
     *
     * @param code 代码
     * @return String
     */
    public static String forValue(Integer code) {
        for (ResultEnum ivrCustInfoType : ResultEnum.values()) {
            if (ivrCustInfoType.getTypeCode().equals(code)) {
                return ivrCustInfoType.getValue();
            }
        }
        return "无对应的枚举类型";
    }


}
