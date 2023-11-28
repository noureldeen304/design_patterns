package com.example.desing_patterns.structural.Decorator;

public class SportsCar extends CarDecorator {

    public SportsCar(Car c) {
        super(c);
    }

    @Override
    public void drive() {
        super.drive();
        System.out.print(" And drives fast like a Sports Car");
    }

    public void setTransmissionMode(String transmissionMode) {
        // do something new
    }
}