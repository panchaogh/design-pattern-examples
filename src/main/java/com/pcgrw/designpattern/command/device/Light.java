package com.pcgrw.designpattern.command.device;

/**
 * Light
 */
public class Light {
    private String room;

    public Light(String room) {
        this.room = room;
    }

    public void on() {
        System.out.println(room + " light is on");
    }

    public void off() {
        System.out.println(room + " light is off");
    }
}
