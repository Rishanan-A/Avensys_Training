package Week2;
import java.util.Scanner;
public class array_assignment1 {

	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int[][] deposits = new int[5][];
	        deposits[0] = new int[3];
	        deposits[1] = new int[1];
	        deposits[2] = new int[4];
	        deposits[3] = new int[5];
	        deposits[4] = new int[2];
	        
	        // Input for each bank-customer combination
	        for (int i = 0; i < deposits.length; i++) {
	            for (int j = 0; j < deposits[i].length; j++) {
	                System.out.print("Enter the deposit for bank " + i + " customer " + j + ": ");
	                deposits[i][j] = sc.nextInt();
	            }
	        }
	        
	        // Display the deposit for each bank-customer combination
	        for (int i = 0; i < deposits.length; i++) {
	            for (int j = 0; j < deposits[i].length; j++) {
	                System.out.println("The deposit for bank " + i + " customer " + j + " is " + deposits[i][j] + ".");
	            }
	        }

	}

}
