package com.pcgrw.designpattern.command.command;

import com.pcgrw.designpattern.command.device.Light;

/**
 * LightOnCommand
 */
public class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
