package com.training.domain;

import com.training.exceptions.InsufficientBalanceException;
import com.training.exceptions.InvalidAmountException;

public class BankAccount {
	private String accountNumber;
	private String accountHolder;
	private double balance;

	public BankAccount(String accountNumber, String accountHolder, double balance) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.balance = balance;
	}
	
	public void withdraw(double amount) throws InvalidAmountException, InsufficientBalanceException {
		if ( amount <= 0 ) {
			throw new InvalidAmountException("Amount must be greater than zero.");
		}
		
		if ( amount > balance ) {
			throw new InsufficientBalanceException(
					"Insufficient balance. Available: " + balance + ", Requested: " + amount
					);
		}
		
		balance -= amount;
		System.out.println("Withdrawal successful. New balance: " + balance);
	}

	public void deposit(double amount) throws InvalidAmountException {
		if (amount <= 0) {
			throw new InvalidAmountException("Deposit amount must be positive");
		}

		balance += amount;
		System.out.println("Deposit successful. New balance: " + balance);
	}
	
	public double getBalance() {
		return balance;
	}
	public String getAccountHolder() {
		return accountHolder;
	}

}
