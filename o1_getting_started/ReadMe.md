### Objectives

### key features in Java technology
	# Simple and Easy to Learn
	# Object Oriented
	# Platform Independent ( WORA )
	# Compiled and Interpreted
	# Automatic Memory Management
	# Secure and Robust
	# Multithreaded
	# Portable and High Performance
	
### Write , compile and run a simple java technology  application

```
public class HelloWorld {
  public static void main(String[] args) {
    System.out.println("Hello, Java World!");
  }
}

Save  HelloWord.java
Compile
javac HelloWorld.java

This produces a file HelloWorld.class ( bytecode )

Execute
java HelloWorld



```

### Describe the function of Java Virtual Machine ( JVM )

	# Class Loader
	# Bytecode Verfier
	# Intrepreter & JIT Compiler
	# Memory Management
	# Execution Engine
	# Garbage Collector

### Garbage Collection in Java

**Garbage Collection (GC)** in Java is the automatic process of reclaiming memory occupied by unused objects.

---

#### How It Works:

1. **Mark Phase**  
   The GC identifies which objects are still being used (reachable).

2. **Sweep Phase**  
   It removes objects that are no longer referenced.

3. **Compact Phase (optional)**  
   It may compact memory to reduce fragmentation.

---

#### Types of Garbage Collection:

- **Minor GC**  
  Cleans up the *Young Generation* (short-lived objects).

- **Major/Full GC**  
  Cleans up the *Old Generation* (long-living objects).

---

GC allows developers to focus on application logic instead of manual memory deallocation, reducing memory leaks and crashes.


```java 

package com.training.model;

public class Account {
	
	// field
	public double balance;
	
	//Initialize the field (constructor)
	public Account(double initBalance) {
		balance = initBalance;
	}
	
	//Business Methods
	public void deposit ( double amt ) {
		balance = balance + amt;
	}
	
	public void withdraw( double amt ) {
		balance = balance - amt;
	}
	
	//accessor method
	public double getBalance() {
		return balance;
	}

}
 ```
 
 ```java
 
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
 
 ```
 
 ```shell
 /o1_getting_started/bin$ java com.training.test.TestAccount
Final account balance is : 3.0
 
```
# List the three tasks  performed be the Java Platform that handle code security

	1. Class Loader
	2. Bytecode Verifier
	3. Security Manager

