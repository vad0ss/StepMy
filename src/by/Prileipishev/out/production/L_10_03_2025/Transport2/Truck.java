package by.Prileipishev.out.production.L_10_03_2025.Transport2;

public class Truck extends Transport {

    private double loadCapacity;

    public Truck(String model, String licensePlate, int speed, double loadCapacity) {
        super(model, licensePlate, speed);
        this.loadCapacity = loadCapacity;
    }
}
