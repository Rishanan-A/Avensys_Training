
public class string_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = new String ("Java programming is fun");
		System.out.println(s1);
		System.out.println("***************************");
		System.out.println(s1.toUpperCase ());
		System.out.println("***************************");
		System.out.println(s1.toLowerCase());
		System.out.println("***************************");
		System.out.println(s1.contains ("fun"));
		System.out.println("***************************");
		System.out.println(s1.contains("Python"));
		System.out.println("***************************");
		System.out.println(s1.indexOf('T'));
		System.out.println("***************************");
		System.out.println(s1.charAt (2));
		System.out.println("***************************");
		System.out.println(s1.substring(5));
		System.out.println("***************************");
		System.out.println(s1.substring(20, 23));

	} 

}
