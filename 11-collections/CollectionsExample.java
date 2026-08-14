// CollectionsExample.java
// Demonstrates: ArrayList, HashMap, HashSet.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class CollectionsExample {
    public static void main(String[] args) {

        System.out.println("=== ArrayList ===");
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println("\n=== HashMap ===");
        HashMap<String, Integer> ages = new HashMap<>();
        ages.put("Alice", 30);
        ages.put("Bob", 25);
        for (String name : ages.keySet()) {
            System.out.println(name + " is " + ages.get(name));
        }

        System.out.println("\n=== HashSet ===");
        HashSet<Integer> uniqueNumbers = new HashSet<>();
        uniqueNumbers.add(1);
        uniqueNumbers.add(2);
        uniqueNumbers.add(2); // duplicate, ignored
        System.out.println("Unique numbers: " + uniqueNumbers);
    }
}
