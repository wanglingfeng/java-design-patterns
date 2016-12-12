package com.joseph.bridge.db.impl;

import com.joseph.bridge.db.DataBase;

/**
 * Created by lfwang on 2016/12/9.
 */
public class MongoDB implements DataBase {
    @Override
    public void im() {
        System.out.println("this is mongoDB.");
    }
}
