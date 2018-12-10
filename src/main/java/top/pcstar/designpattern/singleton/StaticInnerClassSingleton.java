package top.pcstar.designpattern.singleton;

/**
 * 单例模式-静态内部类式
 * （线程安全，调用效率高，可以延时加载）
 */
public class StaticInnerClassSingleton {
    private StaticInnerClassSingleton() {
    }

    public static StaticInnerClassSingleton getInstance() {
        return SingletonInstance.INSTANCE;
    }

    private static class SingletonInstance {
        private static final StaticInnerClassSingleton INSTANCE = new StaticInnerClassSingleton();
    }

}
