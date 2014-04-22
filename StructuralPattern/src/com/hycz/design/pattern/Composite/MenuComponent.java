package com.hycz.design.pattern.Composite;

/**
 * Created with IntelliJ IDEA.
 * User: shangke
 * Date: 6/17/13
 * Time: 4:38 PM
 * To change this template use File | Settings | File Templates.
 */
public class MenuComponent {

    public void add(MenuComponent menuComponent) {}
    public void remove(MenuComponent menuComponent){}
    public MenuComponent getChild(int i){
        return null;
    }
    public String getName(){
        return "";
    }
    public String getDescription(){
        return "";
    }
    public double getPrice(){
        return 0;
    }
    public boolean isVegetarian(){
        return false;
    }
    public void print(){
    }

}
