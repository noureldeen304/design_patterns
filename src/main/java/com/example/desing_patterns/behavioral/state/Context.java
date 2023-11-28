package com.example.desing_patterns.behavioral.state;

public class Context {
    private State state;
    private String name;

    public Context(String name) {
        this.name = name;
        this.state = new LowercaseState();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void doAction() {
        state.doAction(this);
    }

    public String getName() {
        return name;
    }
}
