package com.example.desing_patterns.behavioral.template;

public class TicTacToe extends Game {
    @Override
    protected void initialize() {
        // Initialize the Tic-Tac-Toe game
        System.out.println("Initializing Tic-Tac-Toe game...");
    }

    @Override
    protected void takeTurn() {
        // Logic for taking a Tic-Tac-Toe turn
        System.out.println("Taking a Tic-Tac-Toe turn...");
    }

    @Override
    protected boolean gameOver() {
        // Check if the Tic-Tac-Toe game is over
        return false;
    }

    @Override
    protected void displayWinner() {
        // Display the winner of the Tic-Tac-Toe game
        System.out.println("Displaying the winner of the Tic-Tac-Toe game...");
    }
}