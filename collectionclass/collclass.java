package collectionclass;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import org.xml.sax.SAXException;

public class collclass {
    public static void main(String[] args) {
        List <Integer> nums = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size: ");
        int size = sc.nextInt();
        System.out.print("Enter elemenet: ");
        for (int i =0; i < size ; i++){
            int values = sc.nextInt();
            nums.add(values);

        }
        System.out.println(nums);
        System.out.println("Min element: "+Collections.min(nums));
        System.out.println("Max element: "+Collections.max(nums));
        System.out.println("Element Present: "+Collections.frequency(nums, 2)); //occurance of element
        Collections.sort(nums);
        System.out.println("Sorted elements: " + nums);

        Collections.sort(nums, Collections.reverseOrder()); //reveresing
        System.out.println("Sorted elements: " + nums); 

        Collections.rotate(nums, 2); // Rotating element From Right Side.........
        System.out.println("Right Rotated List: "+nums);

        Collections.rotate(nums, -2); // Rotating element From Left Side.........
        System.out.println("Left Rotation List: "+nums); //on the last operation performed

        // Shuffle the list randomly
        Collections.shuffle(nums);
        System.out.println("Shuffled List: " + nums);

        // Swap two elements (index 0 and 1)
        Collections.swap(nums, 0, 1);
        System.out.println("After Swapping: " + nums);

        // Replace all occurrences of an element
        Collections.replaceAll(nums, 2, 100);
        System.out.println("After Replacing: " + nums);

        // Fill all positions with the same element
        Collections.fill(nums, 5);
        System.out.println("After Filling: " + nums);

        // Find index of an element in a sorted list
        Collections.sort(nums);
        System.out.println("First Occurrence Index: " + Collections.binarySearch(nums, 5));

        // Find index of an element (first occurrence)
        System.out.println("Index of 5: " + nums.indexOf(5));

        // Find last occurrence
        System.out.println("Last Index of 5: " + nums.lastIndexOf(5));

        // Get an unmodifiable view
        List<Integer> readOnly = Collections.unmodifiableList(nums);
        System.out.println("Unmodifiable List: " + readOnly);




    }
}
