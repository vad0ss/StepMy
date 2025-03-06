package by.Prileipishev.out.production.L_06_03_2025.Transport;

public class Bike extends Transport {

    private boolean hasSidecar;


    public Bike(String model, int speed, boolean hasSidecar) {
        super(model, speed);
        this.hasSidecar = hasSidecar;
    }


}
