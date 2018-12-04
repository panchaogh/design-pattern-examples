package top.pcstar.designpattern.strategy.service.impl;

import top.pcstar.designpattern.strategy.service.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public String fly() {
        return "使用火箭动力飞行";
    }
}
