package com.hycz.design.pattern.factory.simple.interfaces;

/**
 * Created with IntelliJ IDEA.
 * User: shangke
 * Date: 6/14/13
 * Time: 9:53 AM
 * To change this template use File | Settings | File Templates.
 */
public class PizzaStore {

    SimplePizzaFactory simplePizzaFactory;

    public PizzaStore(SimplePizzaFactory simplePizzaFactory){
        this.simplePizzaFactory = simplePizzaFactory;
    }

    public Pizza orderPizza(String type){
        Pizza pizza = null;
        pizza = simplePizzaFactory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
