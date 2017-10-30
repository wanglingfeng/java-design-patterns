package com.joseph.decorator;

/**
 * Created by lfwang on 2017/10/30.
 */
public class DecoratorTests {

    public static void main(String... args) {
        DecoratorSay source = new DecoratorSayImpl();
        DecoratorSay newSource = new Decorator(source);
        newSource.say();
    }
}
