package com.joseph.prototype;

import java.io.*;

/**
 * 原型模式(将一个对象作为原型，对其进行复制、克隆，产生新对象)
 *
 * Created by lfwang on 2016/12/9.
 */
public class BasicPrototype implements Cloneable, Serializable {

    private static final long serialVersionUID = 1l;

    private String string;

    private SerializableObject obj;

    /**
     * 浅复制
     * @return 创建的对象
     * @throws CloneNotSupportedException
     */
    protected BasicPrototype clone() throws CloneNotSupportedException {
        return (BasicPrototype) super.clone();
    }

    /**
     * 利用串行化来做深复制
     * 实现方式，需要采用流的形式读入当前对象的二进制输入，再写出二进制数据对应的对象
     * @return 创建的对象
     */
    public Object deepClone() throws IOException, ClassNotFoundException {
        // 写入当前对象的二进制流
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);

        // 读出二进制流产生的新对象
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return ois.readObject();
    }

    public SerializableObject getObj() {
        return obj;
    }

    public void setObj(SerializableObject obj) {
        this.obj = obj;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    class SerializableObject implements Serializable {

        private static final long serialVersionUID = 1l;
    }
}
