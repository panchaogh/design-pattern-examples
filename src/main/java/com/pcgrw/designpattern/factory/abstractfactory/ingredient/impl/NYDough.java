package com.pcgrw.designpattern.factory.abstractfactory.ingredient.impl;

import com.pcgrw.designpattern.factory.abstractfactory.ingredient.Dough;

public class NYDough implements Dough {
    @Override
    public String getName() {
        return "纽约面团";
    }
}
