//Propagation of exceptions
import java.util.Scanner;

class DemoOne1
{
	public void alpha()
	{
		System.out.println("Connection 3 Estd");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Numerator");
		int a = scan.nextInt();
		System.out.println("Enter the Denominator");
		int b = scan.nextInt();
		int c = a/b;
		System.out.println("Result is :" + c);
		System.out.println("Connection 3 is Closed");
	}
}
class DemoTwo2
{
	public void beta()
	{
		System.out.println("Connection 2 is Estd");
		DemoOne1 d1 = new DemoOne1();
		d1.alpha();
		System.out.println("Connection 2 is closed");
	}
}
class DemoThree3
{
	public void gamma()
	{
		System.out.println("Connection 1 is Estd");
		DemoTwo2 d2 = new DemoTwo2();
		d2.beta();
		System.out.println("Connection 1 is closed");
	}
}
class propogation_exception
{
	public static void main(String[] args) {
		System.out.println("Main Connection is Estd");
		DemoThree3 d3 = new DemoThree3();
		d3.gamma();
		System.out.println("Main Connection is closed");
	}

}