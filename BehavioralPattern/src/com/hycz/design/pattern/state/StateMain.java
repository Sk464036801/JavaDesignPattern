package com.hycz.design.pattern.state;

/**
 * Created with IntelliJ IDEA.
 * User: shangke
 * Date: 6/18/13
 * Time: 10:56 AM
 * To change this template use File | Settings | File Templates.
 */
public class StateMain {

    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(5);

        System.out.println(gumballMachine.toString());

        gumballMachine.insertQuarter();
        gumballMachine.ejectQuarter();

        System.out.println(gumballMachine.toString());

        gumballMachine.insertQuarter();
        gumballMachine.trunCrank();
        gumballMachine.insertQuarter();
        gumballMachine.ejectQuarter();

        System.out.println(gumballMachine.toString());

        gumballMachine.insertQuarter();
        gumballMachine.trunCrank();
        System.out.println(gumballMachine.toString());
    }
}
