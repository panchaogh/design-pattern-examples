package com.pcgrw.designpattern.strategy.service.impl;

import com.pcgrw.designpattern.strategy.service.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public String fly() {
        return "不会飞行";
    }
}
