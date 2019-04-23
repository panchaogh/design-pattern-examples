package com.pcgrw.designpattern.chainofresponsibility.demo1;

/**
 * @ClassName ConsoleLogger
 * @Description TODO
 * @Author panchao
 * @Date 2019/4/23 9:36
 * @Version 1.0
 */
public class ConsoleLogger extends AbstractLogger {
    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String msg) {
        System.out.println("console log:[" + msg + "]");
    }
}
