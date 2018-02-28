package com.jc.support.model;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.io.Serializable;

/**
 * supports-parent
 *
 * Created by weijun on 2018/2/27
 *
 */
public abstract class AbstractModel<T extends Serializable> {
    /**
     * Method toString ...
     * @return String
     */
    @Override public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}