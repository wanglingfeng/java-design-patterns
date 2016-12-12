package com.joseph.memento;

/**
 * 原始类
 *
 * Created by lfwang on 2016/12/12.
 */
public class Original {

    private String value;

    public Memento createMemento() {
        return new Memento(value);
    }

    public void restoreMemento(Memento memento) {
        this.value = memento.getValue();
    }

    public Original(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
