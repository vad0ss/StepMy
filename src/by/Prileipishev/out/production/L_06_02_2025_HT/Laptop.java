package by.Prileipishev.out.production.L_06_02_2025_HT;

public class Laptop extends ElectronicDevice {

    int battareyTime;

    public Laptop(String brand, String model, int power, int battareyTime) {
        super(brand, model, power);
        this.battareyTime = battareyTime;
    }

    @Override
    public String toString() {
        return super.toString() + " время работы батареи " + this.battareyTime;
    }

    @Override
    public String getStatus() {
        return " лаптоп " + (isOn ? " включен " : " выключен");
    }


    @Override
    public void turnOn() {
        isOn = true;
    }

    @Override
    public void turnOff() {
        isOn = false;
    }
}
