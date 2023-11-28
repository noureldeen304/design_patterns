package com.example.desing_patterns.behavioral.Iterator;

// Aggregate interface
interface Aggregate {
    Iterator<Integer> createIterator();
}
