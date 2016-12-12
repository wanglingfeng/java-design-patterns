package com.joseph.memento;

/**
 * Created by lfwang on 2016/12/12.
 */
public class MementoTest {

    /**
     * 新建原始类时，value被初始化为egg，后经过修改，将value的值置为dog，最后进行恢复状态，结果成功恢复了
     * @param args
     */
    public static void main(String... args) {
        // 创建原始类
        Original original = new Original("egg");

        // 创建备忘录
        Storage storage = new Storage(original.createMemento());

        System.out.println("初始化状态为：" + original.getValue());
        original.setValue("dog");
        System.out.println("修改后状态为：" + original.getValue());

        // 恢复原始类的状态
        original.restoreMemento(storage.getMemento());
        System.out.println("恢复后状态为：" + original.getValue());
    }
}
