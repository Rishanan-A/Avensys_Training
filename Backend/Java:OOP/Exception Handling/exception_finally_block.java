import java.util.Scanner;
//Second way: Re throwing the Exception
class ATM
{
	public void alpha()
	{
		try
		{
			System.out.println("Connection 1 is Estd in ATM");
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the numerator");
			int a = scan.nextInt();
			System.out.println("Enter the Denominator");
			int b = scan.nextInt();
			int c = a/b;
			System.out.println(c);
		}
		catch(Exception e)
		{
			System.out.println("Some Problem Occured");
			throw e;
		}
		finally
		{
			System.out.println("Connection 1 is closed in ATM");
		}
	}
}
class exception_finally_block
{
	public static void main(String[] args) {
		System.out.println("Main Connection is Estd");
		ATM a = new ATM();
		try {
			a.alpha();
		} catch (Exception e) {
			System.out.println("Exception handled in main method as well");
		}
		System.out.println("Main Connection is closed");
	}

}