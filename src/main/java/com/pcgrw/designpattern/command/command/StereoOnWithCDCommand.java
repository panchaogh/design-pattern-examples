package com.pcgrw.designpattern.command.command;

import com.pcgrw.designpattern.command.device.Stereo;

/**
 * StereoOnWithCDCommand
 */
public class StereoOnWithCDCommand implements Command {
    private Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(18);
    }

    @Override
    public void undo() {

    }
}
