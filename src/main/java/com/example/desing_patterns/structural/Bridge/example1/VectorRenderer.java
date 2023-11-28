package com.example.desing_patterns.structural.Bridge.example1;

public class VectorRenderer implements Renderer {
    @Override
    public void renderCircle(double radius) {
        System.out.println("Rendering a circle of radius " + radius + " using vector graphics.");
    }

    @Override
    public void renderSquare(double side) {
        System.out.println("Rendering a square of side " + side + " using vector graphics.");
    }
}

