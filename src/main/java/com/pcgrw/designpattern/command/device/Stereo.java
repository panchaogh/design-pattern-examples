package com.pcgrw.designpattern.command.device;

/**
 * Stereo
 */
public class Stereo {
    private String room;

    public Stereo(String room) {
        this.room = room;
    }

    public void on() {
        System.out.println(room + " stereo is on");
    }

    public void off() {
        System.out.println(room + " stereo is off");
    }

    public void setCD() {
        System.out.println(room + " stereo is set for CD input");
    }

    public void setVolume(int volume) {
        System.out.println(room + " stereo volume set to " + volume);
    }
}
