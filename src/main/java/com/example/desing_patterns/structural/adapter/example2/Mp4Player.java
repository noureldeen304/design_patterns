package com.example.desing_patterns.structural.adapter.example2;

// Adaptee class
public class Mp4Player {

    String fileName;

    public Mp4Player(String fileName) {
        this.fileName = fileName;
    }

    public void playMp4() {
        System.out.println("Playing MP4 file: " + this.fileName);
    }
}