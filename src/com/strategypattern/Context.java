package com.strategypattern;

/**
 * Created by sande on 24-06-2022.
 */
public class Context {
    IRemoteControl  remoteControl;
    public void setRemoteControl(IRemoteControl remoteControl){
        this.remoteControl=remoteControl;
    }
    public void on(){
        remoteControl.switchOn();
    }
    public void off(){
        remoteControl.switchOff();
    }
}
