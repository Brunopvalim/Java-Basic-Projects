public class Exercise01_04 {
	public static void main(String[] args) {
    	
    	int time = 3600 * 24 * 365;  // Calculate 1 year in second
		int born = time / 7;  // Born in 1 year
		int death = time / 13;  // Death in 1 year
		int immigrant = time / 45;  // Immigrant in 1 year

		int current_population = 312032486;
		int population = born + immigrant - death;

		for (int i = 1; i <= 5; i++) {
			current_population = current_population + population;  // Calculate total population
			System.out.println(i + " year population is : " + current_population);
		}
    }
}