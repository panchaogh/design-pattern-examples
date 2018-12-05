package top.pcstar.designpattern.decorator.demo.coffee;

import top.pcstar.designpattern.decorator.demo.Beverage;

/**
 * 混合咖啡
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        this.description = "混合咖啡";
    }

    @Override
    public double cost() {
        return .89;
    }
}
