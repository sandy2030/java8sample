package com.strategypattern;

/**
 * Created by sande on 24-06-2022.
 */
public class TVRemoteControl implements IRemoteControl {
    @Override
    public void switchOn() {
        System.out.println("switch on TV ...");
    }

    @Override
    public void switchOff() {
        System.out.println("switch off TV ...");
    }
}
