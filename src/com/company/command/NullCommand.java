package com.company.command;

public class NullCommand implements Command{
    public NullCommand() {}

    @Override
    public void execute() {
        System.out.println("Null command");
    }
}
