package by.Prileipishev.out.production.L_06_02_2025_HT;

public abstract class ElectronicDevice {

    protected String brand;
    protected String model;
    protected int power;
    protected boolean isOn;

    public ElectronicDevice(String brand, String model, int power) {
        this.brand = brand;
        this.model = model;
        this.power = power;
    }

    public abstract void turnOn();

    public abstract void turnOff();

    public abstract String getStatus();


    @Override
    public String toString() {
        return "Устройство: " + this.brand + " " + this.model + ", мощность: " + this.power + " Вт";
    }

}
