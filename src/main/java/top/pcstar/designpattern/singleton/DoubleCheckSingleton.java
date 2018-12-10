package top.pcstar.designpattern.singleton;

/**
 * 单例模式-双重检测锁模式
 * （由于JVM底层模型原因，偶尔会出问题，不建议使用）；
 * 不适用于1.4及之前的版本，因为volatile关键字的实现差异而导致的。
 */
public class DoubleCheckSingleton {
    /**
     * volatile确保doubleCheckSingleton变量在多线程下的可见性
     */
    private static volatile DoubleCheckSingleton doubleCheckSingleton;

    private DoubleCheckSingleton() {
    }

    public static DoubleCheckSingleton getInstance() {
        if (doubleCheckSingleton == null) {
            synchronized (DoubleCheckSingleton.class) {
                if (doubleCheckSingleton == null) {
                    doubleCheckSingleton = new DoubleCheckSingleton();
                }
            }
        }
        return doubleCheckSingleton;
    }
}
