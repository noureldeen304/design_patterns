package com.example.desing_patterns.behavioral.strategy;

public class Demo {
    public static void main(String[] args) {
        int[] array = { 5, 2, 8, 1, 9 };

        Sorter sorter = new Sorter();

        SortingStrategy bubbleSortStrategy = new BubbleSortStrategy();
        SortingStrategy quickSortStrategy = new QuickSortStrategy();

        sorter.setSortingStrategy(bubbleSortStrategy);
        sorter.sortArray(array); // Output: Sorting array using Bubble Sort

        sorter.setSortingStrategy(quickSortStrategy);
        sorter.sortArray(array); // Output: Sorting array using Quick Sort
    }
}