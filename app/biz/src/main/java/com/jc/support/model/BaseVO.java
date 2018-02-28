package com.jc.support.model;

import java.util.Date;

/**
 * supports-parent
 *
 * Created by weijun on 2018/2/27
 *
 */
public class BaseVO extends AbstractModel<Long> {
    /**  */
    private static final long serialVersionUID = 1L;
    /** 主键  */
    private long   id;
    /** 创建时间 */
    private Date   gmtCreate;
    /** 修改时间 */
    private Date   gmtModified;
    /** 创建人 */
    private String createBy;
    /** 修改人 */
    private String modifyBy;
}
