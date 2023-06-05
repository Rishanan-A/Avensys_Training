import java.util.HashSet;
import java.util.LinkedHashSet;

//Hash Set [Best at searching]
public class hash_set
{
	public static void main(String[] args)  {
		HashSet hs = new HashSet(); // Hashing algorithm
		hs.add(100);
		hs.add(150);
		hs.add(75);
		hs.add(50);
		System.out.println(hs); // insertion order will not be preserved
		Linked_hash();
	}
	static void Linked_hash()  {
		LinkedHashSet hs = new LinkedHashSet(); // Hashing algorithm
		hs.add(100);
		hs.add(150);
		hs.add(75);
		hs.add(50);
		System.out.println(hs); // insertion order will not be preserved
	}
}