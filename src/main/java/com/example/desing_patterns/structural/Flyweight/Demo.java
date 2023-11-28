package com.example.desing_patterns.structural.Flyweight;

public class Demo {
    public static void main(String[] args) {
        Circle redCircle = (Circle) ShapeFactory.getCircle("red");
        redCircle.setRadius(5);
        redCircle.draw(); // Output: Drawing a red circle with radius 5

        Circle blueCircle = (Circle) ShapeFactory.getCircle("blue");
        blueCircle.setRadius(10);
        blueCircle.draw(); // Output: Drawing a blue circle with radius 10

        Circle redCircleAgain = (Circle) ShapeFactory.getCircle("red");
        redCircleAgain.setRadius(15);
        redCircleAgain.draw(); // Output: Drawing a red circle with radius 15
    }
}
