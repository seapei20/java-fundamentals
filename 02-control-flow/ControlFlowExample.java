// ControlFlowExample.java
// Demonstrates: if/else if/else statements and switch statements.

public class ControlFlowExample {

    public static void main(String[] args) {

        // -- 1. if / else if / else --
        // Checks a condition and runs the matching block.
        int number = 10;

        System.out.println("=== If / Else ===");
        if (number > 0) {
            System.out.println(number + " is positive.");
        } else if (number < 0) {
            System.out.println(number + " is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        // -- 2. Switch Statement --
        // Cleaner than if/else when checking one variable against fixed values.
        char grade = 'B';

        System.out.println("\n=== Switch ===");
        switch (grade) {
            case 'A':
                System.out.println("Excellent!");
                break;
            case 'B':
                System.out.println("Well done!");
                break;
            case 'C':
                System.out.println("Good!");
                break;
            default:
                System.out.println("Invalid grade.");
        }
    }
}

/*
 * Summary
 * -------
 * - if/else checks conditions that can be any boolean expression.
 * - switch is cleaner when one variable is matched against fixed values.
 * - Always include a default case in a switch to handle unexpected values.
 * - break stops execution from falling into the next case.
 */
