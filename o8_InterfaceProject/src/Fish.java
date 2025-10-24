
public class Fish extends Animal implements Pet {

	private String name;

	public Fish() {
		super(0);
	}

	@Override
	public void eat() {
		System.out.println(" Fish wat pond scum ");
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String n) {
		name = n;
	}
	
	@Override
	public void walk() {
		super.walk();
		System.out.println(" Fish, of course , can't walk; they swim.");
	}

	@Override
	public void play() {
		System.out.println("Fish swim in their tanks al day.");
	}
	
}
