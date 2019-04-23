package com.pcgrw.designpattern.strategy.ducks;

import com.pcgrw.designpattern.strategy.service.FlyBehavior;
import com.pcgrw.designpattern.strategy.service.QuackBehavior;

public abstract class Duck {
    /**
     * 飞行技能
     */
    protected FlyBehavior flyBehavior;
    /**
     * 鸭叫技能
     */
    protected QuackBehavior quackBehavior;
    /**
     * 鸭叫
     * @Author panchao
     * @Date 10:37 2019/4/23
     * @param
     * @return java.lang.String
     */
    public String performQuack() {
        return quackBehavior.quack();
    }
    /**
     * 飞行
     * @Author panchao
     * @Date 10:38 2019/4/23
     * @param
     * @return java.lang.String
     */
    public String performFly() {
        return flyBehavior.fly();
    }
    /**
     * 游泳
     * @Author panchao
     * @Date 10:38 2019/4/23
     * @param
     * @return java.lang.String
     */
    public String swim() {
        return "游泳";
    }
    /**
     * 外观
     * @Author panchao
     * @Date 10:39 2019/4/23
     * @param
     * @return java.lang.String
     */
    public abstract String display();

    public FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public QuackBehavior getQuackBehavior() {
        return quackBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
