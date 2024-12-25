package com.pcgrw.designpattern.facade.subsystem;

public class DvdPlayer {
    public void on() {
        System.out.println("Turn on the DvdPlayer");
    }

    public void off() {
        System.out.println("Turn off the DvdPlayer");
    }

    public void play(String movie) {
        System.out.println("play " + movie);
    }
}
