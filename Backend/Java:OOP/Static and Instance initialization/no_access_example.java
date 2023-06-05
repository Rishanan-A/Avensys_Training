class Demo1 extends Object
{
	static int a,b,c;
	
	static
	{
		a=100;
		b=200;
		c=300;
		//m=1000;
		//n=2000;
		//o=3000;
	}
	
	static void displayOne()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		//System.out.println(m);
		//System.out.println(n);
		//System.out.println(o);
	}
	
	int m,n,o;
	
	{
		m=10; 
		n=20; 
		o=30;
	}
	
	void displayTwo()
	{
		System.out.println(m);
		System.out.println(n);
		System.out.println(o);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}

public class no_access_example extends Object {
	
	public static void main(String[] args) {
		Demo1.displayOne();
		Demo1 d = new Demo1();
		d.displayTwo();
	}
}