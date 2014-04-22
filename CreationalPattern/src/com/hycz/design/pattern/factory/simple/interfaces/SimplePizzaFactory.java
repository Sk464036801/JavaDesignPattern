package com.hycz.design.pattern.factory.simple.interfaces;

/**
 * Created with IntelliJ IDEA.
 * User: shangke
 * Date: 6/14/13
 * Time: 9:50 AM
 * To change this template use File | Settings | File Templates.
 */
public class SimplePizzaFactory {


    /**
     * 这个方法通常声明为一个静态方法，创建一个静态工厂方法。
     * @param type
     * @return
     */
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if ("greek".equals(type)) {
            pizza = new GreekPizza();
        }else if ("cheese".equals(type)){
            pizza = new CheesePizza();
        }else if ("pepperoni".equals(type)){
            pizza = new PepperoniPizza();
        }
        return pizza;
    }
}
