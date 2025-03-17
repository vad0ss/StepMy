package by.Prileipishev.out.production.L_13_03_2025.TransportManagementSystem.Transports;

import by.Prileipishev.out.production.L_13_03_2025.TransportManagementSystem.Comparators.SortBySpeedComparator;
import by.Prileipishev.out.production.L_13_03_2025.TransportManagementSystem.Transports.Interfaces.TransportInterface;

import java.util.*;

public class TransportAnalytics implements TransportInterface {

    List<Transport> transportList = new ArrayList<>();

    @Override
    public void addTransport(Transport transport) {
        transportList.add(transport);
    }

    public List<Transport> filterByYear(int year) {
        List<Transport> listByYear = new ArrayList<>();

        for (Transport transport : transportList) {
            if (transport.getYear() < year) {
                listByYear.add(transport);
            }
        }
        return listByYear;
    }

    public List<Transport> findTop3Fastest() {
        List<Transport> listBy3Speed = new ArrayList<>();
        transportList.sort(new SortBySpeedComparator());

        listBy3Speed.add(transportList.get(transportList.size() - 1));
        listBy3Speed.add(transportList.get(transportList.size() - 2));
        listBy3Speed.add(transportList.get(transportList.size() - 3));
        return listBy3Speed;
    }

    public Set<String> getUniqueBrands() {
        Set<String> set = new HashSet<>();

        for (Transport transport : transportList) {
            set.add(transport.getModel());
        }
        return set;
    }

    public Map<String, List<Transport>> groupBySpeedRange() {
        Map<String, List<Transport>> group = new HashMap<>();

        for (Transport transport : transportList) {
            if (transport.getSpeed() < 100) {
                group.putIfAbsent("Медленный", new ArrayList<>());
                group.get("Медленный").add(transport);
            } else if (transport.getSpeed() >= 100 && transport.getSpeed() < 200) {
                group.putIfAbsent("Средний", new ArrayList<>());
                group.get("Средний").add(transport);
            } else {
                group.putIfAbsent("Быстрый", new ArrayList<>());
                group.get("Быстрый").add(transport);
            }
        }

        return group;
    }

}
