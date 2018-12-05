package top.pcstar.designpattern.factory.factorymethod.creator;

import top.pcstar.designpattern.factory.factorymethod.product.Pizza;
import top.pcstar.designpattern.factory.factorymethod.product.chicagostyle.ChicagoCheesePizza;
import top.pcstar.designpattern.factory.factorymethod.product.chicagostyle.ChicagoGreekPizza;
import top.pcstar.designpattern.factory.factorymethod.product.chicagostyle.ChicagoPepperoniPizza;

public class ChicagoPizzaShop extends PizzaShop {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza;
        switch (type) {
            case "cheese":
                pizza = new ChicagoCheesePizza();
                break;
            case "greek":
                pizza = new ChicagoGreekPizza();
                break;
            case "pepperoni":
                pizza = new ChicagoPepperoniPizza();
                break;
            default:
                pizza = null;
                break;
        }
        return pizza;
    }
}
