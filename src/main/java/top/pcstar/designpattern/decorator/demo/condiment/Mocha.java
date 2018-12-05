package top.pcstar.designpattern.decorator.demo.condiment;

import top.pcstar.designpattern.decorator.demo.Beverage;

/**
 * 摩卡调料
 */
public class Mocha extends CondimentDecorator {
    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost()+.20;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+",摩卡调料";
    }
}
