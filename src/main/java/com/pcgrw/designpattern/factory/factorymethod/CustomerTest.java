package com.pcgrw.designpattern.factory.factorymethod;

import com.pcgrw.designpattern.factory.factorymethod.creator.ChicagoPizzaShop;
import com.pcgrw.designpattern.factory.factorymethod.creator.NYStylePizzaShop;
import com.pcgrw.designpattern.factory.factorymethod.creator.PizzaShop;

public class CustomerTest {
    public static void main(String[] args) {
        PizzaShop chicagoPizzaShop = new ChicagoPizzaShop();
        chicagoPizzaShop.orderPizza("cheese");
        System.out.println("------------------------------------");
        PizzaShop nystylePizzaShop = new NYStylePizzaShop();
        nystylePizzaShop.orderPizza("cheese");

    }
}
