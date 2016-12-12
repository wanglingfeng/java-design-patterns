package com.joseph.interpreter;

/**
 * Created by lfwang on 2016/12/12.
 */
public class InterpreterTest {

    public static void main(String... args) {
        // 计算(9+2)-8
        int result = new Minus().interpret(new Context(new Plus().interpret(new Context(9, 2)), 8));
        System.out.println(result);
    }
}
