package com.hycz.design.pattern.Composite;

/**
 * Created with IntelliJ IDEA.
 * User: shangke
 * Date: 6/17/13
 * Time: 4:45 PM
 * To change this template use File | Settings | File Templates.
 */
public class CompositeMain {

    public static void main(String[] args) {

        MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU","Breakfast");
        MenuComponent dinnerMenu = new Menu("DINNER MENU","Lunch");
        MenuComponent cafeMenu = new Menu("CAFE MENU","Dinner");
        MenuComponent dessertMenu = new Menu("DESSERT MENU","Dessert of course!");

        MenuComponent allMenus = new Menu("ALL MENUS", "All menus combeind");

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinnerMenu);
        allMenus.add(cafeMenu);

        //加入菜单项
        dinnerMenu.add(new MenuItem("Pasta","Pasta xxxxx",3.98,true));
        dinnerMenu.add(dessertMenu);

        dessertMenu.add(new MenuItem("Apple pie","Apple pie xxxxxxx",0.98,false));

        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();


    }
}
