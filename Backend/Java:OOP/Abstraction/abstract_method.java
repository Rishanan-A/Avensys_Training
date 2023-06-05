//Abstraction -  providing the signature of the methods but not implementation
abstract class Teacher3 // since we have abstract method in the class then the class should abstract
{
	abstract public void teach(); // By declaring the methods as abstract methods
	
	abstract public void doExp();

}
class PhysicsTeacher3 extends Teacher3
{
	public void teach()
	{
		System.out.println("Physics Teacher is teaching Physics");
	}
	public void doExp()
	{
		System.out.println("Physics teacher is doing expreiment");
	}
}
class ChemistryTeacher3 extends Teacher3
{
	public void teach()
	{
		System.out.println("Chemistry Teacher is teaching Chemistry");
	}
	public void doExp()
	{
		System.out.println("Chemistry teacher is doing expreiment");
	}

}
class BiologyTeacher3 extends Teacher3
{
	public void teach()
	{
		System.out.println("Biology Teacher is teaching Biology");
	}
	public void doExp()
	{
		System.out.println("Biology teacher is doing expreiment");
	}

}
class College3
{
	public void acceptTeacher(Teacher3 ref)
	{
		ref.teach();
		ref.doExp();
	}
}
class abstract_method extends Object {
	
	public static void main(String[] args) {
		PhysicsTeacher3 pt = new PhysicsTeacher3(); 
		ChemistryTeacher3 ct = new ChemistryTeacher3();
		BiologyTeacher3 bt = new BiologyTeacher3(); 
		College3 c = new College3();
		c.acceptTeacher(pt);
		c.acceptTeacher(ct);
		c.acceptTeacher(bt);
	} 
}