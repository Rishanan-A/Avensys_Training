
// Rule 3: Multiple Inheritance is not possible
class DemoOne extends Object
{	
	public void greet()
	{
		System.out.println("Hello Team from DemoOne!!");
	}
}
class DemoTwo extends Object
{	
	public void greet()
	{
		System.out.println("Hello Team from DemoTwo!!");
	}
}
class DemoThree extends DemoOne,DemoTwo
{
	
}
public class LaunchApp extends Object {
	public static void main(String[] args) {
		DemoThree d3 = new DemoThree();
		d3.greet();
	
	}
}

//Rule 4: MultiLevel inheritance is possible
class DemoOne extends Object
{	
	int a = 10;
}
class DemoTwo extends DemoOne
{	
	
}
class DemoThree extends DemoTwo
{
	
}
public class LaunchApp extends Object {
	public static void main(String[] args) {
		DemoThree d3 = new DemoThree();
		System.out.println(d3.a);
	
	}
}

//Rule 5: Cyclic Inheritance is not possible
class DemoOne extends DemoTwo
{	
	public DemoOne()
	{
		super();
	}
}
class DemoTwo extends DemoOne
{	
	public DemoTwo()
	{
		super();
	}
}
public class LaunchApp extends Object {
	
	public static void main(String[] args) {
		
		DemoTwo d2 = new DemoTwo();
	
	}
}