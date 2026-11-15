package map;
//map stores in Key : Value pair...
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class hashmap {
    public static void main(String[] args) {
        // map....
      Map<String, String> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of entries: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < n; i++) {
            System.out.print("Enter key: ");
            String key = sc.nextLine();
            System.out.print("Enter value: ");
            String value = sc.nextLine();
            map.put(key, value);
        }

        System.out.println("Enteries are: " + map);

         // 1. get()
        System.out.print("\nEnter key to search: ");
        String searchKey = sc.nextLine();

        System.out.println("Value = " + map.get(searchKey));
        
        // 2. containsKey()
        System.out.println("\nDoes key exist? " +
                map.containsKey(searchKey));
        
                // 3. containsValue()
        System.out.print("Enter value to search: ");
        String searchValue = sc.nextLine();

        System.out.println("Does value exist? " +
                map.containsValue(searchValue));

        // 4. size()
        System.out.println("\nNumber of entries: " + map.size());

        // 5. isEmpty()
        System.out.println("Is map empty? " + map.isEmpty());

        // 6. replace()
        System.out.print("\nEnter key to replace its value: ");
        String replaceKey = sc.nextLine();

        if (map.containsKey(replaceKey)) {

            System.out.print("Enter new value: ");
            String newValue = sc.nextLine();

            map.replace(replaceKey, newValue);

            System.out.println("After replace: " + map);

        } else {
            System.out.println("Key not found.");
        }

        // 7. remove()
        System.out.print("\nEnter key to remove: ");
        String removeKey = sc.nextLine();

        map.remove(removeKey);

        System.out.println("After remove: " + map);

        // 8. keySet()
        System.out.println("\nAll Keys:");
        System.out.println(map.keySet());

        // 9. values()
        System.out.println("All Values:");
        System.out.println(map.values());

        // 10. entrySet()
        System.out.println("\nKey : Value");

        for (Map.Entry<String, String> entry : map.entrySet()) {

            System.out.println(
                    entry.getKey() + " : " + entry.getValue()
            );
        }

        // 11. clear()
        System.out.println("\nClearing the map...");
        map.clear();

        System.out.println("Map after clear: " + map);
        
        // 12. isEmpty() after clear
        System.out.println("Is map empty? " + map.isEmpty());


    }    
}
