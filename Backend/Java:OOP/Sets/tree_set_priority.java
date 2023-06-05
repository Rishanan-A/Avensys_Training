import java.util.TreeSet;

public class tree_set_priority
{
	public static void main(String[] args)  {
		
		TreeSet ts = new TreeSet(); // Red - Black algorithm
	
		ts.add(10);
		ts.add(20);
		ts.add(30);
		ts.add(40);
		
		System.out.println(ts.ceiling(8));
		System.out.println(ts.floor(35));
		System.out.println(ts.higher(10));
		System.out.println(ts.lower(20));
	}
}