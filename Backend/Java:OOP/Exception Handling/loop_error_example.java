class DemoOneOne1
{
	public void alpha()
	{
		try {
		System.out.println("Connection 3 Estd");
		alpha();
		}
		catch(Error e)
		{
			System.out.println("Dont keep alpha method in loop");
			
		}
		System.out.println("Connection 3 is Closed");
	}
}
class loop_error_example
{
	public static void main(String[] args) {
		System.out.println("Main Connection is Estd");
		DemoOneOne1 d1 = new DemoOneOne1();
		d1.alpha();
		System.out.println("Main Connection is closed");
	}

}