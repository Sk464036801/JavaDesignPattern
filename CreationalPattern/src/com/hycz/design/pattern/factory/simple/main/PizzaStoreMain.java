package com.hycz.design.pattern.factory.simple.main;

import com.hycz.design.pattern.factory.simple.interfaces.PizzaStore;
import com.hycz.design.pattern.factory.simple.interfaces.SimplePizzaFactory;

/**
 * Created with IntelliJ IDEA.
 * User: shangke
 * Date: 6/14/13
 * Time: 10:02 AM
 * To change this template use File | Settings | File Templates.
 */
public class PizzaStoreMain {
    public static void main(String[] args) {
        SimplePizzaFactory simplePizzaFactory = new SimplePizzaFactory();
        PizzaStore pizzaStore = new PizzaStore(simplePizzaFactory);

        pizzaStore.orderPizza("cheese");
    }
}
