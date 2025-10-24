
public class TestArrayIndexOutOfBounds {

	public static void main(String[] args) {
		int array[] = {1,2,3,4};
		
		try {
			System.out.println(array[10]);
		}catch ( ArrayIndexOutOfBoundsException e) {
			System.out.println("Error: Invalid array index!");
			System.out.println("Valid indexes are 0 to " + (array.length -1 ));
		}

	}

}
