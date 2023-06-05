
import java.util.PriorityQueue;

public class priority_queue {
  public static void main(String[] args) {
    // Creating a PriorityQueue
    PriorityQueue numbers = new PriorityQueue();

    // Adding items to the PriorityQueue
    numbers.add(100);
    numbers.add(50);
    numbers.add(150);
    numbers.add(25);
    numbers.add(75);
    numbers.add(125);
    
    System.out.println(numbers);

    // Printing out the elements in the queue
    while (!numbers.isEmpty()) {
      System.out.println(numbers.remove());
    }
    
    System.out.println(numbers);
  }
}
