package com.training.test;

import com.training.model.Account;

public class TestAccount {

	public static void main(String[] args) {
		Account account = new Account(100);
		
		account.deposit(50);
		account.withdraw(147);
		
		System.out.println("Final account balance is : " + account.getBalance());
	}
}
