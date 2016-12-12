package com.joseph.adapter;

/**
 * 接口的适配器模式
 *
 * Created by lfwang on 2016/12/9.
 */
public class InterfaceAdapter {

    public static void main(String... args) {
        AdapterSourceable helloSource = new HelloSource();
        helloSource.methodHello();
        helloSource.methodGoodbye();

        System.out.println("------");

        AdapterSourceable goodbyeSource = new GoodbyeSource();
        goodbyeSource.methodHello();
        goodbyeSource.methodGoodbye();
    }

    public interface AdapterSourceable {

        void methodHello();
        void methodGoodbye();
    }

    public static abstract class Wrapper implements AdapterSourceable {

        public void methodHello() {}
        public void methodGoodbye() {}
    }

    public static class HelloSource extends Wrapper {
        public void methodHello() {
            System.out.println("this is hello.");
        }
    }

    public static class GoodbyeSource extends Wrapper {
        public void methodGoodbye() {
            System.out.println("this is goodbye.");
        }
    }
}
