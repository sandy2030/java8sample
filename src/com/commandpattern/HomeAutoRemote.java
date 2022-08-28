package com.commandpattern;

/**
 * Created by sande on 25-06-2022.
 */
public class HomeAutoRemote {
    ICommand command;

    public void setCommand(ICommand command){
        this.command=command;
    }


    public void pressButton(){
        command.execute();
    }
}
