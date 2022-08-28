package com.commandpattern;

/**
 * Created by sande on 25-06-2022.
 */
public class StopCommand<T extends Invoker>  implements ICommand{
    T t;

    public StopCommand(T t) {
        //this.light = light;
        this.t=t;
    }

    @Override
    public void execute() {
        t.off();
    }
}
