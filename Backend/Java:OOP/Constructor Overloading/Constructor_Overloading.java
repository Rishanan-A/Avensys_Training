/* Constructor OverLoading **/
class Student5 extends Object
{
	private String name; 
	private int age;     
	private String city; 
	
	public Student5() 
	{
		//super();
	}
	public Student5(String name, int age, String city)
	{
		this();
		this.name = name;
		this.age = age;
		this.city = city;	
	}
	public Student5(String name, int age)
	{
		this("Sabrina", 18, "Sunraise");
		this.name = name;
		this.age = age;
	}
	public Student5(String name)
	{
		this("Silas",21);
		this.name=name;
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

public class Constructor_Overloading extends Object {
	
	public static void main(String[] args) {
		Student5 s = new Student5("Siddu");
		System.out.println(s.getName());
		System.out.println(s.getAge());
		System.out.println(s.getCity());
	}
}