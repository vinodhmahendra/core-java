package com.training.client;

import java.util.HashSet;

public class HashSetExample {
	
	public static void main(String[] args) {
		
		HashSet<String> accountNumbers  = new HashSet<String>();
		
        // Adding account numbers
        System.out.println("Adding ACC001: " + accountNumbers.add("ACC001"));  // true
        System.out.println("Adding ACC002: " + accountNumbers.add("ACC002"));  // true
        System.out.println("Adding ACC003: " + accountNumbers.add("ACC003"));  // true
        System.out.println("Adding ACC001 again: " + accountNumbers.add("ACC001"));  // false (duplicate)
        
        System.out.println("\n Total Unique Accounts: "+ accountNumbers.size());
        
        String newAccount = "ACC004";
        if ( accountNumbers.contains(newAccount) ) {
        	System.out.println(newAccount + " Already exists!");
        }else {
        	accountNumbers.add(newAccount);
        	System.out.println(newAccount + " created successfully");
        }
        
        // Display all accounts (order not guaranteed)
        System.out.println("\nAll Account Numbers:");
        for (String account : accountNumbers) {
            System.out.println(account);
        }
        
        accountNumbers.remove("ACC002");
        System.out.println("\nAfter closing ACC002: " + accountNumbers.size() + " accounts");
		
	}

}
