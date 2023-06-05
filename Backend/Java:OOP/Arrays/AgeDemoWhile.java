import static java.lang.System.out;

import java.util.Scanner;

public class AgeDemoWhile {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int a[] = new int[10];
		
		int i=1;
		while (i<=a.length) {
        out.print("Enter the age for student "+ i +" : ");
        a[i-1] = scanner.nextInt();
        i++;
		}
		
		out.println("\nThe age for Students are:");
		int j=1;
		while (j<=a.length) {
			out.println("The age for student "+(j)+" is : "+a[j-1]);
			j++;
		}
	}

}
