package com.joseph.bridge;

import com.joseph.bridge.db.DataBase;

/**
 * 持有数据库实例的桥对象
 *
 * Created by lfwang on 2016/12/9.
 */
public abstract class Bridge {

    private DataBase dataBase;

    public void im() {
        dataBase.im();
    }

    public DataBase getDataBase() {
        return dataBase;
    }

    public void setDataBase(DataBase dataBase) {
        this.dataBase = dataBase;
    }
}
