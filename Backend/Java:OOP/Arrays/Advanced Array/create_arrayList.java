import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
//ArrayList
public class create_arrayList
{
	public static void main(String[] args)  {
		long startTimeMillis = System.currentTimeMillis();

		ArrayList al = new ArrayList(20);
		
		System.out.println(al.size());
		
		// Dynamic Array
		al.add("Siddu");
		al.add(100);
		al.add(3.4);
		al.add('c');
		//Follows insert order
		System.out.println(al);
		
		al.add(0,"Singapore");
		System.out.println(al);
		
		
		al.remove(0);
		al.remove("Siddu");
		System.out.println(al);
		
		ArrayList al3 = new ArrayList();
		al3.add("Sabrina");
		al3.add(89.100);
		System.out.println(al3);
		
		al.addAll(1, al3);
		System.out.println(al);
		
		
		al.retainAll(al3);
		System.out.println(al);
		
		System.out.println(al.isEmpty());
		
		al.removeAll(al3);
		System.out.println(al);
		
		
		al.clear();
		System.out.println(al);
		
		long endTimeMillis = System.currentTimeMillis();
        long durationMillis = endTimeMillis - startTimeMillis;

        System.out.println("Execution time in milliseconds: " + durationMillis);
		
	}

}

