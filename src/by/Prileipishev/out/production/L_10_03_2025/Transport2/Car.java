package by.Prileipishev.out.production.L_10_03_2025.Transport2;

public class Car extends Transport {

    private String fuelType;

    public Car(String model, String licensePlate, int speed, String fuelType) {
        super(model, licensePlate, speed);
        this.fuelType = fuelType;
    }
}
