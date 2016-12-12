package com.joseph.adapter.support;

/**
 * Created by lfwang on 2016/12/9.
 */
public interface Targetable {

    /**
     * 与原类中的方法相同
     */
    void originalMethod();

    /**
     * 新类的方法
     */
    void targetableMethod();
}
