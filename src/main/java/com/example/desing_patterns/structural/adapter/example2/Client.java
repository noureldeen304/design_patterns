package com.example.desing_patterns.structural.adapter.example2;

// Client class
public class Client {

    MediaPlayer mediaPlayer;

    public void setMediaPlayer(MediaPlayer mediaPlayer) {
        this.mediaPlayer = mediaPlayer;
    }

    public void play() {
        mediaPlayer.play();
    }
}