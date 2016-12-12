package com.joseph.decorator;

/**
 * Created by lfwang on 2016/12/9.
 */
public class Decorator implements DecoratorSay {

    private DecoratorSay source;

    public Decorator(DecoratorSay source) {
        this.source = source;
    }

    @Override
    public void say() {
        System.out.println("before decorator!");
        source.say();
        System.out.println("after decorator!");
    }

    public static void main(String... args) {
        DecoratorSay source = new DecoratorSayImpl();
        DecoratorSay newSource = new Decorator(source);
        newSource.say();
    }
}
