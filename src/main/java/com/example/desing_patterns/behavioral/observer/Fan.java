package com.example.desing_patterns.behavioral.observer;

public class Fan implements Observer {
    @Override
    public void update(float temperature) {
        if (temperature > 25) {
            System.out.println("Fan: Turning on the fan");
        } else {
            System.out.println("Fan: Turning off the fan");
        }
    }
}