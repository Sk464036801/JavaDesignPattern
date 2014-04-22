package com.hycz.design.pattern.Adapter.ObjectAdapter;

/**
 * Created with IntelliJ IDEA.
 * User: shangke
 * Date: 6/14/13
 * Time: 5:50 PM
 * To change this template use File | Settings | File Templates.
 */
public class ConcreteTarget implements Target {
    @Override
    public void request() {
        //To change body of implemented methods use File | Settings | File Templates.
        System.out.println("普通类 具有 普通功能...");
    }
}
