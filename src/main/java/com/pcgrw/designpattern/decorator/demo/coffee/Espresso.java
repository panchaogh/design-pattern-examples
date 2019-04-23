package com.pcgrw.designpattern.decorator.demo.coffee;

import com.pcgrw.designpattern.decorator.demo.Beverage;

/**
 * 意大利浓咖啡
 */
public class Espresso extends Beverage {

    public Espresso() {
        this.description = "意大利浓咖啡";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
