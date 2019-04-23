package com.pcgrw.designpattern.chainofresponsibility.demo2;

/**
 * @ClassName IpInterceptHandle
 * @Description Ip访问拦截
 * @Author panchao
 * @Date 2019/4/23 10:07
 * @Version 1.0
 */
public class IpInterceptHandle extends GatewayHandle {
    @Override
    protected boolean handle() {
        System.out.println("---Ip访问拦截---");
        return true;
    }
}
