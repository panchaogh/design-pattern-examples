package com.pcgrw.designpattern.strategy.ducks.impl;

import com.pcgrw.designpattern.strategy.ducks.Duck;
import com.pcgrw.designpattern.strategy.service.impl.FlyWithWings;
import com.pcgrw.designpattern.strategy.service.impl.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public String display() {
        return "绿头鸭";
    }
}
