package top.pcstar.designpattern.strategy.ducks.impl;

import top.pcstar.designpattern.strategy.ducks.Duck;
import top.pcstar.designpattern.strategy.service.impl.FlyWithWings;
import top.pcstar.designpattern.strategy.service.impl.Quack;

public class RedHeadDuck extends Duck {

    public RedHeadDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public String display() {
        return "红头鸭";
    }
}
