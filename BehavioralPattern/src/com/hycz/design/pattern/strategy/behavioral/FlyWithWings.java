package com.hycz.design.pattern.strategy.behavioral;

/**
 * Created with IntelliJ IDEA.
 * User: shangke
 * Date: 6/13/13
 * Time: 10:47 AM
 * To change this template use File | Settings | File Templates.
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying !");
    }
}
