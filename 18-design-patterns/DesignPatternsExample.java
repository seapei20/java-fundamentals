// DesignPatternsExample.java
// Demonstrates: Singleton, Factory, and Observer patterns.

import java.util.ArrayList;
import java.util.List;

// -- Singleton --
class ConfigManager {
    private static ConfigManager instance;
    private String setting = "default";

    private ConfigManager() {}

    static ConfigManager getInstance() {
        if (instance == null) {
            instance = new ConfigManager();
        }
        return instance;
    }

    void setSetting(String setting) { this.setting = setting; }
    String getSetting() { return setting; }
}

// -- Factory --
interface Shape {
    void draw();
}
class Circle implements Shape {
    public void draw() { System.out.println("Drawing a Circle"); }
}
class Square implements Shape {
    public void draw() { System.out.println("Drawing a Square"); }
}
class ShapeFactory {
    static Shape create(String type) {
        if (type.equals("circle")) return new Circle();
        if (type.equals("square")) return new Square();
        throw new IllegalArgumentException("Unknown shape: " + type);
    }
}

// -- Observer --
interface Observer {
    void update(String event);
}
class Logger implements Observer {
    public void update(String event) {
        System.out.println("Logger received: " + event);
    }
}
class EventSource {
    private final List<Observer> observers = new ArrayList<>();

    void subscribe(Observer o) { observers.add(o); }

    void notifyAll(String event) {
        for (Observer o : observers) {
            o.update(event);
        }
    }
}

public class DesignPatternsExample {
    public static void main(String[] args) {

        System.out.println("=== Singleton ===");
        ConfigManager config = ConfigManager.getInstance();
        config.setSetting("production");
        System.out.println("Setting: " + ConfigManager.getInstance().getSetting());

        System.out.println("\n=== Factory ===");
        Shape shape = ShapeFactory.create("circle");
        shape.draw();

        System.out.println("\n=== Observer ===");
        EventSource source = new EventSource();
        source.subscribe(new Logger());
        source.notifyAll("Something happened!");
    }
}
