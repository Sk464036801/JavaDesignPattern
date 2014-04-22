package com.hycz.design.pattern.command;

/**
 * Created with IntelliJ IDEA.
 * User: shangke
 * Date: 6/14/13
 * Time: 4:07 PM
 * To change this template use File | Settings | File Templates.
 */
public class LightOffCommand implements Command {

    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        //To change body of implemented methods use File | Settings | File Templates.
        light.off();
    }
}
