package by.Prileipishev.out.production.L_13_03_2025.TransportManagementSystem.Transports;

import by.Prileipishev.out.production.L_13_03_2025.TransportManagementSystem.User.User;

public class Bike extends Transport {

    private boolean hasSidecar;


    public Bike(String model, String licensePlate, int speed, int year, User user, boolean hasSidecar) {
        super(model, licensePlate, speed, year, user);
        this.hasSidecar = hasSidecar;
    }
}
