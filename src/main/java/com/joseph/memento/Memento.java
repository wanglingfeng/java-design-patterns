package com.joseph.memento;

/**
 * 备忘录类
 *
 * Created by lfwang on 2016/12/12.
 */
public class Memento {

    private String value;

    public Memento(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
