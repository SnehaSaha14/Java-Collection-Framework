
import java.util.ArrayList;
import java.util.Scanner;

public class arraylist {
    public static void main(String[] args) {

//Iritration...........
        // ArrayList<Integer> nums = new ArrayList<>();
        // Scanner sc = new Scanner(System.in);

        // System.out.print("Enter Size: ");
        // int size = sc.nextInt();

        // System.out.print("Enter Numbers: ");

        // for (int i = 0; i < size; i++) {
        //     int values = sc.nextInt();
        //     nums.add(values);
        // }

        // System.out.println("Numbers: " + nums);


//COLLECTION FRAMEWORK...........
        // Scanner sc = new Scanner(System.in);
        // ArrayList <String> names = new ArrayList<>();
        // System.out.print("Enter the Size: ");
        // int size = sc.nextInt();
        // sc.nextLine();

        // System.out.print("Enter the Names: ");
        // for (int i =0; i <size ; i++){
        //     String values = sc.nextLine();
        //     names.add(values);
        // }
        // System.out.println("Names are: "+names);



        // ArrayList <String> names = new ArrayList<>();
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number of elements: ");
        // int n = sc.nextInt();
        // sc.nextLine();

        // System.out.println("Enter the names: ");

        // for (int i = 0; i < n; i++) {
        //     String name = sc.nextLine();
        //     names.add(name);
        // }
        // // names.addFirst("sneha"); // ADDING AT FIRST....
       

        // System.out.println(names); // printing all the elements
        // System.out.println(names.get(3)); //getting index at 3
        // System.out.println(names.contains("nano")); //whether nano is in the list or not



        //SUM OF NUMBERS...
       Scanner sc = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();

        // System.out.println("Enter the Size: ");
        // int size = sc.nextInt();

        // System.out.println("Enter the numbers: ");
        // int sum = 0; // variable to store sum
        // for (int i = 0; i < size; i++) {
        //     int num = sc.nextInt();
        //     nums.add(num);
        //     sum += num; // add to sum
        // }

        // System.out.println("Numbers entered: " + nums);
        // System.out.println("Sum of numbers: " + sum);




        //FACTORIAL
        // System.out.println("Enter a number: ");
        // int n = sc.nextInt();

        // int factorial = 1; // use long to handle bigger results
        // for (int i = 1; i <= n; i++) {
        //     factorial *= i;
        // }

        // System.out.println("Factorial of " + n + " is: " + factorial);


        // sc.close();



         
        // Creating an Array of string type
        ArrayList<String> al = new ArrayList<>();

        // 1. Adding elements to ArrayList at the end
        al.add("Geeks");
        al.add("Geeks");

      	System.out.println("Original List : "+al);
      	
      	// Adding Elements at the specific index
        al.add(1, "For");

      	System.out.println("After Adding element at index 1 : "+ al);
      	
      	// 2. Removing Element using index
      	al.remove(0);
      
      	System.out.println("Element removed from index 0 : "+ al);
      	
      	// Removing Element using the value
      	al.remove("Geeks");
      
      	System.out.println("Element Geeks removed : "+ al);
      	
      	// 3. Updating value at index 0
      	al.set(0, "GFG");
      
        System.out.println("List after updation of value : "+al);
    }
}
        


    
    
    
    