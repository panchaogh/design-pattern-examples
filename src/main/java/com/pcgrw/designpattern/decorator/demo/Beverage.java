package com.pcgrw.designpattern.decorator.demo;

/**
 * 饮料抽象类
 */
public abstract class Beverage {
    /**
     * 描述
     */
    protected String description = "未知饮料";

    public abstract double cost();

    public String getDescription() {
        return description;
    }
}
