package by.Prileipishev.out.production.L_06_02_2025;

public class ElectronicDevice {

    private String brand;
    private String model;
    private int power;
    private boolean isOn;

    public ElectronicDevice(String brand, String model, int power) {
        this.brand = brand;
        this.model = model;
        this.power = power;
    }

    public void turnOn() {
        this.isOn = true;
        System.out.println(this.model + " от " + this.brand + (!this.isOn ? " выключен " : " включен "));
    }


}
