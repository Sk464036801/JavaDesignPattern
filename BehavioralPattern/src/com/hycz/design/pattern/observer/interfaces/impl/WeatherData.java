package com.hycz.design.pattern.observer.interfaces.impl;

import com.hycz.design.pattern.observer.interfaces.Observer;
import com.hycz.design.pattern.observer.interfaces.Subject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: shangke
 * Date: 6/13/13
 * Time: 3:54 PM
 * To change this template use File | Settings | File Templates.
 */
public class WeatherData implements Subject {

    private List<Observer> subjectList ;
    private float tempreature;
    private float humidity;
    private float pressure;

    public WeatherData(){
        subjectList = new ArrayList<Observer>();
    }

    /**
     * 在 concreteSubject WeatherData 中添加一个subjectList 来保存所有的观察者对象。
     * @param subjectList
     */
    public WeatherData(List<Observer> subjectList) {
        this.subjectList = subjectList;
    }

    /**
     * 把注册的观察者对象保存到subjectList 数组中
     * @param observer
     */
    @Override
    public void registerObserver(Observer observer) {
        subjectList.add(observer);
    }

    /**
     * 移除观察者对象
     * @param observer
     */
    @Override
    public void removeObserver(Observer observer) {
        int index = subjectList.indexOf(observer);
        if (index > 0) subjectList.remove(observer);
    }

    /**
     * 当有数据更新时，通知所有的观察者对象去更新数据
     */
    @Override
    public void notifyObservers() {
        for (Observer item : subjectList){
            item.update(tempreature, humidity, pressure);
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float tempreature, float humidity, float pressure){
        this.tempreature = tempreature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    // WeatherData 其他方法
}
