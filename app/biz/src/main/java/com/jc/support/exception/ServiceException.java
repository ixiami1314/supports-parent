package com.jc.support.exception;

import com.zeh.jungle.core.error.JGError;
import com.zeh.jungle.core.exception.JGException;

/**
 * supports-parent
 *
 * Created by weijun on 2018/2/27
 *
 */
public class ServiceException extends JGException {

    /**  */
    private static final long serialVersionUID = 1L;

    /**
     * 构造方法
     *
     * @param error 错误实例
     */
    public ServiceException(JGError error) {
        super(error);
    }

    /**
     * 构造方法
     *
     * @param error 错误实例
     * @param cause 异常
     */
    public ServiceException(JGError error, Throwable cause) {
        super(error, cause);
    }

    /**
     * 构造方法
     *
     * @param cause 异常
     */
    public ServiceException(Throwable cause) {
        super(cause);
    }
}
