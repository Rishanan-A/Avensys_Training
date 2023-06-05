package Week2;

import java.util.Scanner;

public class find_array_key {

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

	        System.out.println("Enter the key to be searched:");
	        int key = scan.nextInt();

	        
	        int j=0;
	        for (int i=0; i<=a.length-1; i++) {
	            if (a[i] == key) {
	                System.out.println("Key Found at index "+i);
	                j=1;
	                break;
	            }
	        }
	        if (j==0) {
	        	System.out.println("Key Not Found");
	        }
	        
	    }

}
