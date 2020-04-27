import java.io.*;
import java.util.*;
import java.util.Date;
import java.io.FileWriter;   
import java.text.DateFormat;
import java.text.SimpleDateFormat;


public class Checkers {

    private final static int SIZE = 8;
    private char[][] board; // Create the boards 
    private int redcheckers; // Number of red checkers on the board
    private int blackcheckers; // Number of black checkers on the board
    private char whosemove; // Either 'R' or 'B', for who's move it currently is.
	public static String p1; //Player 1 Name
	public static String p2; //Player 2 Name
	public static Date startDate;
    // Constructs default Checkers object, initializing board to starting playing position.
    public Checkers() {
    	
    	
    	//Getting info of players
		Scanner sc = new Scanner(System.in);
 		System.out.println("Please enter Player 1 name: "); 
 		p1 = sc.nextLine();
 		System.out.println("Please enter Player 2 name: "); 
 		p2 = sc.nextLine();
 		
 		//Defining start time
    	startDate = new Date();
        
 		//General configuration
		board = new char[SIZE][SIZE];
		redcheckers = 12;
		blackcheckers = 12;
		whosemove = 'R';
		// Initialize board with correct positions
		int i,j;
		for (i=0;i<SIZE;i++)
		    for (j=0;j<SIZE;j++)
			board[i][j] = '_';
	
		for (i=1;i<SIZE;i+=2) {
		    board[i][1] = 'R';
		    board[i][5] = 'B';
		    board[i][7] = 'B';
		}
		for (i=0;i<SIZE;i+=2) {
		    board[i][0] = 'R';
		    board[i][2] = 'R';
		    board[i][6] = 'B';
		}
    }

    // This method prints the board
    private void printBoard() {
		int i,j;
		System.out.println("  1 2 3 4 5 6 7 8    X axis");
		for (i=0;i<SIZE;i++) {
		    System.out.print((i+1) + " ");
		    for (j=0;j<SIZE;j++) {
			System.out.print(board[j][i] + " ");
		    }
		    System.out.println();
		}
		System.out.println("");
		System.out.println("Y axis");
    }

    // This method is to executes one move.
    public void getNextMove() throws IOException {
		
		Scanner sc = new Scanner(System.in);
	
		if (whosemove=='R')
		    System.out.println("It's "+p1+" turn.(R)");
		else
		    System.out.println("It's "+p2+" turn.(B)");
	
		boolean moved = false;
		// Loops until legal move is entered.
		while (!moved) {
		    // Reads in square to move from and to.
		    System.out.println("Choose your move: (e.g if you want to move from X1Y3 to X2Y4, enter 13 24).");
		    
		    int movefrom = sc.nextInt();
		    int moveto = sc.nextInt();
	
		    // Checks to see if move is valid, if so, executes it.
		    if (validMove(movefrom,moveto)) {
		    	executeMove(movefrom,moveto);
		    	moved = true;
		    }
		    else
		    	System.out.println("Invalid move, please try again.");
		}
	
		// Update whosemove.
		if (whosemove == 'R')
		    whosemove = 'B';
		else
		    whosemove = 'R';
    }

    // Check if its a valid move.
    public boolean validMove(int movefrom, int moveto) {
	
		// Gets array indexes corresponding to the move.
		int xfrom = movefrom/10 - 1;
		int yfrom = movefrom%10 - 1;
		int xto = moveto/10 - 1;
		int yto = moveto%10 - 1;
		
		// Check if indexes in range, if not, return false.
		if (xfrom < 0 || xfrom > 7 || yfrom < 0 || yfrom > 7 ||
		    xto < 0 || xto > 7 || yto < 0 || yto > 7) 
		    return false;
	
		// Check if the move is to a blank square.
		else if (board[xfrom][yfrom]==whosemove && board[xto][yto]=='_') {
	
		    // Checks case of simple move
		    if (Math.abs(xfrom-xto)==1) {
			if ((whosemove == 'R') && (yto - yfrom == 1))
			    return true;
			else if ((whosemove == 'B') && (yto - yfrom == -1))
			    return true;
		    }
		    
		    // Checks case of a jump
		    else if (Math.abs(xfrom-xto)==2) {
			if (whosemove == 'R' && (yto - yfrom == 2) && 
			    board[(xfrom+xto)/2][(yfrom+yto)/2] == 'B')
			    return true;
			else if (whosemove == 'B' && (yto - yfrom == -2) && 
			    board[(xfrom+xto)/2][(yfrom+yto)/2] == 'R')
			    return true;
		    }
		}
		// If move isn't a simple one or a jump, it is not legal.
		return false;
    }

    // Executes a move.
    public void executeMove(int movefrom, int moveto) {
	// Gets array indexes corresponding to the move, from parameters.
	int xfrom = movefrom/10 - 1;
	int yfrom = movefrom%10 - 1;
	int xto = moveto/10 - 1;
	int yto = moveto%10 - 1;
	
	// Change appropriate board elements and decrement red checkers or black checkers if necessary.
	board[xfrom][yfrom] = '_';
	board[xto][yto] = whosemove;
	if (Math.abs(xto - xfrom) == 2) {
	    board[(xfrom+xto)/2][(yfrom+yto)/2] = '_';
	    if (whosemove == 'R')
		redcheckers--;
	    else
		blackcheckers--;
	}

    }

    // Checks to see if game is over based on number of checkers left.
    public boolean gameOver() {
	return (redcheckers == 0 || blackcheckers == 0);
    }

    // Returns color of the winner.
    public String winnerIs() {
		if (redcheckers == 0)
		    return p1;
		else
		    return p2;
    }

    public static void main(String args[]) throws IOException {

    //Menu
	Scanner sc = new Scanner(System.in);
	System.out.println("Menu: "); 
	System.out.println("1. Developer"); 
	System.out.println("2. Instruction on how to play"); 
	System.out.println("3. Play!"); 
	System.out.println("4. Show winners"); 
	System.out.println("5. Exit"); 

	System.out.println("Select one option: "); 
	int menuChoice = sc.nextInt();
	switch(menuChoice) {
	  
	  case 1:
	    System.out.println("This game was developed by Bruno Pinheiro Valim");
	   
	    break;
	  case 2:
		System.out.println("This game use the rules of Checkers. To play it, you need to type 2 numbers each round.");
		System.out.println("The first number is the coordinate of X and Y axis of the piece you want to move.");
		System.out.println("The second number is the coordinate of X and Y axis of the position you want to move");
		System.out.println("e.g: If you want to move from X1 Y3 to X2 Y4, enter 13 24 in the console). ");
		
		break;
	  case 3:
		// Setup and print out checker board.
		Checkers game = new Checkers();
		game.printBoard();
		
		// Loop until game is over.
		while (!game.gameOver()) {
		    //Execute a move and print the board out afterwards.
		    game.getNextMove();
		    game.printBoard();
		}
		// Announce winner.
		System.out.println("The winner is " + game.winnerIs());
		
		//Creating results file
	    try {
	      File results = new File("results.txt");
	      if (results.createNewFile()) 
	        System.out.println("File created: " + results.getName());
	    else 
	        System.out.println("File already exists.");
	    } 
	    catch (IOException e) {
	    	System.out.println("An error occurred.");
	    	e.printStackTrace();
	    }
		// Writing into file
	    try {
	    	DateFormat df = new SimpleDateFormat("MMMM d, yyyy");
	        DateFormat hf = new SimpleDateFormat("HH:mm");
	    	Date endDate  = new Date();
	        FileWriter myWriter = new FileWriter("results.txt");
			myWriter.write(df.format(startDate)+" - "+p1+" vs "+p2+" - "+hf.format(startDate)+" to "+hf.format(endDate)+" - "+game.winnerIs()+" won");
	        myWriter.close();
	        System.out.println("Successfully wrote to the file.");
	    } 
	    catch (IOException e) {
	        System.out.println("An error occurred.");
	        e.printStackTrace();
	    }
	    break;
	  case 4:
		  try {
		      File myObj = new File("results.txt");
		      Scanner myReader = new Scanner(myObj);
		      while (myReader.hasNextLine()) {
		        String data = myReader.nextLine();
		        System.out.println(data);
		      }
		      myReader.close();
		  } 
		  catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		  }
		  break;
	  case 5:
		    // code block
		    break;
	  
	}

	
    }
}
