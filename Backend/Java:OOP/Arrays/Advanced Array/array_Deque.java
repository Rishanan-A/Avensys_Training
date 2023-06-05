import java.util.ArrayDeque;
//Array Deque
class array_Deque
{
	public static void main(String[] args)  {
		
		ArrayDeque ad = new ArrayDeque();// Dynamic Array
		ad.add(10);
		ad.add(20);
		ad.add(30);
		ad.addFirst(100);
		ad.addLast(200);
		System.out.println(ad.getFirst());
		System.out.println(ad.getLast());
		System.out.println(ad);
	}
}