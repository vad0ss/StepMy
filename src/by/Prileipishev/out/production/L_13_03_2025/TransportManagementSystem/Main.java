package by.Prileipishev.out.production.L_13_03_2025.TransportManagementSystem;

import by.Prileipishev.out.production.L_13_03_2025.TransportManagementSystem.Transports.*;
import by.Prileipishev.out.production.L_13_03_2025.TransportManagementSystem.User.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {


    public static void main(String[] args) {

        TransportUserManager transportUserManager = new TransportUserManager();
        TransportStatistics transportStatistic = new TransportStatistics();
        TransportSpeedGrouper transportSpeedGrouper = new TransportSpeedGrouper();
        TransportAnalytics transportAnalytics = new TransportAnalytics();

        for (int i = 0; i < 100; i++) {
            Transport transport = TransportFactory.next();
            transportUserManager.addTransport(transport);
            transportStatistic.addTransport(transport);
            transportSpeedGrouper.addTransport(transport);
            transportAnalytics.addTransport(transport);
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

    }
}
