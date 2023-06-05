import java.util.LinkedList;

public class create_linkedList {

	public static void main(String[] args)  {
			long startTimeMillis = System.currentTimeMillis();
		
			LinkedList al = new LinkedList();
			
			System.out.println(al.size());
			
			// Dynamic Array
			al.add("Siddu");
			al.add(100);
			al.add(3.4);
			al.add("Siddu");
			al.add('c');
			al.add("Siddu");
			//Follows insert order
			System.out.println(al);
			
			al.removeFirstOccurrence("Siddu");
			System.out.println(al);
			
			al.add(0,"Singapore");
			System.out.println(al);
			
			
			al.remove(0);
			al.remove("Siddu");
			System.out.println(al);
			
			LinkedList al3 = new LinkedList();
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
