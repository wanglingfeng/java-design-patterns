package com.joseph.observer.subject.impl;

import com.joseph.observer.subject.AbstractSubject;

/**
 * Created by lfwang on 2016/12/12.
 */
public class MySubject extends AbstractSubject {
    @Override
    public void operation() {
        System.out.println("update self.");
        notifyObservers();
    }
}
