package com.hycz.design.pattern.strategy.behavioral;

/**
 * Created with IntelliJ IDEA.
 * User: shangke
 * Date: 6/13/13
 * Time: 10:50 AM
 * To change this template use File | Settings | File Templates.
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack !");
    }
}
