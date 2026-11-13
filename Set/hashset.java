
// The Set interface is part of the Java Collections Framework (java.util package). 
// It represents a collection that does not allow duplicate elements.

// //HashSet is a class that implements the Set interface.


package Set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class hashset {
    public static void main(String[] args) {

        Set<Integer> nums = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size: ");
        int size = sc.nextInt();

        System.out.print("Enter Elements: ");
        for (int i = 0; i < size; i++) {
            int value = sc.nextInt();
            nums.add(value);
        }

        System.out.println("Original Set: " + nums);

        System.out.println("Is 7 present? " + nums.contains(7));

        //isEmpty()
        System.out.println("Is Set Empty? " + nums.isEmpty());

        // add()
        nums.add(100);
        System.out.println("After Adding 100: " + nums);

        // remove()
        nums.remove(100);
        System.out.println("After Removing 100: " + nums);

        // Iterate using enhanced for loop
        System.out.print("Elements: ");
        for (Integer num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Create another Set
        Set<Integer> nums2 = new HashSet<>();
        nums2.add(10);
        nums2.add(20);
        nums2.add(30);

        System.out.println("\nSecond Set: " + nums2);

        //Creates a new HashSet containing all elements of nums, 
        //so changes to union do not affect the original set nums.        
        
        // addAll() -> Union
        Set<Integer> union = new HashSet<>(nums);
        union.addAll(nums2);
        System.out.println("Union: " + union);

        // retainAll() -> Intersection
        Set<Integer> intersection = new HashSet<>(nums);
        intersection.retainAll(nums2);
        System.out.println("Intersection: " + intersection);

        // removeAll() -> Difference
        Set<Integer> difference = new HashSet<>(nums);
        difference.removeAll(nums2);
        System.out.println("Difference: " + difference);

        // clear()
        Set<Integer> temp = new HashSet<>(nums);
        temp.clear();
        System.out.println("After clear(): " + temp);
    }
}