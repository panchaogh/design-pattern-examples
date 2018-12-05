package top.pcstar.designpattern.factory.simple;

public class CustomerTest {
    public static void main(String[] args) {
        SimplePizzaFactory factory = new SimplePizzaFactory();
        PizzaShop pizzaShop = new PizzaShop(factory);
        pizzaShop.orderPizza("cheese");
    }
}
