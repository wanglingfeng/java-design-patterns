package com.joseph.command;

/**
 * Created by lfwang on 2016/12/12.
 */
public class CommandTest {

    public static void main(String... args) {
        // 司令向士兵发命令
        Receiver receiver = new Receiver();
        Command cmd = new MyCommand(receiver);
        Invoker invoker = new Invoker(cmd);
        invoker.action();
    }
}
