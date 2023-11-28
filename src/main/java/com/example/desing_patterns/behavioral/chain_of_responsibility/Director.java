package com.example.desing_patterns.behavioral.chain_of_responsibility;

// Concrete handler
public class Director implements ExpenseApprover {

    @Override
    public void approveExpense(Expense expense) {
        System.out.println("Expense approved by Director");
    }

    @Override
    public void setNextApprover(ExpenseApprover director) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setNextApprover'");
    }
}
