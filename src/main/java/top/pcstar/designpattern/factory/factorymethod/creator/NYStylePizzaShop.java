package top.pcstar.designpattern.factory.factorymethod.creator;

import top.pcstar.designpattern.factory.factorymethod.product.Pizza;
import top.pcstar.designpattern.factory.factorymethod.product.nystyle.NYStyleCheesePizza;
import top.pcstar.designpattern.factory.factorymethod.product.nystyle.NYStyleGreekPizza;
import top.pcstar.designpattern.factory.factorymethod.product.nystyle.NYStylePepperoniPizza;

public class NYStylePizzaShop extends PizzaShop {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza;
        switch (type) {
            case "cheese":
                pizza = new NYStyleCheesePizza();
                break;
            case "greek":
                pizza = new NYStyleGreekPizza();
                break;
            case "pepperoni":
                pizza = new NYStylePepperoniPizza();
                break;
            default:
                pizza = null;
                break;
        }
        return pizza;
    }
}
