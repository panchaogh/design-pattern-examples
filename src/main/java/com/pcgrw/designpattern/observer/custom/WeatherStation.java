package com.pcgrw.designpattern.observer.custom;

import com.pcgrw.designpattern.observer.custom.service.impl.CurrentConditionsDisplay;
import com.pcgrw.designpattern.observer.custom.service.impl.ForecastDisplay;
import com.pcgrw.designpattern.observer.custom.service.impl.WeatherData;

public class WeatherStation {
    public static void main(String[] args) throws InterruptedException {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        weatherData.setMeasurements(12, 32, 12);
        weatherData.setMeasurements(24, 43, 21);
    }
}
