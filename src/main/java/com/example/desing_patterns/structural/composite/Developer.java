package com.example.desing_patterns.structural.composite;

public class Developer implements Employee{
    private String name;
    private String position;
    
    public Developer(String name, String position) {
        this.name = name;
        this.position = position;
    }
    
    @Override
    public void showEmployeeDetails() {
        System.out.println("Developer: " + name + ", Position: " + position);
    }
}
