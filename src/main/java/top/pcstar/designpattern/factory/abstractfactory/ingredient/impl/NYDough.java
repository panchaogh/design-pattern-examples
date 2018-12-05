package top.pcstar.designpattern.factory.abstractfactory.ingredient.impl;

import top.pcstar.designpattern.factory.abstractfactory.ingredient.Dough;

public class NYDough implements Dough {
    @Override
    public String getName() {
        return "纽约面团";
    }
}
