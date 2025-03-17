package by.Prileipishev.out.production.L_13_03_2025.TransportManagementSystem.comparators;

import by.Prileipishev.out.production.L_13_03_2025.TransportManagementSystem.models.Transport;

import java.util.Comparator;

public class SortBySpeedComparator implements Comparator<Transport> {

    @Override
    public int compare(Transport transport, Transport t1) {
        return transport.getSpeed() - t1.getSpeed();
    }
}
