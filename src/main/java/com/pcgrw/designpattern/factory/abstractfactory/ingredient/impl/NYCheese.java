package com.pcgrw.designpattern.factory.abstractfactory.ingredient.impl;

import com.pcgrw.designpattern.factory.abstractfactory.ingredient.Cheese;

public class NYCheese implements Cheese {
    @Override
    public String getName() {
        return "纽约奶酪";
    }
}
