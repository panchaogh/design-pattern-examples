package com.pcgrw.designpattern.factory.abstractfactory.ingredient.impl;

import com.pcgrw.designpattern.factory.abstractfactory.ingredient.Dough;

public class ChicagoDough implements Dough {
    @Override
    public String getName() {
        return "芝加哥面团";
    }
}
