package com.hycz.design.pattern.factory.simple.interfaces;

/**
 * Created with IntelliJ IDEA.
 * User: shangke
 * Date: 6/14/13
 * Time: 9:45 AM
 * To change this template use File | Settings | File Templates.
 */
public class GreekPizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("prepare greek pizza .");
    }

    @Override
    public void bake() {
        System.out.println("greek pizza bake .");
    }

    @Override
    public void cut() {
        System.out.println("greek pizza cut .");
    }

    @Override
    public void box() {
        System.out.println("greek pizza box .");
    }
}
