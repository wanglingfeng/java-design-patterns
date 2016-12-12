package com.joseph.bridge;

import com.joseph.bridge.db.impl.MongoDB;
import com.joseph.bridge.db.impl.MySql;

/**
 * Created by lfwang on 2016/12/9.
 */
public class BridgeTests {

    public static void main(String... args) {
        Bridge bridge = new MyBridge();

        // 调用mysql对象
        MySql mySql = new MySql();
        bridge.setDataBase(mySql);
        bridge.im();

        // 调用mongodb对象
        MongoDB mongoDB = new MongoDB();
        bridge.setDataBase(mongoDB);
        bridge.im();
    }
}
