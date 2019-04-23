package com.pcgrw.designpattern.strategy.service.impl;

import com.pcgrw.designpattern.strategy.service.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public String fly() {
        return "用翅膀飞行";
    }
}
