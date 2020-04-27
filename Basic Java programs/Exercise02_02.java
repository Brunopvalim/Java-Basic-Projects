import java.util.Scanner;

public class Exercise02_02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		final double mpf = 0.305;

		System.out.print("Enter a value for feet: ");
		double feet = input.nextDouble();

		double meters = feet * mpf;

		System.out.println(feet + " feet is " + meters + " meters");
	}
}