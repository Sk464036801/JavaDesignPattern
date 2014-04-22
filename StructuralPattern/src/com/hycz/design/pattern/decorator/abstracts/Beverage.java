package com.hycz.design.pattern.decorator.abstracts;

/**
 * Created with IntelliJ IDEA.
 * User: shangke
 * Date: 6/13/13
 * Time: 5:39 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class Beverage {


    /**
     * 装饰者模式中的基类（原始类，所有的类继承它）
     */
    public String description = "Unknown Beverage";

    public String getDescription(){
        return this.description;
    }

    public abstract double cost();

}
