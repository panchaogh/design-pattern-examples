package top.pcstar.designpattern.singleton;

/**
 * 单例模式-懒汉模式
 * (线程安全，调用效率不高，但是能延时加载)
 */
public class SluggardSingleton {
    private static SluggardSingleton sluggardSingleton;

    private SluggardSingleton() {
    }

    public static synchronized SluggardSingleton getInstance() {
        if (sluggardSingleton == null) {
            sluggardSingleton = new SluggardSingleton();
        }
        return sluggardSingleton;
    }
}
