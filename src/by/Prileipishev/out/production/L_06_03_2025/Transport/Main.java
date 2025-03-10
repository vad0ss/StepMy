package by.Prileipishev.out.production.L_06_03_2025.Transport;

public class Main {

    public static void main(String[] args) {
        TransportManager transportManager = new TransportManager();

        for (int i = 0; i < 50; i++) {
            Transport transport = TransportFactory.next();
            transportManager.addTransport(transport);
        }

        System.out.println("Весь транспорт:");
        transportManager.printAllTransport();

        System.out.println("Весь уникальный транспорт:");
        transportManager.printUniqueTransport();

        System.out.println("Весь транспорт после сортировки по скорости:");
        transportManager.sortTransportBySpeed();
        transportManager.printAllTransport();

        System.out.println("Весь уникальный транспорт после сортировки по скорости:");
        transportManager.printUniqueTransport();

        System.out.println("Весь транспорт после сортировки по модели:");
        transportManager.sortTransportByModel();
        transportManager.printAllTransport();

        System.out.println("Весь уникальный транспорт после сортировки по модели:");
        transportManager.printUniqueTransport();

        System.out.println("Весь транспорт после удаления:");
        transportManager.removeTransport("Reno");
        transportManager.printAllTransport();

        System.out.println("Весь уникальный транспорт после удаления:");
        transportManager.printUniqueTransport();

        System.out.println("Весь транспорт после сортировки по скорости:");
        transportManager.sortTransportBySpeed();
        transportManager.printAllTransport();

        System.out.println("Весь уникальный транспорт после сортировки по скорости:");
        transportManager.printUniqueTransport();

    }
}
