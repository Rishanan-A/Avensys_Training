

class access{
	static int a,b,c;
	
	static
	{
		a=100;
		b=200;
		c=300;
	}
	
	static void displayOne()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}



class no_access {
	
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
	
	}
}


public class ex2_9may {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		access.displayOne();
		//no_access.displayTwo();

	}

}
