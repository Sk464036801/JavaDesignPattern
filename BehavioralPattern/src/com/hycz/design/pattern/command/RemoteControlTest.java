package com.hycz.design.pattern.command;

/**
 * Created with IntelliJ IDEA.
 * User: shangke
 * Date: 6/14/13
 * Time: 4:11 PM
 * To change this template use File | Settings | File Templates.
 */
public class RemoteControlTest {
    //命令模式的客户端

    public static void main(String[] args) {
        Light light = new Light(); //命令接收者
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();// 调用者
        simpleRemoteControl.setCommand(lightOnCommand);// 把命令传给调用者
        simpleRemoteControl.buttonWasPressed();
    }
}
