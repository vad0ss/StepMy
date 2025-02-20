package by.Prileipishev.out.production.L_06_02_2025_HT;

public class Main {
    public static void main(String[] args) {

        ElectronicDevice smartphone = new Smartphone("Samsung", "S24", 220, 8);
        ElectronicDevice tele = new Television("LG", "XY777555", 220, 128);
        ElectronicDevice laptop = new Laptop("LG", "LK333444", 220, 128);

        ElectronicDevice[] electronicDevices = new ElectronicDevice[3];

        electronicDevices[0] = smartphone;
        electronicDevices[1] = tele;
        electronicDevices[2] = laptop;


        for (ElectronicDevice device : electronicDevices) {
            System.out.println(device.getStatus());
            System.out.println("Состояние: " + device.getStatus());
            device.turnOn();
            System.out.println("Состояние: " + device.getStatus());
            device.turnOff();
            System.out.println("Состояние: " + device.getStatus());
        }

    }
}
