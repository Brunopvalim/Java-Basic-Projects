import java.util.Scanner;

public class Exercise02_05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	
		final double MONTHLY_INTEREST_RATE = 0.00417;	

		// Prompt the user to enter a montly saving amount
		System.out.print("Enter the monthly saving amount: ");
		double savingAmount = input.nextDouble();

		// Compute first month account value
		double total = savingAmount * (1 + MONTHLY_INTEREST_RATE);
		System.out.println("After the first month, the account value is " + total);
		// Compute second month account value
		total = (savingAmount + total) * (1 + MONTHLY_INTEREST_RATE);
		System.out.println("After the second month, the account value is " + total);
		// Compute third month account value
		total = (savingAmount + total) * (1 + MONTHLY_INTEREST_RATE);
		System.out.println("After the third month, the account value is " + total);
		// Compute forth month account value
		total = (savingAmount + total) * (1 + MONTHLY_INTEREST_RATE);
		// Compute fifth month account value
		total = (savingAmount + total) * (1 + MONTHLY_INTEREST_RATE);
		// Compute sixth month account value
		total = (savingAmount + total) * (1 + MONTHLY_INTEREST_RATE);
		System.out.println("After the sixth month, the account value is " + total);
	}
}

