package top.pcstar.designpattern.factory.simple;

import top.pcstar.designpattern.factory.simple.pizza.Pizza;

/**
 * 披萨店
 */
public class PizzaShop {
    SimplePizzaFactory simplePizzaFactory;

    public PizzaShop(SimplePizzaFactory simplePizzaFactory) {
        this.simplePizzaFactory = simplePizzaFactory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza = simplePizzaFactory.createPizza(type);
        if (pizza != null) {
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } else {
            System.out.println("没有这种类型的披萨");
        }
        return pizza;
    }
}
