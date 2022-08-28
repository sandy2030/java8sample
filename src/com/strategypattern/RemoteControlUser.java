package com.strategypattern;

/**
 * Created by sande on 24-06-2022.
 */
public class RemoteControlUser {
    public static void main(String[] args) {
        Context context=new Context();

        context.setRemoteControl(new ACRemoteControl());
        context.on();
        context.setRemoteControl(new TVRemoteControl());
        context.on();
    }
}
