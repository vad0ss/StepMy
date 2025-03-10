package by.Prileipishev.out.production.L_06_03_2025.Transport;

import java.util.*;
import java.util.stream.Collectors;

public class TransportManager {

    private final List<Transport> transportList = new ArrayList<>();
    private Set<Transport> uniqueTransportSet = new TreeSet<>(new SortBySpeedComparator());

    public void addTransport(Transport transport) {
        transportList.add(transport);
        uniqueTransportSet.add(transport);
    }

    public List<Transport> getTransportList() {
        return transportList;
    }

    public Set<Transport> getUniqueTransportSet() {
        return uniqueTransportSet;
    }

    public void removeTransport(String model) {
        Iterator<Transport> transportIterator = this.transportList.iterator();
        Iterator<Transport> uniqueTransportIterator = this.uniqueTransportSet.iterator();

        while (transportIterator.hasNext()) {
            Transport next = transportIterator.next();

            if (next.getModel().equals(model)) {
                transportIterator.remove();
            }
        }

        while (uniqueTransportIterator.hasNext()) {
            Transport next = uniqueTransportIterator.next();

            if (next.getModel().equals(model)) {
                uniqueTransportIterator.remove();
            }
        }
    }

    public void sortTransportBySpeed() {
        Comparator<Transport> comparator = new SortBySpeedComparator();
        transportList.sort(comparator);

        Set<Transport> sortedSet = new TreeSet<>(comparator);
        sortedSet.addAll(uniqueTransportSet);
        uniqueTransportSet = sortedSet;
    }

    public void sortTransportByModel() {
        Comparator<Transport> comparator = new SortByModelComparator();
        transportList.sort(comparator);

        Set<Transport> sortedSet = new TreeSet<>(comparator);
        sortedSet.addAll(uniqueTransportSet);
        uniqueTransportSet = sortedSet;
    }

    public void printAllTransport() {
        for (Transport transport : this.transportList) {
            System.out.println(transport);
        }
        System.out.println(transportList.size());
    }

    public void printUniqueTransport() {
        for (Transport transport : uniqueTransportSet) {
            System.out.println(transport);
        }
        System.out.println(uniqueTransportSet.size());
    }
}
