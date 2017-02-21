package com.joseph.singleton.effective.refelct.attack;

import com.joseph.singleton.EnumSingleton;
import com.joseph.singleton.SyncSingleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by lfwang on 2016/12/12.
 */
public class SingletonModifiedReflectAttack {

    public static void main(String... args) {
        //syncSingletonAttack();
        enumSingletonAttack();
    }

    public static void syncSingletonAttack() {
        Class<SyncSingleton> classType = SyncSingleton.class;

        try {
            Constructor<SyncSingleton> c = classType.getDeclaredConstructor();
            c.setAccessible(true);
            SyncSingleton s1 = c.newInstance();
            SyncSingleton s2 = SyncSingleton.getInstance();

            System.out.println(s1 = s2);
        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }
    }

    public static void enumSingletonAttack() {
        Class<EnumSingleton> classType = EnumSingleton.class;

        try {
            Constructor<EnumSingleton> c = classType.getConstructor();
            c.setAccessible(true);
            c.newInstance();
        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }
    }
}
