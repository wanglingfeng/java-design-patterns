package com.joseph.visitor;

/**
 * Created by lfwang on 2016/12/12.
 */
public class MyVisitor implements Visitor {
    @Override
    public void visit(Subject subject) {
        System.out.println("visit the subject: " + subject.getSubject());
    }
}
