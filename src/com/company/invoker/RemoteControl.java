package com.company.invoker;

import com.company.command.Command;
import com.company.command.NullCommand;

public class RemoteControl {
    private Command[] onCommands;
    private Command[] offCommands;

    public RemoteControl(int controlButtonNum) {
        onCommands = new Command[controlButtonNum];
        offCommands = new Command[controlButtonNum];

        for (int i = 0; i < controlButtonNum; i++) {
            onCommands[i] = new NullCommand();
            offCommands[i] = new NullCommand();
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void pressOnButton(int slot) {
        onCommands[slot].execute();
    }

    public void pressOffButton(int slot) {
        offCommands[slot].execute();
    }
}
