package com.hycz.design.pattern.state;

/**
 * Created with IntelliJ IDEA.
 * User: shangke
 * Date: 6/18/13
 * Time: 10:19 AM
 * To change this template use File | Settings | File Templates.
 */
public class GumballMachine {

    State noQuarterState;
    State hasQuarterState;
    State soldState;
    State soldOutState;

    State state;
    int count = 0;

    public GumballMachine(int count) {

        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldOutState = new SoldOutState(this);
        soldState = new SoldState(this);

        this.count = count;
        if (count > 0) state = noQuarterState;
    }

    public void releaseBall(){
        System.out.println("A gumball comes rolling out of solt .");
        if (this.count !=0) count -= 1;
    }

    public void insertQuarter(){
        state.insertQuarter();
    }

    public void ejectQuarter(){
        state.ejectQuarter();
    }

    public void trunCrank(){
        state.turnCrank();
        state.dispense();
    }


    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "GumballMachine{" +
                "state=" + state +
                '}';
    }
}
