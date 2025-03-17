package by.Prileipishev.out.production.L_13_03_2025.TransportManagementSystem.Transports;

import by.Prileipishev.out.production.L_13_03_2025.TransportManagementSystem.User.User;

import java.util.Objects;

public class Transport {

    private final String model;
    private final String licensePlate;
    private final int speed;
    private final int year;
    private final User user;

    public Transport(String model, String licensePlate, int speed, int year, User user) {
        this.model = model;
        this.licensePlate = licensePlate;
        this.speed = speed;
        this.year = year;
        this.user = user;
    }

    public User getUser() {
        return user;
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
