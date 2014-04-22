package com.hycz.design.pattern.strategy;

import com.hycz.design.pattern.strategy.behavioral.FlyNoWings;
import com.hycz.design.pattern.strategy.behavioral.Quack;

/**
 * Created with IntelliJ IDEA.
 * User: shangke
 * Date: 6/13/13
 * Time: 10:55 AM
 * To change this template use File | Settings | File Templates.
 */
public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWings();
        quackBehavior = new Quack();
    }

    @Override
    public void dispaly() {
        System.out.println("I'm a model duck !");
    }
}
