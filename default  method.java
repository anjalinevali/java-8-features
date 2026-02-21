interface Vehicle {

    // Default method
    default void start() {
        System.out.println("Vehicle is starting...");
    }

    // Abstract method
    void fuelType();
}

class Car implements Vehicle {

    // Only abstract method must be implemented
    public void fuelType() {
        System.out.println("Petrol");
    }
}

public class Main {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();       // Calling default method
        c.fuelType();
    }
}