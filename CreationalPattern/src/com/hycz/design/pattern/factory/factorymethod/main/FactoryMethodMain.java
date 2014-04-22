package com.hycz.design.pattern.factory.factorymethod.main;

import com.hycz.design.pattern.factory.factorymethod.PizzaStore;
import com.hycz.design.pattern.factory.factorymethod.impl.NYPizzaStore;

/**
 * Created with IntelliJ IDEA.
 * User: shangke
 * Date: 6/14/13
 * Time: 11:29 AM
 * To change this template use File | Settings | File Templates.
 */
public class FactoryMethodMain {

    public static void main(String[] args) {
        PizzaStore pizzaStore = new NYPizzaStore();
        pizzaStore.orderPizza("cheese");
    }
}
