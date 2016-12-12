package com.joseph.factory.product.impl;

import com.joseph.factory.product.Sender;

/**
 * mail发送类实现
 * Created by lfwang on 2016/12/9.
 */
public class MailSender implements Sender {
    @Override
    public void send() {
        System.out.println("this is mail sender.");
    }
}
