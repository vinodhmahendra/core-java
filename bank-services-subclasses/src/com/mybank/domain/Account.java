package com.mybank.domain;

public class Account {

	protected double balance = 0.0;

	protected Account(double initBalance) {
		balance = initBalance;
	}

	public boolean deposit(double amt) {
		balance = balance + amt;
		return true;
	}

	public boolean withdraw(double amt) {
		boolean result = false; // assume operation failure
		if (amt <= balance) {
			balance = balance - amt;
			return true;// operation succeeds
		}
		return result;
	}

	public double getBalance() {
		return balance;
	}
}
