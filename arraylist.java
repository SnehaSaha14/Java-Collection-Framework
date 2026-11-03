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



        ArrayList <String> names = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter the names: ");

        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            names.add(name);
        }
        // names.addFirst("sneha"); // ADDING AT FIRST....
       

        System.out.println(names); // printing all the elements
        System.out.println(names.get(3)); //getting index at 3
        System.out.println(names.contains("nano")); //whether nano is in the list or not

    
    
    
    }



}