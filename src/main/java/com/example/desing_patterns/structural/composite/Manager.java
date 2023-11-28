package com.example.desing_patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Manager implements Employee {
    private String name;
    private String position;
    private List<Employee> subordinates;
    
    public Manager(String name, String position) {
        this.name = name;
        this.position = position;
        this.subordinates = new ArrayList<>();
    }
    
    public void addSubordinate(Employee employee) {
        subordinates.add(employee);
    }
    
    public void removeSubordinate(Employee employee) {
        subordinates.remove(employee);
    }
    
    @Override
    public void showEmployeeDetails() {
        System.out.println("Manager: " + name + ", Position: " + position);
        System.out.println("Subordinates:");
        for (Employee employee : subordinates) {
            employee.showEmployeeDetails();
        }
    }
}