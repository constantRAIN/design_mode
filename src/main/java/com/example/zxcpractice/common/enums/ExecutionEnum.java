package com.example.zxcpractice.common.enums;

/**
 * @author xuce.zhang
 * @date 2022/12/6
 */
public enum ExecutionEnum {
    //    0-未运行，1-运行成功，2-运行失败
    INITIAL(0, "未运行"),
    SUCCESS(1, "运行成功"),
    FAIL(2, "运行失败");
    private final Integer typeCode;
    private final String value;

    ExecutionEnum(Integer typeCode, String value) {
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
        for (ExecutionEnum ivrCustInfoType : ExecutionEnum.values()) {
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
        for (ExecutionEnum ivrCustInfoType : ExecutionEnum.values()) {
            if (ivrCustInfoType.getTypeCode().equals(code)) {
                return ivrCustInfoType.getValue();
            }
        }
        return null;
    }
}
