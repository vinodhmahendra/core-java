# Object Oriented Programming

## Classe as Blueprint for Object

	# A class describes the data that each object includes.
	# A class describes the behaviors that each object exhibits.
	
## In Java technology, classes support three key features of object-oriented programming (OOP):
	# Encapsulation
	# Inheritance
	# Polymorphism
	
	
# Declaring Java Technology Classes

	~ Basic syntax a Java class:
	
	<modifier>* class <class_name> {
		<attribute_declartion>*
		<constructor_declaration>*
		<method_declaation>*
	}
	
## Example	
	
``` java
public class Vehicle {
	
	private double maxLoad;
	
	public void setMaxLoad(double value) {
		this.maxLoad = value;
	}

}
```

# Declaring Attributes
**<span style="color:blue">
	<modifier>* type <name> = [<initial_value>];
</span>

## Example
``` java

public class Foo {
	
	private int x;
	private float y = 10000.0F;
	private String name = "Vinodh Mahendra";

}

```

## Declaring Methods

**<span style="color:blue">

<modifier>* <return_type> <name> ( <argument>* ) {
	<statement>*
}

</span> **

### Example
```java

package com.training.demos;

public class Dog {

	private  int weight;
	
	public int getWeight() {
		return weight;
	}
	
	public void setWeight(int newWeight) {
		if ( newWeight > 0 ) {
			weight = newWeight;
		}
	}
}

```

## Creating An Object And Accessing The Memebers

```java
class_name object_name = new class_name();
(or)
class_name object_name = new constructor();

Dog myDag = new Dog();
myDog.setWeight(42);
myDog.weight = 42; // only permissible if weight is public

```

# Information Hiding

```java
public class MyDate {
    public int day;
    public int month;
    public int year;
}
```
All attribute a re declared a public
``` java
MyDate today = new MyDate();
// worng values is assigned
today.day = 32;
today.month = 13;
int year  = -1000;
```
javac doesn't give an error ,[PROBLEM]

# Encapsulation
    • Hides the implementation details of a class
    • Forces the user to use an interface to access data
    • Makes the code more maintainable
    
[SOLUTION] :
```java
public class MyDate {
    private int day;
    private int month;
    private int year;
    
    public setDay (paramDay ) {
        // check its valid day
    }
     public setMonth (paramMonth ) {
        // check its valid month
    }
     public setYear (paramyear ) {
        // check its valid year
    }
}
```

# Declaring Constructor
    • Basic syntax of a constructor:
        [<modifier>] <class_name> ( <argument>* ) {
            <statement>*
        }
        
    • Example:
    
    ```java
    public class Dog {
        private int weight;
        
        public Dog() {
            weight = 42;
        }
    }
    
//Invoking a Constructor
Dog d = new Dog(); // weight = 42

# The Default Constructor
    • There is always at least one constructor in every class.
    • If the writer does not supply any constructors, the
      default constructor is present automatically:
        • The default constructor takes no arguments
        • The default constructor body is empty
    • The default enables you to create object instances with
      new Xxx() without having to write a constructor.
      
## Example
```java
public class Animal {
    
}

javac Animal.java

Generate the class file (default constructor)

Animal animal = new Animal(); // using default constructor
```

# Software Packages
    • Packages help manage large software systems.
    • Packages can contain classes and sub-packages.

## The package Statement    
    • Basic syntax of the package statement is:
      package <top_pkg_name>[.<sub_pkg_name>]*;
    • Example
      package com.training.model;
    • Specify the package decalration at the beginning of the source file
    • Only one package declaration per source file
    • Package names must be hierachical and seperated by dots.
    


	