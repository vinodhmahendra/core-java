package com.training.client;

import com.training.model.Account;

public class TestAccount {

	public static void main(String[] args) {
		Account acct = new Account(100);
		acct.deposit(50);
		acct.withdraw(147);
		
		System.out.println("Final account balance is : "+ acct.getBalance());
	}
}
