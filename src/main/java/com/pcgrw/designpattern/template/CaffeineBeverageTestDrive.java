package com.pcgrw.designpattern.template;

/**
 *
 */
public class CaffeineBeverageTestDrive {
    public static void main(String[] args) {
        Tea tea = new Tea();
        tea.prepareRecipe();
        System.out.println("------------------------");
        Coffee coffee = new Coffee();
        coffee.prepareRecipe();
    }
}
