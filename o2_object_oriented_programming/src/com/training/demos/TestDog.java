package com.training.demos;

public class TestDog {
	
	public static void main(String[] args) {
		Dog mydog = new Dog();
		mydog.setWeight(42);
		
//		mydog.weight = 42 ; compiler error
		
		System.out.println("Dog weight is : " + mydog.getWeight());
		
	}

}
