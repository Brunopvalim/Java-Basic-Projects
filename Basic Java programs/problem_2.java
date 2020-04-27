
public class problem_2 {
	public static void main(String[] args) {
		int lines = 0;

		// Test if all numbers from 100 to 1,000 are divisible by 4 and 6
		for (int i = 100; i <= 1000; i++) {	
			if (i % 4 == 0 && i % 6 == 0) {
				lines++;	
				// Test if numbers per line is 10 
				if (lines % 10 == 0) { 
					System.out.println(i);
				}
				else {
					System.out.print(i + " ");	
				}
			}
		}
	}
}