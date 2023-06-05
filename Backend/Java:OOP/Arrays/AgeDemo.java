import java.util.Scanner;
import static java.lang.System.out;

public class AgeDemo {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int a[] = new int[10];
		
		for(int i=1;i<=a.length;i++) {
        out.print("Enter the age for student "+ i +" : ");
        a[i-1] = scanner.nextInt();
		}
		
		out.println("\nThe age for Students are:");
		for(int i=1;i<=a.length;i++) {
			out.println("The age for student "+(i)+" is : "+a[i-1]);
		}
	}
}
