package com.hycz.design.pattern.command;

/**
 * Created with IntelliJ IDEA.
 * User: shangke
 * Date: 6/14/13
 * Time: 4:09 PM
 * To change this template use File | Settings | File Templates.
 */
public class SimpleRemoteControl {
    Command command;

    public void setCommand(Command command){
        this.command = command;
    }

    public void buttonWasPressed(){
        command.execute();
    }
}
