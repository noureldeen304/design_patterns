package com.example.desing_patterns.structural.Bridge.example2;

public class AdvancedRemoteControl extends RemoteControl {
    public AdvancedRemoteControl(Device device) {
        super(device);
    }

    @Override
    public void powerOn() {
        device.powerOn();
        device.selectSource();
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