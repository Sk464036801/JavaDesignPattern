package com.hycz.design.pattern.strategy.behavioral;

/**
 * Created with IntelliJ IDEA.
 * User: shangke
 * Date: 6/13/13
 * Time: 10:49 AM
 * To change this template use File | Settings | File Templates.
 */
public class FlyNoWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm can't fly !");
    }
}
