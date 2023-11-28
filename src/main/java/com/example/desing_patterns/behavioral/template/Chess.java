package com.example.desing_patterns.behavioral.template;

public class Chess extends Game {
    @Override
    protected void initialize() {
        // Initialize the chess game
        System.out.println("Initializing Chess game...");
    }

    @Override
    protected void takeTurn() {
        // Logic for taking a chess turn
        System.out.println("Taking a chess turn...");
    }

    @Override
    protected boolean gameOver() {
        // Check if the chess game is over
        return false;
    }

    @Override
    protected void displayWinner() {
        // Display the winner of the chess game
        System.out.println("Displaying the winner of the chess game...");
    }
}
