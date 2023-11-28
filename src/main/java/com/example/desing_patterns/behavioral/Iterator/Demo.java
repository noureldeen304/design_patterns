package com.example.desing_patterns.behavioral.Iterator;

public class Demo {
    public static void main(String[] args) {
        NumberCollection numberCollection = new NumberCollection();
        numberCollection.addNumber(5);
        numberCollection.addNumber(2);
        numberCollection.addNumber(8);

        Iterator<Integer> iterator = numberCollection.createIterator();

        while (iterator.hasNext()) {
            int number = iterator.next();
            System.out.println("Number: " + number);
        }
        // Output: Number: 5
        // Output: Number: 2
        // Output: Number: 8
    }
}