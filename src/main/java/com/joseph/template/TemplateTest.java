package com.joseph.template;

/**
 * Created by lfwang on 2016/12/12.
 */
public class TemplateTest {

    public static void main(String... args) {
        String exp = "12+12";

        AbstractCalculator cal = new Plus();
        int result = cal.calculate(exp, "\\+");
        System.out.println(result);
    }
}
