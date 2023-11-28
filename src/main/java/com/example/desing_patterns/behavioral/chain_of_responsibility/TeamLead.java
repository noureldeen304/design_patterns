package com.example.desing_patterns.behavioral.chain_of_responsibility;

// Concrete handlers
public class TeamLead implements ExpenseApprover {
    private ExpenseApprover nextApprover;
    
    @Override
    public void approveExpense(Expense expense) {
        if (expense.getAmount() <= 1000) {
            System.out.println("Expense approved by Team Lead");
        } else if (nextApprover != null) {
            nextApprover.approveExpense(expense);
        }
    }
    
    public void setNextApprover(ExpenseApprover nextApprover) {
        this.nextApprover = nextApprover;
    }
}
