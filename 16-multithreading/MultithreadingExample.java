// MultithreadingExample.java
// Demonstrates: Thread, Runnable, and basic concurrency.

class CounterTask implements Runnable {
    private final String name;

    CounterTask(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(name + " count: " + i);
        }
    }
}

public class MultithreadingExample {
    public static void main(String[] args) throws InterruptedException {

        Thread thread1 = new Thread(new CounterTask("Thread-A"));
        Thread thread2 = new Thread(new CounterTask("Thread-B"));

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Both threads finished.");
    }
}
