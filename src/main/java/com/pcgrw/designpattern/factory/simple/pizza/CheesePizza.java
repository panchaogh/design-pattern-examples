package com.pcgrw.designpattern.factory.simple.pizza;

/**
 * 奶酪披萨
 */
public class CheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("准备奶酪披萨");
    }

    @Override
    public void bake() {
        System.out.println("烘烤奶酪披萨");
    }

    @Override
    public void cut() {
        System.out.println("切片奶酪披萨");
    }

    @Override
    public void box() {
        System.out.println("装盒奶酪披萨");
    }
}
