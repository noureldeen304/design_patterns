package com.example.desing_patterns.behavioral.command;

public class Demo {
    public static void main(String[] args) {
        Light light = new Light();

        Command turnOnCommand = new TurnOnCommand(light);
        Command turnOffCommand = new TurnOffCommand(light);

        RemoteControl remoteControl = new RemoteControl();

        remoteControl.setCommand(turnOnCommand);
        remoteControl.pressButton(); // Output: Light is turned on

        remoteControl.setCommand(turnOffCommand);
        remoteControl.pressButton(); // Output: Light is turned off
    }
}