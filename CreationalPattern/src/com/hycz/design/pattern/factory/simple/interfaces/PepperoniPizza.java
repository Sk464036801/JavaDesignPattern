package com.hycz.design.pattern.factory.simple.interfaces;

/**
 * Created with IntelliJ IDEA.
 * User: shangke
 * Date: 6/14/13
 * Time: 9:47 AM
 * To change this template use File | Settings | File Templates.
 */
public class PepperoniPizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("prepare pepperoni pizza .");
    }

    @Override
    public void bake() {
        System.out.println("pepperoni pizza bake .");
    }

    @Override
    public void cut() {
        System.out.println("pepperoni pizza cut .");
    }

    @Override
    public void box() {
        System.out.println("pepperoni pizza box .");
    }
}
