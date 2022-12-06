package com.example.zxcpractice.common.enums;

/**
 * @author xuce.zhang
 * @date 2022/12/6
 */
public enum DeletedEnum {
    //    0-未删除，1-删除
    EXIST(1, "未删除"),
    DELETE(1, "删除");

    private final Integer typeCode;
    private final String value;

    DeletedEnum(Integer typeCode, String value) {
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
        for (DeletedEnum ivrCustInfoType : DeletedEnum.values()) {
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
        for (DeletedEnum ivrCustInfoType : DeletedEnum.values()) {
            if (ivrCustInfoType.getTypeCode().equals(code)) {
                return ivrCustInfoType.getValue();
            }
        }
        return null;
    }

}
