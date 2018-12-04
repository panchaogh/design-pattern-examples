package top.pcstar.designpattern.observer.builtin;

import java.util.Observable;

public class WeatherData extends Observable {
    /**
     * 温度
     */
    private float temperature;

    /**
     * 湿度
     */
    private float humidity;
    /**
     * 压力
     */
    private float pressure;

    /**
     * 测量改变
     */
    public void measurementsChanged() {
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
