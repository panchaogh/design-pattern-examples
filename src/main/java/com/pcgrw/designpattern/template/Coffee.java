package com.pcgrw.designpattern.template;

/**
 *
 */
public class Coffee extends CaffeineBeverage{
    @Override
    void brew() {
        System.out.println("Steeping the coffee");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding sugar and milk");
    }
}
