// LoopsExample.java
// Demonstrates: for, while, and do-while loops.

public class LoopsExample {

    public static void main(String[] args) {

        // -- 1. For Loop --
        // Use when you know exactly how many times to repeat.
        System.out.println("=== For Loop ===");
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteration: " + i);
        }

        // -- 2. While Loop --
        // Use when you repeat until a condition becomes false.
        System.out.println("\n=== While Loop ===");
        int j = 0;
        while (j < 5) {
            System.out.println("Iteration: " + j);
            j++;
        }

        // -- 3. Do-While Loop --
        // Runs at least once before checking the condition.
        System.out.println("\n=== Do-While Loop ===");
        int k = 0;
        do {
            System.out.println("Iteration: " + k);
            k++;
        } while (k < 5);
    }
}

/*
 * Summary
 * -------
 * - for loop is best when the number of iterations is known upfront.
 * - while loop is best when the number of iterations is unknown.
 * - do-while always runs at least once, even if the condition is false.
 */
