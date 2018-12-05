package top.pcstar.designpattern.decorator.demo.condiment;

import top.pcstar.designpattern.decorator.demo.Beverage;

/**
 * 奶泡调料
 */
public class Whip extends CondimentDecorator{
    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost()+.25;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+",奶泡调料";
    }
}
