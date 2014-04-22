package com.hycz.design.pattern.strategy;

/**
 * Created with IntelliJ IDEA.
 * User: shangke
 * Date: 6/13/13
 * Time: 10:57 AM
 * To change this template use File | Settings | File Templates.
 */
public class MiniDuckSimulator {

    public static void main(String[] args) {
        Duck model = new ModelDuck();
        model.dispaly();
        model.performFly();
        model.performQuack();



    }
}
