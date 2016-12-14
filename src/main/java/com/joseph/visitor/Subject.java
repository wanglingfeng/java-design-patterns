package com.joseph.visitor;

/**
 * 被访问者接口
 *
 * Created by lfwang on 2016/12/12.
 */
public interface Subject {

    /**
     * 接受将要访问它的对象
     * @param visitor
     */
    void accept(Visitor visitor);

    /**
     * 获取将要被访问的属性
     * @return
     */
    String getSubject();
}
