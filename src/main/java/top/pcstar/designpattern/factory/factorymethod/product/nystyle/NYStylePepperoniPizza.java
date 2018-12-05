package top.pcstar.designpattern.factory.factorymethod.product.nystyle;


import top.pcstar.designpattern.factory.factorymethod.product.Pizza;

/**
 * 纽约香肠比萨
 */
public class NYStylePepperoniPizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("准备纽约香肠比萨");
    }

    @Override
    public void bake() {
        System.out.println("烘烤纽约香肠比萨");
    }

    @Override
    public void cut() {
        System.out.println("切片纽约香肠比萨");
    }

    @Override
    public void box() {
        System.out.println("装盒纽约香肠比萨");
    }
}
