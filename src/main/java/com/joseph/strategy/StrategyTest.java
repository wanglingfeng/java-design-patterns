package com.joseph.strategy;

import com.joseph.strategy.calculator.Icalculator;
import com.joseph.strategy.calculator.impl.Plus;

/**
 * 简单测试类
 *
 * Created by lfwang on 2016/12/12.
 */
public class StrategyTest {

    public static void main(String... args) {
        String exp = "12+11";

        Icalculator cal = new Plus();
        int result = cal.calculate(exp);

        System.out.println(result);
    }
}
