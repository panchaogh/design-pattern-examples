package top.pcstar.designpattern.factory.abstractfactory.ingredient.impl;

import top.pcstar.designpattern.factory.abstractfactory.ingredient.Dough;

public class ChicagoDough implements Dough {
    @Override
    public String getName() {
        return "芝加哥面团";
    }
}
