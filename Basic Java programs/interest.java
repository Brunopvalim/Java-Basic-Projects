import java.util.Scanner;

public class Exercise06_01 {
	
	public static void main(String[] args) {
		//Main Method
		Scanner input = new Scanner(System.in); // Create a Scanner
		

		// Prompt the user to enter the investment amount, interest rate and number of years
		System.out.print("Enter investment amount: ");
		double amount = input.nextDouble();
		System.out.print("Enter yearly interest rate: ");
		double yearlyIntRate = input.nextDouble();
		System.out.print("Enter number of years: ");
		int numberYears = input.nextInt(); 

		
		// Get monthly interest rate
		double monthlyInterestRate = yearlyIntRate / 1200;
		

		// Print a table that displays future value for the years from 1 to n
		System.out.println("Years     Future Value"); // Table header
		for (int years = 1; years <= numberYears; years++) {
			System.out.printf("%-10d", years);
			System.out.printf("%11.2f\n", 
				futureInvestmentValue(amount, monthlyInterestRate, years));
		}
	}//End of main method

	// futureInvestmentValue Method 
	public static double futureInvestmentValue(
		double investmentAmount, double monthlyInterestRate, int years) {
		return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
	}// end of futureInvestmentValue
}