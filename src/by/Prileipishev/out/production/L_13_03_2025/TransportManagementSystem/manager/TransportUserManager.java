package by.Prileipishev.out.production.L_13_03_2025.TransportManagementSystem.manager;

import by.Prileipishev.out.production.L_13_03_2025.TransportManagementSystem.comparators.SortBySpeedComparator;
import by.Prileipishev.out.production.L_13_03_2025.TransportManagementSystem.manager.impl.TransportInterface;
import by.Prileipishev.out.production.L_13_03_2025.TransportManagementSystem.models.User;
import by.Prileipishev.out.production.L_13_03_2025.TransportManagementSystem.models.Transport;

import java.util.*;

public class TransportUserManager implements TransportInterface {

    private final Map<User, List<Transport>> transportByOwner = new HashMap<>();

    @Override
    public void addTransport(Transport transport) {
        transportByOwner.putIfAbsent(transport.getUser(), new ArrayList<>());
        transportByOwner.get(transport.getUser()).add(transport);
    }

    public Map<User, List<Transport>> getTransportByOwner() {
        return transportByOwner;
    }

    public List<Transport> getTransportByOwner(User owner) {
        return transportByOwner.get(owner);
    }

    public void removeTransport(User owner, String licensePlate) {
        List<Transport> userTransports = transportByOwner.get(owner);

        Iterator<Transport> iterator = userTransports.iterator();

        while (iterator.hasNext()) {
            Transport next = iterator.next();
            if (licensePlate.equals(next.getLicensePlate())) {
                iterator.remove();
            }
        }
    }

    public Transport getFastestTransport(User owner) {
        List<Transport> transports = getTransportByOwner(owner);
        transports.sort(new SortBySpeedComparator());
        return transports.get(transports.size() - 1);
    }

    public User findOwnerWithMostCars() {
        TreeMap<Integer, User> treeMap = new TreeMap<>();
        transportByOwner.forEach((user, transports) -> treeMap.put(transports.size(), user));
        return treeMap.lastEntry().getValue();
    }

    public void printAllOwnersAndTransport() {
        transportByOwner.forEach((k, v) -> System.out.println(v));
    }

}
