package com.pcgrw.designpattern.chainofresponsibility.demo1;

/**
 * @ClassName ErrorLogger
 * @Description TODO
 * @Author panchao
 * @Date 2019/4/23 9:37
 * @Version 1.0
 */
public class ErrorLogger extends AbstractLogger {
    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String msg) {
        System.out.println("error log:[" + msg + "]");
    }
}
