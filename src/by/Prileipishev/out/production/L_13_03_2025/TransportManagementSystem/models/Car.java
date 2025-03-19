package by.Prileipishev.out.production.L_13_03_2025.TransportManagementSystem.models;

public class Car extends Transport {

    private String fuelType;

    public Car(String model, String licensePlate, int speed, int year, String fuelType, double mileage) {
        super(model, licensePlate, speed, year, mileage);
        this.fuelType = fuelType;
    }
}
