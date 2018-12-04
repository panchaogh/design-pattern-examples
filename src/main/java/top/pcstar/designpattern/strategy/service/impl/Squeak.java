package top.pcstar.designpattern.strategy.service.impl;

import top.pcstar.designpattern.strategy.service.QuackBehavior;

public class Squeak implements QuackBehavior {
    @Override
    public String quack() {
        return "吱吱叫";
    }
}
