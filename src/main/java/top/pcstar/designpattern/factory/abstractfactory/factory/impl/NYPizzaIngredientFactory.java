package top.pcstar.designpattern.factory.abstractfactory.factory.impl;

import top.pcstar.designpattern.factory.abstractfactory.factory.PizzaIngredientFactory;
import top.pcstar.designpattern.factory.abstractfactory.ingredient.*;
import top.pcstar.designpattern.factory.abstractfactory.ingredient.impl.*;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Cheese createCheese() {
        return new NYCheese();
    }

    @Override
    public Dough createDough() {
        return new NYDough();
    }

    @Override
    public Pepperoni createPepperoni() {
        return new NYPepperoni();
    }

    @Override
    public Sauce createSauce() {
        return new NYSauce();
    }

    @Override
    public Clams createClams() {
        return new NYClams();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies[] veggies = {new NYVeggies()};
        return veggies;
    }
}
