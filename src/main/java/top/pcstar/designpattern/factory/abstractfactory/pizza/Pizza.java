package top.pcstar.designpattern.factory.abstractfactory.pizza;

import top.pcstar.designpattern.factory.abstractfactory.factory.PizzaIngredientFactory;
import top.pcstar.designpattern.factory.abstractfactory.ingredient.*;

public abstract class Pizza {
    protected String name;
    protected Cheese cheese;
    protected Clams clams;
    protected Dough dough;
    protected Pepperoni pepperoni;
    protected Sauce sauce;
    protected Veggies[] veggies;
    protected PizzaIngredientFactory pizzaIngredientFactory;

    public Pizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    /**
     * 准备
     */
    public abstract void prepare();

    /**
     * 烘烤
     */
    public void bake() {
        System.out.println("烘烤比萨");
    }

    /**
     * 切片
     */
    public void cut() {
        System.out.println("切片比萨");
    }

    /**
     * 装盒
     */
    public void box() {
        System.out.println("装盒比萨");
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", cheese=" + (cheese == null ? null : cheese.getName()) +
                ", clams=" + (clams == null ? null : clams.getName()) +
                ", dough=" + (dough == null ? null : dough.getName()) +
                ", pepperoni=" + (pepperoni == null ? null : pepperoni.getName()) +
                ", sauce=" + (sauce == null ? null : sauce.getName()) +
                ", veggies=" + (veggies == null ? null : (veggies[0] == null ? null : veggies[0].getName())) +
                '}';
    }
}
