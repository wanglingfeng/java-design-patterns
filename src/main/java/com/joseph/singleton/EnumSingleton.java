package com.joseph.singleton;

/**
 * 单例模式枚举实现
 *
 * Created by lfwang on 2016/12/12.
 */
public enum EnumSingleton {
    INSTANCE;

    public void test() {
        System.out.println("the test.");
    }
}
