package map;

import java.util.Map;
import java.util.TreeMap;

public class treemap {

    //TreeMap stores key-value pairs in sorted order of keys 
    //and is based on a type of self-balancing binary search tree.
    public static void main(String[] args) {
        Map<String , Integer> nums = new TreeMap<>();
        nums.put("one", 1);
        nums.put("Two", 2);
        nums.put("Three", 3);
        nums.put("Four", 4);
        System.out.println(nums);

      // Check whether a key exists
        if (!nums.containsKey("five")) {
            nums.put("five", 5);
        }

        // Alternative: Add only if the key is absent
        nums.putIfAbsent("five", 5);

        // Iterate through the Map
        for (Map.Entry<String, Integer> e : nums.entrySet()) {
            System.out.println(e.getKey() + " = " + e.getValue());
        }

        // Check whether a key exists
        System.out.println(nums.containsKey("seven"));

        // Check whether a value exists
        System.out.println(nums.containsValue(7));

        // Check whether the Map is empty
        System.out.println(nums.isEmpty());

        // Get a value using its key
        System.out.println(nums.get("one"));

        // Remove an entry using its key
        nums.remove("one");

        // Get the size of the Map
        System.out.println(nums.size());

        // Replace a value
        nums.replace("Two", 20);

        // Clear all entries
        nums.clear();


    }
}
