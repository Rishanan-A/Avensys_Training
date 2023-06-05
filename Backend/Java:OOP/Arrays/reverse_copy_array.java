package Week2;

import java.util.Scanner;

public class reverse_copy_array {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the length of array");
        int len = scan.nextInt();

        System.out.println("Array is created with the length of "+ len);
        System.out.println("Enter the elements ");

        int a[] = new int [len];

        for (int i=0; i<=a.length-1;i++) {
            a[i] = scan.nextInt();
        }

        System.out.println("1st array elements are");

        for (int j=0; j<=a.length-1; j++) {
            System.out.println(a[j]+" ");
        }

        System.out.println();

        int b[] = new int[a.length];

        /*
        for (int i=a.length-1, j=0; i>=0; i--, j++) {
            b[j]=a[i];
        }
        */
        
        int k=a.length-1;
        for (int i=0;i<=a.length-1;i++) {
			b[i]=a[k];
			k--;
		}
        
        

        System.out.println("2nd Array elements in reverse order: ");

        for (int j=0;j<=b.length-1;j++) {
            System.out.println(b[j]+" ");
        }
    }

}
