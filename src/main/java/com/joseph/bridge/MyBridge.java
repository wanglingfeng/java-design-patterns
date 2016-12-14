package com.joseph.bridge;

/**
 * Created by lfwang on 2016/12/9.
 */
public class MyBridge extends Bridge {
    @Override
    public void execute() {
        getDataBase().im();
    }
}
