package com.hycz.design.pattern.template;

/**
 * Created with IntelliJ IDEA.
 * User: shangke
 * Date: 6/17/13
 * Time: 11:39 AM
 * To change this template use File | Settings | File Templates.
 */
public class Caffe extends CaffeineBeverage {
    @Override
    public void brew() {
        //To change body of implemented methods use File | Settings | File Templates.
        System.out.println("caffe brew .");
    }

    @Override
    public void addCondiments() {
        //To change body of implemented methods use File | Settings | File Templates.
        System.out.println("caffe add condiments .");
    }
}
