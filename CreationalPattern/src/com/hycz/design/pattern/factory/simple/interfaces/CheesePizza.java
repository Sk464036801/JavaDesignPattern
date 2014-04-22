package com.hycz.design.pattern.factory.simple.interfaces;

/**
 * Created with IntelliJ IDEA.
 * User: shangke
 * Date: 6/14/13
 * Time: 9:43 AM
 * To change this template use File | Settings | File Templates.
 */
public class CheesePizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("prepare cheese pizza .");
    }

    @Override
    public void bake() {
        System.out.println("cheese pizza bake .");
    }

    @Override
    public void cut() {
        System.out.println("cheese pizza cut .");
    }

    @Override
    public void box() {
        System.out.println("cheese pizza box .");
    }
}
