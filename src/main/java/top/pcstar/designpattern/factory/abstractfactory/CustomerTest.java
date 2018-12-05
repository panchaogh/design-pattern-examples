package top.pcstar.designpattern.factory.abstractfactory;

import top.pcstar.designpattern.factory.abstractfactory.pizza.Pizza;
import top.pcstar.designpattern.factory.abstractfactory.pizzashop.PizzaShop;
import top.pcstar.designpattern.factory.abstractfactory.pizzashop.impl.ChicagoPizzaShop;
import top.pcstar.designpattern.factory.abstractfactory.pizzashop.impl.NYPizzaShop;

public class CustomerTest {
    public static void main(String[] args) {
        PizzaShop nyPizzaShop = new NYPizzaShop();
        Pizza cheesePizza = nyPizzaShop.orderPizza("cheese");
        System.out.println(cheesePizza);
        System.out.println();
        PizzaShop chicagoPizzaShop = new ChicagoPizzaShop();
        Pizza clamPizza1 = chicagoPizzaShop.orderPizza("clam");
        System.out.println(clamPizza1);
        System.out.println();
    }
}
