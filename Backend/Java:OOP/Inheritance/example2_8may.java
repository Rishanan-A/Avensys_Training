class Student1 extends Object
{
	private String name; 
	private int age;     
	private String city; 
	
	public Student1(String name, int age , String city)
	{
		super(); // to call parent class constructor
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

public class example2_8may extends Object {
	
	public static void main(String[] args) {
		Student1 s = new Student1("Siddu",23,"Singapore");
		System.out.println(s.getName());
		System.out.println(s.getAge());
		System.out.println(s.getCity());
	}
}