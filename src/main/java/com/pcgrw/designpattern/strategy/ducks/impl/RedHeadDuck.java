package com.pcgrw.designpattern.strategy.ducks.impl;

import com.pcgrw.designpattern.strategy.ducks.Duck;
import com.pcgrw.designpattern.strategy.service.impl.FlyWithWings;
import com.pcgrw.designpattern.strategy.service.impl.Quack;

public class RedHeadDuck extends Duck {

    public RedHeadDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public String display() {
        return "红头鸭";
    }
}
