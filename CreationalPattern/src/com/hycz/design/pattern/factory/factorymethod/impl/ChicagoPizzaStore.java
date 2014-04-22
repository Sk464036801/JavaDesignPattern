package com.hycz.design.pattern.factory.factorymethod.impl;

import com.hycz.design.pattern.factory.factorymethod.Pizza;
import com.hycz.design.pattern.factory.factorymethod.PizzaStore;

/**
 * Created with IntelliJ IDEA.
 * User: shangke
 * Date: 6/14/13
 * Time: 11:15 AM
 * To change this template use File | Settings | File Templates.
 */
public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        if ("cheese".equals(type)){
            pizza = new ChicagoStyleCheesePizza();
        }
        return pizza;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
