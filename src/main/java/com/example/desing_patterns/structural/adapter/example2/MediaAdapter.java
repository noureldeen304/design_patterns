package com.example.desing_patterns.structural.adapter.example2;

public class MediaAdapter implements MediaPlayer {
    Mp4Player mp4Player;

    public MediaAdapter(Mp4Player mp4Player) {
        this.mp4Player = mp4Player;
    }

    @Override
    public void play() {
        mp4Player.playMp4();
    }
}
