package top.pcstar.designpattern.factory.abstractfactory.factory;

import top.pcstar.designpattern.factory.abstractfactory.ingredient.*;

/**
 * 比萨原料工厂接口
 */
public interface PizzaIngredientFactory {
    public Cheese createCheese();

    public Dough createDough();

    public Pepperoni createPepperoni();

    public Sauce createSauce();

    public Clams createClams();

    public Veggies[] createVeggies();
}
