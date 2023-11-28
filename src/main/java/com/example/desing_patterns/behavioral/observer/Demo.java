package com.example.desing_patterns.behavioral.observer;

public class Demo {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        TemperatureDisplay temperatureDisplay = new TemperatureDisplay();
        Fan fan = new Fan();

        weatherStation.registerObserver(temperatureDisplay);
        weatherStation.registerObserver(fan);

        weatherStation.setTemperature(20); // Output: Temperature Display: 20.0 degrees Celsius
        // Output: Fan: Turning off the fan

        weatherStation.setTemperature(30); // Output: Temperature Display: 30.0 degrees Celsius
        // Output: Fan: Turning on the fan

        weatherStation.removeObserver(fan);

        weatherStation.setTemperature(15); // Output: Temperature Display: 15.0 degrees Celsius
    }
}
