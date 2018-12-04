package top.pcstar.designpattern.strategy.service.impl;

import top.pcstar.designpattern.strategy.service.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public String quack() {
        return "不会叫";
    }
}
