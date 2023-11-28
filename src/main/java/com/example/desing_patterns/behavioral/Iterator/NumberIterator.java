package com.example.desing_patterns.behavioral.Iterator;

import java.util.List;

// Concrete iterator class
public class NumberIterator implements Iterator<Integer> {
    private List<Integer> numbers;
    private int position;

    public NumberIterator(List<Integer> numbers) {
        this.numbers = numbers;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        return position < numbers.size();
    }

    @Override
    public Integer next() {
        if (hasNext()) {
            int number = numbers.get(position);
            position++;
            return number;
        }
        return null;
    }
}
