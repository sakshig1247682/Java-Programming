// Create an abstract class Vehicle with an abstract method start(). Implement two subclasses, Car and Bike, which provide their own implementation of start(). Demonstrate their functionality in the main method.

// Abstract class
abstract class Vehicle {
    // Abstract method (to be implemented by subclasses)
    abstract void start();
}

// Subclass Car that extends Vehicle
class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car starts with a key ignition.");
    }
}

// Subclass Bike that extends Vehicle
class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Bike starts with a self-start button.");
    }
}

// Main class to test functionality
public class Main {
    public static void main(String[] args) {
        Vehicle myCar = new Car(); // Creating an object of Car
        myCar.start(); // Calling start method

        Vehicle myBike = new Bike(); // Creating an object of Bike
        myBike.start(); // Calling start method
    }
}
