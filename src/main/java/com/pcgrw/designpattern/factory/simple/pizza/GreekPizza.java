package com.pcgrw.designpattern.factory.simple.pizza;

/**
 * 希腊比萨
 */
public class GreekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("准备希腊比萨");
    }

    @Override
    public void bake() {
        System.out.println("烘烤希腊比萨");
    }

    @Override
    public void cut() {
        System.out.println("切片希腊比萨");
    }

    @Override
    public void box() {
        System.out.println("装盒希腊比萨");
    }
}
