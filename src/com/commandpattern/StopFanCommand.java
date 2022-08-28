package com.commandpattern;

/**
 * Created by sande on 24-06-2022.
 */
public class StopFanCommand implements ICommand{
    Fan fan;

    public StopFanCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
       // fan.stop();
    }
}
