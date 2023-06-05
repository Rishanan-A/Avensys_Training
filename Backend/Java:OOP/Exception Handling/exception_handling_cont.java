import java.util.Scanner;
//First way: Handling the exception using try and catch block
class DemoOne5
{
	public void alpha()
	{
		try
		{
			System.out.println("Connection 1 is Estd");
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
			e.printStackTrace();
		}
		System.out.println("Connection 1 is closed");
	}
}
class exception_handling_cont
{
	public static void main(String[] args) {
		System.out.println("Main Connection is Estd");
		DemoOne5 d1 = new DemoOne5();
		d1.alpha();
		System.out.println("Main Connection is closed");
	}

}