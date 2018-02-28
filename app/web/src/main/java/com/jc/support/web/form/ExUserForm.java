package com.jc.support.web.form;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * supports-parent
 *
 * Created by weijun on 2018/2/27
 *
 */
@Getter
@Setter
public class ExUserForm implements Serializable {

    private Integer userSex;
    private String  userName;
}
