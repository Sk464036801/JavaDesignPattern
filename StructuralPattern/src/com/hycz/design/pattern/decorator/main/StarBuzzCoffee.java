package com.hycz.design.pattern.decorator.main;

import com.hycz.design.pattern.decorator.abstracts.Beverage;
import com.hycz.design.pattern.decorator.abstracts.impl.Espresso;
import com.hycz.design.pattern.decorator.abstracts.impl.HouseBlend;
import com.hycz.design.pattern.decorator.abstracts.impl.Mocha;
import com.hycz.design.pattern.decorator.abstracts.impl.Whip;

/**
 * Created with IntelliJ IDEA.
 * User: shangke
 * Date: 6/13/13
 * Time: 5:52 PM
 * To change this template use File | Settings | File Templates.
 */
public class StarBuzzCoffee {

    public static void main(String[] args) {
        Beverage beverage = new Espresso();

        System.out.println(beverage.getDescription() + ", $ " + beverage.cost());

        Beverage beverage1 = new HouseBlend();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);

        System.out.println(beverage1.getDescription() + ", $ " + beverage1.cost());
    }
}
