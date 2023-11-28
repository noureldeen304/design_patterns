package com.example.desing_patterns.behavioral.chain_of_responsibility;

public class Demo {
    public static void main(String[] args) {
        // Create the chain of handlers
        ExpenseApprover teamLead = new TeamLead();
        ExpenseApprover manager = new Manager();
        ExpenseApprover director = new Director();
        
        teamLead.setNextApprover(manager);
        manager.setNextApprover(director);
        
        // Create an expense report
        Expense expense = new Expense(6000);
        
        // Submit the expense report
        teamLead.approveExpense(expense);
    }
}
