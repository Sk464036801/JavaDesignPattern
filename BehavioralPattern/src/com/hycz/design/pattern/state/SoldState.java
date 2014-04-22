package com.hycz.design.pattern.state;

/**
 * Created with IntelliJ IDEA.
 * User: shangke
 * Date: 6/18/13
 * Time: 10:23 AM
 * To change this template use File | Settings | File Templates.
 */
public class SoldState implements State {

    GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        //To change body of implemented methods use File | Settings | File Templates.
        System.out.println("Please wait, we're already giving you a gumball .");
    }

    @Override
    public void ejectQuarter() {
        //To change body of implemented methods use File | Settings | File Templates.
        System.out.println("Sorry, you alrease turned the crank .");
    }

    @Override
    public void turnCrank() {
        //To change body of implemented methods use File | Settings | File Templates.
        System.out.println("Turning twice doesn't get you another gumball .");
    }

    @Override
    public void dispense() {
        //To change body of implemented methods use File | Settings | File Templates.
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() > 0){
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        }else {
            System.out.println("Oops ! out of gumball .");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }
}
