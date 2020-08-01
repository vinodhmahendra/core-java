
public  class Fish extends Animal implements Pet{
	
	private String name;

	protected Fish() {
		super(0); // this line must be here
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
	public void play() {
		System.out.println("Fish swim in their tanks all day.");
		
	}

	@Override
	public void eat() {
		System.out.println("Fish eat pond scum.");
		
	}
	
	@Override
	public void walk() {
		super.walk();
		System.out.println("Fish , Of course, can't walk: they swim.");
	}

}
