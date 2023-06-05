import java.util.ArrayList;
import java.util.LinkedList;

public class ex1_18may {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("ArrayList...\n");
		ArrayList al = new ArrayList();
		
		al.add("Java");
		al.add(100);
		al.add("programming");
		al.add("and");
		al.add("coding");
		al.add(99.5);
		al.add("is");
		al.add(23);
		al.add("fun");
		al.add("N");
		
		System.out.println(al);
		
		//Get Size
		System.out.println("\nSize of ArrayList: " + al.size());
		
		// element at index
        System.out.println("\nElement at index 1: " + al.get(1)); 
        
        //Set
        al.set(1, 30);
        System.out.println("\nSet '30' at pos 0: "+ al);
        
        // Contain?
        System.out.println("\nDoes the AL contain '100': " + al.contains(100)); 
        
        // get index
        System.out.println("\nIndex of 'coding': " + al.indexOf("coding"));
        
        System.out.println("\n\nLinkedList...");
		LinkedList ll = new LinkedList();
				
		ll.add("Java");
		ll.add(100);
		ll.add("programming");
		ll.add("and");
		ll.add("coding");
		ll.add(99.5);
		ll.add("is");
		ll.add(23);
		ll.add("fun");
		ll.add("N");
		
		System.out.println(ll);
		
		// Get the first element
        System.out.println("\nFirst element: " + ll.peekFirst()); 

        // Get the last element 
        System.out.println("\nLast element: " + ll.peekLast()); 
        
        // Insert element at the front of this list
        //method 1
        ll.offerFirst(3);
        System.out.println("\nInsert '3' at pos 0: "+ll);
        //method 2
        ll.addFirst(1);
        System.out.println("\nInsert '1' at pos 0:: " + ll);  
        
        // Insert element at the last of this list
        ll.offerLast(666);
        System.out.println("\nInsert '666' at last pos: "+ll);

	}

}
