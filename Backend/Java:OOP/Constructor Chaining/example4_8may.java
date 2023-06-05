/* Local Chaining **/
class Object2
{
	public Object2()
	{
		// Intialise
	}
}
class Student4 extends Object
{
	private String name; 
	private int age;     
	private String city; 
	
	public Student4() 
	{
		//super();
	}
	
	public Student4(String name, int age, String city)
	{
		this();
		this.name = name;
		this.age = age;
		this.city = city;	
	}
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	public String getCity()
	{
		return city;
	}
}

public class example4_8may extends Object {
	
	public static void main(String[] args) {
		Student4 s = new Student4("Siddu",23,"Singapore");
		System.out.println(s.getName());
		System.out.println(s.getAge());
		System.out.println(s.getCity());
	}
}