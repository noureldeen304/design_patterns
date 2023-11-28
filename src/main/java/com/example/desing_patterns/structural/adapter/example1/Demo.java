package com.example.desing_patterns.structural.adapter.example1;

// Usage
public class Demo {
    public static void main(String[] args) {
        Target target = new Adapter(new Adaptee());

        Client client = new Client();
        client.setCharger(target);
        client.chargePhone();
    }
}