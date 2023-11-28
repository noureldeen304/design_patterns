package com.example.desing_patterns.behavioral.Iterator;

import java.util.List;
import java.util.ArrayList;

// Concrete aggregate class
public class NumberCollection implements Aggregate {
    private List<Integer> numbers;

    public NumberCollection() {
        numbers = new ArrayList<>();
    }

    public void addNumber(int number) {
        numbers.add(number);
    }

    @Override
    public Iterator<Integer> createIterator() {
        return new NumberIterator(numbers);
    }
}
