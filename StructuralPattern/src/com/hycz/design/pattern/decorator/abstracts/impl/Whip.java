package com.hycz.design.pattern.decorator.abstracts.impl;

import com.hycz.design.pattern.decorator.abstracts.Beverage;
import com.hycz.design.pattern.decorator.abstracts.CondimentDecorator;

/**
 * Created with IntelliJ IDEA.
 * User: shangke
 * Date: 6/13/13
 * Time: 5:55 PM
 * To change this template use File | Settings | File Templates.
 */
public class Whip extends CondimentDecorator {

    Beverage beverage;

    public Whip(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public double cost() {
        return .45 + beverage.cost();  //To change body of implemented methods use File | Settings | File Templates.
    }
}
