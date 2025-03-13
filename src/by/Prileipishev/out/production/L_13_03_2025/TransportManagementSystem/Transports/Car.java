package by.Prileipishev.out.production.L_13_03_2025.TransportManagementSystem.Transports;

import by.Prileipishev.out.production.L_13_03_2025.TransportManagementSystem.User.User;

public class Car extends Transport {

    private String fuelType;

    public Car(String model, String licensePlate, int speed, int year, User user, String fuelType) {
        super(model, licensePlate, speed, year, user);
        this.fuelType = fuelType;
    }
}
