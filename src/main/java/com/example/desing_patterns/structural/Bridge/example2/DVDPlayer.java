package com.example.desing_patterns.structural.Bridge.example2;

public class DVDPlayer implements Device {
    @Override
    public void powerOn() {
        System.out.println("DVD player is powered on.");
    }

    @Override
    public void powerOff() {
        System.out.println("DVD player is powered off.");
    }

    @Override
    public void volumeUp() {
        System.out.println("DVD player volume is increased.");
    }

    @Override
    public void volumeDown() {
        System.out.println("DVD player volume is decreased.");
    }

    @Override
    public void selectSource() {
        System.out.println("DVD player source is selected.");
    }
}
