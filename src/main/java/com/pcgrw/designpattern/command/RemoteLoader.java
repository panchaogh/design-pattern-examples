package com.pcgrw.designpattern.command;

import com.pcgrw.designpattern.command.command.*;
import com.pcgrw.designpattern.command.device.CeilingFan;
import com.pcgrw.designpattern.command.device.Light;
import com.pcgrw.designpattern.command.device.Stereo;

/**
 * RemoteLoader
 */
public class RemoteLoader {
    public static void main(String[] args) {
//        test1();
//        test2();
        test3();
    }


    public static void test1() {
        RemoteControl remoteControl = new RemoteControl(7);
        Light livingRoomLight = new Light("Living room");
        Light kitchenRoomLight = new Light("Kitchen room");
        Stereo livingRoomStereo = new Stereo("Living room");

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

        LightOnCommand kitchenRoomLightOn = new LightOnCommand(kitchenRoomLight);
        LightOffCommand kitchenRoomLightOff = new LightOffCommand(kitchenRoomLight);

        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(livingRoomStereo);
        StereoOffWithCDCommand stereoOffWithCD = new StereoOffWithCDCommand(livingRoomStereo);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenRoomLightOn, kitchenRoomLightOff);
        remoteControl.setCommand(2, stereoOnWithCD, stereoOffWithCD);

        System.out.println(remoteControl);
        for (int i = 0; i < remoteControl.getCommandCount(); i++) {
            remoteControl.onButtonWasPushed(i);
            remoteControl.offButtonWasPushed(i);
            remoteControl.undoButtonWasPushed();
        }
    }

    public static void test2() {
        RemoteControl remoteControl = new RemoteControl(3);
        CeilingFan ceilingFan = new CeilingFan("Living room");
        CeilingFanHighCommand ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFan);
        CeilingFanMediumCommand ceilingFanMediumCommand = new CeilingFanMediumCommand(ceilingFan);
        CeilingFanLowCommand ceilingFanLowCommand = new CeilingFanLowCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);
        remoteControl.setCommand(0, ceilingFanHighCommand, ceilingFanOffCommand);
        remoteControl.setCommand(1, ceilingFanMediumCommand, ceilingFanOffCommand);
        remoteControl.setCommand(2, ceilingFanLowCommand, ceilingFanOffCommand);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();

        remoteControl.onButtonWasPushed(1);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();
    }

    public static void test3() {
        Light livingRoomLight = new Light("Living room");
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        Stereo livingRoomStereo = new Stereo("Living room");
        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(livingRoomStereo);
        StereoOffWithCDCommand stereoOffWithCD = new StereoOffWithCDCommand(livingRoomStereo);
        Command[] partyOn = {livingRoomLightOn, stereoOnWithCD};
        Command[] partyOff = {livingRoomLightOff, stereoOffWithCD};
        RemoteControl remoteControl = new RemoteControl(1);
        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);
        remoteControl.setCommand(0, partyOnMacro, partyOffMacro);
        System.out.println(remoteControl);
        System.out.println("---Pushing macro on---");
        remoteControl.onButtonWasPushed(0);
        System.out.println("---Pushing macro off---");
        remoteControl.offButtonWasPushed(0);
    }
}
