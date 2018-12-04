package top.pcstar.designpattern.strategy.ducks.impl;

import top.pcstar.designpattern.strategy.ducks.Duck;
import top.pcstar.designpattern.strategy.service.impl.FlyNoWay;
import top.pcstar.designpattern.strategy.service.impl.Squeak;

/**
 * 橡皮鸭
 */
public class RubberDuck extends Duck {
    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }

    @Override
    public String display() {
        return "橡皮鸭";
    }
}
