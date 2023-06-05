package Week2;
import java.util.Scanner;

public class one_two_multiple {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a[][][] = new int[3][][];
        a[0] = new int[3][];
        a[1] = new int[2][];
        a[2] = new int[4][];
        
        a[0][0] = new int[3];
        a[0][1] = new int[2];
        a[0][2] = new int[4];
        
        a[1][0] = new int[5];
        a[1][1] = new int[3];
        
        a[2][0] = new int[1];
        a[2][1] = new int [4];
        a[2][2] = new int [2]; 
        a[2][3] = new int [3]; 
        
        // Input for each bank-branch-customer combination
        for (int i = 0; i<=a.length-1; i++)
        {
        for (int j = 0; j<=a[i].length-1; j++)
        {
        for (int k = 0; k<=a[i][j].length-1; k++)
        {
        System.out.println("Enter " + (i+1) + " College, " + (j+1) + " Class, " + (k+1) + " student marks: ");
        a[i][j][k] = scan.nextInt ();
        }
        
        }
        }
        
        // Display the deposit for each bank-branch-customer combination
        for (int i = 0; i<=a.length-1; i++)
        {
        for (int j = 0; j<=a[i].length-1; j++)
        {
        for (int k = 0; k<=a[i][j].length-1; k++)
        {
                    System.out.println((i+1) + " College, " + (j+1) + " Class, " + (k+1) + " student marks is: "+(a[i][j][k]));
                }
            }
        }
	}

}
