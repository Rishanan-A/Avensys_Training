import java.util.Scanner;

class Student_class{
	String name;
	int age;
	float marks; // with static
	static String collegeName = "NTU";
	
	public void input()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter student name: ");
		name = scan.nextLine();
		System.out.println("Enter student age: ");
		age = scan.nextInt();
		System.out.println("Enter student marks: ");
		marks = scan.nextFloat();
		
	}
	
	
	public void display()
	{
		System.out.println("\nStudents info: ");
		System.out.println("Student name: "+name);
		System.out.println("Student age: "+age);
		System.out.println("Student marks: "+marks);
		System.out.println("Student college: "+collegeName);
		
	}
	
	
	
}


public class StudentDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student_class s1 = new Student_class();
		Student_class s2 = new Student_class();
		Student_class s3 = new Student_class();
		s1.input();
		s1.display();
		System.out.println("\n**************************\n");
		s2.input();
		s2.display();
		System.out.println("\n**************************\n");
		s3.input();
		s3.display();
		

	}

}
