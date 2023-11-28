package com.example.desing_patterns.structural.adapter.example1;

// Adapter class
public class Adapter implements Target {
    private Adaptee europeanCharger;

    public Adapter(Adaptee europeanCharger) {
        this.europeanCharger = europeanCharger;
    }

    @Override
    public void charge() {
        europeanCharger.connect();
        europeanCharger.supplyElectricity();
    }
}