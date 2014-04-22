package com.hycz.design.pattern.factory.factorymethod;

/**
 * Created with IntelliJ IDEA.
 * User: shangke
 * Date: 6/14/13
 * Time: 11:08 AM
 * To change this template use File | Settings | File Templates.
 */
public abstract class PizzaStore {


    public Pizza orderPizza(String type){
        Pizza pizza = null;
        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    protected abstract Pizza createPizza(String type);

}
