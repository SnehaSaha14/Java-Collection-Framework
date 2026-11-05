package list;

import java.util.LinkedList;
import java.util.Scanner;

public class linkedlist {

//List is an interface, and LinkedList is a class that implements the List interface.
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            LinkedList <Integer> nums = new LinkedList<>();

            System.out.print("Enter Size: ");
            int size = sc.nextInt();

            System.out.print("Enter the elements: ");
            for (int i =0 ; i < size ; i++){
                int values = sc.nextInt();
                nums.add(values);

            }
            System.out.println("Original Linked List:" +nums);

         
            nums.add(1 ,70);
            System.out.println("After adding : "+nums);

    
            System.out.println("At Particular Index: "+nums.get(3));

            System.out.println("After Set Function: "+nums.set(2, 40));

            System.out.println("After removing: "+nums.remove(3));

            System.out.println("Values Containing are: "+nums.contains(1));

            




            
        }
    
}
