package com.example.desing_patterns.behavioral.template;

public abstract class Game {
    // Template method
    public final void play() {
        initialize();

        // Play the game
        while (!gameOver()) {
            takeTurn();
        }

        displayWinner();
    }

    // Abstract methods to be implemented by subclasses
    protected abstract void initialize();
    protected abstract void takeTurn();
    protected abstract boolean gameOver();
    protected abstract void displayWinner();
}
