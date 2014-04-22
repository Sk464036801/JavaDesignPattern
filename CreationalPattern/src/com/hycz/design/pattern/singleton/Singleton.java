package com.hycz.design.pattern.singleton;

/**
 * Created with IntelliJ IDEA.
 * User: shangke
 * Date: 6/11/13
 * Time: 11:21 PM
 * To change this template use File | Settings | File Templates.
 */
public class Singleton {
    private static volatile Singleton instance;
    private Singleton(){}  // 私有的构造函数，只能自己声明自己的对象，不能通过直接new 的方式声明对象。

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) instance = new Singleton();
            }
        }
        return instance;
    }
}
