package com.pcgrw.designpattern.factory.factorymethod.creator;

import com.pcgrw.designpattern.factory.factorymethod.product.Pizza;
import com.pcgrw.designpattern.factory.factorymethod.product.nystyle.NYStyleCheesePizza;
import com.pcgrw.designpattern.factory.factorymethod.product.nystyle.NYStyleGreekPizza;
import com.pcgrw.designpattern.factory.factorymethod.product.nystyle.NYStylePepperoniPizza;

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
