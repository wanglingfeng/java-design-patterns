package com.joseph.observer;

import com.joseph.observer.server.impl.Observer1;
import com.joseph.observer.server.impl.Observer2;
import com.joseph.observer.subject.Subject;
import com.joseph.observer.subject.impl.MySubject;

/**
 * Created by lfwang on 2016/12/12.
 */
public class ObserverTest {

    public static void main(String... args) {
        Subject sub = new MySubject();
        sub.add(new Observer1());
        sub.add(new Observer2());

        sub.operation();
    }
}
