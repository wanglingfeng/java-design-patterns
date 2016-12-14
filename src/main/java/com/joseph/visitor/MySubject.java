package com.joseph.visitor;

/**
 * 被访问者实现
 *
 * Created by lfwang on 2016/12/12.
 */
public class MySubject implements Subject {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getSubject() {
        return "love";
    }
}
