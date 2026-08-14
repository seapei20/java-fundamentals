// PolymorphismExample.java
// Demonstrates: method overriding, dynamic dispatch.

class Shape {
    double area() {
        return 0;
    }
}

class Circle extends Shape {
    double radius;
    Circle(double radius) { this.radius = radius; }
    @Override
    double area() { return Math.PI * radius * radius; }
}

class Square extends Shape {
    double side;
    Square(double side) { this.side = side; }
    @Override
    double area() { return side * side; }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        Shape[] shapes = { new Circle(3), new Square(4) };
        for (Shape shape : shapes) {
            // Dynamic dispatch: the correct area() is chosen at runtime
            System.out.println("Area: " + shape.area());
        }
    }
}
