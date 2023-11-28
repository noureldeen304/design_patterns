package com.example.desing_patterns.structural.Decorator;

public class Demo {
    public static void main(final String[] args) {
        Car basicCar = new BasicCar();
        basicCar.drive();
        System.out.println("\n*****");

        CarDecorator decorator = new CarDecorator(new BasicCar());
        decorator.drive();
        System.out.println("\n*****");

        SportsCar sportsCar = new SportsCar(new BasicCar());
        sportsCar.drive();
        sportsCar.setTransmissionMode("sport+");
        System.out.println("\n*****");

        Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
        sportsLuxuryCar.drive();
        System.out.println("\n*****");

    }
}
