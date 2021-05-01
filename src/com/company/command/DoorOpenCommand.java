package com.company.command;

import com.company.receiver.Door;

public class DoorOpenCommand implements Command{
    private Door door;

    public DoorOpenCommand(Door door) {
        this.door = door;
    }

    @Override
    public void execute() {
        door.openDoor();
    }
}
