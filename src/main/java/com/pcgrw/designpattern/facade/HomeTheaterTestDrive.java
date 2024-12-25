package com.pcgrw.designpattern.facade;

import com.pcgrw.designpattern.facade.subsystem.Amplifier;
import com.pcgrw.designpattern.facade.subsystem.DvdPlayer;
import com.pcgrw.designpattern.facade.subsystem.Tuner;

public class HomeTheaterTestDrive {
    public static void main(String[] args) {
        Amplifier amplifier = new Amplifier();
        Tuner tuner = new Tuner();
        DvdPlayer dvdPlayer = new DvdPlayer();
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(amplifier, tuner, dvdPlayer);
        homeTheaterFacade.watchMovie("Raiders of the lost art");
        homeTheaterFacade.endMovie();
    }
}
