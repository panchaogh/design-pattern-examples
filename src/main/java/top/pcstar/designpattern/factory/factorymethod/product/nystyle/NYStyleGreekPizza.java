package top.pcstar.designpattern.factory.factorymethod.product.nystyle;

import top.pcstar.designpattern.factory.factorymethod.product.Pizza;

/**
 * 纽约希腊比萨
 */
public class NYStyleGreekPizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("准备纽约希腊比萨");
    }

    @Override
    public void bake() {
        System.out.println("烘烤纽约希腊比萨");
    }

    @Override
    public void cut() {
        System.out.println("切片纽约希腊比萨");
    }

    @Override
    public void box() {
        System.out.println("装盒纽约希腊比萨");
    }
}
