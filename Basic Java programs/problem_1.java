import java.text.DecimalFormat;
import java.util.Scanner;;
public class problem_1 {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in); //Scanner class in java
		System.out.print("Enter the tuition fee:");
		double initialTuition=sc.nextInt();
		DecimalFormat df = new DecimalFormat("#,###,##0.00");
        
		double summarizedTuition = 0;
		double TYT = 0;
	    final double theRate = 0.05;

	    for (int i = 1; i < 15; i++) {
	    	initialTuition = ((theRate * initialTuition) + initialTuition);
	    	System.out.println("Year " + i + " tuition is: " + initialTuition);
	    	if (i == 9){
		    	TYT = ((theRate * initialTuition) + initialTuition);
	    	}
	        if ((i > 9) && (i < 14)){
	            summarizedTuition += initialTuition;
	        }
	    }
	    System.out.println("Tuition in ten years is: " + df.format(TYT));
	    System.out.println("The forth-year tuition in ten years is: " + df.format(summarizedTuition));
	}
}