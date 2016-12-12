package com.joseph.singleton;

/**
 * 内部类单例模式实现
 *
 * Created by lfwang on 2016/12/9.
 */
public class InnerClassSingleton {

    /**
     * 私有构造方法，防止被实例化
     */
    private InnerClassSingleton() {

    }

    /**
     * 此处使用一个内部类来维护单例
     */
    private static class SingletonFactory {
        private static InnerClassSingleton instance = new InnerClassSingleton();
    }

    /**
     * 获取实例
     * @return 单例对象
     */
    public static InnerClassSingleton getInstance() {
        return SingletonFactory.instance;
    }
}
