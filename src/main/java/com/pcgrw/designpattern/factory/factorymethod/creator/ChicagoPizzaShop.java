package com.pcgrw.designpattern.factory.factorymethod.creator;

import com.pcgrw.designpattern.factory.factorymethod.product.Pizza;
import com.pcgrw.designpattern.factory.factorymethod.product.chicagostyle.ChicagoCheesePizza;
import com.pcgrw.designpattern.factory.factorymethod.product.chicagostyle.ChicagoGreekPizza;
import com.pcgrw.designpattern.factory.factorymethod.product.chicagostyle.ChicagoPepperoniPizza;

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
