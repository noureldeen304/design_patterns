package com.example.desing_patterns.behavioral.state;

public class LowercaseState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println(context.getName().toLowerCase());
        context.setState(new UppercaseState());
    }
}

