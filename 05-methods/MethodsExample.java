// MethodsExample.java
// Demonstrates: defining methods, parameters, return values, and overloading.

public class MethodsExample {

    // -- A method with no parameters and no return value --
    static void greet() {
        System.out.println("Hello from a method!");
    }

    // -- A method with parameters and a return value --
    static int add(int a, int b) {
        return a + b;
    }

    // -- Overloading: same name, different parameters --
    static double add(double a, double b) {
        return a + b;
    }

    // -- A method that calls another method --
    static int square(int n) {
        return multiply(n, n);
    }

    static int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {

        System.out.println("=== Basic Method Call ===");
        greet();

        System.out.println("\n=== Parameters and Return Values ===");
        int sum = add(5, 7);
        System.out.println("add(5, 7) = " + sum);

        System.out.println("\n=== Method Overloading ===");
        double doubleSum = add(2.5, 3.5);
        System.out.println("add(2.5, 3.5) = " + doubleSum);

        System.out.println("\n=== Method Calling Another Method ===");
        int squared = square(6);
        System.out.println("square(6) = " + squared);
    }
}
