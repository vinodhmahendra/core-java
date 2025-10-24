package com.training.client;

import java.util.LinkedList;
import java.util.Queue;

import com.training.model.Customer;

public class LinkedListExample {
	
	public static void main(String[] args) {
		Queue<Customer> customerQueue = new LinkedList<>();
		
		customerQueue.add(new Customer("Rahul", 101));
		customerQueue.add(new Customer("Sneha", 102));
		customerQueue.add(new Customer("Vikram", 103));
		customerQueue.add(new Customer("Anita", 104));
		
		System.out.println("Customers in Queue: " + customerQueue.size());
		
		System.out.println("\n Next customer: " + customerQueue.peek());
		
		System.out.println("\n Serving Customers:");
		while ( !customerQueue.isEmpty() ) {
			Customer customer = customerQueue.poll();
			System.out.println("Now Serving: " + customer);
			System.out.println("Remaining in Queue: " + customerQueue.size());
		}
		
		System.out.println("\n All customers served!");
				
	}

}
