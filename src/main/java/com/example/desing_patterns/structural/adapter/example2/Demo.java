package com.example.desing_patterns.structural.adapter.example2;

public class Demo {
    public static void main(String[] args) {

        MediaPlayer mediaPlayer = new MediaAdapter(new Mp4Player("video.mp4"));

        Client client = new Client();
        client.setMediaPlayer(mediaPlayer);
        client.play();
    }
}
