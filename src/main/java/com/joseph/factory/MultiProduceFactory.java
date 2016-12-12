package com.joseph.factory;

import com.joseph.factory.product.Sender;
import com.joseph.factory.product.impl.MailSender;
import com.joseph.factory.product.impl.SmsSender;

/**
 * 静态多个工厂方法(不需要实例化工厂类)
 * Created by lfwang on 2016/12/9.
 */
public class MultiProduceFactory {

    public static void main(String... ags) {
        Sender sender = MultiProduceFactory.produceMail();
        sender.send();
    }

    public static Sender produceMail() {
        return new MailSender();
    }

    public static Sender produceSms() {
        return new SmsSender();
    }
}
