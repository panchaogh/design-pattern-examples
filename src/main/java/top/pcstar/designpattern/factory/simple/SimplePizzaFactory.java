package top.pcstar.designpattern.factory.simple;

import top.pcstar.designpattern.factory.simple.pizza.CheesePizza;
import top.pcstar.designpattern.factory.simple.pizza.GreekPizza;
import top.pcstar.designpattern.factory.simple.pizza.PepperoniPizza;
import top.pcstar.designpattern.factory.simple.pizza.Pizza;

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
