package top.pcstar.designpattern.factory.abstractfactory.pizzashop.impl;

import top.pcstar.designpattern.factory.abstractfactory.factory.impl.ChicagoPizzaIngredientFactory;
import top.pcstar.designpattern.factory.abstractfactory.pizza.Pizza;
import top.pcstar.designpattern.factory.abstractfactory.pizza.impl.CheesePizza;
import top.pcstar.designpattern.factory.abstractfactory.pizza.impl.ClamPizza;
import top.pcstar.designpattern.factory.abstractfactory.pizzashop.PizzaShop;

public class ChicagoPizzaShop extends PizzaShop {

    public ChicagoPizzaShop() {
        super(new ChicagoPizzaIngredientFactory());
    }

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza;
        if ("cheese".equals(type)) {
            pizza = new CheesePizza(pizzaIngredientFactory);
        } else if ("clam".equals(type)) {
            pizza = new ClamPizza(pizzaIngredientFactory);
        } else {
            pizza = null;
        }
        return pizza;
    }
}
