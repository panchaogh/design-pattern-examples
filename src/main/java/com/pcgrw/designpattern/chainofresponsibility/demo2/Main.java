package com.pcgrw.designpattern.chainofresponsibility.demo2;

/**
 * @ClassName Main
 * @Description TODO
 * @Author panchao
 * @Date 2019/4/23 10:10
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        GatewayHandle gatewayHandle = GatewayHandleFactory.getGatewayHandle();
        gatewayHandle.service();
    }
}
