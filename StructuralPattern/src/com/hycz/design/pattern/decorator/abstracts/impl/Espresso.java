package com.hycz.design.pattern.decorator.abstracts.impl;

import com.hycz.design.pattern.decorator.abstracts.Beverage;

/**
 * Created with IntelliJ IDEA.
 * User: shangke
 * Date: 6/13/13
 * Time: 5:44 PM
 * To change this template use File | Settings | File Templates.
 */
public class Espresso extends Beverage {

    public Espresso(){
        this.description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
