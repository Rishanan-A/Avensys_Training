package Week2;

import java.util.Scanner;

public class one_two_two_array {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][][] marks = new int[3][3][4];
        
        // Input for each college-class-student combination
        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                for (int k = 0; k < marks[i][j].length; k++) {
                    System.out.print("Enter the marks for college " + i + " class " + j + " student " + k + ": ");
                    marks[i][j][k] = sc.nextInt();
                }
            }
        }
        
        // Display the marks for each college-class-student combination
        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                for (int k = 0; k < marks[i][j].length; k++) {
                    System.out.println("The marks for college " + i + " class " + j + " student " + k + " is " + marks[i][j][k] + ".");
                }
            }
        }
	} 

}
