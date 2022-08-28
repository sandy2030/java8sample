package com.commandpattern;

public class Client {
    public static void main(String[] args) {
        Fan fan=new Fan();
        Light light=new Light();
        ICommand turnOnLightCommand=new StartCommand(light);
        HomeAutoRemote remote=new HomeAutoRemote();
        remote.setCommand(turnOnLightCommand);
        remote.pressButton();

        turnOnLightCommand=new StartCommand<>(fan);
        remote.setCommand(turnOnLightCommand);
        remote.pressButton();
    }
}