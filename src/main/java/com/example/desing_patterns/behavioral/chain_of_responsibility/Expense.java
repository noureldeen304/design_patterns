package com.example.desing_patterns.behavioral.chain_of_responsibility;

// Client class
public class Expense {
    private double amount;

    public Expense(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}
