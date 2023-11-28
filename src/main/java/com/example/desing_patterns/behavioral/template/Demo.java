package com.example.desing_patterns.behavioral.template;

public class Demo {
    public static void main(String[] args) {
        Game chessGame = new Chess();
        chessGame.play();

        System.out.println("------------------");

        Game ticTacToeGame = new TicTacToe();
        ticTacToeGame.play();
    }
}