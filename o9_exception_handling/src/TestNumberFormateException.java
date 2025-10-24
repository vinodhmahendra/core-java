
public class TestNumberFormateException {

	public static void main(String[] args) {
		String number = "two";
		try {
			int x = Integer.parseInt(number);

			System.out.println(x);
		} catch (NumberFormatException e) {
			System.out.println("Error: Invalid number format!");
			System.out.println("Please enter valid numeric amount.");
		}
	}
}
