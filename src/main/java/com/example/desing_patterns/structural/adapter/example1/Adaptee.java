package com.example.desing_patterns.structural.adapter.example1;

// Adaptee class
public class Adaptee {
    void connect() {
        System.out.println("European charger connected");
    }

    void supplyElectricity() {
        System.out.println("Supplying electricity with European charger");
    }
}
