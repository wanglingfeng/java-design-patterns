package com.joseph.observer.subject;

import com.joseph.observer.server.Observer;

/**
 * Created by lfwang on 2016/12/12.
 */
public interface Subject {

    void add(Observer observer);

    void delete(Observer observer);

    void notifyObservers();

    void operation();
}
