package com.pcgrw.designpattern.strategy.ducks.impl;

import com.pcgrw.designpattern.strategy.ducks.Duck;
import com.pcgrw.designpattern.strategy.service.impl.FlyRocketPowered;
import com.pcgrw.designpattern.strategy.service.impl.MuteQuack;

public class ModeDuck extends Duck {

    public ModeDuck() {
        flyBehavior = new FlyRocketPowered();
        quackBehavior = new MuteQuack();
    }

    @Override
    public String display() {
        return "模型鸭";
    }
}
