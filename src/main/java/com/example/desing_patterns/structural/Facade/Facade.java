package com.example.desing_patterns.structural.Facade;

public class Facade {
    private SubsystemA subsystemA;
    private SubsystemB subsystemB;
    private SubsystemC subsystemC;

    public Facade() {
        subsystemA = new SubsystemA();
        subsystemB = new SubsystemB();
        subsystemC = new SubsystemC();
    }

    public void performOperation() {
        System.out.println("Facade: Performing complex operation by delegating to subsystems.");
        subsystemA.operationA();
        subsystemB.operationB();
        subsystemC.operationC();
    }
}