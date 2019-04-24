import java.util.Scanner;

public class SquareCubeMultiplicationTable {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		String userContinue = "y";
		while(userContinue.equalsIgnoreCase("y")) {
			System.out.println("Please enter an integer: ");
			int num = sc.nextInt();
			System.out.println();
			
			squareCubeTable(num);
			System.out.println(" ");
			multiplicationTable(num);
			
			System.out.println(" ");
			System.out.println("Would you like to continue(y/n)?");
			userContinue = sc.next();
		}
		System.out.println("Goodbye!");
		sc.close();
	}

	/*****************method squareCubeTable*********************/
	public static void squareCubeTable(int number) {
		System.out.println("Square and cube calculation table: ");
		System.out.printf("Number\t\tSquared\t\tCubed%n");
		System.out.printf("=======\t\t=======\t\t======%n");
		for(int i = 1; i <= number; i++) {
			int squares = (int)Math.pow(i, 2);
			int cubes = (int)Math.pow(i, 3);
			System.out.printf("%-15d %-15d %d %n", i, squares, cubes);
		}
	}
	
	/*****************method multiplicationTable*********************/
	public static void multiplicationTable(int num) {
		System.out.println("Multiplication table:");
		
		System.out.print("    ");
		for(int i = 1; i <= num; i++) {
			System.out.printf("   %d",i);
		}
		System.out.println();
		System.out.print("     ");
		for(int i = 1; i <= num; i++) {
			System.out.printf("----");
		}
		System.out.println();
		for(int i = 1; i <= num ; i++) {
			System.out.printf("%2d  | ", i);
			for(int j = 1; j <= num; j++) {
				System.out.printf("%-4d", i*j);
			}
		System.out.println(" ");
		}
			
	}
		
}

