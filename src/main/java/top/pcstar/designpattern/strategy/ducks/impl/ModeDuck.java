package top.pcstar.designpattern.strategy.ducks.impl;

import top.pcstar.designpattern.strategy.ducks.Duck;
import top.pcstar.designpattern.strategy.service.impl.FlyRocketPowered;
import top.pcstar.designpattern.strategy.service.impl.MuteQuack;

public class ModeDuck extends Duck {

    public ModeDuck() {
        flyBehavior = new FlyRocketPowered();
        quackBehavior = new MuteQuack();
    }

    @Override
    public String display() {
        return "模型鸭";
    }
}
