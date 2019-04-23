package com.pcgrw.designpattern.chainofresponsibility.demo1;

/**
 * @ClassName AbstractLogger
 * @Description TODO
 * @Author panchao
 * @Date 2019/4/23 9:24
 * @Version 1.0
 */
public abstract class AbstractLogger {
    protected AbstractLogger nextLogger;
    protected int level;
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void logMsg(int level, String msg) {
        if (this.level <= level) {
            write(msg);
        }
        if (nextLogger != null) {
            nextLogger.logMsg(level, msg);
        }
    }

    protected abstract void write(String msg);

}
