# static keyword

members belong class rather than instance

class attribute
class method


### single pattern : there will be only one object through out the application
```java

public class Bank {
	
	private static Customer[] customers;
	private static int numberOfCustomers;
	
	// initializer
	static {
		customers = new Customer[10]; // intializes the customers array with some maximum size
		numberOfCustomers = 0;
	}
	
	
	// Define a constructor
	private  Bank() {
	
	}

	public static void addCustomer(String f, String l) {
		int  i = numberOfCustomers ++;
		customers[i] = new Customer(f, l);
	}
	
	public static int getNumOfCustomers() {
		return numberOfCustomers;
	}
	
	public static Customer getCustomer(int customer_index) {
		return customers[customer_index];
	}
}
```
## to invoke a static method the better apporch is use class name
``` java
Bank.addCustomer("Jane", "Smith");
```

