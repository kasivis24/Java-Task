abstract class Vehicle {
    abstract void start();
    abstract void stop();
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car is starting with key...");
    }

    void stop() {
        System.out.println("Car is stopping.");
    }
}

class Bike extends Vehicle {
    void start() {
        System.out.println("Bike is kick-started.");
    }

    void stop() {
        System.out.println("Bike has stopped.");
    }
}

class Truck extends Vehicle {
    void start() {
        System.out.println("Truck starts with button.");
    }

    void stop() {
        System.out.println("Truck stops slowly.");
    }
}

