package com.jc.support.model;

import com.jc.support.model.enums.UserSexEnum;
import lombok.Getter;
import lombok.Setter;

/**
 * supports-parent
 *
 * Created by weijun on 2018/2/27
 *
 */
@Getter
@Setter
public class ExUserVO extends BaseVO {
    /** 用户名称 */
    private String      userName;
    /** 用户性别 */
    private UserSexEnum userSex;
}
