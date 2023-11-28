package com.example.desing_patterns.structural.adapter.example1;

// Client
public class Client {
    private Target charger;

    public void setCharger(Target charger) {
        this.charger = charger;
    }

    public void chargePhone() {
        charger.charge();
    }
}