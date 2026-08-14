// InheritanceExample.java
// Demonstrates: extending classes, super.

class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void makeSound() {
        System.out.println(name + " makes a sound.");
    }
}

class Dog extends Animal {
    Dog(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println(name + " barks.");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Animal generic = new Animal("Generic Animal");
        Dog dog = new Dog("Rex");
        generic.makeSound();
        dog.makeSound();
    }
}
