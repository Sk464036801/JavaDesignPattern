package com.hycz.design.pattern.observer.main;

import com.hycz.design.pattern.observer.interfaces.impl.CurrentConditionsDisplay;
import com.hycz.design.pattern.observer.interfaces.impl.WeatherData;

/**
 * Created with IntelliJ IDEA.
 * User: shangke
 * Date: 6/13/13
 * Time: 4:20 PM
 * To change this template use File | Settings | File Templates.
 */
public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 34.5f);
    }

}
