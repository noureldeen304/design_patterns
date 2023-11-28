package com.example.desing_patterns.behavioral.state;

public class Demo {
    public static void main(String[] args) {
        Context context = new Context("Hello");
        
        context.doAction(); // Output: hello
        context.doAction(); // Output: HELLO
        context.doAction(); // Output: hello
    }
}