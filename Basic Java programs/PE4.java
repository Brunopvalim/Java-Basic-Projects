import java.text.DecimalFormat;
import java.util.Scanner;


public class PE4_100349031
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String[] testeName = new String[3];
		int[] yourScore = new int[3];
		int[] pointsPossible = new int[3];		
		int totalyourScore = 0, totalPointsPossible = 0;
		
		//Saving all the inputs
		for(int i = 0; i < 3; i++){
			
			System.out.println("Name of exercise " + (i + 1) + ":");
			testeName[i] = input.nextLine();
			
			System.out.println("Score received for exercise " + (i + 1) + ":");
			yourScore[i] = input.nextInt();
			totalyourScore += yourScore[i];
			
			System.out.println("Total points possible for exercise " + (i + 1) + ":");
			pointsPossible[i] = input.nextInt();
			totalPointsPossible += pointsPossible[i];
			
			input.nextLine(); /* Skip keyboard buffer  */			
		}
		
		input.close();
		DecimalFormat myFormat = new DecimalFormat("#.00%");
		
		String outputHeaderFormatting = "%n%-20s %15s %20s%n";
		String outputFormatting =       "%-20s %15d %20d%n";
		
		//formatting output		
		System.out.printf(outputHeaderFormatting, "Exercise", "Score", "Total Possible");
		System.out.printf(outputFormatting, testeName[0], yourScore[0], pointsPossible[0]);
		System.out.printf(outputFormatting, testeName[1], yourScore[1], pointsPossible[1]);
		System.out.printf(outputFormatting, testeName[2], yourScore[2], pointsPossible[2]);
		System.out.printf(outputFormatting, "Total", totalyourScore, totalPointsPossible);
		System.out.print("\nYour total is " + totalyourScore + " out of " + totalPointsPossible);
		System.out.println(", or " + myFormat.format((double)totalyourScore / totalPointsPossible) + ".");

	}
}