package by.Prileipishev.out.production.L_10_03_2025.Transport2;

public class Bike extends Transport {

    private boolean hasSidecar;


    public Bike(String model, String licensePlate, int speed, boolean hasSidecar) {
        super(model, licensePlate, speed);
        this.hasSidecar = hasSidecar;
    }
}
