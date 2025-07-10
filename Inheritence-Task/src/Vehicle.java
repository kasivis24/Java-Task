// Base class
abstract class Vehicle {
    abstract void start();
}

// Derived class: Car
class Car extends Vehicle {
    void start() {
        System.out.println("Car starts with key");
    }
}

// Derived class: Bike
class Bike extends Vehicle {
    void start() {
        System.out.println("Bike starts with kick");
    }
}

// Derived class: Truck
class Truck extends Vehicle {
    void start() {
        System.out.println("Truck starts with button");
    }
}
