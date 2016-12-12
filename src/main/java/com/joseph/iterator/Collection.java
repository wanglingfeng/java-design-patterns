package com.joseph.iterator;

/**
 * Created by lfwang on 2016/12/12.
 */
public interface Collection {

    Iterator iterator();

    Object get(int i);

    int size();
}
