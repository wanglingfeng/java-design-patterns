package com.joseph.iterator;

/**
 * Created by lfwang on 2016/12/12.
 */
public class IteratorTest {

    public static void main(String... args) {
        Collection collection = new MyCollection();
        Iterator it = collection.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
