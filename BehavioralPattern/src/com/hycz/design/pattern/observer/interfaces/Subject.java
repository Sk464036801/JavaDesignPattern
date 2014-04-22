package com.hycz.design.pattern.observer.interfaces;

/**
 * Created with IntelliJ IDEA.
 * User: shangke
 * Date: 6/13/13
 * Time: 3:47 PM
 * To change this template use File | Settings | File Templates.
 */
public interface Subject {

    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers();


}
