package com.hycz.design.pattern.state;

/**
 * Created with IntelliJ IDEA.
 * User: shangke
 * Date: 6/18/13
 * Time: 10:19 AM
 * To change this template use File | Settings | File Templates.
 */
public interface State {
    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();
}
