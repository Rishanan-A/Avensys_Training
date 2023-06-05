import java.util.Scanner;

public class ex4_5may {

	static boolean stringCheck(String string1) {
		
	    string1 = string1.toLowerCase();
	    
	    char[] string1Char = string1.toCharArray();

	    for (int i = 0; i < string1Char.length; i++) {
	        if (string1Char[i] == 's') {
	            return true;
	        }
	    }
	    return false;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter name 1: ");
		Scanner scan1 = new Scanner(System.in);
		String string1 = scan1.nextLine();
		
		boolean res = stringCheck(string1);
		
		if (res == true ) {
			System.out.println("Name contains S");
		}else {
			System.out.println("Name doesnt Contain S");
		}

	}

}
