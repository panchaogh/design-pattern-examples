package com.pcgrw.designpattern.observer.custom.service.impl;

import com.pcgrw.designpattern.observer.custom.service.DisplayElement;
import com.pcgrw.designpattern.observer.custom.service.Observer;
import com.pcgrw.designpattern.observer.custom.service.Subject;

public class ForecastDisplay implements Observer, DisplayElement {
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

    public Subject subject;

    public ForecastDisplay(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current Conditions Display:(temperature=" + temperature + ";humidity=" + humidity + ";pressure" + pressure + ")");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
