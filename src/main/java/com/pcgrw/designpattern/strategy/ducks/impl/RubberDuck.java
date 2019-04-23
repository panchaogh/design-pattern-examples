package com.pcgrw.designpattern.strategy.ducks.impl;

import com.pcgrw.designpattern.strategy.ducks.Duck;
import com.pcgrw.designpattern.strategy.service.impl.FlyNoWay;
import com.pcgrw.designpattern.strategy.service.impl.Squeak;

/**
 * 橡皮鸭
 */
public class RubberDuck extends Duck {
    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }

    @Override
    public String display() {
        return "橡皮鸭";
    }
}
