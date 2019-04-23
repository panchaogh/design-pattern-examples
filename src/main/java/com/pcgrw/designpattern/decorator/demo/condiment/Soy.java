package com.pcgrw.designpattern.decorator.demo.condiment;

import com.pcgrw.designpattern.decorator.demo.Beverage;

/**
 * 豆浆调料
 */
public class Soy extends CondimentDecorator {
    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + .56;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ",豆浆调料";
    }
}
