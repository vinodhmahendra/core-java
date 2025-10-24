package com.training.client;

import com.training.domain.BankAccount;
import com.training.exceptions.InsufficientBalanceException;
import com.training.exceptions.InvalidAmountException;

public class TestBankExceptions {

	public static void main(String[] args) {
		BankAccount account = new BankAccount("AccOO1", "Vinodh Kumar", 5000);
		
		try {
			System.out.println("Attempting to withdraw 6000");
			account.withdraw(6000);
		}catch(InsufficientBalanceException e) {
			System.err.println("Error: "+ e.getMessage());
		} catch (InvalidAmountException e) {
			System.err.println("Error: " + e.getMessage());
		}
        System.out.println("Current balance: " + account.getBalance());
        System.out.println();
	}
}
