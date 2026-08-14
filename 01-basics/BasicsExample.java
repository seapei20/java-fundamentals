// BasicsExample.java
// Demonstrates: primitive types, String, arithmetic operators, comparison operators, and type casting.

public class BasicsExample {
    public static void main(String[] args) {

        // -- Primitive Types --
        System.out.println("=== Primitive Types ===");
        int age = 21;
        double price = 9.99;
        boolean isOnSale = true;
        char grade = 'A';

        System.out.println("Age: " + age);
        System.out.println("Price: " + price);
        System.out.println("Is on sale: " + isOnSale);
        System.out.println("Grade: " + grade);

        // -- String --
        System.out.println("\n=== String ===");
        String name = "Java";
        String greeting = "Hello, " + name + "!";
        System.out.println(greeting);

        // -- Arithmetic Operators --
        System.out.println("\n=== Arithmetic Operators ===");
        int a = 10;
        int b = 3;
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));   // integer division
        System.out.println("a % b = " + (a % b));

        // -- Comparison Operators --
        System.out.println("\n=== Comparison Operators ===");
        System.out.println("a > b: " + (a > b));
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));

        // -- Type Casting --
        System.out.println("\n=== Type Casting ===");
        double d = 9.75;
        int narrowed = (int) d; // narrowing, explicit
        int wholeNumber = 5;
        double widened = wholeNumber; // widening, automatic
        System.out.println("Narrowed (double to int): " + narrowed);
        System.out.println("Widened (int to double): " + widened);
    }
}
