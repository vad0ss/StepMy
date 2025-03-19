package by.Prileipishev.out.production.L_13_03_2025.TransportManagementSystem;

import by.Prileipishev.out.production.L_13_03_2025.TransportManagementSystem.factory.UserFactory;
import by.Prileipishev.out.production.L_13_03_2025.TransportManagementSystem.models.User;
import by.Prileipishev.out.production.L_13_03_2025.TransportManagementSystem.factory.TransportFactory;
import by.Prileipishev.out.production.L_13_03_2025.TransportManagementSystem.manager.*;
import by.Prileipishev.out.production.L_13_03_2025.TransportManagementSystem.models.Transport;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        TransportUserManager transportUserManager = new TransportUserManager();
        TransportStatistics transportStatistic = new TransportStatistics();
        TransportSpeedGrouper transportSpeedGrouper = new TransportSpeedGrouper();
        TransportAnalytics transportAnalytics = new TransportAnalytics();
        TransportService transportService = new TransportService();

        for (int i = 0; i < 100; i++) {
            Transport transport = TransportFactory.next();
            User user = UserFactory.next();
            transport.setUser(user);

            transportUserManager.addTransport(transport);
            transportStatistic.addTransport(transport);
            transportSpeedGrouper.addTransport(transport);
            transportAnalytics.addTransport(transport);
            transportService.addTransport(transport);
        }

        transportUserManager.printAllOwnersAndTransport();

        System.out.println();
        System.out.println("============ Пользователь с наибольшим количеством авто ============");

        User mostCarUser = transportUserManager.findOwnerWithMostCars();
        System.out.println("Имя Фамилия : " + mostCarUser.getName() + " " + mostCarUser.getSurname());

        List<Transport> transportsByMostCarOwner = transportUserManager.getTransportByOwner(mostCarUser);
        System.out.println("Количество транспортных средств: " + transportsByMostCarOwner.size());

        for (Transport transport : transportsByMostCarOwner) {
            System.out.println(transport);
        }

        System.out.println("====================================================================");

        System.out.println();
        System.out.println("================= Самый быстрый транспорт владельца =================");
        System.out.println("Имя Фамилия : " + mostCarUser.getName() + " " + mostCarUser.getSurname());

        System.out.println(transportUserManager.getFastestTransport(mostCarUser));

        System.out.println("====================================================================");

        System.out.println();
        System.out.println("======================= Вывод авто по брендам ======================");

        transportStatistic.printBrandStatistics();

        System.out.println("====================================================================");

        System.out.println();
        System.out.println("====================== Вывод авто по скорости ======================");

        transportSpeedGrouper.printTransportBySpeed();

        System.out.println("====================================================================");

        System.out.println("========================= Авто до 2008 года ========================");

        for (Transport transport : transportAnalytics.filterByYear(2008)) {
            System.out.println(transport);
        }

        System.out.println("====================================================================");

        System.out.println("======================== 3 самых быстрых авто ======================");

        for (Transport transport : transportAnalytics.findTop3Fastest()) {
            System.out.println(transport);
        }

        System.out.println("====================================================================");

        System.out.println("====================== Уникальные Авто бренды ======================");

        for (String brand : transportAnalytics.getUniqueBrands()) {
            System.out.println(brand);
        }

        System.out.println("====================================================================");

        System.out.println("====================== Скоростные группы ======================");

        Map<String, List<Transport>> group = transportAnalytics.groupBySpeedRange();

        for (String key : transportAnalytics.groupBySpeedRange().keySet()) {
            System.out.println(key + "" + group.get(key));
        }

        System.out.println("====================================================================");

        System.out.println();
        System.out.println("Введите номер для поиска");

        String licensePlate = scanner.next();

        System.out.println("====================== Владелец авто с номером " + licensePlate + "==============");

        System.out.println(transportService.findOwnerByLicensePlate(licensePlate));

        Map<String, List<User>> groupOwnersByCarCount = transportService.groupOwnersByCarCount();

        for (String key : groupOwnersByCarCount.keySet()) {
            System.out.println(key + " " + groupOwnersByCarCount.get(key));
        }

        System.out.println("====================================================================");

        System.out.println("======================== ТОП 5 Брендов =============================");

        for (String brand : transportService.findTop5MostPopularBrands()) {
            System.out.println(brand);
        }

        System.out.println("====================================================================");

        System.out.println("======================== По возрастным группам =====================");

        transportService.groupByAge().forEach((k,v) -> System.out.println(k + " " + v));

        System.out.println("====================================================================");

        System.out.println("=================== Количество транспорта по типу ==================");

        transportService.countTransportByType().forEach((k,v) -> System.out.println(k + " " + v));

        System.out.println("====================================================================");

        System.out.println("=================== Владелец самого старого авто ==================");

        User ownerByOldestCar = transportService.findOwnerWithOldestCar();
        User smooker = transportService.findOwnerWithOldestCarSmooker();

        System.out.println(ownerByOldestCar.getName() + " " + ownerByOldestCar.getSurname());
        System.out.println(smooker.getName() + " " + smooker.getSurname());

        System.out.println("====================================================================");

        System.out.println("======================= Владельцы одной марки ======================");

        List<User> oneBrandUser = transportService.findOwnersWithSingleBrand();

        for (User user : oneBrandUser) {
            System.out.println(user.getName() + " " + user.getSurname());
        }

        System.out.println("====================================================================");

        System.out.println("========================== Средний пробег ==========================");

        System.out.println(transportService.getAverageCarAge());

        System.out.println("====================================================================");

        System.out.println("======== Пользователь с максимальным суммарным пробегом ============");

        User userWithMaxMileage = transportService.findOwnerWithHighestMileage();

        System.out.println(userWithMaxMileage.getName() + " " + userWithMaxMileage.getSurname());

        System.out.println("====================================================================");

    }
}
