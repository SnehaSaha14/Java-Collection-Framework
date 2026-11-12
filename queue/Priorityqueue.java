//PriorityQueue is a class in Java that implements the Queue interface but orders elements according
// to their priority rather than strictly FIFO (First In, First Out).
// By default, it uses natural ordering (smallest element first for numbers, alphabetical for strings),
// but you can provide a custom comparator.

// Key Points:
// Implements: Queue interface.
// Underlying structure: Min-heap (default).
// Ordering: Default natural order or custom Comparator.
// Null elements: Not allowed.
// Thread safety: Not synchronized (use PriorityBlockingQueue for thread-safe version).


// Duplicates: Allowed.
package queue;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Priorityqueue{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // PriorityQueue<Integer> nums = new PriorityQueue<>();

        // System.out.print("Enter Size: ");
        // int size = sc.nextInt();

        // System.out.print("Enter numbers: ");
        // for (int i = 0; i < size; i++) {
        //     int values = sc.nextInt();
        //     nums.add(values);
        // }

        // System.out.println("\nElements in PriorityQueue: " + nums);

        // // Add more elements
        // nums.add(10);
        // System.out.println("After adding 10: " + nums);

        // nums.add(45);
        // System.out.println("After adding 45: " + nums);

        // // Remove a specific element
        // nums.remove(4); // removes value 4 if present
        // System.out.println("After removing 4: " + nums);

        // // Size of queue
        // System.out.println("Size of PriorityQueue: " + nums.size());

        // // Peek (view smallest element)
        // System.out.println("Peek (smallest element): " + nums.peek());

        // // Poll (remove smallest element)
        // System.out.println("Poll (remove smallest element): " + nums.poll());
        // System.out.println("After poll: " + nums);

        // sc.close();

      
        

    }
}
