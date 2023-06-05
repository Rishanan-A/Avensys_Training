
class Demo11 extends Object{
	int a;
	int b;
	public Demo11()
	{
		super();
		a=10;
		b=20;
	}
	public Demo11(int a, int b)
	{
		super();
		this.a=a;
		this.b=b;
	}
}

class Demo22 extends Demo11{
	int a;
	int b;
	public Demo22()
	{
		super();
		a=100;
		b=200;
	}
	public Demo22(int a, int b)
	{
		super();
		this.a=a;
		this.b=b;
	}
}


public class ex1_12may {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo22 d2 = new Demo22(1000,2000);
		System.out.println(d2.a);
		System.out.println(d2.b);
		
		

	}

}


