package top.pcstar.designpattern.strategy.service.impl;

import top.pcstar.designpattern.strategy.service.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public String fly() {
        return "用翅膀飞行";
    }
}
