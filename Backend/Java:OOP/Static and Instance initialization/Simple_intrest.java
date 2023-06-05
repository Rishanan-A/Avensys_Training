import java.util.Scanner;

/*WHY we need Static*/
class BusinessMan
{
	int p;
	int t;
	static float r; // with static
	float SI;
	
	public void acceptInput()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Principle Amount");
		p = scan.nextInt();
		System.out.println("Enter the Time");
		t = scan.nextInt();
		r = 2f;
	}
	
	public void findSI()
	{
		SI = (p*t*r)/100;
	}
	
	public void display()
	{
		System.out.println("Simple Intrest is :" + SI);
	}
}
public class Simple_intrest extends Object {
	
	public static void main(String[] args) {
		BusinessMan b1 = new BusinessMan();
		BusinessMan b2 = new BusinessMan();
		BusinessMan b3 = new BusinessMan();
		b1.acceptInput();
		b1.findSI();
		b1.display();
		System.out.println("**************************");
		b2.acceptInput();
		b2.findSI();
		b2.display();
		System.out.println("**************************");
		b3.acceptInput();
		b3.findSI();
		b3.display();
	}
}