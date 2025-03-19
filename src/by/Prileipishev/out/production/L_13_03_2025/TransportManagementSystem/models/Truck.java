package by.Prileipishev.out.production.L_13_03_2025.TransportManagementSystem.models;

public class Truck extends Transport {

    private double loadCapacity;

    public Truck(String model, String licensePlate, int speed, int year, double loadCapacity, double mileage) {
        super(model, licensePlate, speed, year, mileage);
        this.loadCapacity = loadCapacity;
    }
}
