package com.commandpattern;

/**
 * Created by sande on 24-06-2022.
 */
public class StartFanCommand  implements ICommand{
    Fan fan;

    public StartFanCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
      //  fan.start();
    }
}
