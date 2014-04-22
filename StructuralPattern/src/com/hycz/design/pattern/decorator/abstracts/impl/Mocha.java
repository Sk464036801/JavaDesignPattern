package com.hycz.design.pattern.decorator.abstracts.impl;

import com.hycz.design.pattern.decorator.abstracts.Beverage;
import com.hycz.design.pattern.decorator.abstracts.CondimentDecorator;

/**
 * Created with IntelliJ IDEA.
 * User: shangke
 * Date: 6/13/13
 * Time: 5:49 PM
 * To change this template use File | Settings | File Templates.
 */
public class Mocha extends CondimentDecorator {

    Beverage beverage;

    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ",Mocha";  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public double cost() {
        return .20 + beverage.cost();  //To change body of implemented methods use File | Settings | File Templates.
    }
}
