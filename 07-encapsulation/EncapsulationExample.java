// EncapsulationExample.java
// Demonstrates: private fields, getters/setters.

class BankAccount {
    private double balance;

    BankAccount(double startingBalance) {
        this.balance = startingBalance;
    }

    double getBalance() {
        return balance;
    }

    void deposit(double amount) {
        if (amount > 0) balance += amount;
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) balance -= amount;
    }
}

public class EncapsulationExample {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(100.0);
        account.deposit(50.0);
        account.withdraw(30.0);
        System.out.println("Final balance: " + account.getBalance());
    }
}
