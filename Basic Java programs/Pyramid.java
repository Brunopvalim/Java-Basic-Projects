import java.util.Scanner; 
public class problem_3{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in); //Scanner class in java
		System.out.print("Enter the rows you want:");
		int rows=sc.nextInt();
		String n = " ";
		//outer forloop
		for (int i=1; i<=rows; i++){
			for (int j=1; j<=(rows-i)*2; j++){
			//create initial space for pyramid shape
				if(j > 9) {n= "  ";}
				else { n =  "  "; }
				System.out.print(n);
			}
			//inner for loops
			for (int k=i; k>=1; k--){//inner for loops
				//create left half
				if(k > 9) {n= "  ";}
				else { n = "   "; }
				System.out.print(n+k);            
			}                                        
			//create right half
			for (int l=2; l<=i; l++){
				if(l > 9) {n= "  ";}
				else { n = "  "; }
				System.out.print(n+l);    
			}
		//end outer for loop                            
		System.out.println();
		}                                           
	}
}
	    
