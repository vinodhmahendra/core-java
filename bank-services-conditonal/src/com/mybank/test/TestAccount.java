package com.mybank.test;

import java.util.Date;

import com.mybank.domain.Account;

public class TestAccount {

	//client code
	public static void main(String[] args) {
		// syntax : class-name variable-name = new class-name(argument)
		Account acct = new Account(100.0);// Objects
//		acct.balance = acct.balance + 47.0;
		acct.deposit(47.0);
		acct.withdraw(150.0); // Methods
		
		Date today = new Date(); // Framework and APIs
		System.out.println("Today's Date is : " +today);
		
		System.out.println("Final account balance is " + acct.getBalance());

	}

}
