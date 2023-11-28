package com.example.desing_patterns.structural.Bridge.example1;

public abstract class Shape {
    protected Renderer renderer;
    
    public Shape(Renderer renderer) {
        this.renderer = renderer;
    }
    
    public abstract void draw();
}