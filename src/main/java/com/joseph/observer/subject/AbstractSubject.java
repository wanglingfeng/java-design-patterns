package com.joseph.observer.subject;

import com.joseph.observer.server.Observer;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by lfwang on 2016/12/12.
 */
public abstract class AbstractSubject implements Subject {

    private Vector<Observer> vector = new Vector<>();

    @Override
    public void add(Observer observer) {
        vector.add(observer);
    }

    @Override
    public void delete(Observer observer) {
        vector.remove(observer);
    }

    @Override
    public void notifyObservers() {
        Enumeration<Observer> enums = vector.elements();

        while (enums.hasMoreElements()) {
            enums.nextElement().update();
        }
    }
}
