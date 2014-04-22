package com.hycz.design.pattern.strategy;

import com.hycz.design.pattern.strategy.behavioral.FlyBehavior;
import com.hycz.design.pattern.strategy.behavioral.QuackBehavior;

/**
 * Created with IntelliJ IDEA.
 * User: shangke
 * Date: 6/13/13
 * Time: 10:13 AM
 * To change this template use File | Settings | File Templates.
 */
public abstract class Duck {

    public FlyBehavior flyBehavior;
    public QuackBehavior quackBehavior;

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public abstract void dispaly();

    public void swim(){
        System.out.printf("All duck float, even decoys!");
    }
    public void performFly(){
        flyBehavior.fly();

    }
    public void performQuack(){
        quackBehavior.quack();
    }



}
