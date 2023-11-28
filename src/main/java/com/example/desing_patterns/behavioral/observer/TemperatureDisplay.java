package com.example.desing_patterns.behavioral.observer;

// Concrete observer classes
public class TemperatureDisplay implements Observer {
    @Override
    public void update(float temperature) {
        System.out.println("Temperature Display: " + temperature + " degrees Celsius");
    }
}