import java.util.Scanner;
public class ex3_5may {

	
	static boolean stringCheck(String string1, String string2) {
		if  (string1.compareTo(string2)>0) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter string 1: ");
		Scanner scan1 = new Scanner(System.in);
		String string1 = scan1.nextLine();
		
		System.out.println("Enter string 2: ");
		Scanner scan2 = new Scanner(System.in);
		String string2 = scan2.nextLine();
		
		boolean res = stringCheck(string1, string2);
		
		System.out.println(res);
		
		if (res == true ) {
			System.out.println("String 2 is greater");
		}else {
			System.out.println("String 1 is greater");
		}

	}

}
