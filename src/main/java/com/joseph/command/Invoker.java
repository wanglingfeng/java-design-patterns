package com.joseph.command;

/**
 * 调用者（司令员）
 *
 * Created by lfwang on 2016/12/12.
 */
public class Invoker {

    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void action() {
        command.exe();
    }
}
