package com.pcgrw.designpattern.command;

import com.pcgrw.designpattern.command.command.Command;
import com.pcgrw.designpattern.command.command.NoCommand;

/**
 * 遥控器
 */
public class RemoteControl {
    private int commandCount;
    private Command[] onCommands;
    private Command[] offCommands;
    private Command undoCommand;

    public RemoteControl(int commandCount) {
        this.commandCount = commandCount;
        this.onCommands = new Command[commandCount];
        this.offCommands = new Command[commandCount];
        NoCommand noCommand = new NoCommand();
        for (int i = 0; i < commandCount; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }

        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonWasPushed() {
        undoCommand.undo();
    }

    public int getCommandCount() {
        return commandCount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n------------------------Remote Control------------------------\n");
        for (int i = 0; i < onCommands.length; i++) {
            sb.append("[slot ").append(i).append("] ")
                    .append(onCommands[i].getClass().getName()).append(" ")
                    .append(offCommands[i].getClass().getName()).append(" ")
                    .append(undoCommand.getClass().getName()).append("\n");
        }
        return sb.toString();
    }
}
