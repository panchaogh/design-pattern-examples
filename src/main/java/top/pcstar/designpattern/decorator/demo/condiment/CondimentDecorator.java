package top.pcstar.designpattern.decorator.demo.condiment;

import top.pcstar.designpattern.decorator.demo.Beverage;

/**
 * 调料抽象类
 */
public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}
