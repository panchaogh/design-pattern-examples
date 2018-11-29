package top.pcstar.designpattern.proxy.staticproxy.impl;


import top.pcstar.designpattern.proxy.staticproxy.UserDao;

/**
 * 目标类
 *
 * @author panchao
 */
public class UserDaoImpl implements UserDao {

    @Override
    public void save() {
        System.out.println("用户信息保存！");
    }

}