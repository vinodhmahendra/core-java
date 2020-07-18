package com.mybank.domain;

public class Account {
	// syntax :attributes: <<modifier>> type variable = [initial value];
	private double balance = 0.0;
	//syntax :  constructor
	/*
	 * 	<<modifier>> class-name (parameter's){
	 * 			statements;
	 * 	}
	 */
	public Account(double initBalance) {
		balance = initBalance;
	}
	
	public void deposit(double amt) {
		balance = balance + amt;
	}
	public void withdraw(double amt) {
		if (amt <= balance) {
			balance = balance - amt;
		}
	}
	public double getBalance() {
		return balance;
	}
}

