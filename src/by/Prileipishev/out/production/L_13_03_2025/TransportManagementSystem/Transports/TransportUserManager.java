package by.Prileipishev.out.production.L_13_03_2025.TransportManagementSystem.Transports;

import by.Prileipishev.out.production.L_13_03_2025.TransportManagementSystem.Comparators.SortBySpeedComparator;
import by.Prileipishev.out.production.L_13_03_2025.TransportManagementSystem.Transports.Interfaces.TransportInterface;
import by.Prileipishev.out.production.L_13_03_2025.TransportManagementSystem.User.User;

import java.util.*;

public class TransportUserManager implements TransportInterface {

    private Map<User, List<Transport>> transportByOwner = new HashMap<>();
    @Override
    public void addTransport(Transport transport) {
        transportByOwner.putIfAbsent(transport.getUser(), new ArrayList<>());
        transportByOwner.get(transport.getUser()).add(transport);
    }

    public List<Transport> getTransportByOwner(User owner) {
        return transportByOwner.get(owner);
    }

    public void removeTransport(User owner, String licensePlate) {
        List<Transport> userTransports = transportByOwner.get(owner);
        if (userTransports.remove(licensePlate)) {
            System.out.println("Транспорт удалён!");
        } else {
            System.out.println("Транспорт не найден!");
        }
    }

    public Transport getFastestTransport(User owner) {
        List<Transport> transports = getTransportByOwner(owner);
        transports.sort(new SortBySpeedComparator());
        return transports.get(transports.size() - 1);
    }

    public User findOwnerWithMostCars() {
        TreeMap<Integer, User> treeMap = new TreeMap<>();
        transportByOwner.forEach((user,transports) -> treeMap.put(transports.size(), user));
        return treeMap.lastEntry().getValue();
    }

    public void printAllOwnersAndTransport() {
        transportByOwner.forEach((k,v) -> System.out.println(v));
    }

}
