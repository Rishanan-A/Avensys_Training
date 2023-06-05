

abstract class bird2 // 2. An abstract Parent class can have abstract child class 5.[Pure abstract class]
{
	abstract public void fly(); //abstract
	abstract public void eat(); // abstract 
}
abstract class Eagle extends bird2 // 1.An abstract class can have parent class Abstract 6.[Impure abstract class]
{
	//eat();  // abstract 
	public void fly() // non abstract
	{
		System.out.println("Eagles are flying at high altitude");
	}
}
abstract class Sparrow extends bird2
{
	public void fly()
	{
		System.out.println("Saprrows are flying at low altitude");
	}
}
class GoldenEagle extends Eagle // 3. An abstract class can have concrete class as child
{
	public void eat()
	{
		System.out.println("Golden eagle hunts fishes and eat");
	}
}
class SerpantEagle extends Eagle //4. A concrete class can have parent class as abstract
{
	public void eat()
	{
		System.out.println("Serpant eagle hunts snakes and eat");
	}
}
class VegSparrow extends Sparrow
{
	public void eat()
	{
		System.out.println("Veg Sparrow eats grains");
	}
}
class NonVegSparrow extends Sparrow
{
	public void eat()
	{
		System.out.println("Non Veg Sparrow eats Insects");
	}
}
class Sky
{
	public void acceptbird2s(bird2 ref)
	{
		ref.fly();
		ref.eat();
	}
}
class abstract_rules extends Object {
	
	public static void main(String[] args) {
		
		GoldenEagle ge = new GoldenEagle();
		SerpantEagle se = new SerpantEagle();
		VegSparrow vs = new VegSparrow();
		NonVegSparrow nvs = new NonVegSparrow();
		Sky s = new Sky();
		s.acceptbird2s(ge);
		s.acceptbird2s(se);
		s.acceptbird2s(vs);
		s.acceptbird2s(nvs);
	
	} 
}

//Rule No 7 : You can not create object for abstract classes
abstract class Bird 
{
	abstract public void fly(); 
}
class Eagle extends Bird
{
	public void fly() 
	{
		System.out.println("Eagles are flying at high altitude");
	}
}

class LaunchApp extends Object {
	
	public static void main(String[] args) {
		Bird b = new Bird(); // error : Cannot instantiate the type Bird
	} 
}

//Rule No 8 : class Bird can be either abstract or final, not both bcz we can not achieve abstraction
final abstract class Bird 
{
	abstract public void fly(); 
}
class Eagle extends Bird
{
	public void fly() 
	{
		System.out.println("Eagles are flying at high altitude");
	}
}

class LaunchApp extends Object {
	
	public static void main(String[] args) {
		
	} 
}


//Rule No 9: when we dont want to create object for the classes declare them as abstract
abstract class Bird 
{
	abstract public void fly(); 
}
abstract class Eagle extends Bird
{
	public void fly() 
	{
		System.out.println("Eagles are flying at high altitude");
	}
}

class LaunchApp extends Object {
	
	public static void main(String[] args) {
		
	} 
}