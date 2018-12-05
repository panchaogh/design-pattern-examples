package top.pcstar.designpattern.factory.factorymethod;

import top.pcstar.designpattern.factory.factorymethod.creator.ChicagoPizzaShop;
import top.pcstar.designpattern.factory.factorymethod.creator.NYStylePizzaShop;
import top.pcstar.designpattern.factory.factorymethod.creator.PizzaShop;

public class CustomerTest {
    public static void main(String[] args) {
        PizzaShop chicagoPizzaShop = new ChicagoPizzaShop();
        chicagoPizzaShop.orderPizza("cheese");
        System.out.println("------------------------------------");
        PizzaShop nystylePizzaShop = new NYStylePizzaShop();
        nystylePizzaShop.orderPizza("cheese");

    }
}
