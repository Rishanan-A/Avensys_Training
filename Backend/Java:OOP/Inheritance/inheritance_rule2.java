// Rule 2: Constructors will not participate in inheritance
class DemoOne extends Object
{
	int a =10;
	int b =20;
	
	public void greet()
	{
		System.out.println("Hello Team!!");
	}
	
	public DemoOne()
	{
		super();
		System.out.println("DemoOne class's constructor");
	}
}
class DemoTwo extends DemoOne
{	
	public DemoTwo()
	{
		super(); // but still you can call parent class constructor using super()
		System.out.println("DemoTwo class's constructor");
	}
}
public class inheritance_rule2 extends Object {
	public static void main(String[] args) {
		DemoTwo d2 = new DemoTwo();
		d2.greet();
		System.out.println(d2.a);
	
	}
}