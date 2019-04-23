package com.pcgrw.designpattern.chainofresponsibility.demo2;

/**
 * @ClassName BlacklistHandle
 * @Description 黑名单网关验证
 * @Author panchao
 * @Date 2019/4/23 10:00
 * @Version 1.0
 */
public class BlacklistHandle extends GatewayHandle {

    @Override
    protected boolean handle() {
        System.out.println("---黑名单网关验证---");
        return true;
    }
}
