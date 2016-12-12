package com.joseph.decorator;

/**
 * Created by lfwang on 2016/12/9.
 */
public class DecoratorSayImpl implements DecoratorSay {
    @Override
    public void say() {
        System.out.println("this is implementation!");
    }
}
