package com.pcgrw.designpattern.factory.abstractfactory.factory.impl;

import com.pcgrw.designpattern.factory.abstractfactory.factory.PizzaIngredientFactory;
import com.pcgrw.designpattern.factory.abstractfactory.ingredient.*;
import com.pcgrw.designpattern.factory.abstractfactory.ingredient.impl.*;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Cheese createCheese() {
        return new ChicagoCheese();
    }

    @Override
    public Dough createDough() {
        return new ChicagoDough();
    }

    @Override
    public Pepperoni createPepperoni() {
        return new ChicagoPepperoni();
    }

    @Override
    public Sauce createSauce() {
        return new ChicagoSauce();
    }

    @Override
    public Clams createClams() {
        return new ChicagoClams();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies[] veggies = {new ChicagoVeggies()};
        return veggies;
    }
}
