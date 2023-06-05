import java.util.Scanner;
public class ex1_5may {
	
	static Boolean getName(String inputName) {
		
		inputName=inputName.toLowerCase();
		return inputName.contains("s");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter name:");
		Scanner scan = new Scanner(System.in);
		
		String name = scan.nextLine();
		
		boolean res=getName(name);
		
		System.out.println(res);
		
				
	}

}
