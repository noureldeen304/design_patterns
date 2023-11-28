package com.example.desing_patterns.behavioral.state;

public class UppercaseState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println(context.getName().toUpperCase());
        context.setState(new LowercaseState());
    }
}