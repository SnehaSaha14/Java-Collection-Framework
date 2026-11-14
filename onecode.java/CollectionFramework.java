
import java.util.*;


public class CollectionFramework {

    public static void main(String[] args) {

        // 1. ARRAYLIST

        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);

        System.out.println("ArrayList: " + arrayList);

        System.out.println("Element at index 1: "
                + arrayList.get(1));

        arrayList.set(1, 25);
        System.out.println("After update: " + arrayList);

        arrayList.remove(2);
        System.out.println("After remove: " + arrayList);

        System.out.println("Contains 10? "
                + arrayList.contains(10));

        System.out.println("Size: "
                + arrayList.size());


        // 2. LINKEDLIST

        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);

        System.out.println("\nLinkedList: " + linkedList);

        linkedList.addFirst(5);
        linkedList.addLast(40);

        System.out.println("After addFirst & addLast: "
                + linkedList);

        System.out.println("First: "
                + linkedList.getFirst());

        System.out.println("Last: "
                + linkedList.getLast());

        linkedList.removeFirst();
        linkedList.removeLast();

        System.out.println("After removing first & last: "
                + linkedList);


        // 3. VECTOR

        Vector<Integer> vector = new Vector<>();

        vector.add(10);
        vector.add(20);
        vector.add(30);

        System.out.println("\nVector: " + vector);

        vector.addElement(40);

        System.out.println("After addElement: "
                + vector);

        System.out.println("Element at index 1: "
                + vector.elementAt(1));

        vector.remove(1);

        System.out.println("After remove: "
                + vector);


        // 4. STACK

        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("\nStack: " + stack);

        System.out.println("Top element: "
                + stack.peek());

        System.out.println("Removed: "
                + stack.pop());

        System.out.println("After pop: "
                + stack);

        System.out.println("Position of 10: "
                + stack.search(10));


        // 5. HASHSET

        HashSet<Integer> hashSet = new HashSet<>();

        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(30);
        hashSet.add(20);     // Duplicate

        System.out.println("\nHashSet: " + hashSet);

        System.out.println("Contains 20? "
                + hashSet.contains(20));

        hashSet.remove(10);

        System.out.println("After remove: "
                + hashSet);


        // 6. LINKEDHASHSET

        LinkedHashSet<Integer> linkedHashSet =
                new LinkedHashSet<>();

        linkedHashSet.add(30);
        linkedHashSet.add(10);
        linkedHashSet.add(20);
        linkedHashSet.add(10);    // Duplicate

        System.out.println("\nLinkedHashSet: "
                + linkedHashSet);

        System.out.println("Contains 20? "
                + linkedHashSet.contains(20));

        linkedHashSet.remove(30);

        System.out.println("After remove: "
                + linkedHashSet);


        // 7. TREESET

        TreeSet<Integer> treeSet = new TreeSet<>();

        treeSet.add(30);
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(40);

        System.out.println("\nTreeSet: " + treeSet);

        System.out.println("First: "
                + treeSet.first());

        System.out.println("Last: "
                + treeSet.last());

        System.out.println("Higher than 20: "
                + treeSet.higher(20));

        System.out.println("Lower than 20: "
                + treeSet.lower(20));


        // 8. PRIORITYQUEUE

        PriorityQueue<Integer> priorityQueue =
                new PriorityQueue<>();

        priorityQueue.offer(30);
        priorityQueue.offer(10);
        priorityQueue.offer(20);

        System.out.println("\nPriorityQueue: "
                + priorityQueue);

        System.out.println("Highest Priority Element: "
                + priorityQueue.peek());

        System.out.println("Removed: "
                + priorityQueue.poll());

        System.out.println("After poll: "
                + priorityQueue);


        // 9. ARRAYDEQUE

        ArrayDeque<Integer> deque =
                new ArrayDeque<>();

        deque.addFirst(20);
        deque.addLast(30);
        deque.addFirst(10);
        deque.addLast(40);

        System.out.println("\nArrayDeque: "
                + deque);

        System.out.println("First: "
                + deque.peekFirst());

        System.out.println("Last: "
                + deque.peekLast());

        deque.removeFirst();
        deque.removeLast();

        System.out.println("After removing first & last: "
                + deque);


        // 10. ITERATION

        System.out.println("\nArrayList Elements:");

        for (Integer value : arrayList) {
            System.out.println(value);
        }


        // 11. SIZE & EMPTY CHECK

        System.out.println("\nArrayList Size: "
                + arrayList.size());

        System.out.println("Is ArrayList Empty? "
                + arrayList.isEmpty());

        System.out.println("HashSet Size: "
                + hashSet.size());

        System.out.println("Is HashSet Empty? "
                + hashSet.isEmpty());


        // END

        System.out.println(
                "\n===== COLLECTION FRAMEWORK COMPLETED =====");
    }
}