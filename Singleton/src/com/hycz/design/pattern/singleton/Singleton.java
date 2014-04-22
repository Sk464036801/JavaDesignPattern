package com.hycz.design.pattern.singleton;

/**
 * Created with IntelliJ IDEA.
 * User: shangke
 * Date: 6/11/13
 * Time: 10:37 PM
 * To change this template use File | Settings | File Templates.
 */
public class Singleton {

    /**
     * volatile 是一个轻量级别的同步关键字，它只有synchronized的可见性，但是没有
     * synchronized的原子性操作。
     */
    private static volatile Singleton instance;  // 使用volatile 加双重锁
    private Singleton(){}

    public static Singleton getInstance(){
        if(instance == null){
            synchronized (Singleton.class){ // 使用synchronized 加锁
                if (instance == null){
                    instance = new Singleton();
                }

            }
        }
        return instance;
    }


}
