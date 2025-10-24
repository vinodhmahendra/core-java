package com.training.model;

public class BankAccount {
	
    private String accountNumber;
    private String customerName;
    private double balance;
    
    public BankAccount(String accountNumber, String customerName, double balance) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.balance = balance;
    }
    
    @Override
    public String toString() {
        return "Account: " + accountNumber + " | Name: " + customerName + " | Balance: ₹" + balance;
    }
    
    public double getBalance() { return balance; }
}
