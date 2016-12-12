package com.joseph.strategy.calculator.impl;

import com.joseph.strategy.calculator.Icalculator;
import com.joseph.strategy.util.AbstractCalculator;

/**
 * Created by lfwang on 2016/12/12.
 */
public class Minus extends AbstractCalculator implements Icalculator {
    @Override
    public int calculate(String exp) {
        int[] arrayInt = split(exp, "-");

        return arrayInt[0] - arrayInt[1];
    }
}
