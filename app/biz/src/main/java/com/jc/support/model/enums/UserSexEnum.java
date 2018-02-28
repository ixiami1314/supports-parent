package com.jc.support.model.enums;

/**
 * supports-parent
 *
 * Created by weijun on 2018/2/27
 *
 */
public enum  UserSexEnum {
    /** 顺丰 */
    BOY("BOY", "男孩"),
    /** 德邦 */
    GIRL("GIRL", "女孩");

    /** 枚举编码 */
    private String code;
    /** 枚举描述 */
    private String desc;

    /**
     * 构造器
     *
     * @param code
     * @param desc
     */
    private UserSexEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    /**
     * 获取枚举类型
     *
     * @param code 枚举码
     * @return
     */
    public static UserSexEnum getEnumByCode(String code) {
        for (UserSexEnum e : UserSexEnum.values()) {
            if (e.getCode().equals(code)) {
                return e;
            }
        }
        return null;
    }

    /**
     *
     *
     * 获取枚举编码
     */
    public String getCode() {
        return code;
    }

    /**
     * 获取枚举描述
     */
    public String getDesc() {
        return desc;
    }
}
