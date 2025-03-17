package by.Prileipishev.out.production.L_13_03_2025.TransportManagementSystem.models;

public class Bike extends Transport {

    private boolean hasSidecar;


    public Bike(String model, String licensePlate, int speed, int year, boolean hasSidecar) {
        super(model, licensePlate, speed, year);
        this.hasSidecar = hasSidecar;
    }
}
