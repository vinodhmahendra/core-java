
public class TestArithmeticException {
	
	public static void main(String[] args) {
		
		int totalInterest = 5000;
		int numberMonths = 0;
		
		try {
			int monthlyInterest = totalInterest / numberMonths;
			System.out.println("Monthly interest: " + monthlyInterest);
		}catch (ArithmeticException e) {
			  System.out.println("Error: Cannot divide by zero!");
	          System.out.println("Exception: " + e.getMessage());
		}
	}

}
