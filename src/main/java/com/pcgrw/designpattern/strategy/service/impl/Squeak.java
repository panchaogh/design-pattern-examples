package com.pcgrw.designpattern.strategy.service.impl;

import com.pcgrw.designpattern.strategy.service.QuackBehavior;

public class Squeak implements QuackBehavior {
    @Override
    public String quack() {
        return "吱吱叫";
    }
}
