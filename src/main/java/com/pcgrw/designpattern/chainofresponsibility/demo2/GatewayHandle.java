package com.pcgrw.designpattern.chainofresponsibility.demo2;

/**
 * @ClassName AbstractHandle
 * @Description 通用网关拦截
 * @Author panchao
 * @Date 2019/4/23 9:58
 * @Version 1.0
 */
public abstract class GatewayHandle {
    protected GatewayHandle nextHandle;

    public void setNextHandle(GatewayHandle nextHandle) {
        this.nextHandle = nextHandle;
    }

    protected void service() {
        if (!handle()) {
            return;
        }
        if (nextHandle != null)
            nextHandle.service();
    }

    protected abstract boolean handle();
}
