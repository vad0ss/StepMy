package by.Prileipishev.out.production.L_06_02_2025_HT;

public class Smartphone extends ElectronicDevice {

    int camera;

    public Smartphone(String brand, String model, int power, int camera) {
        super(brand, model, power);
        this.camera = camera;
    }

    @Override
    public String toString() {
        return super.toString() + " камера " + this.camera;
    }

    @Override
    public String getStatus() {
        return " смартфон " + (isOn ? " включен " : " выключен");
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
