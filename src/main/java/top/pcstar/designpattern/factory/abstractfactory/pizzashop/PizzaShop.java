package top.pcstar.designpattern.factory.abstractfactory.pizzashop;

import top.pcstar.designpattern.factory.abstractfactory.factory.PizzaIngredientFactory;
import top.pcstar.designpattern.factory.abstractfactory.pizza.Pizza;

public abstract class PizzaShop {
    protected PizzaIngredientFactory pizzaIngredientFactory;
    public PizzaShop(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    public Pizza orderPizza(String type){
        Pizza pizza = createPizza(type);
        if (pizza != null) {
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } else {
            System.out.println("没有这种类型的披萨!!");
        }
        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
