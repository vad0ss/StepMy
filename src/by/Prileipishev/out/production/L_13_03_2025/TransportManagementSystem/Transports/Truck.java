package by.Prileipishev.out.production.L_13_03_2025.TransportManagementSystem.Transports;

import by.Prileipishev.out.production.L_13_03_2025.TransportManagementSystem.User.User;

public class Truck extends Transport {

    private double loadCapacity;

    public Truck(String model, String licensePlate, int speed, int year, User user, double loadCapacity) {
        super(model, licensePlate, speed, year, user);
        this.loadCapacity = loadCapacity;
    }
}
