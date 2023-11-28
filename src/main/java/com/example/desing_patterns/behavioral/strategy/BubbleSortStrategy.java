package com.example.desing_patterns.behavioral.strategy;

// Concrete strategy classes
public class BubbleSortStrategy implements SortingStrategy {
    @Override
    public void sort(int[] array) {
        System.out.println("Sorting array using Bubble Sort");
        // Implementation of Bubble Sort algorithm
    }
}
