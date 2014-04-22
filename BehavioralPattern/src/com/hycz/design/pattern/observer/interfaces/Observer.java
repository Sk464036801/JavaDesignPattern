package com.hycz.design.pattern.observer.interfaces;

/**
 * Created with IntelliJ IDEA.
 * User: shangke
 * Date: 6/13/13
 * Time: 3:48 PM
 * To change this template use File | Settings | File Templates.
 */
public interface Observer {

    public void update(float temp, float humidity, float pressure);
}
