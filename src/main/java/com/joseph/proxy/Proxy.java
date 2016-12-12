package com.joseph.proxy;

/**
 * Created by lfwang on 2016/12/9.
 */
public class Proxy implements Animal {

    private Fish fish;

    public Proxy() {
        this.fish = new Fish();
    }

    @Override
    public void name() {
        before();
        fish.name();
        after();
    }

    private void before() {
        System.out.println("before proxy");
    }

    private void after() {
        System.out.println("after proxy");
    }

    public static void main(String... args) {
        Animal animal = new Proxy();
        animal.name();
    }
}
