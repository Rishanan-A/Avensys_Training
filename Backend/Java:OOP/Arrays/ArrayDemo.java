import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int a[][] = new int [5][3];
		
		for (int i=0; i<=a.length-1;i++) {
			for (int j=0;j<=a[i].length-1;j++) {
				System.out.println("Enter the deposit amount for customer "+(j+1)+" in bank "+(i+1)+":");
				a[i][j]=scanner.nextInt();
			}
		}
		
		for (int i=0; i<=a.length-1;i++) {
			for (int j=0;j<=a[i].length-1;j++) {
				System.out.println("Customer "+(j+1)+" Bank "+(i+1)+" is: "+a[i][j]);
			}
		}
	}

}
