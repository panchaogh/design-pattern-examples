package com.pcgrw.designpattern.factory.abstractfactory.pizza.impl;

import com.pcgrw.designpattern.factory.abstractfactory.pizza.Pizza;
import com.pcgrw.designpattern.factory.abstractfactory.factory.PizzaIngredientFactory;

public class CheesePizza extends Pizza {
    public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        super(pizzaIngredientFactory);
    }

    @Override
    public void prepare() {
        super.name = "奶酪披萨";
        cheese = pizzaIngredientFactory.createCheese();
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
    }
}
