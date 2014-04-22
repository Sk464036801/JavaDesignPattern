package com.hycz.design.pattern.factory.factorymethod;

/**
 * Created with IntelliJ IDEA.
 * User: shangke
 * Date: 6/14/13
 * Time: 11:10 AM
 * To change this template use File | Settings | File Templates.
 */
public interface Pizza {

    public void prepare();
    public void bake();
    public void cut();
    public void box();
}
