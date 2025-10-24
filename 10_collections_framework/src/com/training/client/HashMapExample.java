package com.training.client;

import java.util.HashMap;

import com.training.model.BankAccount;

public class HashMapExample {
	
	public static void main(String[] args) {
		
		HashMap<String, BankAccount> accounts = new HashMap<>();
		
		accounts.put("ACC001", new BankAccount("ACC001", "Rajesh Kumar", 50000));
		accounts.put("ACC002", new BankAccount("ACC002", "Priya Sharma", 75000));
		accounts.put("ACC003", new BankAccount("ACC003", "Amit Patel", 100000));
		
		System.out.println("Total accouts: " + accounts.size());
		
		
		System.out.println("\n All Acounts");
		for (String accNum: accounts.keySet()) {
			System.out.println(accounts.get(accNum));
		}
		
		
        // Alternative way to iterate
        System.out.println("\nUsing entrySet:");
        for (HashMap.Entry<String, BankAccount> entry : accounts.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " -> " + entry.getValue());
        }
        
        // Calculate total balance across all accounts
        double totalBalance = 0;
        for (BankAccount account : accounts.values()) {
            totalBalance += account.getBalance();
        }
        System.out.println("\nTotal Bank Balance: ₹" + totalBalance);
        
	}

}
