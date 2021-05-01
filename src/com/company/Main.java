package com.company;

import com.company.command.*;
import com.company.invoker.RemoteControl;
import com.company.receiver.Door;
import com.company.receiver.Light;
import com.company.receiver.Tv;

public class Main {
    // Main will be receiver actor in this example

    public static void main(String[] args) {

        RemoteControl remoteControl = new RemoteControl(3);

        Light mainLight = new Light();
        Command lightOnCommand = new LightOnCommand(mainLight);
        Command lightOffCommand = new LightOffCommand(mainLight);

        Door mainDoor = new Door();
        Command doorOpenCommand = new DoorOpenCommand(mainDoor);
        Command doorCloseCommand = new DoorCloseCommand(mainDoor);

        Tv mainTv = new Tv();
        Command tvOnCommand = new TvOnCommand(mainTv);
        Command tvOffCommand = new TvOffCommand(mainTv);

        remoteControl.setCommand(0, lightOnCommand, lightOffCommand);
        remoteControl.setCommand(1, doorOpenCommand, doorCloseCommand);
        remoteControl.setCommand(2, tvOnCommand, tvOffCommand);

        System.out.println("===== program start =====");

        remoteControl.pressOnButton(0);
        remoteControl.pressOnButton(1);
        remoteControl.pressOnButton(2);

        remoteControl.pressOffButton(0);
        remoteControl.pressOffButton(1);
        remoteControl.pressOffButton(2);
    }
}
