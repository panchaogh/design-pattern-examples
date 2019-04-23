package com.pcgrw.designpattern.factory.abstractfactory.pizzashop.impl;

import com.pcgrw.designpattern.factory.abstractfactory.factory.impl.NYPizzaIngredientFactory;
import com.pcgrw.designpattern.factory.abstractfactory.pizza.Pizza;
import com.pcgrw.designpattern.factory.abstractfactory.pizza.impl.CheesePizza;
import com.pcgrw.designpattern.factory.abstractfactory.pizza.impl.ClamPizza;
import com.pcgrw.designpattern.factory.abstractfactory.pizzashop.PizzaShop;

public class NYPizzaShop extends PizzaShop {

    public NYPizzaShop() {
        super(new NYPizzaIngredientFactory());
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
