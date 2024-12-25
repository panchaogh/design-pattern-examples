package com.pcgrw.designpattern.facade;

import com.pcgrw.designpattern.facade.subsystem.Amplifier;
import com.pcgrw.designpattern.facade.subsystem.DvdPlayer;
import com.pcgrw.designpattern.facade.subsystem.Tuner;

public class HomeTheaterFacade {
    private Amplifier amplifier;
    private Tuner tuner;
    private DvdPlayer dvdPlayer;

    public HomeTheaterFacade(Amplifier amplifier, Tuner tuner, DvdPlayer dvdPlayer) {
        this.amplifier = amplifier;
        this.tuner = tuner;
        this.dvdPlayer = dvdPlayer;
    }

    public void watchMovie(String movie) {
        amplifier.on();
        tuner.on();
        dvdPlayer.on();
        dvdPlayer.play(movie);
    }

    public void endMovie() {
        amplifier.off();
        tuner.off();
        dvdPlayer.off();
    }
}
