package by.Prileipishev.out.production.L_10_03_2025.Transport2;

import java.util.Objects;

public class Transport {

    private String model;
    private String licensePlate;
    private int speed;


    public Transport(String model, String licensePlate, int speed) {
        this.model = model;
        this.licensePlate = licensePlate;
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
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Objects.equals(licensePlate, transport.licensePlate);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(licensePlate);
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    @Override
    public String toString() {
        return "Транспорт: " +
                "модель ='" + model + '\'' +
                ", максимальная скорость =" + speed + ", номер = " + licensePlate + " " + getClass().getSimpleName();
    }
}
