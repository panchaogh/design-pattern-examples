package com.pcgrw.designpattern.factory.simple;

import com.pcgrw.designpattern.factory.simple.pizza.CheesePizza;
import com.pcgrw.designpattern.factory.simple.pizza.Pizza;
import com.pcgrw.designpattern.factory.simple.pizza.GreekPizza;
import com.pcgrw.designpattern.factory.simple.pizza.PepperoniPizza;

/**
 * 简单披萨工厂
 */
public class SimplePizzaFactory {
    /**
     * 制造披萨
     *
     * @param type
     * @return
     */
    public Pizza createPizza(String type) {
        Pizza pizza;
        switch (type) {
            case "cheese":
                pizza = new CheesePizza();
                break;
            case "greek":
                pizza = new GreekPizza();
                break;
            case "pepperoni":
                pizza = new PepperoniPizza();
                break;
            default:
                pizza = null;
                break;
        }
        return pizza;
    }
}
