package by.Prileipishev.out.production.L_06_03_2025.Transport;

public class Truck extends Transport {

    private double loadCapacity;

    public Truck(String model, int speed, double loadCapacity) {
        super(model, speed);
        this.loadCapacity = loadCapacity;
    }

}
