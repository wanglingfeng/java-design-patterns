package com.joseph.singleton;

/**
 * 单例模式基础实现
 *
 * Created by lfwang on 2016/12/9.
 */
public class BasicSingleton {

    /**
     * 持有私有静态实例，防止被引用，此处赋值为null，目的是实现延迟加载
     */
    private static BasicSingleton instance = null;

    /**
     * 私有构造方法，防止被实例化
     */
    private BasicSingleton() {

    }

    /**
     * 静态工程方法，创建实例
     * @return 单例对象
     */
    public static synchronized BasicSingleton getInstance() {
        if (null == instance) {
            instance = new BasicSingleton();
        }

        return instance;
    }
}
