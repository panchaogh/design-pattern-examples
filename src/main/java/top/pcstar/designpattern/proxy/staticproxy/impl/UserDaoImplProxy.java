package top.pcstar.designpattern.proxy.staticproxy.impl;


import top.pcstar.designpattern.proxy.staticproxy.UserDao;

/**
 * 代理类
 *
 * @author panchao
 */
public class UserDaoImplProxy implements UserDao {
    //接收保存目标对象
    private UserDao target;

    public UserDaoImplProxy(UserDao target) {
        super();
        this.target = target;
    }

    public UserDao getTarget() {
        return target;
    }

    public void setTarget(UserDao target) {
        this.target = target;
    }

    @Override
    public void save() {
        System.out.println("开始事务...");
        //执行目标对象
        target.save();
        System.out.println("提交事务...");
    }

}
