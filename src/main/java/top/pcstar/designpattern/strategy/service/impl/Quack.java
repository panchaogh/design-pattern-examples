package top.pcstar.designpattern.strategy.service.impl;

import top.pcstar.designpattern.strategy.service.QuackBehavior;

public class Quack implements QuackBehavior {
    @Override
    public String quack() {
        return "呱呱叫";
    }
}
