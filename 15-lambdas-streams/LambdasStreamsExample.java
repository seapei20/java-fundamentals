// LambdasStreamsExample.java
// Demonstrates: functional interfaces, lambdas, and the Stream API.

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class LambdasStreamsExample {
    public static void main(String[] args) {

        System.out.println("=== Lambda with a Functional Interface ===");
        Predicate<Integer> isEven = n -> n % 2 == 0;
        System.out.println("Is 4 even? " + isEven.test(4));
        System.out.println("Is 7 even? " + isEven.test(7));

        System.out.println("\n=== Streams ===");
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> evenSquares = numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .collect(Collectors.toList());

        System.out.println("Even squares: " + evenSquares);

        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum of all numbers: " + sum);
    }
}
