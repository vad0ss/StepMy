package by.Prileipishev.out.production.L_13_03_2025.TransportManagementSystem.manager;

import by.Prileipishev.out.production.L_13_03_2025.TransportManagementSystem.comparators.TransportListYearComparator;
import by.Prileipishev.out.production.L_13_03_2025.TransportManagementSystem.comparators.TransportMapValueComparator;
import by.Prileipishev.out.production.L_13_03_2025.TransportManagementSystem.manager.impl.TransportInterface;
import by.Prileipishev.out.production.L_13_03_2025.TransportManagementSystem.models.Transport;
import by.Prileipishev.out.production.L_13_03_2025.TransportManagementSystem.models.User;

import java.time.Year;
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
        Map<String, Integer> modelsMap = new HashMap<>();
        List<String> top5 = new ArrayList<>();

        for (Transport transport : transports) {
            int count = modelsMap.get(transport.getModel()) != null ? modelsMap.get(transport.getModel()) : 0;
            modelsMap.putIfAbsent(transport.getModel(), 1);
            modelsMap.put(transport.getModel(), ++count);
        }

        Map<String, Integer> sortedMap = new TreeMap<>(new TransportMapValueComparator(modelsMap));
        sortedMap.putAll(modelsMap);

        Iterator<String> iterator = sortedMap.keySet().iterator();
        int count = 0;

        while (iterator.hasNext() && count < 5) {
            top5.add(iterator.next());
            count++;
        }

        return top5;
    }

    public Map<String, List<Transport>> groupByAge() {
        Map<String, List<Transport>> group = Map.of("Новые", new ArrayList<>(), "Средние", new ArrayList<>(), "Старые", new ArrayList<>());
        int currentYear = Year.now().getValue();

        for (Transport transport : transports) {
            if (currentYear - transport.getYear() < 3) {
                group.get("Новые").add(transport);
            } else if (currentYear - transport.getYear() > 3 && currentYear - transport.getYear() <= 10) {
                group.get("Средние").add(transport);
            } else {
                group.get("Старые").add(transport);
            }
        }

        return group;
    }

    public Map<String, Integer> countTransportByType() {
        Map<String, Integer> countByType = new HashMap<>(Map.of("Car", 0, "Bike", 0, "Truck", 0));
        int carCount = 0;
        int bikeCount = 0;
        int truckCount = 0;

        for (Transport transport : transports) {
            switch (transport.getClass().getSimpleName()) {
                case "Car" -> {
                    countByType.put("Car", ++carCount);
                }
                case "Bike" -> {
                    countByType.put("Bike", ++bikeCount);
                }
                case "Truck" -> {
                    countByType.put("Truck", ++truckCount);
                }
                default -> {
                    return new HashMap<>();
                }
            }
        }

        return countByType;
    }

    public User findOwnerWithOldestCar() {
        List<Transport> sorted = new ArrayList<>(transports);
        sorted.sort(new TransportListYearComparator());
        return sorted.get(0).getUser();
    }

    public User findOwnerWithOldestCarSmooker() {
        User oCarOwner = null;
        int oldestCar = 3999;
        Map<User, List<Transport>> userTransportMap = new HashMap<>();

        for (Transport transport : transports) {
            userTransportMap.putIfAbsent(transport.getUser(), new ArrayList<>());
            userTransportMap.get(transport.getUser()).add(transport);
        }

        for (Map.Entry<User, List<Transport>> entry : userTransportMap.entrySet()) {
            User user = entry.getKey();
            List<Transport> transportList = entry.getValue();

            for (Transport transport : transportList) {
                if (transport.getYear() < oldestCar) {
                    oldestCar = transport.getYear();
                    oCarOwner = transport.getUser();
                }
            }
        }

        return oCarOwner;
    }

    public List<User> findOwnersWithSingleBrand() {
        List<User> singleBrandUser = new ArrayList<>();
        Map<User, List<Transport>> userTransportMap = new HashMap<>();

        for (Transport transport : transports) {
            userTransportMap.putIfAbsent(transport.getUser(), new ArrayList<>());
            userTransportMap.get(transport.getUser()).add(transport);
        }

        for (Map.Entry<User, List<Transport>> entry : userTransportMap.entrySet()) {
            User user = entry.getKey();
            List<Transport> transportList = entry.getValue();

            Set<String> set = new HashSet<>();

            for (Transport transport : transportList) {
                set.add(transport.getModel());
            }

            if (set.size() == 1) {
                singleBrandUser.add(user);
            }

        }

        return singleBrandUser;
    }

    public double getAverageCarAge() {
        int currentYear = Year.now().getValue();
        double average = 0.0;

        for (Transport transport : transports) {
            average += currentYear - transport.getYear();
        }

        average = average / transports.size();
        return average;
    }

    public User findOwnerWithHighestMileage() {
        Map<User, List<Transport>> userTransportMap = new HashMap<>();
        double maxMileage = 0.0;
        User userWithMaxMileage = null;

        for (Transport transport : transports) {
            userTransportMap.putIfAbsent(transport.getUser(), new ArrayList<>());
            userTransportMap.get(transport.getUser()).add(transport);
        }

        for (Map.Entry<User, List<Transport>> entry : userTransportMap.entrySet()) {
            User user = entry.getKey();
            double userMileage = 0.0;
            List<Transport> transportList = entry.getValue();

            for (Transport transport : transportList) {
                userMileage += transport.getMileage();
            }

            if(maxMileage  < userMileage) {
                maxMileage = userMileage;
                userWithMaxMileage = user;
            }

        }
        return userWithMaxMileage;
    }

}
