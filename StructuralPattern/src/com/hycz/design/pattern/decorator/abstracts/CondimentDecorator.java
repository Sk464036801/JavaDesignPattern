package com.hycz.design.pattern.decorator.abstracts;

/**
 * Created with IntelliJ IDEA.
 * User: shangke
 * Date: 6/13/13
 * Time: 5:40 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class CondimentDecorator extends Beverage {

    /**
     * 调料装饰者类
     * @return
     */
    public abstract String getDescription();
}
