package com.example.desing_patterns.structural.Bridge.example2;

public class Demo {
    public static void main(String[] args) {
        Device tv = new TV();
        Device dvdPlayer = new DVDPlayer();

        RemoteControl basicRemote = new BasicRemoteControl(tv);
        RemoteControl advancedRemote = new AdvancedRemoteControl(dvdPlayer);

        basicRemote.powerOn(); // Output: TV is powered on.
        basicRemote.volumeUp(); // Output: TV volume is increased.

        advancedRemote.powerOn(); // Output: DVD player is powered on. DVD player source is selected.
        advancedRemote.volumeDown();// Output: DVD player volume is decreased.
    }
}
