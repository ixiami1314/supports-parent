package com.jc.support.mapper;

import com.jc.support.model.enums.UserSexEnum;

/**
 * supports-parent
 *
 * Created by weijun on 2018/2/27
 *
 */
public interface AbstractMapper {
    /**
     * SettleTypeEnum to code
     *
     * @param type
     * @return
     */
    default String userSexEnumToCode(UserSexEnum type) {
        return type.getCode();
    }

    /**
     * Code to SettleTypeEnum
     *
     * @param code
     * @return
     */
    default UserSexEnum codeToSettleTypeEnum(String code) {
        return UserSexEnum.getEnumByCode(code);
    }
}
