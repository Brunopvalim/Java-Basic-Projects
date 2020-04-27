import java.util.Scanner;

public class PE3_100349031
{
	
	public static final double TAX = 0.0625;
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String[] itemName = new String[3];
		int[] quantity = new int[3];
		double[] price = new double[3];
		double[] itemTotal = new double[3];
		double subTotal = 0, salesTax, total;
		
		//Saving all the inputs
		for(int i = 0; i < 3; i++)
		{
			System.out.println("Input name of item " + (i + 1) + ":");
			itemName[i] = input.nextLine();
			
			System.out.println("Input quantity of item " + (i + 1) + ":");
			quantity[i] = input.nextInt();
			
			System.out.println("Input price of item " + (i + 1) + ":");
			price[i] = input.nextDouble();
			
			input.nextLine();
			itemTotal[i] = quantity[i] * price[i];
		}
		
		input.close();
		//adding the total cost of each item
		for(double x : itemTotal)
			subTotal += x;
		
		//calculating tax and total
		salesTax = subTotal * TAX;
		total = subTotal + salesTax;
		
		String itemFormating =     "%-20s %10s %10s %8s%n";
		String subtotalFormating = "%-20s %10s %10s %8.2f%n";
		
		//formatting output
		System.out.println("Your bill:");
		System.out.printf(itemFormating, "Item", "Quantity", "Price", "Total");
		System.out.printf(itemFormating, itemName[0], quantity[0], price[0], itemTotal[0]);
		System.out.printf(itemFormating, itemName[1], quantity[1], price[1], itemTotal[1]);
		System.out.printf(itemFormating, itemName[2], quantity[2], price[2], itemTotal[2]);
		System.out.printf(subtotalFormating, "Subtotal", "", "", subTotal);
		System.out.printf(subtotalFormating, "Sales tax(6.25%)", "", "", salesTax);
		System.out.printf(subtotalFormating, "Total", "", "", total);		
	}

}