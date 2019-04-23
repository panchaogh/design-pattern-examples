package com.pcgrw.designpattern.factory.abstractfactory.pizza.impl;

import com.pcgrw.designpattern.factory.abstractfactory.pizza.Pizza;
import com.pcgrw.designpattern.factory.abstractfactory.factory.PizzaIngredientFactory;

public class ClamPizza extends Pizza {

    public ClamPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        super(pizzaIngredientFactory);
    }


    @Override
    public void prepare() {
        super.name = "蛤蜊披萨";
        cheese = pizzaIngredientFactory.createCheese();
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        clams = pizzaIngredientFactory.createClams();
    }
}
