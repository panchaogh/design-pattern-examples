package top.pcstar.designpattern.factory.simple.pizza;

/**
 * 披萨抽象类
 */
public abstract class Pizza {
    /**
     * 准备
     */
    public abstract void prepare();

    /**
     * 烘烤
     */
    public abstract void bake();

    /**
     * 切片
     */
    public abstract void cut();

    /**
     * 装盒
     */
    public abstract void box();

}
