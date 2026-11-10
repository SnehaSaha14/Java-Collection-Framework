package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class LinkedListDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // FIFO: Front = Deletion, Rear = Insertion
        Queue<Integer> nums = new LinkedList<>();

        System.out.print("Enter Size: ");
        int size = sc.nextInt();

        System.out.print("Enter Elements: ");
        for (int i = 0; i < size; i++) {
            int values = sc.nextInt();
            nums.add(values);
        }

        System.out.println("Original Queue: " + nums);

        // DIFFERENT OPERATIONS
        System.out.println("Front element (peek): " + nums.peek()); // View head without removing
        System.out.println("Removed element (poll): " + nums.poll()); // Remove head
        System.out.println("Queue after poll: " + nums);

        // Insert element at end using offer()
        System.out.println("Offer 50: " + nums.offer(50));
        System.out.println("Queue after offer: " + nums);

        // Insert element at end using add()
        System.out.println("Add 89: " + nums.add(89));
        System.out.println("Queue after add: " + nums);

        sc.close();
    }
}

