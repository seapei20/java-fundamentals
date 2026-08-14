// AbstractionExample.java
// Demonstrates: abstract classes and interfaces.

abstract class Vehicle {
    abstract void start();

    void stop() {
        System.out.println("Vehicle stopped.");
    }
}

class ElectricCar extends Vehicle {
    @Override
    void start() {
        System.out.println("Electric car starts silently.");
    }
}

interface Flyable {
    void fly();
}

class Drone implements Flyable {
    @Override
    public void fly() {
        System.out.println("Drone is flying.");
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        Vehicle car = new ElectricCar();
        car.start();
        car.stop();

        Flyable drone = new Drone();
        drone.fly();
    }
}
