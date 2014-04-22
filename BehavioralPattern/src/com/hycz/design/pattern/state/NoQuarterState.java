package com.hycz.design.pattern.state;

/**
 * Created with IntelliJ IDEA.
 * User: shangke
 * Date: 6/18/13
 * Time: 10:21 AM
 * To change this template use File | Settings | File Templates.
 */
public class NoQuarterState implements State {

    GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        //To change body of implemented methods use File | Settings | File Templates.
        System.out.println("You need insert quarter .");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        //To change body of implemented methods use File | Settings | File Templates.
        System.out.println("You haven't insert quarter .");
    }

    @Override
    public void turnCrank() {
        //To change body of implemented methods use File | Settings | File Templates.
        System.out.println("You truned ,but there is no quarter .");
    }

    @Override
    public void dispense() {
        //To change body of implemented methods use File | Settings | File Templates.
        System.out.println("You need to pay first .");
    }


}
