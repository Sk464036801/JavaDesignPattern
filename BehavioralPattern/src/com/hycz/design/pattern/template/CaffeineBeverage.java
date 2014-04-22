package com.hycz.design.pattern.template;

/**
 * Created with IntelliJ IDEA.
 * User: shangke
 * Date: 6/17/13
 * Time: 11:33 AM
 * To change this template use File | Settings | File Templates.
 */
public abstract class CaffeineBeverage {

    // 模板方法
    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
        hook();

    }

    public void boilWater(){
        System.out.println("boil water.");
    }

    public void pourInCup(){
        System.out.println("pour in cup.");
    }

    public abstract void brew();
    public abstract void addCondiments();
    public void hook(){} // 钩子方法



}
