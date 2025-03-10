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

    public int getSpeed() {
        return speed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return model.equals(transport.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model);
    }

    @Override
    public String toString() {
        return "Transport: " +
                "model='" + model + '\'' +
                ", speed=" + speed + " " + getClass();
    }
}
