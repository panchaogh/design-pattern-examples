package com.pcgrw.designpattern.observer.builtin;

import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer {
    /**
     * 温度
     */
    public float temperature;

    /**
     * 湿度
     */
    public float humidity;

    /**
     * 压力
     */
    private float pressure;

    public Observable observable;

    public ForecastDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            this.pressure = weatherData.getPressure();
            display();
        }
    }

    public void display() {
        System.out.println("Current Conditions Display:(temperature=" + temperature + ";humidity=" + humidity + ";pressure" + pressure + ")");
    }
}
