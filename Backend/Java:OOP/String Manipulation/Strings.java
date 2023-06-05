
public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Use string buffer or builder
		
		StringBuilder sb = new StringBuilder ();
		
		sb.append("Welcome to Java Programming.");
		
		System.out.println(sb.equals(sb));
		System.out.println("");
		
		
		System.out.println(sb.compareTo(sb));
		System.out.println("");
		
		
		System.out.println(sb.charAt(1) );
		System.out.println("");
		
		
		System.out.println(sb.substring(16));
		System.out.println("");
		
		
		System.out.println(sb.substring(0, 5));
		System.out.println("");
		
		
		System.out.println(sb.append(" This is cool."));
		System.out.println("");
		
		
		System.out.println(sb.insert(0, "T"));
		System.out.println("");
		
		
		System.out.println(sb.reverse() );
		System.out.println("");
		
		sb.ensureCapacity(10); 
		System.out.println(sb);
		System.out.println("");
		
		System.out.println(sb.length());

	}

}
