

import java.util.Scanner;
import java.util.Stack;

public class stack {
    public static void main(String[] args) {

// STACK OPERATIONS............
        // Stack<Integer> nums= new Stack<>();
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter Size: ");
        // int size = sc.nextInt();

        // System.out.print("Enter the elements: ");
        // for(int i =0 ; i <size;i++){
        //     int values = sc.nextInt();
        //     nums.push(values);
        // }
        // System.out.println("Stack: " + nums);

        // System.out.println("Top element: " + nums.peek());

        // System.out.println("Removed element: " + nums.pop());

        // System.out.println("Updated Stack: " + nums);

// OPERATIONS.........
        Stack<Integer>nums = new Stack<>();
        nums.push(10);
        nums.push(20);
        nums.push(30);
        nums.push(40);
        nums.push(50);
        System.out.println("original stack: "+nums);

        nums.pop();
        System.out.println("updated stack is: "+nums);

        int index =1;
        nums.remove(index);
        System.out.println("Particular Index at " + index + " , Stack looks like" +nums);

        System.out.println("New Stack: "+nums);

        nums.set(1, 70);
        System.out.println("Replaced Stack is: "+nums);

        System.out.println("Last Element is: "+nums.peek());

        System.out.println("checking whether stack is empty or not: "+nums.isEmpty());

        System.out.println("Index Searching Element: "+nums.search(70)); // returned index
        System.out.println("Index Searching Element: "+nums.search(60)); // returned -1, element not found




    



  }
    
}
