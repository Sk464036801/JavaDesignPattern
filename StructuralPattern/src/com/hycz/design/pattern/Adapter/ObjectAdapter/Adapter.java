package com.hycz.design.pattern.Adapter.ObjectAdapter;

/**
 * Created with IntelliJ IDEA.
 * User: shangke
 * Date: 6/14/13
 * Time: 5:51 PM
 * To change this template use File | Settings | File Templates.
 */
public class Adapter implements Target {

    Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        //To change body of implemented methods use File | Settings | File Templates.
        adaptee.specificRequest();
    }
}
