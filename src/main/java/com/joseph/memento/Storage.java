package com.joseph.memento;

/**
 * 存储备忘录的类，持有Memento类的实例
 *
 * Created by lfwang on 2016/12/12.
 */
public class Storage {

    private Memento memento;

    public Storage(Memento memento) {
        this.memento = memento;
    }

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
