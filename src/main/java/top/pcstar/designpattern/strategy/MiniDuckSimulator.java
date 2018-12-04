package top.pcstar.designpattern.strategy;

import top.pcstar.designpattern.strategy.ducks.Duck;
import top.pcstar.designpattern.strategy.ducks.impl.MallardDuck;
import top.pcstar.designpattern.strategy.ducks.impl.ModeDuck;
import top.pcstar.designpattern.strategy.ducks.impl.RedHeadDuck;
import top.pcstar.designpattern.strategy.ducks.impl.RubberDuck;

/**
 * 鸭子模拟器
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck duck1 = new MallardDuck();
        Duck duck2 = new RedHeadDuck();
        Duck duck3 = new RubberDuck();
        Duck duck4 = new ModeDuck();
        System.out.println(duck1.display() + "---" + duck1.performQuack() + "---" + duck1.swim() + "---" + duck1.performFly());
        System.out.println(duck2.display() + "---" + duck2.performQuack() + "---" + duck2.swim() + "---" + duck2.performFly());
        System.out.println(duck3.display() + "---" + duck3.performQuack() + "---" + duck3.swim() + "---" + duck3.performFly());
        System.out.println(duck4.display() + "---" + duck4.performQuack() + "---" + duck4.swim() + "---" + duck4.performFly());
    }
}
