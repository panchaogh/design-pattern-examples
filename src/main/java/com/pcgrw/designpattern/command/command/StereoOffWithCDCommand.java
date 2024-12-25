package com.pcgrw.designpattern.command.command;

import com.pcgrw.designpattern.command.device.Stereo;

/**
 * StereoOffWithCDCommand
 */
public class StereoOffWithCDCommand implements Command{
    private Stereo stereo;

    public StereoOffWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }

    @Override
    public void undo() {

    }
}
