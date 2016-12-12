package com.joseph.factory;

import com.joseph.factory.product.Sender;
import com.joseph.factory.product.impl.MailSender;
import com.joseph.factory.product.impl.SmsSender;

/**
 * 普通工厂类(单个工厂方法；根据类型创建对象，如果传递的字符串出错，则不能创建对象)
 *
 * Created by lfwang on 2016/12/9.
 */
public class BasicFactory {

    public static void main(String... args) {
        BasicFactory factory = new BasicFactory();
        Sender sender = factory.produce("sms");
        sender.send();
    }

    /**
     * 工厂生产类，根据类型，生产不同的sender类
     * @param type 类型
     * @return 生产对象
     */
    public Sender produce(String type) {
        if ("mail".equals(type)) {
            return new MailSender();
        } else if ("sms".equals(type)) {
            return new SmsSender();
        } else {
            System.out.println("请输入正确的类型.");
            return null;
        }
    }
}
