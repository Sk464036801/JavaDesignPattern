package com.hycz.design.pattern.observer.interfaces.impl;

import com.hycz.design.pattern.observer.interfaces.DisplayElement;
import com.hycz.design.pattern.observer.interfaces.Observer;
import com.hycz.design.pattern.observer.interfaces.Subject;

/**
 * Created with IntelliJ IDEA.
 * User: shangke
 * Date: 6/13/13
 * Time: 4:10 PM
 * To change this template use File | Settings | File Templates.
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float humidity;
    private float tempreature;
    private Subject weatherData;

    /**
     * 构造器需要WeatherData(也就是Subject对象),作为注册之用。
     * @param weatherData
     */
    public CurrentConditionsDisplay(Subject weatherData){
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    /**
     * 显示最近的温度和湿度。
     */
    @Override
    public void display() {
        System.out.println("Current Condition = " + this.tempreature
        + "F degress AND " + this.humidity + "% humidity");
    }

    /**
     * 当update方法调用时，把tempreature 和 humidity保存起来，调用display()方法。
     * @param temp
     * @param humidity
     * @param pressure
     */
    @Override
    public void update(float temp, float humidity, float pressure) {
        this.tempreature = temp;
        this.humidity = humidity;
        display();
    }


}
