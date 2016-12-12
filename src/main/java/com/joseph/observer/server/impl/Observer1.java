package com.joseph.observer.server.impl;

import com.joseph.observer.server.Observer;

/**
 * Created by lfwang on 2016/12/12.
 */
public class Observer1 implements Observer {
    @Override
    public void update() {
        System.out.println("observer1 has received.");
    }
}
