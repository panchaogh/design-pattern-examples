package top.pcstar.designpattern.factory.abstractfactory.pizza.impl;

import top.pcstar.designpattern.factory.abstractfactory.factory.PizzaIngredientFactory;
import top.pcstar.designpattern.factory.abstractfactory.pizza.Pizza;

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
