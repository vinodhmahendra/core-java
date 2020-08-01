
public class TestAnimals {

	public static void main(String[] args) {
		Fish f = new Fish();
		Cat c =new Cat("Fluffy");
		
		Animal animal = new Fish(); // polymorphism
		
		Animal spider = new Spider();
		
		Pet p = new Cat();
		
		//Demonstrate different implementations of an interface
		f.play();
		c.play();
	
		//Demonstrate virtual method invocation
		spider.eat();
		spider.walk();
	
		//Demonstrate calling super methods
		animal.walk();
	}

}
