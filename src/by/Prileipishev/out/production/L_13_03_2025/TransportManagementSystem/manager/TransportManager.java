package by.Prileipishev.out.production.L_13_03_2025.TransportManagementSystem.manager;

import by.Prileipishev.out.production.L_13_03_2025.TransportManagementSystem.models.Transport;

import java.util.*;

public class TransportManager {

    private final Map<String, Transport> transportByPlate = new HashMap<>();
    private final Map<String, List<Transport>> transportByType = new HashMap<>();


    public void addTransport(Transport transport) {
        transportByPlate.putIfAbsent(transport.getLicensePlate(), transport);

        transportByType.putIfAbsent(transport.getClass().getSimpleName(), new ArrayList<>());
        transportByType.get(transport.getClass().getSimpleName()).add(transport);
    }

    public void removeTransport(String licensePlate) {
        if (transportByPlate.remove(licensePlate) != null) {
            System.out.println("Транспорт с номером " + licensePlate + " удалён");
        } else {
            System.out.println("Транспорт с таким номером не найден!");
        }
    }

    public void removeTransportByType(String licensePlate) {
        for (Map.Entry<String, List<Transport>> entry : transportByType.entrySet()) {
            List<Transport> value = entry.getValue();
            Iterator<Transport> iterator = value.iterator();

            while (iterator.hasNext()) {
                Transport next = iterator.next();
                if (licensePlate.equals(next.getLicensePlate())) {
                    iterator.remove();
                }
            }
        }
    }

    public Transport findTransportByPlate(String licensePlate) {
        return transportByPlate.get(licensePlate);
    }

    public List<Transport> getTransportByType(String type) {
        return transportByType.get(type);
    }

//    public Transport getFastestTransportByType(String type) {
//        List<Transport> transports = getTransportByType(type);
//        transports.sort(new SortBySpeedComparator());
//        return transports.getLast();
//    }

    public void printAllTransport() {
        transportByPlate.forEach((k, v) -> System.out.println(v));
    }

    public void printAllTransportByType() {
        transportByType.forEach((k, v) -> System.out.println(k + " = " + v));
    }

}
