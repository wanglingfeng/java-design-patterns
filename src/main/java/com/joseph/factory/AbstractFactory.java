package com.joseph.factory;

import com.joseph.factory.product.Sender;
import com.joseph.factory.product.impl.MailSender;
import com.joseph.factory.product.impl.SmsSender;

/**
 * 抽象工厂模式(增加一个功能：只需做一个Sender接口实现类，同时对应一个工厂类，实现Provider接口。
 *              不会改动原代码，拓展性较好)
 *
 * Created by lfwang on 2016/12/9.
 */
public class AbstractFactory {

    public static void main(String... args) {
        Provider provider = new MailFactory();
        Sender sender = provider.produce();
        sender.send();
    }

    public interface Provider {
        Sender produce();
    }

    public static class MailFactory implements Provider {

        @Override
        public Sender produce() {
            return new MailSender();
        }
    }

    public static class SmsFactory implements Provider {

        @Override
        public Sender produce() {
            return new SmsSender();
        }
    }
}
