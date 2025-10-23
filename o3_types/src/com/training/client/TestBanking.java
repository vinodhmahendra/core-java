package com.training.client;

import com.training.model.Account;
import com.training.model.Customer;

public class TestBanking {

	public static void main(String[] args) {
		
		System.out.println("Creating the customer Samarth Vishnu");
		Customer customer= new Customer("Samarth", "Vishnu");
		
		System.out.println("Creating his account with 500.00 balance.");
		customer.setAccount(new Account(500));
		
		System.out.println("Withdraw 150.00");
		customer.getAccount().withdraw(150);
		
		System.out.println("Deposit 22.50");
		customer.getAccount().deposit(22.50);
		
		System.out.println("Withdraw 47.62");
		customer.getAccount().withdraw(47.62);

		System.out.println("Customer [" + customer.getFirstName() +"," + customer.getLastName() +
				" has a balance of " +customer.getAccount().getBalance());
	}

}
