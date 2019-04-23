package com.pcgrw.designpattern.factory.abstractfactory.ingredient.impl;

import com.pcgrw.designpattern.factory.abstractfactory.ingredient.Pepperoni;

public class ChicagoPepperoni implements Pepperoni {
    @Override
    public String getName() {
        return "芝加哥意大利辣味香肠";
    }
}
