import java.util.Scanner;


public class MarksDemo {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int a[] = new int[5];
		
		for(int i=0;i<=4;i++) {
        System.out.print("Enter the number of marks for student "+(i+1)+" : ");
        a[i] = scanner.nextInt();
		}
		
		System.out.println("The Stored marks for Students are:");
		for(int i=0;i<=4;i++) {
			System.out.print("\nThe marks for student "+(i+1)+" is : "+a[i]);
		}
	}
}
