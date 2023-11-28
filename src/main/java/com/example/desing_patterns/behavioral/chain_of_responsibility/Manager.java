package com.example.desing_patterns.behavioral.chain_of_responsibility;

public class Manager implements ExpenseApprover {
    private ExpenseApprover nextApprover;
    
    @Override
    public void approveExpense(Expense expense) {
        if (expense.getAmount() <= 5000) {
            System.out.println("Expense approved by Manager");
        } else if (nextApprover != null) {
            nextApprover.approveExpense(expense);
        }
    }
    
    public void setNextApprover(ExpenseApprover nextApprover) {
        this.nextApprover = nextApprover;
    }
}