package com.pcgrw.designpattern.observer.builtin;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer {
    /**
     * 温度
     */
    public float temperature;

    /**
     * 湿度
     */
    public float humidity;

    public Observable observable;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    public void display() {
        System.out.println("Current Conditions Display:(temperature=" + temperature + ";humidity=" + humidity + ")");
    }
}
