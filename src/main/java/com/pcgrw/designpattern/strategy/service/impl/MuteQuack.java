package com.pcgrw.designpattern.strategy.service.impl;

import com.pcgrw.designpattern.strategy.service.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public String quack() {
        return "不会叫";
    }
}
