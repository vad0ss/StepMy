package by.Prileipishev.out.production.L_06_03_2025.Transport;

import java.util.Objects;

public class Transport {

    private String model;
    private int speed;


    public Transport(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return speed == transport.speed && Objects.equals(model, transport.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, speed);
    }

    @Override
    public String toString() {
        return "Transport{" +
                "model='" + model + '\'' +
                ", speed=" + speed +
                '}';
    }
}
