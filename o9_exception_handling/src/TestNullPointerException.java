
public class TestNullPointerException {
	public static void main(String[] args) {
		
		String name = null;
		try {
		System.out.println(name.length());
		}catch (NullPointerException e) {
			System.out.println("Error: String object is null!=");
			System.out.println("Please create an string object");
		}
	}

}
