// ExceptionsExample.java
// Demonstrates: try/catch, custom exceptions.

class InsufficientFundsException extends Exception {
    InsufficientFundsException(String message) {
        super(message);
    }
}

public class ExceptionsExample {

    static void withdraw(double balance, double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Not enough funds for this withdrawal.");
        }
        System.out.println("Withdrawal successful: " + amount);
    }

    public static void main(String[] args) {

        System.out.println("=== Built-in Exception ===");
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Caught: " + e.getMessage());
        }

        System.out.println("\n=== Custom Exception ===");
        try {
            withdraw(100.0, 150.0);
        } catch (InsufficientFundsException e) {
            System.out.println("Caught: " + e.getMessage());
        } finally {
            System.out.println("Withdrawal attempt finished.");
        }
    }
}
