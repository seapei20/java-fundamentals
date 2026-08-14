// ArraysExample.java
// Demonstrates: declaring arrays, looping over them, and common array operations.

public class ArraysExample {
    public static void main(String[] args) {

        // -- Declaring and Initializing --
        System.out.println("=== Declaring Arrays ===");
        int[] numbers = {10, 20, 30, 40, 50};
        String[] names = {"Alice", "Bob", "Charlie"};

        // -- Looping with a standard for loop --
        System.out.println("\n=== Standard For Loop ===");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Index " + i + ": " + numbers[i]);
        }

        // -- Looping with a for-each loop --
        System.out.println("\n=== For-Each Loop ===");
        for (String name : names) {
            System.out.println("Name: " + name);
        }

        // -- Common Operations --
        System.out.println("\n=== Common Operations ===");
        int sum = 0;
        int max = numbers[0];
        for (int num : numbers) {
            sum += num;
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Sum: " + sum);
        System.out.println("Max: " + max);
        System.out.println("Array length: " + numbers.length);

        // -- Modifying an element --
        System.out.println("\n=== Modifying Elements ===");
        numbers[0] = 99;
        System.out.println("First element changed to: " + numbers[0]);
    }
}
