package com.joseph.iterator;

/**
 * Created by lfwang on 2016/12/12.
 */
public interface Iterator {

    /**
     * 前移
     * @return
     */
    Object previous();

    /**
     * 后移
     * @return
     */
    Object next();

    boolean hasNext();

    Object first();
}
