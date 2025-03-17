package by.Prileipishev.out.production.L_13_03_2025.TransportManagementSystem.manager;

import by.Prileipishev.out.production.L_13_03_2025.TransportManagementSystem.comparators.TransportMapValueComparator;
import by.Prileipishev.out.production.L_13_03_2025.TransportManagementSystem.manager.impl.TransportInterface;
import by.Prileipishev.out.production.L_13_03_2025.TransportManagementSystem.models.Transport;
import by.Prileipishev.out.production.L_13_03_2025.TransportManagementSystem.models.User;

import java.util.*;

public class TransportService implements TransportInterface {

    private final List<Transport> transports = new ArrayList<>();

    @Override
    public void addTransport(Transport transport) {
        transports.add(transport);
    }

    public User findOwnerByLicensePlate(String licensePlate) {
        for (Transport transport : transports) {
            if (transport.getLicensePlate().equals(licensePlate)) {
                return transport.getUser();
            }
        }
        return null;
    }

    public Map<String, List<User>> groupOwnersByCarCount() {
        Map<String, List<User>> listMap = Map.of("1-2 машины", new ArrayList<>(), "3-5 машин", new ArrayList<>(), "6 и более машин", new ArrayList<>());

        Map<User, Integer> userMap = new HashMap<>();

        for (Transport transport : transports) {
            User user = transport.getUser();
            userMap.putIfAbsent(user, 1);
            if (userMap.containsKey(user)) {
                Integer sizeTransports = userMap.get(user);
                userMap.put(user, ++sizeTransports);
            }
        }

        for (Map.Entry<User, Integer> entry : userMap.entrySet()) {
            Integer size = entry.getValue();
            if (size > 0 && size < 3) {
                listMap.get("1-2 машины").add(entry.getKey());
            } else if (size >= 3 && size < 5) {
                listMap.get("3-5 машин").add(entry.getKey());
            } else if (size >= 6) {
                listMap.get("6 и более машин").add(entry.getKey());
            }
        }

        return listMap;
    }

    public List<String> findTop5MostPopularBrands() {
        Map<String, Integer> models = new HashMap<>();
//        Set<String, Integer> set = new TreeSet<>(new TransportMapValueComparator());
//
//        for (Transport transport : transports) {
//             models.put(transport.getModel(), );
//        }


    }


}
