package com.example.desing_patterns.structural.Bridge.example2;

public abstract class RemoteControl {
    protected Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }

    public abstract void powerOn();

    public abstract void powerOff();

    public abstract void volumeUp();

    public abstract void volumeDown();
}

