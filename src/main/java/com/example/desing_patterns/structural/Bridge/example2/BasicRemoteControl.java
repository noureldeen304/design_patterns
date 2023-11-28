package com.example.desing_patterns.structural.Bridge.example2;

public class BasicRemoteControl extends RemoteControl {
    public BasicRemoteControl(Device device) {
        super(device);
    }

    @Override
    public void powerOn() {
        device.powerOn();
    }

    @Override
    public void powerOff() {
        device.powerOff();
    }

    @Override
    public void volumeUp() {
        device.volumeUp();
    }

    @Override
    public void volumeDown() {
        device.volumeDown();
    }
}