class Teacher
{
	void markAttendance()
	{
		System.out.println("Teacher is marking attendance");
	}
	void teach()
	{
		System.out.println("Techer is teaching");
	}
}
class PhysicsTeacher extends Teacher
{
	void teach() // Overridden Method
	{
		System.out.println("Physics teacher is teaching physics");
	}
	void labExpPhy() // Specialised Method
	{
		System.out.println("Physics teacher is doing experiment in lab");
	}
}
class BoilogyTeacher extends Teacher
{
	void teach() // Overridden Method
	{
		System.out.println("Biology teacher is teaching boilogy");
	}
	void labExpBio() // Specialised Method
	{
		System.out.println("Biology teacher is doing experiment in lab");
	}
}
public class Inhertance_method extends Object {
	
	public static void main(String[] args) {
		
		PhysicsTeacher pt = new PhysicsTeacher();
		pt.markAttendance();
		pt.teach();
		pt.labExpPhy();
		BoilogyTeacher bt = new BoilogyTeacher();
		bt.markAttendance();
		bt.teach();
		bt.labExpBio();
		//
		Teacher ma = new Teacher();
		bt.markAttendance();
		ma.teach();
		
	
	}
}