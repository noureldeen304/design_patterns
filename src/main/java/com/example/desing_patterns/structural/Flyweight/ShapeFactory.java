package com.example.desing_patterns.structural.Flyweight;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {
    private static Map<String, Shape> shapeCache = new HashMap<>();
    
    public static Shape getCircle(String color) {
        Circle circle = (Circle) shapeCache.get(color);
        
        if (circle == null) {
            circle = new Circle(color);
            shapeCache.put(color, circle);
            System.out.println("Creating new circle with color: " + color);
        }
        
        return circle;
    }
}