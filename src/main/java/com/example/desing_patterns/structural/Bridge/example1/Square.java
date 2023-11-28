package com.example.desing_patterns.structural.Bridge.example1;

public class Square extends Shape {
    private double side;

    public Square(Renderer renderer, double side) {
        super(renderer);
        this.side = side;
    }

    @Override
    public void draw() {
        renderer.renderSquare(side);
    }
}