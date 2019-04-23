package com.pcgrw.designpattern.factory.factorymethod.creator;

import com.pcgrw.designpattern.factory.factorymethod.product.Pizza;

/**
 * 披萨店
 */
public abstract class PizzaShop {
    /**
     * 订购披萨
     *
     * @param type
     * @return
     */
    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        if (pizza != null) {
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } else {
            System.out.println("没有这种类型的披萨!");
        }
        return pizza;
    }

    /**
     * 披萨工厂方法
     *
     * @param type
     * @return
     */
    protected abstract Pizza createPizza(String type);
}
