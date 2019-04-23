package com.pcgrw.designpattern.strategy.service.impl;

import com.pcgrw.designpattern.strategy.service.QuackBehavior;

public class Quack implements QuackBehavior {
    @Override
    public String quack() {
        return "呱呱叫";
    }
}
