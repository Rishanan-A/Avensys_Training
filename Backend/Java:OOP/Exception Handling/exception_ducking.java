//Second way: Ducking the Exception
import java.util.Scanner;

class ATM1
{
	public void alpha()throws Exception
	{
		try
		{
			System.out.println("Connection 1 is Estd in ATM1");
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the numerator");
			int a = scan.nextInt();
			System.out.println("Enter the Denominator");
			int b = scan.nextInt();
			int c = a/b;
			System.out.println(c);
		}
		finally
		{
			System.out.println("Connection 1 is closed in ATM1");
		}
	}
}
class exception_ducking
{
	public static void main(String[] args)  {
		System.out.println("Main Connection is Estd");
		ATM1 a = new ATM1();
		try {
			a.alpha();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Main Connection is closed");
	}

}