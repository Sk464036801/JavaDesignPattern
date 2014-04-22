package com.hycz.design.pattern.factory.factorymethod.impl;

import com.hycz.design.pattern.factory.factorymethod.Pizza;

/**
 * Created with IntelliJ IDEA.
 * User: shangke
 * Date: 6/14/13
 * Time: 11:18 AM
 * To change this template use File | Settings | File Templates.
 */
public class NYStypeCheesePizza implements Pizza {
    @Override
    public void prepare() {
        //To change body of implemented methods use File | Settings | File Templates.
        System.out.println("newyork style cheese pizza prepare .");
    }

    @Override
    public void bake() {
        //To change body of implemented methods use File | Settings | File Templates.
        System.out.println("newyork sytle cheese pizza bake .");
    }

    @Override
    public void cut() {
        //To change body of implemented methods use File | Settings | File Templates.
        System.out.println("newyork style cheese pizza cut .");
    }

    @Override
    public void box() {
        //To change body of implemented methods use File | Settings | File Templates.
        System.out.println("newyork style cheese pizza box .");
    }
}
