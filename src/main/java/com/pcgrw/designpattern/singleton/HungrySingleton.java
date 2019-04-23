package com.pcgrw.designpattern.singleton;

/**
 * 单例模式-恶汉模式
 * (线程安全，调用效率高，但是不能延时加载)
 * 利用这个做法，我们依赖JVM在加载这个类时马上创建此唯一的单件实例。
 * JVM保证在任何线程访问hungrySingleton静态变量之前，一定先创建此实例。
 */
public class HungrySingleton {
    private static HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }
}
