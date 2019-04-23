package com.pcgrw.designpattern.proxy.staticproxy.impl;


import com.pcgrw.designpattern.proxy.staticproxy.UserDao;

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
