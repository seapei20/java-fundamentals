// GenericsExample.java
// Demonstrates: generic classes and methods.

class Box<T> {
    private T content;

    void set(T content) {
        this.content = content;
    }

    T get() {
        return content;
    }
}

public class GenericsExample {

    static <T> void printItem(T item) {
        System.out.println("Item: " + item);
    }

    public static void main(String[] args) {

        System.out.println("=== Generic Class ===");
        Box<String> stringBox = new Box<>();
        stringBox.set("Hello Generics");
        System.out.println(stringBox.get());

        Box<Integer> intBox = new Box<>();
        intBox.set(42);
        System.out.println(intBox.get());

        System.out.println("\n=== Generic Method ===");
        printItem("A string");
        printItem(123);
    }
}
