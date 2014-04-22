package com.hycz.design.pattern.decorator.abstracts.impl;

import com.hycz.design.pattern.decorator.abstracts.Beverage;

/**
 * Created with IntelliJ IDEA.
 * User: shangke
 * Date: 6/13/13
 * Time: 5:48 PM
 * To change this template use File | Settings | File Templates.
 */
public class HouseBlend extends Beverage {

    public HouseBlend(){
        this.description = "House Bleed Beverage";
    }

    @Override
    public double cost() {
        return 0.98;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
