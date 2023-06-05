import static java.lang.System.out;

import java.util.Scanner;

public class AgeDemoDoWhile {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int a[] = new int[10];
		
		int i=1;
		do {
        out.print("Enter the age for student "+ i +" : ");
        a[i-1] = scanner.nextInt();
        i++;
		}while (i<=a.length);
		
		out.println("\nThe age for Students are:");
		int j=1;
		do {
			out.println("The age for student "+(j)+" is : "+a[j-1]);
			j++;
		}while (j<=a.length);
	}

}
