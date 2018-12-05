package top.pcstar.designpattern.factory.factorymethod.product;

/**
 * 披萨接口
 */
public interface Pizza {
    /**
     * 准备
     */
    void prepare();

    /**
     * 烘烤
     */
    void bake();

    /**
     * 切片
     */
    void cut();

    /**
     * 装盒
     */
    void box();
}
