package com.joseph.facade;

/**
 * Created by lfwang on 2016/12/9.
 */
public class UserRunner {

    public static void main(String... args) {
        Computer computer = new Computer();
        computer.startup();
        computer.shutdown();
    }
}
