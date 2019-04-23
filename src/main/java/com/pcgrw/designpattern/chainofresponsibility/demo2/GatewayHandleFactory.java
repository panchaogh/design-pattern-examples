package com.pcgrw.designpattern.chainofresponsibility.demo2;

/**
 * @ClassName GatewayHandleFactory
 * @Description TODO
 * @Author panchao
 * @Date 2019/4/23 10:10
 * @Version 1.0
 */
public class GatewayHandleFactory {
    public static GatewayHandle getGatewayHandle() {
        GatewayHandle ipInterceptHandle = new IpInterceptHandle();
        GatewayHandle blacklistHandle = new BlacklistHandle();
        GatewayHandle loginHandle = new LoginHandle();
        GatewayHandle signatureHandle = new SignatureHandle();
        ipInterceptHandle.setNextHandle(blacklistHandle);
        blacklistHandle.setNextHandle(loginHandle);
        loginHandle.setNextHandle(signatureHandle);
        return ipInterceptHandle;
    }
}
