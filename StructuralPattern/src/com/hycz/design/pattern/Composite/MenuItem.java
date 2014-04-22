package com.hycz.design.pattern.Composite;

/**
 * Created with IntelliJ IDEA.
 * User: shangke
 * Date: 6/17/13
 * Time: 4:45 PM
 * To change this template use File | Settings | File Templates.
 */
public class MenuItem extends MenuComponent {

    private String name;
    private String description;
    private double price;
    private boolean isVegetarain;

    public MenuItem(String name, String description, double price, boolean vegetarain) {
        this.name = name;
        this.description = description;
        this.price = price;
        isVegetarain = vegetarain;
    }

    @Override
    public String getName() {
        return name;    //To change body of overridden methods use File | Settings | File Templates.
    }

    @Override
    public String getDescription() {
        return description;    //To change body of overridden methods use File | Settings | File Templates.
    }

    @Override
    public double getPrice() {
        return price;    //To change body of overridden methods use File | Settings | File Templates.
    }

    @Override
    public boolean isVegetarian() {
        return isVegetarain;    //To change body of overridden methods use File | Settings | File Templates.
    }

    @Override
    public void print() {
        System.out.print("  " + getName());
        if (isVegetarian()) System.out.printf("(v)");
        System.out.println("price = " + getPrice());
        System.out.println("description = " + getDescription());
    }
}
