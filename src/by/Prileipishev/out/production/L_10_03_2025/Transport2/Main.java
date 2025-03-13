package by.Prileipishev.out.production.L_10_03_2025.Transport2;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        TransportManager transportManager = new TransportManager();

        for (int i = 0; i < 20; i++) {
            Transport transport = TransportFactory.next();
            transportManager.addTransport(transport);
        }

        while (true) {
            printMenu();
            int num = scanner.nextInt();

            switch (num) {
                case 1: {
                    System.out.println("Введите номер транспорта для удаления: ");
                    String number = scanner.next();
                    transportManager.removeTransport(number);
                    break;
                }
                case 2: {
                    System.out.println("Введите номер транспорта: ");
                    String number = scanner.next();
                    System.out.println(transportManager.findTransportByPlate(number));
                    break;
                }
                case 3: {
                    System.out.println("Введите тип транспорта " + TransportFactory.transportTypes);
                    String number = scanner.next();
                    System.out.println(transportManager.getTransportByType(number));
                    break;
                }
                case 4: {
                    System.out.println("Введите тип транспорта (поиск самого быстрого по типу): ");
                    String number = scanner.next();
                    System.out.println(transportManager.getFastestTransportByType(number));
                    break;
                }
                case 5: {
                    transportManager.printAllTransport();
                    break;
                }
                case 6: {
                    return;
                }
            }
        }
    }

    private static void printMenu() {
        System.out.println();
        System.out.println("===============================================");
        System.out.println("Удалить транспорт: 1");
        System.out.println("Получить транспорт по номеру: 2");
        System.out.println("Получить список транспорта по типу " + TransportFactory.transportTypes + " : 3");
        System.out.println("Получить самый быстрый транспорт по типу " + TransportFactory.transportTypes + " : 4");
        System.out.println("Вывод списка транспорта: 5");
        System.out.println("Выход: 6");
        System.out.println("===============================================");
    }
}
