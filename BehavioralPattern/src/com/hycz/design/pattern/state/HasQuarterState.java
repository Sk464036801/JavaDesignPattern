package com.hycz.design.pattern.state;

/**
 * Created with IntelliJ IDEA.
 * User: shangke
 * Date: 6/18/13
 * Time: 10:22 AM
 * To change this template use File | Settings | File Templates.
 */
public class HasQuarterState implements State {

    GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        //To change body of implemented methods use File | Settings | File Templates.
        System.out.println("You can't  insert another quarter .");
    }

    @Override
    public void ejectQuarter() {
        //To change body of implemented methods use File | Settings | File Templates.
        System.out.println("quarter returned .");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        //To change body of implemented methods use File | Settings | File Templates.
        System.out.println("You returned .");
        gumballMachine.setState(gumballMachine.getSoldState());
    }

    @Override
    public void dispense() {
        //To change body of implemented methods use File | Settings | File Templates.
        System.out.println("no gumball dispense .");
    }
}
