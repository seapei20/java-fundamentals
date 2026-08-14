// OopBasicsExample.java
// Demonstrates: classes, objects, constructors.

class Car {
    String model;
    int year;

    Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    void describe() {
        System.out.println(year + " " + model);
    }
}

public class OopBasicsExample {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota Corolla", 2022);
        Car car2 = new Car("Honda Civic", 2023);
        car1.describe();
        car2.describe();
    }
}
