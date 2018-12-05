package top.pcstar.designpattern.factory.simple.pizza;

/**
 * 香肠比萨
 */
public class PepperoniPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("准备香肠比萨");
    }

    @Override
    public void bake() {
        System.out.println("烘烤香肠比萨");
    }

    @Override
    public void cut() {
        System.out.println("切片香肠比萨");
    }

    @Override
    public void box() {
        System.out.println("装盒香肠比萨");
    }
}
