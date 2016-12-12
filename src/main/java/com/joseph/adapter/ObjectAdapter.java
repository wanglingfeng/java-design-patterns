package com.joseph.adapter;

import com.joseph.adapter.support.Source;
import com.joseph.adapter.support.Targetable;

/**
 * 对象的适配器模式
 * 核心思想：有一个Source类，拥有一个方法，待适配，目标接口时Targetable，
 *          通过ClassAdapter类，将Source的功能扩展到Targetable里
 *
 * Created by lfwang on 2016/12/9.
 */
public class ObjectAdapter implements Targetable {

    public static void main(String... args) {
        Targetable target = new ObjectAdapter(new Source());
        target.originalMethod();
        target.targetableMethod();
    }

    private Source source;

    public ObjectAdapter(Source source) {
        this.source = source;
    }

    @Override
    public void originalMethod() {
        source.originalMethod();
    }

    @Override
    public void targetableMethod() {
        System.out.println("this is targetable method!");
    }
}
