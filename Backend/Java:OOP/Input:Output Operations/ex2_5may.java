import java.util.Scanner;
public class ex2_5may {
	
	static boolean nameCheck(String name1, String name2) {
		return name1.equals(name2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter name 1: ");
		Scanner scan1 = new Scanner(System.in);
		String name1 = scan1.nextLine();
		
		System.out.println("Enter name 2: ");
		Scanner scan2 = new Scanner(System.in);
		String name2 = scan2.nextLine();
		
		boolean res = nameCheck(name1, name2);
		
		System.out.println(res);
		
		
	}

}
