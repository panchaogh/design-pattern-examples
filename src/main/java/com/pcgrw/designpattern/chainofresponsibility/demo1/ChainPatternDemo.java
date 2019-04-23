package com.pcgrw.designpattern.chainofresponsibility.demo1;

/**
 * @ClassName ChainPatternDemo
 * @Description TODO
 * @Author panchao
 * @Date 2019/4/23 9:40
 * @Version 1.0
 */
public class ChainPatternDemo {
    private static AbstractLogger getChainOfLoggers() {
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);
        return errorLogger;
    }

    public static void main(String[] args) {
        AbstractLogger chainOfLoggers = ChainPatternDemo.getChainOfLoggers();
        chainOfLoggers.logMsg(AbstractLogger.ERROR,"打印日志");
        System.out.println("-----------------------------------------");
        chainOfLoggers.logMsg(AbstractLogger.DEBUG,"打印日志");
        System.out.println("-----------------------------------------");
        chainOfLoggers.logMsg(AbstractLogger.INFO,"打印日志");
    }
}
