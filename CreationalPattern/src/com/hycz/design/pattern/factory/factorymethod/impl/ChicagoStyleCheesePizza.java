package com.hycz.design.pattern.factory.factorymethod.impl;

import com.hycz.design.pattern.factory.factorymethod.Pizza;

/**
 * Created with IntelliJ IDEA.
 * User: shangke
 * Date: 6/14/13
 * Time: 11:24 AM
 * To change this template use File | Settings | File Templates.
 */
public class ChicagoStyleCheesePizza implements Pizza {
    @Override
    public void prepare() {
        //To change body of implemented methods use File | Settings | File Templates.
        System.out.println("chicago style cheese pizza prepare .");
    }

    @Override
    public void bake() {
        //To change body of implemented methods use File | Settings | File Templates.
        System.out.println("chicago sytle cheese pizza bake .");
    }

    @Override
    public void cut() {
        //To change body of implemented methods use File | Settings | File Templates.
        System.out.println("chicago style cheese pizza cut .");
    }

    @Override
    public void box() {
        //To change body of implemented methods use File | Settings | File Templates.
        System.out.println("chicago style cheese pizza box .");
    }
}
