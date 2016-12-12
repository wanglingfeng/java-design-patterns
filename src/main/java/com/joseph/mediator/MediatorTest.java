package com.joseph.mediator;

/**
 * Created by lfwang on 2016/12/12.
 */
public class MediatorTest {

    public static void main(String... args) {
        Mediator mediator = new MyMediator();
        mediator.createMediator();
        mediator.workAll();
    }
}
