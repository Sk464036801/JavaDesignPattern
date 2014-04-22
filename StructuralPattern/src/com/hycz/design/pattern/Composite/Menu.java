package com.hycz.design.pattern.Composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: shangke
 * Date: 6/17/13
 * Time: 4:44 PM
 * To change this template use File | Settings | File Templates.
 */
public class Menu extends MenuComponent {

    private List<MenuComponent> menuComponents = new ArrayList<MenuComponent>();
    private String name;
    private String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);    //To change body of overridden methods use File | Settings | File Templates.
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);    //To change body of overridden methods use File | Settings | File Templates.
    }

    @Override
    public MenuComponent getChild(int i) {
        return menuComponents.get(i);    //To change body of overridden methods use File | Settings | File Templates.
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
    public void print() {
        System.out.println(getName());
        System.out.println(", " + getDescription());
        System.out.println("--------------------");
        Iterator<MenuComponent> iterator = menuComponents.iterator();
        while(iterator.hasNext()){
            MenuComponent menuComponent = iterator.next();
            menuComponent.print();
        }
    }
}
