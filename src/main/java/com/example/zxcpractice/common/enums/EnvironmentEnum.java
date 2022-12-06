package com.example.zxcpractice.common.enums;

/**
 * @author xuce.zhang
 * @date 2022/12/6
 */
public enum EnvironmentEnum {
    //1-测试环境，2-预发环境，3-线上环境
    TEST(1,"测试环境"),

    PRE(2,"预发环境"),

    PROD(3,"线上环境");


    private final Integer typeCode;
    private final String value;

    EnvironmentEnum(Integer typeCode, String value) {
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
        for (EnvironmentEnum ivrCustInfoType : EnvironmentEnum.values()) {
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
        for (EnvironmentEnum ivrCustInfoType : EnvironmentEnum.values()) {
            if (ivrCustInfoType.getTypeCode().equals(code)) {
                return ivrCustInfoType.getValue();
            }
        }
        return null;
    }

}
