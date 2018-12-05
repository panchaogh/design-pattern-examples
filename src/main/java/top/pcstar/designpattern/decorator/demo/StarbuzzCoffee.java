package top.pcstar.designpattern.decorator.demo;

import top.pcstar.designpattern.decorator.demo.coffee.DarkRoast;
import top.pcstar.designpattern.decorator.demo.coffee.Espresso;
import top.pcstar.designpattern.decorator.demo.coffee.HouseBlend;
import top.pcstar.designpattern.decorator.demo.condiment.Mocha;
import top.pcstar.designpattern.decorator.demo.condiment.Soy;
import top.pcstar.designpattern.decorator.demo.condiment.Whip;

public class StarbuzzCoffee {
    public static void main(String[] args) {
        //订一杯意大利浓咖啡，打印它的描述和价格
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());
        System.out.println();
        //订一杯黑焦咖啡,加双倍摩卡饮料和奶泡
        Beverage beverage1 = new DarkRoast();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);
        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());
        System.out.println();
        //订一杯混合咖啡,调料为豆浆，摩卡，奶泡
        Beverage beverage2 = new HouseBlend();
        beverage2 = new Soy(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
        System.out.println();
    }
}
