package com.commandpattern;

/**
 * Created by sande on 24-06-2022.
 */
public class Light implements Invoker{


    @Override
    public void on() {
        System.out.println("turn on the light ");
    }

    @Override
    public void off() {
        System.out.println("turn off the light ");
    }
}
