package com.joseph.interpreter;

/**
 * Created by lfwang on 2016/12/12.
 */
public class Minus implements Expression {
    @Override
    public int interpret(Context context) {
        return context.getNum1() - context.getNum2();
    }
}
