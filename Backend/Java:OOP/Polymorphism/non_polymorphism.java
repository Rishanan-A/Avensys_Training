//Non Polymorphic version
class Teacher2
{
	public void teach()
	{
		System.out.println("Teacher is teaching");
	}
}
class PhysicsTeacher2 extends Teacher2
{
	public void teach()
	{
		System.out.println("Physics Teacher is teaching Physics");
	}
}
class ChemistryTeacher extends Teacher2
{
	public void teach()
	{
		System.out.println("Chemistry Teacher is teaching Chemistry");
	}
}
class BiologyTeacher extends Teacher2
{
	public void teach()
	{
		System.out.println("Biology Teacher is teaching Biology");
	}
}
class non_polymorphism extends Object {
	
	public static void main(String[] args) {
		PhysicsTeacher2 pt = new PhysicsTeacher2(); //tight coupling
		ChemistryTeacher ct = new ChemistryTeacher(); //tight coupling
		BiologyTeacher bt = new BiologyTeacher(); //tight coupling
		pt.teach(); // 1 : 1
		ct.teach(); // 1 : 1
		bt.teach(); // 1 : 1 
	} 
}

/*

//Polymorphic version
class Teacher
{
	public void teach()
	{
		System.out.println("Teacher is teaching");
	}
}
class PhysicsTeacher extends Teacher
{
	public void teach()
	{
		System.out.println("Physics Teacher is teaching Physics");
	}
}
class ChemistryTeacher extends Teacher
{
	public void teach()
	{
		System.out.println("Chemistry Teacher is teaching Chemistry");
	}
}
class BiologyTeacher extends Teacher
{
	public void teach()
	{
		System.out.println("Biology Teacher is teaching Biology");
	}
}
class LaunchApp extends Object {
	
	public static void main(String[] args) {
		PhysicsTeacher pt = new PhysicsTeacher(); 
		ChemistryTeacher ct = new ChemistryTeacher();
		BiologyTeacher bt = new BiologyTeacher(); 
		Teacher ref;
		ref = pt;
		ref.teach();
		ref = ct;
		ref.teach();
		ref = bt;
		ref.teach();
	}
}

*/