package com.jc.support.service;

/**
 * supports-parent
 *
 * Created by weijun on 2018/3/1
 *
 */
public interface CommonEnvService {
    /** 获取当前应用实例环境 */
    String env();

    /** 获取当前应用实例版本 */
    String version();
}
