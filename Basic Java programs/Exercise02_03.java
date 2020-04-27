import java.util.Scanner;

public class Exercise02_03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);		// Create new Scanner object

		System.out.print("Enter an integer between 0 and 1000: ");
		int number = input.nextInt();
		int originalNumber = number;

		int lessThan10 = number % 10;		// Extract the digit less than 10
		number /= 10;						// Remove the extracted digit
		int tens = number % 10;				// Extract the digit between 10 to 99
		number /= 10;						// Remove the extracted digit
		int hundreds = number % 10;			// Extract the digit between 100 to 999
		number /= 10;						// Remove the extracted digit
		int sum = hundreds + tens + lessThan10;	

		System.out.println("The sum of all the digits in number "+originalNumber+" is " + sum);
	}
}