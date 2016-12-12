package com.joseph.mediator;

/**
 * Created by lfwang on 2016/12/12.
 */
public class User2 extends User {

    public User2(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void work() {
        System.out.println("user2 execute.");
    }
}
