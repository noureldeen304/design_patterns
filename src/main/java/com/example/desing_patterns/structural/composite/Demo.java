package com.example.desing_patterns.structural.composite;

public class Demo {
    public static void main(String[] args) {
        Employee developer1 = new Developer("John Doe", "Senior Developer");
        Employee developer2 = new Developer("Jane Smith", "Junior Developer");

        Manager manager1 = new Manager("Alice Johnson", "Project Manager");
        manager1.addSubordinate(developer1);
        manager1.addSubordinate(developer2);

        Employee developer3 = new Developer("Bob Williams", "Senior Developer");
        Employee developer4 = new Developer("Sarah Davis", "Junior Developer");

        Manager manager2 = new Manager("Mike Brown", "Department Manager");
        manager2.addSubordinate(developer3);
        manager2.addSubordinate(developer4);
        manager2.addSubordinate(manager1);

        manager2.showEmployeeDetails();
    }
}
