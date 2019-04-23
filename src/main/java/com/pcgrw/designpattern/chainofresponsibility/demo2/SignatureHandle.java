package com.pcgrw.designpattern.chainofresponsibility.demo2;

/**
 * @ClassName SignatureHandle
 * @Description 接口验签
 * @Author panchao
 * @Date 2019/4/23 10:06
 * @Version 1.0
 */
public class SignatureHandle extends GatewayHandle {
    @Override
    protected boolean handle() {
        System.out.println("---接口验签---");
        return true;
    }
}
