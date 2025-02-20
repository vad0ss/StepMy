package by.Prileipishev.out.production.L_06_02_2025_HT;

public class Television extends ElectronicDevice {

    int screenDescription;

    public Television(String brand, String model, int power, int screenDescription) {
        super(brand, model, power);
        this.screenDescription = screenDescription;
    }

    @Override
    public String toString() {
        return super.toString() + " размер экрана " + this.screenDescription;
    }

    @Override
    public String getStatus() {
        return "телевизор " + (isOn ? " включен " : " выключен");
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
