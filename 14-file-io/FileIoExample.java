// FileIoExample.java
// Demonstrates: writing to and reading from a file.

import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class FileIoExample {
    public static void main(String[] args) {

        String fileName = "output.txt";

        System.out.println("=== Writing to a File ===");
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("Line 1: Hello, file!\n");
            writer.write("Line 2: Java file I/O example.\n");
            System.out.println("Write successful.");
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }

        System.out.println("\n=== Reading from a File ===");
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
