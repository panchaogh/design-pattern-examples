package top.pcstar.designpattern.observer.custom.service.impl;

import top.pcstar.designpattern.observer.custom.service.DisplayElement;
import top.pcstar.designpattern.observer.custom.service.Observer;
import top.pcstar.designpattern.observer.custom.service.Subject;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    /**
     * 温度
     */
    public float temperature;

    /**
     * 湿度
     */
    public float humidity;

    public Subject subject;

    public CurrentConditionsDisplay(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current Conditions Display:(temperature=" + temperature + ";humidity=" + humidity + ")");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }
}
