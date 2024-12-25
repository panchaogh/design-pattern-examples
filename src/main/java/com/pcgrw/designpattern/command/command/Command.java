package com.pcgrw.designpattern.command.command;

/**
 * 命令接口
 */
public interface Command {
    void execute();

    void undo();
}
