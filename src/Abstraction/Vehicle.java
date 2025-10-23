package Abstraction;

abstract class Vehicle {
    abstract void start();

    void fuelType() {
        System.out.println("Vehicle uses petrol or diesel");
    }
}

class Bike extends Vehicle {
    void start() {
        System.out.println("Bike starts with a kick");
    }

    public static void main(String[] args) {
        Bike b = new Bike();
        b.start();
        b.fuelType();
    }
}

