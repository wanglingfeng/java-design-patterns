package com.joseph.state;

/**
 * 状态类的核心类
 *
 * Created by lfwang on 2016/12/12.
 */
public class State {

    private String value;

    public void method1() {
        System.out.println("execute the first opt.");
    }

    public void method2() {
        System.out.println("execute the second opt.");
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
