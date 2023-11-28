package com.example.desing_patterns.structural.Flyweight;

class Circle implements Shape {
    private String color;
    private int radius;
    
    public Circle(String color) {
        this.color = color;
    }
    
    public void setRadius(int radius) {
        this.radius = radius;
    }
    
    @Override
    public void draw() {
        System.out.println("Drawing a " + color + " circle with radius " + radius);
    }
}
