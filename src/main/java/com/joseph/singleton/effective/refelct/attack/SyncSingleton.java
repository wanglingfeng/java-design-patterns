package com.joseph.singleton.effective.refelct.attack;

/**
 * Created by lfwang on 2016/12/12.
 */
public class SyncSingleton {

    private static boolean flag = false;

    private SyncSingleton() {
        synchronized (SyncSingleton.class) {
            if (!flag) {
                flag = true;
            } else {
                throw new RuntimeException("单例模式被侵犯。");
            }
        }
    }

    private static class SingletonHolder {
        private static final SyncSingleton instance = new SyncSingleton();
    }

    public static SyncSingleton getInstance() {
        return SingletonHolder.instance;
    }
}
