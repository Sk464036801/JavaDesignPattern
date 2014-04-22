package com.hycz.design.pattern.Adapter.ClassAdapter;

/**
 * Created with IntelliJ IDEA.
 * User: shangke
 * Date: 6/14/13
 * Time: 5:51 PM
 * To change this template use File | Settings | File Templates.
 */
public class Adapter extends Adaptee implements Target {
    @Override
    public void request() {
        //To change body of implemented methods use File | Settings | File Templates.
        this.specificRequest();
    }
}
