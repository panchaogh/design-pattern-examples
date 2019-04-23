package com.pcgrw.designpattern.chainofresponsibility.demo2;

/**
 * @ClassName LoginHandle
 * @Description 登录网关验证
 * @Author panchao
 * @Date 2019/4/23 10:05
 * @Version 1.0
 */
public class LoginHandle extends GatewayHandle {

    @Override
    protected boolean handle() {
        System.out.println("---登录网关验证---");
        return true;
    }
}
