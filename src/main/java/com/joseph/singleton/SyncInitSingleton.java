package com.joseph.singleton;

/**
 * 创建单例对象是使用同步方法创建
 *
 * Created by lfwang on 2016/12/9.
 */
public class SyncInitSingleton {

    private static SyncInitSingleton instance = null;

    /**
     * 私有构造方法，防止被实例化
     */
    private SyncInitSingleton() {

    }

    /**
     * 同步创建singleton对象
     */
    private static synchronized void synchronizeInit() {
        if (null == instance) {
            instance = new SyncInitSingleton();
        }
    }

    /**
     * 获取实例
     * @return 单例对象
     */
    public static SyncInitSingleton getInstance() {
        if (null == instance) {
            synchronizeInit();
        }

        return instance;
    }
}
