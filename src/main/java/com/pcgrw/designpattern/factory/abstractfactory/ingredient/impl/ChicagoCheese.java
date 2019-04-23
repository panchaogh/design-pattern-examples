package com.pcgrw.designpattern.factory.abstractfactory.ingredient.impl;

import com.pcgrw.designpattern.factory.abstractfactory.ingredient.Cheese;

public class ChicagoCheese implements Cheese {
    @Override
    public String getName() {
        return "芝加哥奶酪";
    }
}
