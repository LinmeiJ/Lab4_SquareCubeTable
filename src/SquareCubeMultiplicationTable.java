import java.util.Scanner;

public class SquareCubeMultiplicationTable {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		
		String userContinue = "y"; //initializing the condition for the while loop
		
		while(userContinue.equalsIgnoreCase("y")) {
			System.out.println("Please enter an integer: ");
			int num = sc.nextInt(); // get an integer from a user
			
			System.out.println();
			
			squareCubeTable(num);//method call
			System.out.println(" ");
			multiplicationTable(num);//method call
			
			System.out.println(" ");
			
			System.out.println("Would you like to continue(y/n)?");
			userContinue = sc.next();  //user determines to continue play this program or quit
		}
		System.out.println("Goodbye!");
		sc.close();
	}

	/*****************static void method: squareCubeTable()*********************/
	public static void squareCubeTable(int number) {
		System.out.println("Square and cube calculation table: \n");
		System.out.printf("Number\t\tSquared\t\tCubed%n");
		System.out.printf("=======\t\t=======\t\t======%n");
		
		for(int i = 1; i <= number; i++) {
			int squares = (int)Math.pow(i, 2);
			int cubes = (int)Math.pow(i, 3);
			System.out.printf("%-15d %-15d %d %n", i, squares, cubes);
		}
	}
	
	/*****************static void method: multiplicationTable()*********************/
	public static void multiplicationTable(int num) {
		System.out.println("Multiplication table:\n");
		
		//   this for loop is for displaying all the integers horizontally
		// starting from 1 to the integer user entered
		System.out.print("   ");
		for(int i = 1; i <= num; i++) {
			System.out.printf("   %d",i);
		}
		
		//this for loop is for display the horizontal line 
		System.out.print("\n     ");
		for(int i = 1; i <= num*5; i++) {
			System.out.print('\u2501');
			//System.out.print('\u2501');
		}
		
		// this for loop is for displaying integers vertically, the
		// vertical line and all the calculation
		System.out.println();
		for(int i = 1; i <= num ; i++) {
			System.out.printf("%2d  \u2503 ", i);
			for(int j = 1; j <= num; j++) {
				System.out.printf("%-4d", i*j);
			}
		System.out.println(" ");
		}
			
	}
		
}

