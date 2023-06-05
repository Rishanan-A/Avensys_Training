import java.util.Scanner;
class exception_handling
{
	public static void main(String[] args) {
		/*
		// without Exception handlers
		System.out.println("Connection Established");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Numerator");
		int a = scan.nextInt();
		System.out.println("Enter the Denominator");
		int b = scan.nextInt();
		int c = a/b;
		System.out.println("Result is :" + c);
		System.out.println("Connection is Closed");
		*/
		
		System.out.println("Connection Established");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Numerator");
		int a = scan.nextInt();
		System.out.println("Enter the Denominator");
		int b = scan.nextInt();
		
		try {
			int c = a/b;
			System.out.println("Result is :" + c);
		}
		catch(Exception e){
			System.out.println(e.getMessage()+" error");
		}
		System.out.println("Connection is Closed");
	}
}