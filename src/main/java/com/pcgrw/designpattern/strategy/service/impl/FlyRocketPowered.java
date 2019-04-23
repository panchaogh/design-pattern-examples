package com.pcgrw.designpattern.strategy.service.impl;

import com.pcgrw.designpattern.strategy.service.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public String fly() {
        return "使用火箭动力飞行";
    }
}
