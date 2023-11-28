package com.example.desing_patterns.behavioral.chain_of_responsibility;

// Handler interface
public  interface ExpenseApprover {
    void approveExpense(Expense expense);
    void setNextApprover(ExpenseApprover approver);
}
