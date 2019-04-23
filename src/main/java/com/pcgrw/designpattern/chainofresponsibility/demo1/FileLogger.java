package com.pcgrw.designpattern.chainofresponsibility.demo1;

/**
 * @ClassName FileLogger
 * @Description TODO
 * @Author panchao
 * @Date 2019/4/23 9:38
 * @Version 1.0
 */
public class FileLogger extends AbstractLogger {
    public FileLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String msg) {
        System.out.println("file log:[" + msg + "]");
    }
}
