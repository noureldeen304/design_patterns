package com.example.desing_patterns.structural.Bridge.example1;


public class Demo {
    public static void main(String[] args) {
        Renderer vectorRenderer = new VectorRenderer();
        Renderer rasterRenderer = new RasterRenderer();

        Shape circle = new Circle(vectorRenderer, 5);
        Shape square = new Square(rasterRenderer, 10);

        circle.draw(); // Output: Rendering a circle of radius 5 using vector graphics.
        square.draw(); // Output: Rendering a square of side 10 using raster graphics.
    }
}
