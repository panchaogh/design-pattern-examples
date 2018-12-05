package top.pcstar.designpattern.factory.factorymethod.product.chicagostyle;

import top.pcstar.designpattern.factory.factorymethod.product.Pizza;

/**
 * 芝加哥希腊比萨
 */
public class ChicagoGreekPizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("准备芝加哥希腊比萨");
    }

    @Override
    public void bake() {
        System.out.println("烘烤芝加哥希腊比萨");
    }

    @Override
    public void cut() {
        System.out.println("切片芝加哥希腊比萨");
    }

    @Override
    public void box() {
        System.out.println("装盒芝加哥希腊比萨");
    }
}
