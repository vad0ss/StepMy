package by.Prileipishev.out.production.L_10_03_2025.Transport2;

import java.util.Comparator;

public class SortBySpeedComparator implements Comparator<Transport> {

    @Override
    public int compare(Transport transport, Transport t1) {
        return transport.getSpeed() - t1.getSpeed();
    }
}
