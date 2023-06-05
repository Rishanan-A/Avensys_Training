import java.util.InputMismatchException;
import java.util.Scanner;
// Advantage of Specific and multiple catch blocks
class exception_handling2
{
	public static void main(String[] args) {
		try {
			System.out.println("Connection Established");
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the Numerator");
			int a = scan.nextInt();
			System.out.println("Enter the Denominator");
			int b = scan.nextInt();
			int c = a/b;
			System.out.println("Result is :" + c);
			System.out.println("Enter the array length");
			int len = scan.nextInt();
			int arr[] = new int[len];
			System.out.println("Enter the element which you wish to store in array");
			int ele = scan.nextInt();
			System.out.println("Enter the position");
			int pos = scan.nextInt();
			arr[pos] = ele;
			System.out.println("The element " + ele + " is present in " + pos + " position");
		}
		/*
		catch(ArithmeticException ae)
		{
			System.out.println("Hey user !! Dont give zero Denominator");
		}
		catch(NegativeArraySizeException ne)
		{
			System.out.println("Hey user !! Dont pass negative value to the size");
		}
		catch(InputMismatchException ie)
		{
			System.out.println("Hey user !! Dont pass invalid inputs");
		}
		catch(ArrayIndexOutOfBoundsException aie)
		{
			System.out.println("Hey user !! dont pass invlid position");
		}
		//Geniric Catch Block
		catch(Exception e)
		{
			System.out.println("Some Problem Occured");
		}
			System.out.println("Connection is Closed");
	*/
		catch(Exception e) {
		    String name = e.getClass().getSimpleName();
		    System.out.println("\nError classification: " + name);

		    if (name.equals("ArithmeticException")) {
		        System.out.println("Reason: You cannot divide by 0");
		    } else {
		        System.out.println("Reason: "+e.getMessage());
		    }

		    StackTraceElement[] stackTrace = e.getStackTrace();
		    if (stackTrace.length > 0) {
		        int lineNumber = stackTrace[0].getLineNumber();
		        System.out.println("Exception caught in line: " + lineNumber);
		    }
		    main(args);
		}
		System.out.println("\nConnection is closed");
	}
}
