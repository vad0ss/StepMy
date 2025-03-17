package by.Prileipishev.out.production.L_13_03_2025.TransportManagementSystem.models;

import java.util.Objects;

public class Transport {

    private final String model;
    private final String licensePlate;
    private final int speed;
    private final int year;
    private User user;

    public Transport(String model, String licensePlate, int speed, int year) {
        this.model = model;
        this.licensePlate = licensePlate;
        this.speed = speed;
        this.year = year;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getModel() {
        return model;
    }

    public int getSpeed() {
        return speed;
    }

    public int getYear() {
        return year;
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
        return "Транспорт: " + "модель ='" + model + '\'' + ", максимальная скорость = " + speed + ", номер = " + licensePlate + " год выпуска: " + year + " владелец " + user.getName() + " " + user.getSurname() + " " + getClass().getSimpleName();
    }


}
