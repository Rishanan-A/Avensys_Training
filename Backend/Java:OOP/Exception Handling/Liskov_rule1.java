//Liskov's Substitution Principle 

class DemoOne6
{
	public void greet()throws ArithmeticException, ClassNotFoundException
	{
		System.out.println("Hello Team!!");
	}
}
class DemoTwo6 extends DemoOne6
{
	public void greet()throws ClassNotFoundException //not is-a
	{
		System.out.println("Hello Team From Siddu!!");
	}
}
class Liskov_rule1
{
	public static void main(String[] args)  {
		System.out.println("Main Connection is Estd");
		System.out.println("Main Connection is closed");
	}

}