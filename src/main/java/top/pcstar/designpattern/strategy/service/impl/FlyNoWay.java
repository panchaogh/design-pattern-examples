package top.pcstar.designpattern.strategy.service.impl;

import top.pcstar.designpattern.strategy.service.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public String fly() {
        return "不会飞行";
    }
}
