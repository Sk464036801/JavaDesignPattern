package com.hycz.design.pattern.state;

/**
 * Created with IntelliJ IDEA.
 * User: shangke
 * Date: 6/18/13
 * Time: 10:24 AM
 * To change this template use File | Settings | File Templates.
 */
public class SoldOutState implements State {

    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        //To change body of implemented methods use File | Settings | File Templates.
        System.out.println("You can't insert a quarter, the machine is sold out .");
    }

    @Override
    public void ejectQuarter() {
        //To change body of implemented methods use File | Settings | File Templates.
        System.out.println("You can't eject, you haven't insert quarter yet .");
    }

    @Override
    public void turnCrank() {
        //To change body of implemented methods use File | Settings | File Templates.
        System.out.println("You turned ,but there is no gumballs .");
    }

    @Override
    public void dispense() {
        //To change body of implemented methods use File | Settings | File Templates.
        System.out.println("No gumball dispense .");
    }
}
