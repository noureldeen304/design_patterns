package com.example.desing_patterns.structural.Bridge.example2;

public class TV implements Device {
    @Override
    public void powerOn() {
        System.out.println("TV is powered on.");
    }

    @Override
    public void powerOff() {
        System.out.println("TV is powered off.");
    }

    @Override
    public void volumeUp() {
        System.out.println("TV volume is increased.");
    }

    @Override
    public void volumeDown() {
        System.out.println("TV volume is decreased.");
    }

    @Override
    public void selectSource() {
        System.out.println("TV source is selected.");
    }
}
