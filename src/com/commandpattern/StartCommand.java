package com.commandpattern;


public class StartCommand<T extends Invoker> implements ICommand{

    T t;

    public StartCommand(T t) {
        this.t=t;
    }

    @Override
    public void execute() {
        t.on();
    }
}
