// Package: java.util | Interface: Deque<E> | Implemented by: ArrayDeque and LinkedList.
// Hierarchy: Deque extends Queue, and it represents a Double Ended Queue, 
//      where elements can be added or removed from both the front and rear.
package queue;

import java.util.ArrayDeque;
import java.util.Scanner;

public class deque {

    public static void main(String[] args) {

        ArrayDeque<Integer> nums = new ArrayDeque<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size: ");
        int size = sc.nextInt();

        System.out.print("Enter Elements: ");

        for (int i = 0; i < size; i++) {
            int values = sc.nextInt();
            nums.add(values);
        }

        System.out.println("\nOriginal Deque: " + nums);
        // 1. addFirst()
        nums.addFirst(10);
        System.out.println("After addFirst(10): " + nums);

        // 2. addLast()
        nums.addLast(20);
        System.out.println("After addLast(20): " + nums);

        // 3. offerFirst()
        nums.offerFirst(30);
        System.out.println("After offerFirst(30): " + nums);

        // 4. offerLast()
        nums.offerLast(40);
        System.out.println("After offerLast(40): " + nums);

        // 5. getFirst()
        System.out.println("First Element using getFirst(): "
                + nums.getFirst());

        // 6. getLast()
        System.out.println("Last Element using getLast(): "
                + nums.getLast());

        // 7. peekFirst()
        System.out.println("First Element using peekFirst(): "
                + nums.peekFirst());

        // 8. peekLast()
        System.out.println("Last Element using peekLast(): "
                + nums.peekLast());

        // 9. removeFirst()
        System.out.println("Removed First Element: "
                + nums.removeFirst());

        System.out.println("After removeFirst(): " + nums);

        // 10. removeLast()
        System.out.println("Removed Last Element: "
                + nums.removeLast());

        System.out.println("After removeLast(): " + nums);

        // 11. pollFirst()
        System.out.println("Removed First using pollFirst(): "
                + nums.pollFirst());

        System.out.println("After pollFirst(): " + nums);

        // 12. pollLast()
        System.out.println("Removed Last using pollLast(): "
                + nums.pollLast());

        System.out.println("After pollLast(): " + nums);

        // 13. add()
        nums.add(50);
        System.out.println("After add(50): " + nums);

        // 14. remove()
        nums.remove(50);
        System.out.println("After remove(50): " + nums);

        sc.close();
    }
}