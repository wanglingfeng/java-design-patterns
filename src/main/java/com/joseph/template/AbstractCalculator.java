package com.joseph.template;

/**
 * Created by lfwang on 2016/12/12.
 */
public abstract class AbstractCalculator {

    /**
     * 主方法，实现对本类其它方法的调用
     * @param exp
     * @param opt
     * @return
     */
    public final int calculate(String exp, String opt) {
        int[] array = split(exp, opt);

        return abstractCalculate(array[0], array[1]);
    }

    abstract public int abstractCalculate(int i1, int i2);


    /**
     * 工具方法
     * @param exp
     * @param opt
     * @return
     */
    public int[] split(String exp, String opt) {
        String[] array = exp.split(opt);

        int[] arrayInt = new int[2];
        arrayInt[0] = Integer.parseInt(array[0]);
        arrayInt[1] = Integer.parseInt(array[1]);

        return arrayInt;
    }
}
