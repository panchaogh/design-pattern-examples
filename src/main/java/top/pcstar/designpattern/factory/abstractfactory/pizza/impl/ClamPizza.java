package top.pcstar.designpattern.factory.abstractfactory.pizza.impl;

import top.pcstar.designpattern.factory.abstractfactory.factory.PizzaIngredientFactory;
import top.pcstar.designpattern.factory.abstractfactory.pizza.Pizza;

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
